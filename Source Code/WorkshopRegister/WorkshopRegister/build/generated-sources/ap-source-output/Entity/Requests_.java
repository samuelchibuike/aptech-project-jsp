package Entity;

import Entity.Accounts;
import Entity.Presentations;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-08T09:40:39")
@StaticMetamodel(Requests.class)
public class Requests_ { 

    public static volatile SingularAttribute<Requests, String> rType;
    public static volatile SingularAttribute<Requests, Presentations> prID;
    public static volatile SingularAttribute<Requests, String> rStatus;
    public static volatile SingularAttribute<Requests, Accounts> aEmail;
    public static volatile SingularAttribute<Requests, Integer> rID;

}