/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSFBeans;

import Managers.ContentManager;
import java.util.List;
import javax.faces.bean.ManagedBean;
import screenObject.ContentSO;
import screenObject.ScreenObject;

/**
 *
 * @author Ehab
 */
@ManagedBean(name = "contentBean")
public class ContentBean {

    private ContentSO contentSO;
    private List<ScreenObject> contents;

    public ContentSO getContentSO() {
        return contentSO;
    }

    public void setContentSO(ContentSO contentSO) {
        this.contentSO = contentSO;
    }

    public List<ScreenObject> getContents() {
        return contents;
    }

    public void setContents(List<ScreenObject> contents) {
        this.contents = contents;
    }

    public void addContent() {
        ContentManager contentManager = new ContentManager();
        contentManager.create(contentSO);
        contentSO = new ContentSO();
    }

}
