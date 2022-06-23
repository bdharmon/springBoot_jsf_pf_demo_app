package com.demo1.session;

import com.demo1.entity.UserAccount;
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

    public UserDetailsImpl getUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        System.out.println("Principal: " + authentication.getPrincipal());
        System.out.println("Credentials: " + authentication.getCredentials());
        System.out.println("Details: " + authentication.getDetails());
        System.out.println("User Account: " + userDetails.getUserAccount());
        return userDetails;
    }

}
