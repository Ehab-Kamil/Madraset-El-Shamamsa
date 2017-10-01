/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.StdStudent;
import org.hibernate.Query;

/**
 *
 * @author Ehab
 */
public class StudentDAO extends AbstractDao<StdStudent> {

    public StudentDAO() {
        super(StdStudent.class);
    }

    @Override
    public StdStudent findByCode(String code) {
        StdStudent student = null;
        try {
            startOperation();
            Query query = session.createQuery("From Entities.StdStudent student where student.code ='" + code + "'");
            student = (StdStudent) query.uniqueResult();
        } finally {
            HibernateFactory.close(session);
        }
        return student;
    }

}
