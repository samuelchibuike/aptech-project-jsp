/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JFSBeans;

import Entity.Accounts;
import Entity.Presentations;
import SessionBeans.PresentationsFacade;
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
public class Presentation {
    @EJB
    private PresentationsFacade presentationsFacade;    
    private Presentations pre = new Presentations();    
    private String message;
    private String tbx;
    
    public Presentation() {        
    }        

    public String getTbx() {
        return tbx;
    }

    public void setTbx(String tbx) {
        this.tbx = tbx;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Presentations getPre() {
        return pre;
    }

    public void setPre(Presentations pre) {
        this.pre = pre;
    }
    
    public List<Presentations> listPres(){
        return presentationsFacade.findAll();
    }          
    
    public String searchPre(){              
        try{
            if(pre.getPrTitle() == null){                
                message = "Error for search !";
                return "searchPresen";
            }else{
                pre = presentationsFacade.getPresenByTitle(pre.getPrTitle().toString());                                 
                if(pre.getPrAdd()!=null){
                    message = "Search Success !";
                    return "viewDetailPresentations";                   
                }else{
                    message = "Error for search !";
                    return "searchPresen";
                }                            
            }            
        }catch(Exception ex){
            message = "Error for search !";
            return "searchPresen";
        }                                                             
    }
    

    public List<Presentations> listPresen() {
        return presentationsFacade.lPrensentations("Accepted");
         
    }

    public String findId(int _pID) {   
        message = "";
        pre = presentationsFacade.preDetails(_pID);                      
        return "viewDetailPresentations";
    }
    
    public String add() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        Accounts acc = new Accounts();
        acc.setAEmail(session.getAttribute("uEmail").toString());                
        pre.setPrID(97);
        pre.setPrStatus("Request");
        pre.setAEmail(acc);
        presentationsFacade.create(pre);
        message = "Success";
        return "viewAllPresentations";
    }
}
