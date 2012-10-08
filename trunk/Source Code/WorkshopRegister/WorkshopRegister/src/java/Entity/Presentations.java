/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
@Table(name = "Presentations", catalog = "eProject_sem4", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Presentations.findAll", query = "SELECT p FROM Presentations p"),
    @NamedQuery(name = "Presentations.findByPrID", query = "SELECT p FROM Presentations p WHERE p.prID = :prID"),
    @NamedQuery(name = "Presentations.findByPrTitle", query = "SELECT p FROM Presentations p WHERE p.prTitle = :prTitle"),
    @NamedQuery(name = "Presentations.findByPrSummary", query = "SELECT p FROM Presentations p WHERE p.prSummary = :prSummary"),
    @NamedQuery(name = "Presentations.findByPrContent", query = "SELECT p FROM Presentations p WHERE p.prContent = :prContent"),
    @NamedQuery(name = "Presentations.findByPrDate", query = "SELECT p FROM Presentations p WHERE p.prDate = :prDate"),
    @NamedQuery(name = "Presentations.findByPrAdd", query = "SELECT p FROM Presentations p WHERE p.prAdd = :prAdd"),
    @NamedQuery(name = "Presentations.findByPrStatus", query = "SELECT p FROM Presentations p WHERE p.prStatus = :prStatus"),
    @NamedQuery(name = "Presentations.findByPrCost", query = "SELECT p FROM Presentations p WHERE p.prCost = :prCost")})
public class Presentations implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "prID", nullable = false)
    private Integer prID;
    @Size(max = 100)
    @Column(name = "prTitle", length = 100)
    private String prTitle;
    @Size(max = 300)
    @Column(name = "prSummary", length = 300)
    private String prSummary;
    @Size(max = 300)
    @Column(name = "prContent", length = 300)
    private String prContent;
    @Column(name = "prDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prDate;
    @Size(max = 300)
    @Column(name = "prAdd", length = 300)
    private String prAdd;
    @Size(max = 20)
    @Column(name = "prStatus", length = 20)
    private String prStatus;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "prCost", precision = 53)
    private Double prCost;
    @OneToMany(mappedBy = "prID")
    private Collection<Histories> historiesCollection;
    @OneToMany(mappedBy = "prID")
    private Collection<Requests> requestsCollection;
    @JoinColumn(name = "aEmail", referencedColumnName = "aEmail")
    @ManyToOne
    private Accounts aEmail;

    public Presentations() {
    }

    public Presentations(Integer prID) {
        this.prID = prID;
    }

    public Integer getPrID() {
        return prID;
    }

    public void setPrID(Integer prID) {
        this.prID = prID;
    }

    public String getPrTitle() {
        return prTitle;
    }

    public void setPrTitle(String prTitle) {
        this.prTitle = prTitle;
    }

    public String getPrSummary() {
        return prSummary;
    }

    public void setPrSummary(String prSummary) {
        this.prSummary = prSummary;
    }

    public String getPrContent() {
        return prContent;
    }

    public void setPrContent(String prContent) {
        this.prContent = prContent;
    }

    public Date getPrDate() {
        return prDate;
    }

    public void setPrDate(Date prDate) {
        this.prDate = prDate;
    }

    public String getPrAdd() {
        return prAdd;
    }

    public void setPrAdd(String prAdd) {
        this.prAdd = prAdd;
    }

    public String getPrStatus() {
        return prStatus;
    }

    public void setPrStatus(String prStatus) {
        this.prStatus = prStatus;
    }

    public Double getPrCost() {
        return prCost;
    }

    public void setPrCost(Double prCost) {
        this.prCost = prCost;
    }

    @XmlTransient
    public Collection<Histories> getHistoriesCollection() {
        return historiesCollection;
    }

    public void setHistoriesCollection(Collection<Histories> historiesCollection) {
        this.historiesCollection = historiesCollection;
    }

    @XmlTransient
    public Collection<Requests> getRequestsCollection() {
        return requestsCollection;
    }

    public void setRequestsCollection(Collection<Requests> requestsCollection) {
        this.requestsCollection = requestsCollection;
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
        hash += (prID != null ? prID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Presentations)) {
            return false;
        }
        Presentations other = (Presentations) object;
        if ((this.prID == null && other.prID != null) || (this.prID != null && !this.prID.equals(other.prID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Presentations[ prID=" + prID + " ]";
    }
    
}
