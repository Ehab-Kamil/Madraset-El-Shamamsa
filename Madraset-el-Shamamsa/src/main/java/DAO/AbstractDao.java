/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.AbstractEntity;
import Exceptions.DataAccessLayerException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

/**
 *
 * @author Ehab
 */
public abstract class AbstractDao<T extends AbstractEntity> {

    public Session session;
    private Transaction tx;
    private Class<T> cls;

    public AbstractDao(Class<T> t) {
        cls = t;
        HibernateFactory.buildIfNeeded();
    }

    public void create(T t) {
        try {
            startOperation();
            session.saveOrUpdate(t);
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
    }

    public void saveOrUpdate(T t) {
        try {
            startOperation();
            session.update(t);
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
    }

    public void delete(T t) {
        try {
            startOperation();
            session.delete(t);
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
    }

    public T find(Class clazz, Long id) {
        T obj = null;
        try {
            startOperation();
            obj = (T) session.load(clazz, id);
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
//            HibernateFactory.close(session);
        }
        return obj;
    }

    public List<T> findAll(Class clazz) {
        List<T> objects = null;
        try {
            startOperation();
            Query query = session.createQuery("from " + clazz.getName());
            objects = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return objects;
    }

    public T findByCode(String code) {
        T entity = null;
        try {
            startOperation();
            Query query = session.createQuery("From "+cls.getName()+" alias where alias.code ='" + code + "'");
            entity = (T) query.uniqueResult();
        } finally {
            HibernateFactory.close(session);
        }
        return entity;
    }

    public List<T> findByExample(T t) {
        List<T> objects = null;
        try {
            startOperation();
            objects = session.createCriteria(t.getClass()).add(Example.create(t).ignoreCase()).list();
//            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return objects;
    }

    protected void handleException(HibernateException e) throws DataAccessLayerException {
        HibernateFactory.rollback(tx);
        throw new DataAccessLayerException(e);
    }

    public void startOperation() throws HibernateException {
        session = HibernateFactory.openSession();
        tx = session.beginTransaction();
    }

}
