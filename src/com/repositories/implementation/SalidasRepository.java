/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repositories.implementation;

import com.POJOS.Salida;
import com.repositories.RepositoryBase;
import com.repositories.interfaces.ISalidasRepository;
import javax.persistence.EntityManager;

/**
 *
 * @author felix
 */
public class SalidasRepository extends RepositoryBase<Salida> implements ISalidasRepository {
    
    public SalidasRepository(EntityManager em) {
        super(em);
    }
    
}
