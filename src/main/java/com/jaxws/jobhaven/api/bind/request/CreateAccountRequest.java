package com.jaxws.jobhaven.api.bind.request;
/**
 * @author NetshiaR2
 */
public class CreateAccountRequest {
    private String firstname;
    private String username;
    private String password;
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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
