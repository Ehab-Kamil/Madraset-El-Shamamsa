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
public class ContentSO implements ScreenObject {

    private String contentCode;
    private String contentName;
    private String parentContentCode;

    public String getContentCode() {
        return contentCode;
    }

    public void setContentCode(String contentCode) {
        this.contentCode = contentCode;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public String getParentContentCode() {
        return parentContentCode;
    }

    public void setParentContentCode(String parentContentCode) {
        this.parentContentCode = parentContentCode;
    }

    @Override
    public String toString() {
        return getContentCode();
    }

    
    
}
