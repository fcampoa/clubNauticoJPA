/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubnauticojpa;

import com.repositories.implementation.BarcosRepository;
import com.repositories.implementation.SalidasRepository;
import com.repositories.implementation.SociosRepository;
import com.repositories.interfaces.IBarcosRepository;
import com.repositories.interfaces.ISalidasRepository;
import com.repositories.interfaces.ISociosRepository;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author felix
 */
public class UnitOfWork {
    
    public UnitOfWork() {
        
    }
    
    private EntityManager entityManager;
    
    private IBarcosRepository barcosRepository;
    
    private ISociosRepository sociosRepository;
    
    private ISalidasRepository salidasRepository;
    
    public EntityManager getEntityManager() {
        return entityManager != null ? entityManager : (entityManager = Persistence.createEntityManagerFactory("clubNauticoJPAPU").createEntityManager());
    }
    
    public IBarcosRepository getBarcosRepository() {
        return barcosRepository != null ? barcosRepository : (barcosRepository = new BarcosRepository(getEntityManager()));
    }
    
    public ISociosRepository getSociosRepository() {
        return sociosRepository != null ? sociosRepository : (sociosRepository = new SociosRepository(getEntityManager()));
    }
    
    public ISalidasRepository getSalidasRepository() {
        return salidasRepository != null ? salidasRepository : (salidasRepository = new SalidasRepository(getEntityManager()));
    }
}
