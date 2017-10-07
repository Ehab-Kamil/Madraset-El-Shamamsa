/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transformers;

import DAO.LevelDAO;
import Entities.Level;
import Entities.Term;
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
        so.setLevelCode(entity.getLevel().getCode());
        return so;
    }

    @Override
    public Term fromScreenToEntity(TermSO screenObject) {
        Term term = new Term();

        term.setCode(screenObject.getTermCode());
        LevelDAO levelDao = new LevelDAO();
        Level level = levelDao.findByCode(screenObject.getLevelCode());
        term.setLevel(level);
        term.setLastModifiedBy("System");
        term.setLastModifiedDate(new Date());
        return term;
    }

}
