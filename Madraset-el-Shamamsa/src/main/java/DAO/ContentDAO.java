/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

import org.hibernate.Query;

import Entities.Content;
import screenObject.ContentSO;

/**
 *
 * @author Ehab
 */
public class ContentDAO extends AbstractDao<Content> {

	public ContentDAO() {
		super(Content.class);
	}

	public List<ContentSO> findAllParents() {
		
		startOperation();
		Query query = session.createQuery("FROM Content content where  content.isParent = 1");

		return query.list();
	}
}
