/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.room;

import java.lang.Boolean;
import java.lang.Long;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import org.apache.openmeetings.persistence.beans.domain.Organisation;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.room.RoomOrganisation.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Tue Mar 19 11:14:39 CST 2013")
public class RoomOrganisation_ {
    public static volatile SingularAttribute<RoomOrganisation,Boolean> deleted;
    public static volatile SingularAttribute<RoomOrganisation,Organisation> organisation;
    public static volatile SingularAttribute<RoomOrganisation,Room> room;
    public static volatile SingularAttribute<RoomOrganisation,Long> rooms_organisation_id;
    public static volatile SingularAttribute<RoomOrganisation,Date> starttime;
    public static volatile SingularAttribute<RoomOrganisation,Date> updatetime;
}
