/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenObject;

/**
 *
 * @author Ehab
 */
public class TermSO implements ScreenObject {

    private String termCode;
    private String termName;
    private String yearCode;

    public String getTermCode() {
        return termCode;
    }

    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public String getYearCode() {
        return yearCode;
    }

    public void setYearCode(String yearCode) {
        this.yearCode = yearCode;
    }

    @Override
    public String toString() {
        return getTermCode();
    }

}
