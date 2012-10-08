/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jsfBean;

import entity.Accounts;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import session.AccountsFacade;

/**
 *
 * @author ANHDUNG
 */
@ManagedBean
@SessionScoped
public class Function {

    @EJB
    private AccountsFacade accountsFacade;
    /**
     * Creates a new instance of Function
     */
    Accounts a = new Accounts();
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Accounts getA() {
        return a;
    }

    public void setA(Accounts a) {
        this.a = a;
    }

    public Function() {
    }

    public List<Accounts> list() {
        return accountsFacade.findAll();
    }

    public boolean CheckID(String s) {
        List<Accounts> a = list();
        for (Accounts accounts : a) {
            if (accounts.getAID().equals(s)) {
                return false;
            }
        }
        return true;
    }

    public String addNew() {
        if (CheckID(a.getAID()) == false) {
            message = "ID exist";
        } else {
            a.setAStatus(Boolean.TRUE);
            accountsFacade.AddAcount(a);
            message = "ok";
        }
        return "index";
    }

    public void Update(Accounts a) {
        a.setAStatus(Boolean.FALSE);
        accountsFacade.Delete(a);
    }
    
    public String accByID(String id){
        a = accountsFacade.getAccountByID(id);
        return "edit";
    }

    public String Update2() {                
        accountsFacade.Update(a);
        return "index";
    }
    
}
