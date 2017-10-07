package Entities;
// Generated Oct 5, 2017 11:18:29 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * StdPhone generated by hbm2java
 */
public class StdPhone  implements java.io.Serializable {


     private String phoneId;
     private StdStudent stdStudent;
     private String phoneTitle;
     private String phoneNumber;
     private Date creationDate;
     private String createdBy;
     private Date lastModifiedDate;
     private String lastModifiedBy;

    public StdPhone() {
    }

	
    public StdPhone(String phoneId) {
        this.phoneId = phoneId;
    }
    public StdPhone(String phoneId, StdStudent stdStudent, String phoneTitle, String phoneNumber, Date creationDate, String createdBy, Date lastModifiedDate, String lastModifiedBy) {
       this.phoneId = phoneId;
       this.stdStudent = stdStudent;
       this.phoneTitle = phoneTitle;
       this.phoneNumber = phoneNumber;
       this.creationDate = creationDate;
       this.createdBy = createdBy;
       this.lastModifiedDate = lastModifiedDate;
       this.lastModifiedBy = lastModifiedBy;
    }
   
    public String getPhoneId() {
        return this.phoneId;
    }
    
    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }
    public StdStudent getStdStudent() {
        return this.stdStudent;
    }
    
    public void setStdStudent(StdStudent stdStudent) {
        this.stdStudent = stdStudent;
    }
    public String getPhoneTitle() {
        return this.phoneTitle;
    }
    
    public void setPhoneTitle(String phoneTitle) {
        this.phoneTitle = phoneTitle;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Date getCreationDate() {
        return this.creationDate;
    }
    
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }




}

