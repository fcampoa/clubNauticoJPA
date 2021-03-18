/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubnauticojpa;

// import com.POJOS.Barco;
import com.POJOS.Barco;
import com.POJOS.Socio;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author felix
 */
public class ClubNauticoJPA {

    /**
     * @param args the command line arguments
     */
      static  UnitOfWork unitOfWork = new UnitOfWork();
    public static void main(String[] args) {
       
        buscar();
    }
    
    private static void agregar() {
         try {

            Socio socio = new Socio();
            socio.setNombre("felix campoa");
            socio.setDni("4556");
            
            unitOfWork.getSociosRepository().agregar(socio);
            
            System.out.println("todo bien");
        
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    private static void buscar() {
        try {
            Socio socio = unitOfWork.getSociosRepository().obtener(1L);
            System.out.println(socio);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
