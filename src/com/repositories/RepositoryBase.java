/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.eclipse.persistence.internal.oxm.Root;

/**
 *
 * @author felix
 */
public class RepositoryBase<T> implements IRepository<T>{

    private EntityManager entityManager;
    private Class<T> type;

    public RepositoryBase(EntityManager entityManager) {
        this.entityManager = entityManager;

        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }

    @Override
    public T agregar(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        return entity;
    }

    @Override
    public void Eliminar(T entity) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.merge(entity));
        entityManager.getTransaction().commit();
    }

    @Override
    public List<T> lista() {
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(type));
        Query query = entityManager.createQuery(criteria);
        List<T> lista = query.getResultList();
        entityManager.getTransaction().commit();
        return lista;
    }

    @Override
    public T obtener(Long id) {
        return entityManager.find(type, id);
    }

    @Override
    public T actualizar(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entityManager.merge(entity));
        entityManager.getTransaction().commit();
        return entity;
    }

}
