/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author pipe22007
 */
@Named(value = "loginBean")
@RequestScoped
public class loginBean implements Serializable{
    private String username;
    private String password;
    /**
     * Creates a new instance of loginBean
     */
    public loginBean() {
    }
    public void login(){
        
    }
    public void logout(){
        
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
