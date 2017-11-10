/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transformers;

import DAO.TermDAO;
import Entities.StdStudent;
import Entities.Term;
import screenObject.StudentScreenObject;

/**
 *
 * @author Ehab
 */
public class StudentTransformer extends AbstractTransformer<StdStudent, StudentScreenObject> {

	@Override
	public StudentScreenObject fromEntityToScreen(StdStudent entity) {
		StudentScreenObject so = new StudentScreenObject();
		so.setCode(entity.getCode());
		so.setFirstName(entity.getFirstName());
		so.setMiddleName(entity.getMiddleName());
		so.setLastName(entity.getLastName());

		return so;

	}

	@Override
	public StdStudent fromScreenToEntity(StudentScreenObject screenObject) {
		StdStudent entity = new StdStudent();
		entity.setCode(screenObject.getCode());
		entity.setFirstName(screenObject.getFirstName());
		entity.setMiddleName(screenObject.getMiddleName());

		TermDAO termDao = new TermDAO();
		Term term = termDao.findByCode(screenObject.getTermCode());

		entity.setTerm(term);

		return entity;
	}

}
