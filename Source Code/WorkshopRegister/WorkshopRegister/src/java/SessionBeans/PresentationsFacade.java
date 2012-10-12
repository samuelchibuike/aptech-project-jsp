/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import Entity.Presentations;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ANHDUNG
 */
@Stateless
public class PresentationsFacade extends AbstractFacade<Presentations> {
    @PersistenceContext(unitName = "WorkshopRegisterPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }   
    
    public PresentationsFacade() {
        super(Presentations.class);
    }        
         
    public Presentations getPresenByTitle(String _prTitle){
        try{
            String eql = "SELECT p FROM Presentations p WHERE p.prTitle = :prTitle";      
            return (Presentations) em.createQuery(eql).setParameter("prTitle", _prTitle).getSingleResult();
        }catch(Exception ex){             
            return new Presentations();
        }                       
    }
    
    public List<Presentations> lPrensentations(String _pStatus){
        try{
            String sql = "SELECT p FROM Presentations p WHERE p.prStatus = :prStatus";
            return em.createQuery(sql).setParameter("prStatus", _pStatus).getResultList();
        }catch(Exception ex){
            List<Presentations> lpre = null ;
            return lpre; 
        }   
    }
    
    public Presentations preDetails(int _pID){
        try{
            String sql = "SELECT p FROM Presentations p WHERE p.prID = :prID";             
            return (Presentations) em.createQuery(sql).setParameter("prID", _pID).getSingleResult();
        }catch(Exception ex){            
            return new Presentations(); 
        }   
    }
    
    
    
}
