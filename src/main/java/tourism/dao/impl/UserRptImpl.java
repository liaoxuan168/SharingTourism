package tourism.dao.impl;

import org.springframework.stereotype.Repository;
import tourism.base.rptimpl.HibernateRptImpl;
import tourism.bean.User;
import tourism.dao.UserRpt;

/**
 * @author liaoxuan
 * @date 2018-4-11-0011.
 */
@Repository
public class UserRptImpl extends HibernateRptImpl implements UserRpt {
    @Override
    public void put(User user) {
        getHibernateTemplate().saveOrUpdate(user);
    }

    @Override
    public User login(String userNo, String password) {
        String hql = "from User u where u.userNo=? and u.password=?";
        return (User) getHibernateTemplate().find(hql, userNo, password).stream().findFirst().orElse(null);
    }
}
