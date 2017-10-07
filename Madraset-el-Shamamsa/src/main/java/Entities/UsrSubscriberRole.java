package Entities;
// Generated Oct 5, 2017 11:18:29 AM by Hibernate Tools 4.3.1



/**
 * UsrSubscriberRole generated by hbm2java
 */
public class UsrSubscriberRole  implements java.io.Serializable {


     private UsrSubscriberRoleId id;
     private UsrRole usrRole;
     private UsrSubscriber usrSubscriber;

    public UsrSubscriberRole() {
    }

	
    public UsrSubscriberRole(UsrSubscriberRoleId id) {
        this.id = id;
    }
    public UsrSubscriberRole(UsrSubscriberRoleId id, UsrRole usrRole, UsrSubscriber usrSubscriber) {
       this.id = id;
       this.usrRole = usrRole;
       this.usrSubscriber = usrSubscriber;
    }
   
    public UsrSubscriberRoleId getId() {
        return this.id;
    }
    
    public void setId(UsrSubscriberRoleId id) {
        this.id = id;
    }
    public UsrRole getUsrRole() {
        return this.usrRole;
    }
    
    public void setUsrRole(UsrRole usrRole) {
        this.usrRole = usrRole;
    }
    public UsrSubscriber getUsrSubscriber() {
        return this.usrSubscriber;
    }
    
    public void setUsrSubscriber(UsrSubscriber usrSubscriber) {
        this.usrSubscriber = usrSubscriber;
    }




}


