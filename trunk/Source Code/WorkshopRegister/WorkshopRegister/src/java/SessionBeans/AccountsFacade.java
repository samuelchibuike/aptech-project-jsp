/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import Entity.Accounts;
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
    @PersistenceContext(unitName = "WorkshopRegisterPU")
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
            
    public Accounts Login(String _aID, String _aPass){
        try{
            String eql = "SELECT a FROM Accounts a WHERE a.aName = :aName and a.aPass = :aPass";
            return (Accounts) em.createQuery(eql).setParameter("aName", _aID).setParameter("aPass", _aPass).getSingleResult();
        }catch(Exception ex){            
            return new Accounts();
        }        
    }
    
    public Accounts changePass(String _aID, String _aPass){
        try{
            String eql = "SELECT a FROM Accounts a WHERE a.aName = :aName and a.aPass = :aPass";
            return (Accounts) em.createQuery(eql).setParameter("aName", _aID).setParameter("aPass", _aPass).getSingleResult();
        }catch(Exception ex){            
            return new Accounts();
        }        
    }
    
    public Accounts changeInfo(String _aID){
        try{
            String eql = "SELECT a FROM Accounts a WHERE a.aName = :aName";
            return (Accounts) em.createQuery(eql).setParameter("aName", _aID).getSingleResult();
        }catch(Exception ex){            
            return new Accounts();
        }        
    }
    
    
    public void AddAccount(Accounts acc){
        em.persist(acc);
    }
    
    public void Update(Accounts acc){
        em.merge(acc);
    }
    
    public void Delete(Accounts acc){
        em.merge(acc);
    }
        
    
}
