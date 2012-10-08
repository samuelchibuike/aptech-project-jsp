package Entity;

import Entity.Accounts;
import Entity.Histories;
import Entity.Requests;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-08T09:40:39")
@StaticMetamodel(Presentations.class)
public class Presentations_ { 

    public static volatile SingularAttribute<Presentations, Integer> prID;
    public static volatile SingularAttribute<Presentations, String> prTitle;
    public static volatile CollectionAttribute<Presentations, Requests> requestsCollection;
    public static volatile SingularAttribute<Presentations, String> prSummary;
    public static volatile SingularAttribute<Presentations, Date> prDate;
    public static volatile SingularAttribute<Presentations, Double> prCost;
    public static volatile SingularAttribute<Presentations, String> prContent;
    public static volatile SingularAttribute<Presentations, Accounts> aEmail;
    public static volatile SingularAttribute<Presentations, String> prAdd;
    public static volatile SingularAttribute<Presentations, String> prStatus;
    public static volatile CollectionAttribute<Presentations, Histories> historiesCollection;

}