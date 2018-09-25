package tourism.base;


import tourism.base.lock.DBLockMode;

import java.util.List;

/**
 * @author liaoxuan
 * @date 2018-4-11-0011.
 */
public interface BaseRpt {
    Object getById(Long id);

    Object getById(Long id, DBLockMode lockMode);

    <T> T getById(Class<T> cla, Long id);

    List<Object> getList(Long[] ids);

    List<Object> getList(Long[] ids, DBLockMode lockMode);

    void saveOrUpdate(Object domain);

    void saveOrUpdateList(List<Object> domain);
}
