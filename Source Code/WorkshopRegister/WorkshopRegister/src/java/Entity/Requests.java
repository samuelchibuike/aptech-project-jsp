/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

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
@Table(name = "Requests", catalog = "eProject_sem4", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Requests.findAll", query = "SELECT r FROM Requests r"),
    @NamedQuery(name = "Requests.findByRID", query = "SELECT r FROM Requests r WHERE r.rID = :rID"),
    @NamedQuery(name = "Requests.findByRType", query = "SELECT r FROM Requests r WHERE r.rType = :rType"),
    @NamedQuery(name = "Requests.findByRStatus", query = "SELECT r FROM Requests r WHERE r.rStatus = :rStatus")})
public class Requests implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "rID", nullable = false)
    private Integer rID;
    @Size(max = 30)
    @Column(name = "rType", length = 30)
    private String rType;
    @Size(max = 20)
    @Column(name = "rStatus", length = 20)
    private String rStatus;
    @JoinColumn(name = "prID", referencedColumnName = "prID")
    @ManyToOne
    private Presentations prID;
    @JoinColumn(name = "aEmail", referencedColumnName = "aEmail")
    @ManyToOne
    private Accounts aEmail;

    public Requests() {
    }

    public Requests(Integer rID) {
        this.rID = rID;
    }

    public Integer getRID() {
        return rID;
    }

    public void setRID(Integer rID) {
        this.rID = rID;
    }

    public String getRType() {
        return rType;
    }

    public void setRType(String rType) {
        this.rType = rType;
    }

    public String getRStatus() {
        return rStatus;
    }

    public void setRStatus(String rStatus) {
        this.rStatus = rStatus;
    }

    public Presentations getPrID() {
        return prID;
    }

    public void setPrID(Presentations prID) {
        this.prID = prID;
    }

    public Accounts getAEmail() {
        return aEmail;
    }

    public void setAEmail(Accounts aEmail) {
        this.aEmail = aEmail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rID != null ? rID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Requests)) {
            return false;
        }
        Requests other = (Requests) object;
        if ((this.rID == null && other.rID != null) || (this.rID != null && !this.rID.equals(other.rID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Requests[ rID=" + rID + " ]";
    }
    
}
