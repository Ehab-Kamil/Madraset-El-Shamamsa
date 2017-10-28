/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transformers;

import DAO.ContentDAO;
import Entities.Content;
import screenObject.ContentSO;

/**
 *
 * @author Ehab
 */
public class ContentTransformer extends AbstractTransformer<Content, ContentSO> {

	@Override
	public ContentSO fromEntityToScreen(Content entity) {
		ContentSO content = new ContentSO();
		content.setContentCode(entity.getCode());
		content.setContentName(entity.getName());
		return content;
	}

	@Override
	public Content fromScreenToEntity(ContentSO screenObject) {
		Content content = new Content();
		content.setCode(screenObject.getContentCode());
		content.setName(screenObject.getContentName());
		content.setDurationInHours(screenObject.getDurationInHours());
		content.setType(screenObject.getSelectedType());
		content.setIsParent(screenObject.isParent());

		if (screenObject.getParentContentCode() != null) {
			ContentDAO contentDAO = new ContentDAO();
			content.setContent(contentDAO.findByCode(screenObject.getParentContentCode()));
		}
		
		return content;

	}

}
