/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transformers;

import Entities.Level;
import Entities.StdStudent;
import Entities.Term;
import Entities.Year;
import screenObject.StudentScreenObject;

/**
 *
 * @author Ehab
 */
public class StudentTransformer extends AbstractTransformer<StdStudent, StudentScreenObject> {

    @Override
    public StudentScreenObject fromEntityToScreen(StdStudent entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StdStudent fromScreenToEntity(StudentScreenObject screenObject) {
        StdStudent entity = new StdStudent();
        entity.setCode(screenObject.getCode());
        entity.setFirstName(screenObject.getFirstName());
        entity.setMiddleName(screenObject.getMiddleName());
        Level level1 = new Level();
        
        Term term = new Term();
        term.setLevel(level1);
        
        Year year = new Year();
        year.setTerm(term);
        entity.setYear(year);
        return entity;
    }

}
