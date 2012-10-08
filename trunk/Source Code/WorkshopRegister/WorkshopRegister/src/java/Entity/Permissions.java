/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ANHDUNG
 */
@Entity
@Table(name = "Permissions", catalog = "eProject_sem4", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permissions.findAll", query = "SELECT p FROM Permissions p"),
    @NamedQuery(name = "Permissions.findByPID", query = "SELECT p FROM Permissions p WHERE p.pID = :pID"),
    @NamedQuery(name = "Permissions.findByPName", query = "SELECT p FROM Permissions p WHERE p.pName = :pName"),
    @NamedQuery(name = "Permissions.findByPStatus", query = "SELECT p FROM Permissions p WHERE p.pStatus = :pStatus")})
public class Permissions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pID", nullable = false)
    private Integer pID;
    @Size(max = 30)
    @Column(name = "pName", length = 30)
    private String pName;
    @Column(name = "pStatus")
    private Boolean pStatus;
    @OneToMany(mappedBy = "pid")
    private Collection<Accounts> accountsCollection;

    public Permissions() {
    }

    public Permissions(Integer pID) {
        this.pID = pID;
    }

    public Integer getPID() {
        return pID;
    }

    public void setPID(Integer pID) {
        this.pID = pID;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public Boolean getPStatus() {
        return pStatus;
    }

    public void setPStatus(Boolean pStatus) {
        this.pStatus = pStatus;
    }

    @XmlTransient
    public Collection<Accounts> getAccountsCollection() {
        return accountsCollection;
    }

    public void setAccountsCollection(Collection<Accounts> accountsCollection) {
        this.accountsCollection = accountsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pID != null ? pID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permissions)) {
            return false;
        }
        Permissions other = (Permissions) object;
        if ((this.pID == null && other.pID != null) || (this.pID != null && !this.pID.equals(other.pID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Permissions[ pID=" + pID + " ]";
    }
    
}
