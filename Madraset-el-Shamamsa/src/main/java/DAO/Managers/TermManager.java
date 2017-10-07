/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Managers;

import DAO.TermDAO;
import Entities.Term;
import Transformers.TermTransformer;
import screenObject.TermSO;

/**
 *
 * @author Ehab
 */
public class TermManager extends AbstractManager<Term, TermSO> {

    public TermManager() {
        super(new TermDAO(), new TermTransformer());
    }

}
