package com.jzheng.mapper;

import com.jzheng.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    // 使用 sqlSessionTemplate 代替 sqlSession
    private SqlSessionTemplate sqlsession;

    public void setSqlsession(SqlSessionTemplate sqlsession) {
        this.sqlsession = sqlsession;
    }

    @Override
    public List<User> getUser() {
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        return mapper.getUser();
    }
}
