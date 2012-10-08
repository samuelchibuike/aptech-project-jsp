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
import javax.persistence.Entity;

/**
 *
 * @author ANHDUNG
 */
@ManagedBean
@RequestScoped
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
    
    public List<Permissions> listPermiss(){
        return permissionsFacade.findAll();
    }
    
    
    
}
