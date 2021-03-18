/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repositories.implementation;

import com.POJOS.Socio;
import com.repositories.RepositoryBase;
import com.repositories.interfaces.ISociosRepository;
import javax.persistence.EntityManager;

/**
 *
 * @author felix
 */
public class SociosRepository extends RepositoryBase<Socio> implements ISociosRepository{
    
    public SociosRepository(EntityManager em) {
        super(em);
    }
    
}
