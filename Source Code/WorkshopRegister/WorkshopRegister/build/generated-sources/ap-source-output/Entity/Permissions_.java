package Entity;

import Entity.Accounts;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-08T09:40:39")
@StaticMetamodel(Permissions.class)
public class Permissions_ { 

    public static volatile SingularAttribute<Permissions, Boolean> pStatus;
    public static volatile SingularAttribute<Permissions, Integer> pID;
    public static volatile SingularAttribute<Permissions, String> pName;
    public static volatile CollectionAttribute<Permissions, Accounts> accountsCollection;

}