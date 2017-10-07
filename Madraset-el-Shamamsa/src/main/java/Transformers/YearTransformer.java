/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transformers;

import DAO.LevelDAO;
import Entities.Level;
import Entities.Year;
import java.util.Date;
import screenObject.YearSO;

/**
 *
 * @author Ehab
 */
public class YearTransformer extends AbstractTransformer<Year, YearSO> {

    @Override
    public YearSO fromEntityToScreen(Year entity) {
        YearSO so = new YearSO();
        so.setYearCode(entity.getCode());
        so.setYearName(entity.getName());
        so.setLevelCode(entity.getLevel().getCode());

        return so;

    }

    @Override
    public Year fromScreenToEntity(YearSO screenObject) {
        Year year = new Year();
        year.setCode(screenObject.getYearCode());
        year.setName(screenObject.getYearName());
        year.setLastModifiedDate(new Date());
        year.setLastModifiedBy("System");
        LevelDAO levelDao = new LevelDAO();
        Level level = levelDao.findByCode(screenObject.getLevelCode());
        year.setLevel(level);

        return year;
    }

}
