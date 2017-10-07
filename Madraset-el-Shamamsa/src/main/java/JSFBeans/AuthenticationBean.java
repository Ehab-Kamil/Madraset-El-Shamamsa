/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSFBeans;

import DAO.StudentDAO;
import Entities.StdStudent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Ehab
 */
@ManagedBean(name = "student")
public class AuthenticationBean {

    private String username = "Hello Ehab";
    private String password = "***";

    public AuthenticationBean() {

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

    /**
     * This method will handle the Login logic and redirect to home screen or
     * threw validation Exception
     *
     * @return
     */
    public String checkAvailable() {
        StudentDAO dao = new StudentDAO();
        String resultScreen = "/home.xhtml";
        try {
            StdStudent std = dao.findByCode(username);
//            if (!std.getPassword().equals(password)) {
                FacesContext.getCurrentInstance().addMessage(
                        "loginForm:password",
                        new FacesMessage(FacesMessage.SEVERITY_WARN,
                                "Incorrect Username and Passowrd",
                                "Please enter correct username and Password"));
                resultScreen = "/LoginScreen.xhtml";
//            }
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(
                    "loginForm:password",
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            "Please enter correct username and Password"));
            resultScreen = "/LoginScreen.xhtml";
        }

        return resultScreen;
    }

}
