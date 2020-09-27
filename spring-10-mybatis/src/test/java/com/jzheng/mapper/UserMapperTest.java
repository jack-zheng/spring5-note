package com.jzheng.mapper;

import com.jzheng.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserMapperTest {
    @Test
    public void test() throws IOException {
//        String resources = "mybatis-config.xml";
//        InputStream in = Resources.getResourceAsStream(resources);
//
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//        SqlSession sqlsession = factory.openSession(true);
//        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
//
//        List<User> users = mapper.getUser();
//
//        for (User user: users) {
//            System.out.println(user);
//        }
//
//        sqlsession.close();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        for (User user: userMapper.getUser()) {
            System.out.println(user);
        }
    }
}