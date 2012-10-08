/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Accounts;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ANHDUNG
 */
@Stateless
public class AccountsFacade extends AbstractFacade<Accounts> {

    @PersistenceContext(unitName = "testJSFPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountsFacade() {
        super(Accounts.class);
    }

    public List<Accounts> ShowAcc() {
        String eql = "SELECT a FROM Accounts a WHERE a.aStatus = 1";
        return em.createQuery(eql).getResultList();
    }
    
    public Accounts getAccountByID(String ID){
        String eql = "SELECT a FROM Accounts a WHERE a.aID = :aID";
        return (Accounts) em.createQuery(eql).setParameter("aID", ID).getSingleResult();
    }
    
    public void Update(Accounts a){
        em.merge(a);
    }
    
    public void Delete(Accounts a){
        em.merge(a);
    }
    
    public void AddAcount(Accounts a){
        em.persist(a);
    }
}
