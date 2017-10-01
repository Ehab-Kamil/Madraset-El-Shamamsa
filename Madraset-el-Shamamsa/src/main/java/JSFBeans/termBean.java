/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSFBeans;

import DAO.Managers.TermManager;
import javax.faces.bean.ManagedBean;
import screenObject.TermSO;

/**
 *
 * @author Ehab
 */
@ManagedBean(name = "termBean")
public class termBean {

    private TermSO newTermSO;

    public termBean() {
        newTermSO = new TermSO();

    }

    public void addNewTerm() {
        TermManager termManager = new TermManager();
        termManager.create(newTermSO);
    }

    public TermSO getNewTermSO() {
        return newTermSO;
    }

    public void setNewTermSO(TermSO newTermSO) {
        this.newTermSO = newTermSO;
    }

}
