package com.jzheng.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User {
    private String name = "jack";
    @Value("man")
    private String gender;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
