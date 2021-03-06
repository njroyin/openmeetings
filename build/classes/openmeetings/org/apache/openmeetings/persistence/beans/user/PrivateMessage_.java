/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.user;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import org.apache.openmeetings.persistence.beans.room.Room;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.user.PrivateMessage.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Wed Mar 06 22:04:00 CST 2013")
public class PrivateMessage_ {
    public static volatile SingularAttribute<PrivateMessage,Boolean> bookedRoom;
    public static volatile SingularAttribute<PrivateMessage,String> email;
    public static volatile SingularAttribute<PrivateMessage,User> from;
    public static volatile SingularAttribute<PrivateMessage,Date> inserted;
    public static volatile SingularAttribute<PrivateMessage,Boolean> isContactRequest;
    public static volatile SingularAttribute<PrivateMessage,Boolean> isRead;
    public static volatile SingularAttribute<PrivateMessage,Boolean> isTrash;
    public static volatile SingularAttribute<PrivateMessage,String> message;
    public static volatile SingularAttribute<PrivateMessage,User> owner;
    public static volatile SingularAttribute<PrivateMessage,Long> parentMessage;
    public static volatile SingularAttribute<PrivateMessage,Long> privateMessageFolderId;
    public static volatile SingularAttribute<PrivateMessage,Long> privateMessageId;
    public static volatile SingularAttribute<PrivateMessage,Room> room;
    public static volatile SingularAttribute<PrivateMessage,String> subject;
    public static volatile SingularAttribute<PrivateMessage,User> to;
    public static volatile SingularAttribute<PrivateMessage,Long> userContactId;
}
