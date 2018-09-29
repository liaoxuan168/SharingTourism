package tourism.dao;


import tourism.bean.User;

/**
 * @author liaoxuan
 * @date 2018-4-11-0011.
 */
public interface UserRpt {
    void put(User user);

    User login(String userNo,String password);
}
