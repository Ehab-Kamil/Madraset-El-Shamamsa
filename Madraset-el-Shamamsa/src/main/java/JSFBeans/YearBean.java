/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSFBeans;

import Managers.YearManager;
import Entities.Year;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import screenObject.ScreenObject;
import screenObject.YearSO;

/**
 *
 * @author Ehab
 */
@ManagedBean(name = "yearBean")
@ApplicationScoped
public class YearBean {

    private YearSO year;
    private List<ScreenObject> years;

    public YearBean() {
        year = new YearSO();

        YearManager yearManager = new YearManager();
        years = yearManager.findAll(Year.class);
    }

    public void addYear() {
        YearManager yearManager = new YearManager();
        yearManager.create(year);
        year = new YearSO();
    }

    public YearSO getYear() {
        return year;
    }

    public void setYear(YearSO year) {
        this.year = year;
    }

    public List<ScreenObject> getYears() {
        return years;
    }

    public void setYears(List<ScreenObject> years) {
        this.years = years;
    }

}
