import com.jzheng.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User)applicationContext.getBean("user");
        user.show();

        User alias = (User)applicationContext.getBean("userAlias");
        alias.show();

        User u2 = (User)applicationContext.getBean("u2");
        u2.show();
    }
}
