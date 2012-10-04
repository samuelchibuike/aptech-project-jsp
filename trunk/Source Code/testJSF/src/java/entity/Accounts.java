/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ANHDUNG
 */
@Entity
@Table(name = "Accounts", catalog = "test", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accounts.findAll", query = "SELECT a FROM Accounts a"),
    @NamedQuery(name = "Accounts.findByAID", query = "SELECT a FROM Accounts a WHERE a.aID = :aID"),
    @NamedQuery(name = "Accounts.findByAName", query = "SELECT a FROM Accounts a WHERE a.aName = :aName"),
    @NamedQuery(name = "Accounts.findByAStatus", query = "SELECT a FROM Accounts a WHERE a.aStatus = :aStatus")})
public class Accounts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "aID", nullable = false, length = 50)
    private String aID;
    @Size(max = 50)
    @Column(name = "aName", length = 50)
    private String aName;
    @Column(name = "aStatus")
    private Boolean aStatus;

    public Accounts() {
    }

    public Accounts(String aID) {
        this.aID = aID;
    }

    public String getAID() {
        return aID;
    }

    public void setAID(String aID) {
        this.aID = aID;
    }

    public String getAName() {
        return aName;
    }

    public void setAName(String aName) {
        this.aName = aName;
    }

    public Boolean getAStatus() {
        return aStatus;
    }

    public void setAStatus(Boolean aStatus) {
        this.aStatus = aStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aID != null ? aID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accounts)) {
            return false;
        }
        Accounts other = (Accounts) object;
        if ((this.aID == null && other.aID != null) || (this.aID != null && !this.aID.equals(other.aID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accounts[ aID=" + aID + " ]";
    }
    
}
