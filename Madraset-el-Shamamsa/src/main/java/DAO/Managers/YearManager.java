/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Managers;

import DAO.AbstractDao;
import DAO.YearDAO;
import Entities.Year;
import Transformers.AbstractTransformer;
import Transformers.YearTransformer;
import screenObject.YearSO;

/**
 *
 * @author Ehab
 */
public class YearManager extends AbstractManager<Year, YearSO> {

    public YearManager() {
        super(new YearDAO(), new YearTransformer());
    }

}
