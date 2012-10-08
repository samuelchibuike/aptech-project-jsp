/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ANHDUNG
 */
@Entity
@Table(name = "Histories", catalog = "eProject_sem4", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Histories.findAll", query = "SELECT h FROM Histories h"),
    @NamedQuery(name = "Histories.findByHID", query = "SELECT h FROM Histories h WHERE h.hID = :hID"),
    @NamedQuery(name = "Histories.findByHDate", query = "SELECT h FROM Histories h WHERE h.hDate = :hDate"),
    @NamedQuery(name = "Histories.findByHType", query = "SELECT h FROM Histories h WHERE h.hType = :hType"),
    @NamedQuery(name = "Histories.findByHStatus", query = "SELECT h FROM Histories h WHERE h.hStatus = :hStatus"),
    @NamedQuery(name = "Histories.findByHCost", query = "SELECT h FROM Histories h WHERE h.hCost = :hCost")})
public class Histories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "hID", nullable = false)
    private Integer hID;
    @Column(name = "hDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hDate;
    @Size(max = 20)
    @Column(name = "hType", length = 20)
    private String hType;
    @Column(name = "hStatus")
    private Boolean hStatus;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "hCost", precision = 53)
    private Double hCost;
    @JoinColumn(name = "tcID", referencedColumnName = "tcID")
    @ManyToOne
    private TypeCost tcID;
    @JoinColumn(name = "prID", referencedColumnName = "prID")
    @ManyToOne
    private Presentations prID;
    @JoinColumn(name = "aEmail", referencedColumnName = "aEmail")
    @ManyToOne
    private Accounts aEmail;

    public Histories() {
    }

    public Histories(Integer hID) {
        this.hID = hID;
    }

    public Integer getHID() {
        return hID;
    }

    public void setHID(Integer hID) {
        this.hID = hID;
    }

    public Date getHDate() {
        return hDate;
    }

    public void setHDate(Date hDate) {
        this.hDate = hDate;
    }

    public String getHType() {
        return hType;
    }

    public void setHType(String hType) {
        this.hType = hType;
    }

    public Boolean getHStatus() {
        return hStatus;
    }

    public void setHStatus(Boolean hStatus) {
        this.hStatus = hStatus;
    }

    public Double getHCost() {
        return hCost;
    }

    public void setHCost(Double hCost) {
        this.hCost = hCost;
    }

    public TypeCost getTcID() {
        return tcID;
    }

    public void setTcID(TypeCost tcID) {
        this.tcID = tcID;
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
        hash += (hID != null ? hID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Histories)) {
            return false;
        }
        Histories other = (Histories) object;
        if ((this.hID == null && other.hID != null) || (this.hID != null && !this.hID.equals(other.hID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Histories[ hID=" + hID + " ]";
    }
    
}
