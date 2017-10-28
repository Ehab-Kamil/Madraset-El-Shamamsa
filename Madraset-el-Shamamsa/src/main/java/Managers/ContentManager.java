/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import java.util.List;

import DAO.ContentDAO;
import Entities.Content;
import Transformers.ContentTransformer;
import screenObject.ContentSO;

/**
 *
 * @author Ehab
 */
public class ContentManager extends AbstractManager<Content, ContentSO> {

	public ContentManager() {
		super(new ContentDAO(), new ContentTransformer());
	}

	public List<ContentSO> getAllParents() {
		return ((ContentDAO) getEntityDao()).findAllParents();
	}

}
