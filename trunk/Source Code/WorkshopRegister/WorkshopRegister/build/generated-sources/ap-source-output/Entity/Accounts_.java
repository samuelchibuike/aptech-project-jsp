package Entity;

import Entity.Histories;
import Entity.Permissions;
import Entity.Presentations;
import Entity.Requests;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-08T09:40:39")
@StaticMetamodel(Accounts.class)
public class Accounts_ { 

    public static volatile CollectionAttribute<Accounts, Presentations> presentationsCollection;
    public static volatile SingularAttribute<Accounts, String> aAdd;
    public static volatile SingularAttribute<Accounts, String> aDegree;
    public static volatile SingularAttribute<Accounts, Date> aBirthday;
    public static volatile SingularAttribute<Accounts, String> aTel;
    public static volatile SingularAttribute<Accounts, Permissions> pid;
    public static volatile SingularAttribute<Accounts, String> aJob;
    public static volatile CollectionAttribute<Accounts, Histories> historiesCollection;
    public static volatile SingularAttribute<Accounts, String> aName;
    public static volatile CollectionAttribute<Accounts, Requests> requestsCollection;
    public static volatile SingularAttribute<Accounts, String> aJobAdd;
    public static volatile SingularAttribute<Accounts, String> aEmail;
    public static volatile SingularAttribute<Accounts, String> aStatus;
    public static volatile SingularAttribute<Accounts, String> aPass;

}