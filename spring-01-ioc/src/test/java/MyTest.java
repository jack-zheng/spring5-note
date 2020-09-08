import com.jzheng.dao.UserDaoMysqlImpl;
import com.jzheng.dao.UserDaoOracleImpl;
import com.jzheng.service.UserService;
import com.jzheng.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//
////        ((UserServiceImpl)userService).setUserDao(new UserDaoMysqlImpl());
//        ((UserServiceImpl)userService).setUserDao(new UserDaoOracleImpl());
//
//        userService.getUser();

        // xml config type example
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService mysqlService = (UserServiceImpl) context.getBean("userServiceImpl");
        mysqlService.getUser();

        UserService oracleService = (UserServiceImpl)context.getBean("oracleUserServiceImpl");
        oracleService.getUser();
    }
}
