/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSFBeans;

import DAO.Managers.LevelManager;
import DAO.Managers.TermManager;
import DAO.Managers.YearManager;
import Entities.Level;
import java.util.List;
import javax.faces.bean.ManagedBean;
import screenObject.LevelScreenObject;
import screenObject.ScreenObject;
import screenObject.TermSO;
import screenObject.YearSO;

/**
 *
 * @author Ehab
 */
@ManagedBean(name = "levelBean")
public class levelBean {

    private LevelScreenObject newLevelSO;
    private YearSO newYearSO;
    private List<ScreenObject> levels;
    private List<TermSO> terms;
    private List<YearSO> years;

    public levelBean() {
        newLevelSO = new LevelScreenObject();
        newYearSO = new YearSO();

        LevelManager levelManager = new LevelManager();
        levels = levelManager.findAll(Level.class);

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

    public List<ScreenObject> getLevels() {
        return levels;
    }

    public void setLevels(List<ScreenObject> levels) {
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

        try {
            LevelManager levelManger = new LevelManager();
            levelManger.create(newLevelSO);
//            levels.add(newLevelSO);
        } catch (Exception e) {

        }

    }

    public void addNewYear() {
        YearManager yearManager = new YearManager();
        yearManager.create(newYearSO);
    }

}
