/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repositories.implementation;

import com.POJOS.Barco;
import com.repositories.RepositoryBase;
import com.repositories.interfaces.IBarcosRepository;
import javax.persistence.EntityManager;

/**
 *
 * @author felix
 */
public class BarcosRepository extends RepositoryBase<Barco> implements IBarcosRepository {
    
    public BarcosRepository(EntityManager em) {
        super(em);
    }
    
}
