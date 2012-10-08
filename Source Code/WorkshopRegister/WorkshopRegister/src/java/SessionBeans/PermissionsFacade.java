/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import Entity.Permissions;
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
    
    public List<Permissions> ShowAcc() {
        String eql = "SELECT p FROM Permissions p WHERE p.pStatus = 1";
        return em.createQuery(eql).getResultList();
    }
    
}
