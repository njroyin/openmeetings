/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.domain;

import java.lang.Boolean;
import java.lang.Long;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import org.apache.openmeetings.persistence.beans.user.User;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.domain.Organisation_Users.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Thu Mar 07 11:05:06 CST 2013")
public class Organisation_Users_ {
    public static volatile SingularAttribute<Organisation_Users,Boolean> deleted;
    public static volatile SingularAttribute<Organisation_Users,Boolean> isModerator;
    public static volatile SingularAttribute<Organisation_Users,Organisation> organisation;
    public static volatile SingularAttribute<Organisation_Users,Long> organisation_users_id;
    public static volatile SingularAttribute<Organisation_Users,Date> starttime;
    public static volatile SingularAttribute<Organisation_Users,Date> updatetime;
    public static volatile SingularAttribute<Organisation_Users,User> user;
    public static volatile SingularAttribute<Organisation_Users,Long> user_id;
}
