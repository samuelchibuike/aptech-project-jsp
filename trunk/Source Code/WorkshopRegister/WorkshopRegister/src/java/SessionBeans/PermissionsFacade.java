/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import Entity.Permissions;
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
public class PermissionsFacade extends AbstractFacade<Permissions> {
    @PersistenceContext(unitName = "WorkshopRegisterPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PermissionsFacade() {
        super(Permissions.class);
    }
    
    public List<Permissions> ShowAcc(Boolean _pStatus) {
        String eql = "SELECT p FROM Permissions p WHERE p.pStatus = :pStatus";        
        return em.createQuery(eql).setParameter("pStatus", _pStatus).getResultList();
    }
    
    public Permissions getPermissByID(int _pID){        
        try{
            String eql = "SELECT p FROM Permissions p WHERE p.pID = :pID";
            return (Permissions) em.createQuery(eql).setParameter("pID", _pID).getSingleResult();
        }catch(Exception ex){
            return new Permissions();
        }        
    }        
    
    public Permissions getPermissByName(String _pName){        
        try{
            String eql = "SELECT p FROM Permissions p WHERE p.pName = :pName";
            return (Permissions) em.createQuery(eql).setParameter("pName", _pName).getSingleResult();
        }catch(Exception ex){
            return new Permissions();
        }        
    }        
                       
    public void Edit(Permissions permis){
        em.merge(permis);
    }
    
    public void Update(Permissions permis){
        em.merge(permis);
    }
    
    public void AddPermiss(Permissions permis){
        em.persist(permis);
    }
                
}
