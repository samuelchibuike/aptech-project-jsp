/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JFSBeans;

import Entity.Accounts;
import Entity.Presentations;
import Entity.Requests;
import SessionBeans.RequestsFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ANHDUNG
 */
@ManagedBean
@SessionScoped
public class RequestBean {
    @EJB
    private RequestsFacade requestsFacade;
    
    public RequestBean() {
    }
    
    private Requests r = new Requests();
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
    public Requests getR() {
        return r;
    }

    public void setR(Requests r) {
        this.r = r;
    }
    
    public String JoinPresentation(int id){
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);        
        if(isJoinPresentation(id, session.getAttribute("uEmail").toString()) == false){
            message = "You has been join this Presentation please join other Presentation";            
        }else{
            Presentations pres = new Presentations();
            Accounts acc = new Accounts();
            acc.setAEmail(session.getAttribute("uEmail").toString());        
            pres.setPrID(id);
            r.setRID(12);
            r.setAEmail(acc);  
            r.setRType("Register");
            r.setRStatus("Not Confirm");
            r.setPrID(pres);        
            requestsFacade.create(r);
            message = "Success";
        }                 
        return "viewDetailPresentations";                                
    }         
            
    public Boolean isJoinPresentation(int _prID, String _aEmail){
        List<Requests> lRequest = requestsFacade.findAll();        
        for(Requests r1 : lRequest){                 
            int id = r1.getPrID().getPrID();
            String email = r1.getAEmail().getAEmail();            
            if((id == _prID) && (email.equals(_aEmail)) == true){                 
                return false;
            }
        }                 
       return true;
    }
}
