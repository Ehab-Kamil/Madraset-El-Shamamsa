/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSFBeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import Managers.ContentManager;
import screenObject.ContentSO;

/**
 *
 * @author Ehab
 */
@ManagedBean(name = "contentBean")
@ViewScoped
public class ContentBean {

	private ContentSO contentSO;
	private List<ContentSO> contents;
	private ContentManager contentManager;

	@PostConstruct
	private void init() {
		contentSO = new ContentSO();
		contentManager = new ContentManager();
		contents = contentManager.getAllParents();
	}

	public ContentSO getContentSO() {
		return contentSO;
	}

	public void setContentSO(ContentSO contentSO) {
		this.contentSO = contentSO;
	}

	public List<ContentSO> getContents() {
		return contents;
	}

	public void setContents(List<ContentSO> contents) {
		this.contents = contents;
	}

	public void addContent() {
		contentManager.create(contentSO);
		if (contentSO.isParent()) {
			contents.add(contentSO);
		}
		contentSO = new ContentSO();
	}

}
