package Entities;
// Generated Oct 5, 2017 11:18:29 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Teacher generated by hbm2java
 */
public class Teacher  implements java.io.Serializable {


     private long teacherId;
     private String code;
     private String name;
     private String desecription;
     private Date creationDate;
     private String createdBy;
     private Date lastModificationDate;
     private String lastModifiedBy;
     private Set teacherLessonContents = new HashSet(0);

    public Teacher() {
    }

	
    public Teacher(long teacherId) {
        this.teacherId = teacherId;
    }
    public Teacher(long teacherId, String code, String name, String desecription, Date creationDate, String createdBy, Date lastModificationDate, String lastModifiedBy, Set teacherLessonContents) {
       this.teacherId = teacherId;
       this.code = code;
       this.name = name;
       this.desecription = desecription;
       this.creationDate = creationDate;
       this.createdBy = createdBy;
       this.lastModificationDate = lastModificationDate;
       this.lastModifiedBy = lastModifiedBy;
       this.teacherLessonContents = teacherLessonContents;
    }
   
    public long getTeacherId() {
        return this.teacherId;
    }
    
    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDesecription() {
        return this.desecription;
    }
    
    public void setDesecription(String desecription) {
        this.desecription = desecription;
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
    public Date getLastModificationDate() {
        return this.lastModificationDate;
    }
    
    public void setLastModificationDate(Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
    public Set getTeacherLessonContents() {
        return this.teacherLessonContents;
    }
    
    public void setTeacherLessonContents(Set teacherLessonContents) {
        this.teacherLessonContents = teacherLessonContents;
    }




}


