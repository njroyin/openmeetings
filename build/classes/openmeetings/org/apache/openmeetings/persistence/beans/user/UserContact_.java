/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.user;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.user.UserContact.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Wed Mar 06 22:04:00 CST 2013")
public class UserContact_ {
    public static volatile SingularAttribute<UserContact,User> contact;
    public static volatile SingularAttribute<UserContact,String> hash;
    public static volatile SingularAttribute<UserContact,Date> inserted;
    public static volatile SingularAttribute<UserContact,User> owner;
    public static volatile SingularAttribute<UserContact,Boolean> pending;
    public static volatile SingularAttribute<UserContact,Boolean> shareCalendar;
    public static volatile SingularAttribute<UserContact,Date> updated;
    public static volatile SingularAttribute<UserContact,Long> userContactId;
}
