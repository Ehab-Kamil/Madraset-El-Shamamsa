/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import DAO.LevelDAO;
import Entities.Level;
import Transformers.LevelTransformer;
import screenObject.LevelScreenObject;

/**
 *
 * @author Ehab
 */
public class LevelManager extends AbstractManager<Level, LevelScreenObject>{
    
    public LevelManager() {
        super(new LevelDAO(), new LevelTransformer());
    }
    
}
