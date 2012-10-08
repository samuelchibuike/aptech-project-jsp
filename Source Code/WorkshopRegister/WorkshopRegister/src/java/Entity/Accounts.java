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
@Table(name = "Accounts", catalog = "eProject_sem4", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accounts.findAll", query = "SELECT a FROM Accounts a"),
    @NamedQuery(name = "Accounts.findByAEmail", query = "SELECT a FROM Accounts a WHERE a.aEmail = :aEmail"),
    @NamedQuery(name = "Accounts.findByAPass", query = "SELECT a FROM Accounts a WHERE a.aPass = :aPass"),
    @NamedQuery(name = "Accounts.findByAName", query = "SELECT a FROM Accounts a WHERE a.aName = :aName"),
    @NamedQuery(name = "Accounts.findByABirthday", query = "SELECT a FROM Accounts a WHERE a.aBirthday = :aBirthday"),
    @NamedQuery(name = "Accounts.findByATel", query = "SELECT a FROM Accounts a WHERE a.aTel = :aTel"),
    @NamedQuery(name = "Accounts.findByAAdd", query = "SELECT a FROM Accounts a WHERE a.aAdd = :aAdd"),
    @NamedQuery(name = "Accounts.findByAJob", query = "SELECT a FROM Accounts a WHERE a.aJob = :aJob"),
    @NamedQuery(name = "Accounts.findByADegree", query = "SELECT a FROM Accounts a WHERE a.aDegree = :aDegree"),
    @NamedQuery(name = "Accounts.findByAJobAdd", query = "SELECT a FROM Accounts a WHERE a.aJobAdd = :aJobAdd"),
    @NamedQuery(name = "Accounts.findByAStatus", query = "SELECT a FROM Accounts a WHERE a.aStatus = :aStatus")})
public class Accounts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "aEmail", nullable = false, length = 30)
    private String aEmail;
    @Size(max = 30)
    @Column(name = "aPass", length = 30)
    private String aPass;
    @Size(max = 30)
    @Column(name = "aName", length = 30)
    private String aName;
    @Column(name = "aBirthday")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aBirthday;
    @Size(max = 20)
    @Column(name = "aTel", length = 20)
    private String aTel;
    @Size(max = 300)
    @Column(name = "aAdd", length = 300)
    private String aAdd;
    @Size(max = 100)
    @Column(name = "aJob", length = 100)
    private String aJob;
    @Size(max = 100)
    @Column(name = "aDegree", length = 100)
    private String aDegree;
    @Size(max = 300)
    @Column(name = "aJobAdd", length = 300)
    private String aJobAdd;
    @Size(max = 20)
    @Column(name = "aStatus", length = 20)
    private String aStatus;
    @JoinColumn(name = "pID", referencedColumnName = "pID")
    @ManyToOne
    private Permissions pid;
    @OneToMany(mappedBy = "aEmail")
    private Collection<Histories> historiesCollection;
    @OneToMany(mappedBy = "aEmail")
    private Collection<Requests> requestsCollection;
    @OneToMany(mappedBy = "aEmail")
    private Collection<Presentations> presentationsCollection;

    public Accounts() {
    }

    public Accounts(String aEmail) {
        this.aEmail = aEmail;
    }

    public String getAEmail() {
        return aEmail;
    }

    public void setAEmail(String aEmail) {
        this.aEmail = aEmail;
    }

    public String getAPass() {
        return aPass;
    }

    public void setAPass(String aPass) {
        this.aPass = aPass;
    }

    public String getAName() {
        return aName;
    }

    public void setAName(String aName) {
        this.aName = aName;
    }

    public Date getABirthday() {
        return aBirthday;
    }

    public void setABirthday(Date aBirthday) {
        this.aBirthday = aBirthday;
    }

    public String getATel() {
        return aTel;
    }

    public void setATel(String aTel) {
        this.aTel = aTel;
    }

    public String getAAdd() {
        return aAdd;
    }

    public void setAAdd(String aAdd) {
        this.aAdd = aAdd;
    }

    public String getAJob() {
        return aJob;
    }

    public void setAJob(String aJob) {
        this.aJob = aJob;
    }

    public String getADegree() {
        return aDegree;
    }

    public void setADegree(String aDegree) {
        this.aDegree = aDegree;
    }

    public String getAJobAdd() {
        return aJobAdd;
    }

    public void setAJobAdd(String aJobAdd) {
        this.aJobAdd = aJobAdd;
    }

    public String getAStatus() {
        return aStatus;
    }

    public void setAStatus(String aStatus) {
        this.aStatus = aStatus;
    }

    public Permissions getPid() {
        return pid;
    }

    public void setPid(Permissions pid) {
        this.pid = pid;
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

    @XmlTransient
    public Collection<Presentations> getPresentationsCollection() {
        return presentationsCollection;
    }

    public void setPresentationsCollection(Collection<Presentations> presentationsCollection) {
        this.presentationsCollection = presentationsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aEmail != null ? aEmail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accounts)) {
            return false;
        }
        Accounts other = (Accounts) object;
        if ((this.aEmail == null && other.aEmail != null) || (this.aEmail != null && !this.aEmail.equals(other.aEmail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Accounts[ aEmail=" + aEmail + " ]";
    }
    
}
