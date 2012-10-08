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
@Table(name = "TypeCost", catalog = "eProject_sem4", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeCost.findAll", query = "SELECT t FROM TypeCost t"),
    @NamedQuery(name = "TypeCost.findByTcID", query = "SELECT t FROM TypeCost t WHERE t.tcID = :tcID"),
    @NamedQuery(name = "TypeCost.findByTcName", query = "SELECT t FROM TypeCost t WHERE t.tcName = :tcName"),
    @NamedQuery(name = "TypeCost.findByTcStatus", query = "SELECT t FROM TypeCost t WHERE t.tcStatus = :tcStatus")})
public class TypeCost implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "tcID", nullable = false)
    private Integer tcID;
    @Size(max = 100)
    @Column(name = "tcName", length = 100)
    private String tcName;
    @Column(name = "tcStatus")
    private Boolean tcStatus;
    @OneToMany(mappedBy = "tcID")
    private Collection<Histories> historiesCollection;

    public TypeCost() {
    }

    public TypeCost(Integer tcID) {
        this.tcID = tcID;
    }

    public Integer getTcID() {
        return tcID;
    }

    public void setTcID(Integer tcID) {
        this.tcID = tcID;
    }

    public String getTcName() {
        return tcName;
    }

    public void setTcName(String tcName) {
        this.tcName = tcName;
    }

    public Boolean getTcStatus() {
        return tcStatus;
    }

    public void setTcStatus(Boolean tcStatus) {
        this.tcStatus = tcStatus;
    }

    @XmlTransient
    public Collection<Histories> getHistoriesCollection() {
        return historiesCollection;
    }

    public void setHistoriesCollection(Collection<Histories> historiesCollection) {
        this.historiesCollection = historiesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tcID != null ? tcID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeCost)) {
            return false;
        }
        TypeCost other = (TypeCost) object;
        if ((this.tcID == null && other.tcID != null) || (this.tcID != null && !this.tcID.equals(other.tcID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.TypeCost[ tcID=" + tcID + " ]";
    }
    
}
