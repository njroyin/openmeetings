/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.domain;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.domain.Organisation.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Thu Mar 07 11:05:06 CST 2013")
public class Organisation_ {
    public static volatile SingularAttribute<Organisation,Boolean> deleted;
    public static volatile SingularAttribute<Organisation,Long> insertedby;
    public static volatile SingularAttribute<Organisation,String> name;
    public static volatile SingularAttribute<Organisation,Long> organisation_id;
    public static volatile SingularAttribute<Organisation,Date> starttime;
    public static volatile SingularAttribute<Organisation,Long> updatedby;
    public static volatile SingularAttribute<Organisation,Date> updatetime;
}
