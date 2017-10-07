/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transformers;

import Entities.AbstractEntity;
import screenObject.ScreenObject;

/**
 *
 * @author Ehab
 */
public abstract class AbstractTransformer<T extends AbstractEntity, H extends ScreenObject> {

    
    abstract public H fromEntityToScreen(T entity);
    
    abstract public T fromScreenToEntity(H screenObject);
    
}
