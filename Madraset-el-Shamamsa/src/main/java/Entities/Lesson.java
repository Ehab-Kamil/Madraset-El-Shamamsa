package Entities;
// Generated Sep 29, 2017 12:28:05 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Lesson generated by hbm2java
 */
public class Lesson  implements java.io.Serializable {


     private long lessonId;
     private Year year;
     private Serializable code;
     private Serializable name;
     private Integer durationInHours;
     private Date creationDate;
     private String createdBy;
     private Date lastModifiedDate;
     private String lastModifiedBy;
     private Set lessonContents = new HashSet(0);

    public Lesson() {
    }

	
    public Lesson(long lessonId) {
        this.lessonId = lessonId;
    }
    public Lesson(long lessonId, Year year, Serializable code, Serializable name, Integer durationInHours, Date creationDate, String createdBy, Date lastModifiedDate, String lastModifiedBy, Set lessonContents) {
       this.lessonId = lessonId;
       this.year = year;
       this.code = code;
       this.name = name;
       this.durationInHours = durationInHours;
       this.creationDate = creationDate;
       this.createdBy = createdBy;
       this.lastModifiedDate = lastModifiedDate;
       this.lastModifiedBy = lastModifiedBy;
       this.lessonContents = lessonContents;
    }
   
    public long getLessonId() {
        return this.lessonId;
    }
    
    public void setLessonId(long lessonId) {
        this.lessonId = lessonId;
    }
    public Year getYear() {
        return this.year;
    }
    
    public void setYear(Year year) {
        this.year = year;
    }
    public Serializable getCode() {
        return this.code;
    }
    
    public void setCode(Serializable code) {
        this.code = code;
    }
    public Serializable getName() {
        return this.name;
    }
    
    public void setName(Serializable name) {
        this.name = name;
    }
    public Integer getDurationInHours() {
        return this.durationInHours;
    }
    
    public void setDurationInHours(Integer durationInHours) {
        this.durationInHours = durationInHours;
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
    public Set getLessonContents() {
        return this.lessonContents;
    }
    
    public void setLessonContents(Set lessonContents) {
        this.lessonContents = lessonContents;
    }




}


