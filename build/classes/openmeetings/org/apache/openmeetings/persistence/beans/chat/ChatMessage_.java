/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.chat;

import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import org.apache.openmeetings.persistence.beans.room.Room;
import org.apache.openmeetings.persistence.beans.user.User;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.chat.ChatMessage.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Thu Mar 07 11:05:06 CST 2013")
public class ChatMessage_ {
    public static volatile SingularAttribute<ChatMessage,String> fromEmail;
    public static volatile SingularAttribute<ChatMessage,String> fromName;
    public static volatile SingularAttribute<ChatMessage,User> fromUser;
    public static volatile SingularAttribute<ChatMessage,Long> id;
    public static volatile SingularAttribute<ChatMessage,String> message;
    public static volatile SingularAttribute<ChatMessage,Date> sent;
    public static volatile SingularAttribute<ChatMessage,String> toEmail;
    public static volatile SingularAttribute<ChatMessage,String> toName;
    public static volatile SingularAttribute<ChatMessage,Room> toRoom;
    public static volatile SingularAttribute<ChatMessage,User> toUser;
}
