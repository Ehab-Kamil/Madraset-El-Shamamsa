/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSFBeans;

import DAO.HibernateFactory;
import DAO.StudentDAO;
import Entities.StdStudent;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Ehab
 */
@ManagedBean(name = "student")
public class StudentBeans {

    private String studenName = "Hello Ehab";

    public StudentBeans() {

    }

    public String getStudenName() {
        return studenName;
    }

    public void setStudenName(String studenName) {
        this.studenName = studenName;
    }

    public String checkAvailable() {
       StudentDAO dao = new StudentDAO();
//        StdStudent std = dao.find(StdStudent.class, Long.parseLong(studenName));
        return "true";
    }

}
