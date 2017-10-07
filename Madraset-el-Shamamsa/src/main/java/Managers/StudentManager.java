/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import DAO.StudentDAO;
import Entities.StdStudent;
import Transformers.StudentTransformer;
import screenObject.StudentScreenObject;

/**
 *
 * @author Ehab
 */
public class StudentManager extends AbstractManager<StdStudent, StudentScreenObject>{
    
    public StudentManager() {
        super(new StudentDAO(), new StudentTransformer());
    }
    
    
    
}
