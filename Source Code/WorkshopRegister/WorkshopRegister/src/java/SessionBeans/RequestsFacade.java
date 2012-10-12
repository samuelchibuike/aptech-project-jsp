/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import Entity.Requests;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ANHDUNG
 */
@Stateless
public class RequestsFacade extends AbstractFacade<Requests> {
    @PersistenceContext(unitName = "WorkshopRegisterPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RequestsFacade() {
        super(Requests.class);
    }
        
    
}
