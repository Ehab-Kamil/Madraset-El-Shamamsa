/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.StdStudent;

/**
 *
 * @author Ehab
 */
public class StudentDAO extends AbstractDao<StdStudent> {

    public StudentDAO() {
        super(StdStudent.class);
    }

}
