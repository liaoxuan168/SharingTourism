import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tourism.bean.User;
import tourism.dao.UserRpt;

/**
 * @author liaoxuan
 * @date 2018-9-25-0025.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/SharingTourism_context.xml"})
public class UserTest {
    @Autowired
    private UserRpt userRpt;

    @Test
    public void putTest(){
        User user = new User("1000000","admin","admin","173213123","1075721685@qq.com");
        userRpt.put(user);
    }
}
