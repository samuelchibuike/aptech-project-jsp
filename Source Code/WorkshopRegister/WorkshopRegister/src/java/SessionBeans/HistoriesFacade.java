/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import Entity.Histories;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ANHDUNG
 */
@Stateless
public class HistoriesFacade extends AbstractFacade<Histories> {
    @PersistenceContext(unitName = "WorkshopRegisterPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HistoriesFacade() {
        super(Histories.class);
    }
    
}
