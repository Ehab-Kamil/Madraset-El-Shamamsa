/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import DAO.AbstractDao;
import Entities.AbstractEntity;
import Transformers.AbstractTransformer;
import java.util.ArrayList;
import java.util.List;
import screenObject.ScreenObject;

/**
 *
 * @author Ehab
 */
public abstract class AbstractManager<T extends AbstractEntity, H extends ScreenObject> {

	private AbstractDao entityDao;
	private AbstractTransformer transformer;

	public AbstractManager(AbstractDao dao, AbstractTransformer transformer) {
		this.setEntityDao(dao);
		this.setTransformer(transformer);
	}

	public void create(H h) {

		try {

			doBeforeTransformEntity();

			AbstractEntity entity = getTransformer().fromScreenToEntity(h);

			doBeforeSaveEntity();

			getEntityDao().create(entity);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public H findByCode(String code) {

		AbstractEntity entity = getEntityDao().findByCode(code);

		return (H) getTransformer().fromEntityToScreen(entity);
	}

	public List<H> findAll() {

		T t;
		List<H> SOs = new ArrayList<H>();

		try {
			t = (T) getEntityDao().getEntityClass().newInstance();

			List<AbstractEntity> entities = getEntityDao().findAll(t.getClass());
			for (AbstractEntity entity : entities) {
				SOs.add((H) getTransformer().fromEntityToScreen(entity));
			}

		} catch (Exception e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		return SOs;

	}

	public AbstractDao getEntityDao() {
		return entityDao;
	}

	public void setEntityDao(AbstractDao entityDao) {
		this.entityDao = entityDao;
	}

	public AbstractTransformer getTransformer() {
		return transformer;
	}

	public void setTransformer(AbstractTransformer transformer) {
		this.transformer = transformer;
	}

	protected void doBeforeSaveEntity() {
		// do Nothing
	}

	protected void doBeforeTransformEntity() {
		// do Nothing
	}

}
