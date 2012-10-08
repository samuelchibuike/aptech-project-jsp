package Entity;

import Entity.Accounts;
import Entity.Presentations;
import Entity.TypeCost;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-08T09:40:39")
@StaticMetamodel(Histories.class)
public class Histories_ { 

    public static volatile SingularAttribute<Histories, Date> hDate;
    public static volatile SingularAttribute<Histories, Double> hCost;
    public static volatile SingularAttribute<Histories, Presentations> prID;
    public static volatile SingularAttribute<Histories, Boolean> hStatus;
    public static volatile SingularAttribute<Histories, Accounts> aEmail;
    public static volatile SingularAttribute<Histories, TypeCost> tcID;
    public static volatile SingularAttribute<Histories, Integer> hID;
    public static volatile SingularAttribute<Histories, String> hType;

}