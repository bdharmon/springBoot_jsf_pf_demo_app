package com.demo1.session;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component("userSessionManager")
@SessionScope
public class UserSessionManager {

    public UserSessionManager() {
        System.out.println("*** UserSessionManager bean created. ***");
    }

    public String getUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("Principal: " + authentication.getPrincipal());
        System.out.println("Credentials: " + authentication.getCredentials());
        System.out.println("Details: " + authentication.getDetails());
        return authentication.getName();
    }

}
