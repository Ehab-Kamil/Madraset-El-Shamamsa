/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSFBeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import Managers.LevelManager;
import Managers.YearManager;
import screenObject.LevelScreenObject;
import screenObject.TermSO;
import screenObject.YearSO;

/**
 *
 * @author Ehab
 */
@ManagedBean(name = "levelBean")
@RequestScoped
public class levelBean {

    private LevelScreenObject newLevelSO;
    private YearSO newYearSO;
    private List<LevelScreenObject> levels;
    private List<TermSO> terms;
    private List<YearSO> years;

    public levelBean() {
        newLevelSO = new LevelScreenObject();
        newYearSO = new YearSO();

        LevelManager levelManager = new LevelManager();
        levels = levelManager.findAll();

    }

    public LevelScreenObject getNewLevelSO() {
        return newLevelSO;
    }

    public void setNewLevelSO(LevelScreenObject newLevelSO) {
        this.newLevelSO = newLevelSO;
    }

    public YearSO getNewYearSO() {
        return newYearSO;
    }

    public void setNewYearSO(YearSO newYearSO) {
        this.newYearSO = newYearSO;
    }

    public List<LevelScreenObject> getLevels() {
        return levels;
    }

    public void setLevels(List<LevelScreenObject> levels) {
        this.levels = levels;
    }

    public List<TermSO> getTerms() {
        return terms;
    }

    public void setTerms(List<TermSO> terms) {
        this.terms = terms;
    }

    public List<YearSO> getYears() {
        return years;
    }

    public void setYears(List<YearSO> years) {
        this.years = years;
    }

    public void addNewLevel() {
        LevelManager levelManger = new LevelManager();
        if (newLevelSO.getLevelCode() != null) {
            levelManger.create(newLevelSO);
            levels.add(newLevelSO);
            newLevelSO = new LevelScreenObject();
        }

    }

    public void addNewYear() {
        YearManager yearManager = new YearManager();
        yearManager.create(newYearSO);
    }

}
