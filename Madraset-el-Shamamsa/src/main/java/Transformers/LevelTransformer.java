/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transformers;

import Entities.Level;
import screenObject.LevelScreenObject;

/**
 *
 * @author Ehab
 */
public class LevelTransformer extends AbstractTransformer<Level, LevelScreenObject> {

    @Override
    public LevelScreenObject fromEntityToScreen(Level entity) {
        LevelScreenObject levelSO = new LevelScreenObject();
        levelSO.setLevelCode(entity.getCode());
        levelSO.setLevelName(entity.getTitle());
        return levelSO;
    }

    @Override
    public Level fromScreenToEntity(LevelScreenObject screenObject) {
        Level level = new Level();
        level.setCode(screenObject.getLevelCode());
        level.setTitle(screenObject.getLevelName());

        return level;
    }

}
