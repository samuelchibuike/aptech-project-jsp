/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JFSBeans;

import Entity.Permissions;
import SessionBeans.PermissionsFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;

/**
 *
 * @author ANHDUNG
 */
@ManagedBean
@SessionScoped
public class Permission {
    @EJB
    private PermissionsFacade permissionsFacade;

    
    public Permission() {
    }
    
    Permissions per = new Permissions();
    private String message ;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Permissions getPer() {
        return per;
    }

    public void setPer(Permissions per) {
        this.per = per;
    }
    
    public List<Permissions> listPermiss(Boolean _pStatus){        
        return permissionsFacade.ShowAcc(_pStatus);
    }        
    
    public Boolean checkName(String _pName){
        List<Permissions> lPermiss = permissionsFacade.findAll();
        for(Permissions p : lPermiss){
            if(p.getPName().equalsIgnoreCase(_pName) == true)
                return false;
        }
        return true;
    }
    
    public String blockPermiss(int pid){
        Permissions p1 ;
        p1 = permissionsFacade.getPermissByID(pid);
        p1.setPStatus(Boolean.FALSE);
        permissionsFacade.Update(p1);
        return "list";
    }
    
    public String RestorePermiss(int pid){
        Permissions p1 ;
        p1 = permissionsFacade.getPermissByID(pid);
        p1.setPStatus(Boolean.TRUE);
        permissionsFacade.Update(p1);
        return "Restore";
    }
    
    public String AddNew(){                
        if(checkName(per.getPName()) == true){
            per.setPID(6);
            per.setPStatus(Boolean.TRUE);
            permissionsFacade.AddPermiss(per);       
            per.setPName("");
            return "list";
        }else{             
            message = "Permiss name has been exist please enter again!";
            return "list";
        }                
    }
    
}
