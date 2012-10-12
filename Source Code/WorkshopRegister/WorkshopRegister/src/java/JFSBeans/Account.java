/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JFSBeans;

import Entity.Accounts;
import Entity.Permissions;
import SessionBeans.AccountsFacade;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.mail.Session;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ANHDUNG
 */
@ManagedBean
@SessionScoped
public class Account {
    @EJB
    private AccountsFacade accountsFacade;
    private Accounts acc = new Accounts();
    private String message = "";
    private String newPass;

    public String getNewPass() {
        return newPass;
    }

    public void setNewPass(String newPass) {
        this.newPass = newPass;
    }
    
    public Account() {
    }       

    public Accounts getAcc() {
        return acc;
    }

    public void setAcc(Accounts acc) {
        this.acc = acc;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public List<Accounts> list() {
        return accountsFacade.findAll();
    }
    
    public boolean checkAccountID(String _aID){
        List<Accounts> list = list();
        for(Accounts a : list){
            if(a.getAName().equalsIgnoreCase(_aID)){
                return false;
            }
        }
        return true;
    }
    
    public boolean checkAccountEmail(String _aEmail){
        List<Accounts> list = list();
        for(Accounts a : list){
            if(a.getAEmail().equalsIgnoreCase(_aEmail)){
                return false;
            }
        }
        return true;
    }
        
        
    public String login(){
        try{
            acc = accountsFacade.Login(acc.getAName(),acc.getAPass());
            if(acc.getAEmail() == null){
                message = "Account not exist !";
                return "Login";
            }
            else{
                HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
                session.setAttribute("userName", acc.getAName());                                 
                session.setAttribute("uEmail", acc.getAEmail());                                 
                if(acc.getPid().getPID() == 1){
                    session.setAttribute("userPermiss", acc.getPid()+"");
                }                                
                acc.setAPass("");
                message = "";
                return "UserTemplate";               
            }
        }catch(Exception ex){
            message = "Account not exist !";
            return "Login";
        }        
    }
        
    
    public String changePass(){
        try{
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);            
            acc = accountsFacade.changePass(session.getAttribute("userName").toString(),acc.getAPass());
            if(acc.getAEmail() == null){
                message = "Old pass not correct !";
                return "changePass";
            }            
            else{
                acc.setAPass(newPass);
                accountsFacade.Update(acc);       
                message = "";
                return "UserTemplate";
            }                                    
        }catch(Exception ex){
            message = "Old pass not correct !";
            return "changePass";
        }                
    }    
    
    public String AddNewAccount(){        
        if(checkAccountID(acc.getAName()) == false){
            message = "Account Name has been exist !";
        }else if(checkAccountEmail(acc.getAEmail()) == false){
            message = "Email has been exist !";
        }else{
            Permissions permiss = new Permissions();
            permiss.setPID(4);
            Date d = new Date();
            acc.setABirthday(d);
            acc.setAStatus("active");
            acc.setPid(permiss);
            accountsFacade.AddAccount(acc);
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            session.setAttribute("userName", acc.getAName());            
            session.setAttribute("islogin", "OK");
            message = "Insert Success";            
        }                
        return "UserTemplate";
    }
        
    public String Logout(){
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.removeValue("userName");
        session.removeValue("userPermiss");
        session.removeValue("uEmail");        
        //acc.setAName("");
        //acc.setAPass("");
        acc = new Accounts();
        return "UserTemplate";
        
    }
    
    public String changeInfor(){        
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        acc = accountsFacade.changeInfo(session.getAttribute("userName").toString());
        return "changeInfor";
    }
    
    public String UpdateInfor(){
        accountsFacade.Update(acc);
        message = "Update Success";
        return "changeInfor";
    }
    
}
