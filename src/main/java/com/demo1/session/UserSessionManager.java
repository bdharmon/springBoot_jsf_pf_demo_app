package com.demo1.session;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.io.IOException;

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

    public void processLogin() throws IOException {
        System.out.println("*** inside processLogin() ***");
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        externalContext.dispatch("/login");
        facesContext.responseComplete();
    }
}
