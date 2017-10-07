/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transformers;

import DAO.YearDAO;
import Entities.Term;
import Entities.Year;
import java.util.Date;
import screenObject.TermSO;

/**
 *
 * @author Ehab
 */
public class TermTransformer extends AbstractTransformer<Term, TermSO> {

    @Override
    public TermSO fromEntityToScreen(Term entity) {
        TermSO so = new TermSO();
        so.setTermCode(entity.getCode());
        if (entity.getYear() != null) {
            so.setYearCode(entity.getYear().getCode());
        }
        return so;
    }

    @Override
    public Term fromScreenToEntity(TermSO screenObject) {
        Term term = new Term();

        term.setCode(screenObject.getTermCode());
        YearDAO yearDao = new YearDAO();
        Year year = yearDao.findByCode(screenObject.getYearCode());
        term.setYear(year);
        term.setLastModifiedBy("System");
        term.setLastModifiedDate(new Date());
        return term;
    }

}
