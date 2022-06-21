package com.demo1.session;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.IOException;

@Component("userSessionManager")
@Scope("session")
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
        System.out.println(getUsername() + " " + getPassword());
        if (!getPassword().equals("123")) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Invalid Password."));
            return;
        }
        FacesContext.getCurrentInstance().getExternalContext().redirect("/home");
    }

    public void processLogout() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("/login");
    }

}
