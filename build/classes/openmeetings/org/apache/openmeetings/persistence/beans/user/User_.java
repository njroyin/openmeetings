/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.user;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import org.apache.openmeetings.persistence.beans.basic.OmTimeZone;
import org.apache.openmeetings.persistence.beans.domain.Organisation_Users;
import org.apache.openmeetings.persistence.beans.sip.asterisk.AsteriskSipUser;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.user.User.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Tue Mar 19 11:14:39 CST 2013")
public class User_ {
    public static volatile SingularAttribute<User,String> activatehash;
    public static volatile SingularAttribute<User,Address> adresses;
    public static volatile SingularAttribute<User,Date> age;
    public static volatile SingularAttribute<User,Integer> availible;
    public static volatile SingularAttribute<User,Boolean> deleted;
    public static volatile SingularAttribute<User,String> externalUserId;
    public static volatile SingularAttribute<User,String> externalUserType;
    public static volatile SingularAttribute<User,String> firstname;
    public static volatile SingularAttribute<User,Boolean> forceTimeZoneCheck;
    public static volatile SingularAttribute<User,Long> language_id;
    public static volatile SingularAttribute<User,Date> lastlogin;
    public static volatile SingularAttribute<User,String> lastname;
    public static volatile SingularAttribute<User,Long> lasttrans;
    public static volatile SingularAttribute<User,Long> level_id;
    public static volatile SingularAttribute<User,String> login;
    public static volatile SingularAttribute<User,OmTimeZone> omTimeZone;
    public static volatile ListAttribute<User,Organisation_Users> organisation_users;
    public static volatile SingularAttribute<User,String> password;
    public static volatile SingularAttribute<User,String> pictureuri;
    public static volatile SingularAttribute<User,Date> regdate;
    public static volatile SingularAttribute<User,String> resethash;
    public static volatile SingularAttribute<User,Long> salutations_id;
    public static volatile SingularAttribute<User,Boolean> sendSMS;
    public static volatile SingularAttribute<User,Boolean> showContactData;
    public static volatile SingularAttribute<User,Boolean> showContactDataToContacts;
    public static volatile SingularAttribute<User,AsteriskSipUser> sipUser;
    public static volatile SingularAttribute<User,Date> starttime;
    public static volatile SingularAttribute<User,Integer> status;
    public static volatile SingularAttribute<User,Date> updatetime;
    public static volatile SingularAttribute<User,String> userOffers;
    public static volatile SingularAttribute<User,String> userSearchs;
    public static volatile SingularAttribute<User,Long> user_id;
}
