package com.demo1.session;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component("userSessionManager")
@SessionScope
public class UserSessionManager {

    private String username;
    private String password;

    public UserSessionManager() {
        System.out.println("*** UserSessionManager bean created. ***");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
