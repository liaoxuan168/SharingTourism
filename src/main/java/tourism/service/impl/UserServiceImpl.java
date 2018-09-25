package tourism.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tourism.bean.User;
import tourism.dao.UserRpt;
import tourism.service.UserService;

/**
 * @author liaoxuan
 * @date 2018-9-25-0025.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRpt userRpt;
    @Override
    public void put(User user) {
      userRpt.put(user);
    }
}
