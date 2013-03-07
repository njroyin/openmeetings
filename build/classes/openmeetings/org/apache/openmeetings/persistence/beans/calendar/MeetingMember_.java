/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.calendar;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import org.apache.openmeetings.persistence.beans.basic.OmTimeZone;
import org.apache.openmeetings.persistence.beans.invitation.Invitations;
import org.apache.openmeetings.persistence.beans.user.User;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.calendar.MeetingMember.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Thu Mar 07 11:05:06 CST 2013")
public class MeetingMember_ {
    public static volatile SingularAttribute<MeetingMember,Appointment> appointment;
    public static volatile SingularAttribute<MeetingMember,String> appointmentStatus;
    public static volatile SingularAttribute<MeetingMember,Boolean> deleted;
    public static volatile SingularAttribute<MeetingMember,String> email;
    public static volatile SingularAttribute<MeetingMember,String> firstname;
    public static volatile SingularAttribute<MeetingMember,Invitations> invitation;
    public static volatile SingularAttribute<MeetingMember,Boolean> invitor;
    public static volatile SingularAttribute<MeetingMember,Boolean> isConnectedEvent;
    public static volatile SingularAttribute<MeetingMember,String> lastname;
    public static volatile SingularAttribute<MeetingMember,Long> meetingMemberId;
    public static volatile SingularAttribute<MeetingMember,String> memberStatus;
    public static volatile SingularAttribute<MeetingMember,OmTimeZone> omTimeZone;
    public static volatile SingularAttribute<MeetingMember,String> phone;
    public static volatile SingularAttribute<MeetingMember,Date> starttime;
    public static volatile SingularAttribute<MeetingMember,Date> updatetime;
    public static volatile SingularAttribute<MeetingMember,User> userid;
}
