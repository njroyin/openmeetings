/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.room;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.util.Calendar;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.room.Whiteboard.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Tue Mar 19 11:14:39 CST 2013")
public class Whiteboard_ {
    public static volatile SingularAttribute<Whiteboard,Calendar> created;
    public static volatile SingularAttribute<Whiteboard,Boolean> fullFit;
    public static volatile SingularAttribute<Whiteboard,Long> id;
    public static volatile SingularAttribute<Whiteboard,Integer> roomId;
    public static volatile CollectionAttribute<Whiteboard,WhiteboardItem> roomItems;
    public static volatile SingularAttribute<Whiteboard,Integer> x;
    public static volatile SingularAttribute<Whiteboard,Integer> y;
    public static volatile SingularAttribute<Whiteboard,Integer> zoom;
}
