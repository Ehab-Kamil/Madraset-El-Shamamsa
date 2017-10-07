/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSFBeans;

import Managers.TermManager;
import Entities.Term;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import screenObject.ScreenObject;
import screenObject.TermSO;

/**
 *
 * @author Ehab
 */
@ManagedBean(name = "termBean")
@RequestScoped
public class termBean {

    private TermSO newTermSO;
    private List<ScreenObject> terms;

    public termBean() {
        newTermSO = new TermSO();

        TermManager termManager = new TermManager();
        terms = termManager.findAll(Term.class);
    }

    public void addNewTerm() {
        TermManager termManager = new TermManager();
        termManager.create(newTermSO);
        newTermSO = new TermSO();
    }

    public TermSO getNewTermSO() {
        return newTermSO;
    }

    public void setNewTermSO(TermSO newTermSO) {
        this.newTermSO = newTermSO;
    }

    public List<ScreenObject> getTerms() {
        return terms;
    }

    public void setTerms(List<ScreenObject> terms) {
        this.terms = terms;
    }

}
