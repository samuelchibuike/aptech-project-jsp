package Entity;

import Entity.Histories;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-08T09:40:39")
@StaticMetamodel(TypeCost.class)
public class TypeCost_ { 

    public static volatile SingularAttribute<TypeCost, Integer> tcID;
    public static volatile SingularAttribute<TypeCost, String> tcName;
    public static volatile SingularAttribute<TypeCost, Boolean> tcStatus;
    public static volatile CollectionAttribute<TypeCost, Histories> historiesCollection;

}