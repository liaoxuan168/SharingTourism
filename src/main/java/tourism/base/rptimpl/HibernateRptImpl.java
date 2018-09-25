package tourism.base.rptimpl;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import tourism.base.BaseRpt;
import tourism.base.lock.DBLockMode;
import tourism.utils.ClassUtils;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * @author liaoxuan
 * @date 2018-4-11-0011.
 */
@SuppressWarnings("rawtypes")
public class HibernateRptImpl implements BaseRpt {
    @Resource
    private HibernateTemplate hibernateTemplate;

    private Class domainClass;

    public Session getSession() {
        return getHibernateTemplate().getSessionFactory().getCurrentSession();
    }

    private Class getDomainClass() {
        if (domainClass == null) {
            domainClass = ClassUtils.getGenericType(getClass(), 0);
        }
        return domainClass;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Resource
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public static LockMode convert(DBLockMode lockMode) {
        switch (lockMode) {
            case NONE:
                return LockMode.NONE;
            case WRITE:
                return LockMode.PESSIMISTIC_WRITE;
            case WRITE_NOWAIT:
                return LockMode.UPGRADE_NOWAIT;
            case READ_ONLY:
                return LockMode.READ;
            default:
                throw new RuntimeException("预期之外的数据库锁类型[" + lockMode + "]");
        }
    }

    @Override
    public Object getById(Long id) {
        return getById(id, DBLockMode.NONE);
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object getById(Long id, DBLockMode lockMode) {
        if (id == null) {
            return null;
        }

        LockMode dblockMode = convert(lockMode);
        return hibernateTemplate.get(getDomainClass(), id, dblockMode);
    }

    @Override
    public <T> T getById(Class<T> cla, Long id) {
        return hibernateTemplate.get(cla, id);
    }

    @Override
    public List<Object> getList(Long[] ids) {
        return getList(ids, DBLockMode.NONE);
    }

    @SuppressWarnings({ "unchecked", "deprecation" })
    @Override
    public List<Object> getList(final Long[] ids, final DBLockMode lockMode) {
        return (List<Object>) getHibernateTemplate().executeFind(new HibernateCallback() {

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from " + getDomainClassName() + " where id in (:ids)");
                query.setParameterList("ids", ids);
                query.setLockMode("this", convert(lockMode));
                return query.list();
            }
        });
    }

    protected String getDomainClassName() {
        return getDomainClass().getName();
    }

    @Override
    public void saveOrUpdate(Object domain) {
        hibernateTemplate.saveOrUpdate(domain);
    }

    @Override
    public void saveOrUpdateList(List<Object> list) {
        if (list == null || list.size() == 0) {
            return;
        }

        for (Object domain : list) {
            saveOrUpdate(domain);
        }
    }
}
