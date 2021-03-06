package Entities;
// Generated Oct 5, 2017 11:18:29 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SetNotifications generated by hbm2java
 */
public class SetNotifications  implements java.io.Serializable {


     private long notificationId;
     private String message;
     private String messageDetails;
     private Integer messageLevel;
     private Date messageDateFrom;
     private Date messageDateTo;
     private Set setRolesNotifications = new HashSet(0);

    public SetNotifications() {
    }

	
    public SetNotifications(long notificationId) {
        this.notificationId = notificationId;
    }
    public SetNotifications(long notificationId, String message, String messageDetails, Integer messageLevel, Date messageDateFrom, Date messageDateTo, Set setRolesNotifications) {
       this.notificationId = notificationId;
       this.message = message;
       this.messageDetails = messageDetails;
       this.messageLevel = messageLevel;
       this.messageDateFrom = messageDateFrom;
       this.messageDateTo = messageDateTo;
       this.setRolesNotifications = setRolesNotifications;
    }
   
    public long getNotificationId() {
        return this.notificationId;
    }
    
    public void setNotificationId(long notificationId) {
        this.notificationId = notificationId;
    }
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessageDetails() {
        return this.messageDetails;
    }
    
    public void setMessageDetails(String messageDetails) {
        this.messageDetails = messageDetails;
    }
    public Integer getMessageLevel() {
        return this.messageLevel;
    }
    
    public void setMessageLevel(Integer messageLevel) {
        this.messageLevel = messageLevel;
    }
    public Date getMessageDateFrom() {
        return this.messageDateFrom;
    }
    
    public void setMessageDateFrom(Date messageDateFrom) {
        this.messageDateFrom = messageDateFrom;
    }
    public Date getMessageDateTo() {
        return this.messageDateTo;
    }
    
    public void setMessageDateTo(Date messageDateTo) {
        this.messageDateTo = messageDateTo;
    }
    public Set getSetRolesNotifications() {
        return this.setRolesNotifications;
    }
    
    public void setSetRolesNotifications(Set setRolesNotifications) {
        this.setRolesNotifications = setRolesNotifications;
    }




}


