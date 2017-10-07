/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transformers;

import Entities.Content;
import screenObject.ContentSO;

/**
 *
 * @author Ehab
 */
public class ContentTransformer extends AbstractTransformer<Content,ContentSO>{

    @Override
    public ContentSO fromEntityToScreen(Content entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Content fromScreenToEntity(ContentSO screenObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
