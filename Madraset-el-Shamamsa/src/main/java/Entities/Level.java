package Entities;
// Generated Oct 5, 2017 11:18:29 AM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Level generated by hbm2java
 */
public class Level implements AbstractEntity, Serializable {


     private long levelId;
     private String code;
     private String title;
     private Date creationDate;
     private String createdBy;
     private Date lastModifiedDate;
     private String lastModifiedBy;
     private Set years = new HashSet(0);

    public Level() {
    }

	
    public Level(long levelId) {
        this.levelId = levelId;
    }
    public Level(long levelId, String code, String title, Date creationDate, String createdBy, Date lastModifiedDate, String lastModifiedBy, Set years) {
       this.levelId = levelId;
       this.code = code;
       this.title = title;
       this.creationDate = creationDate;
       this.createdBy = createdBy;
       this.lastModifiedDate = lastModifiedDate;
       this.lastModifiedBy = lastModifiedBy;
       this.years = years;
    }
   
    public long getLevelId() {
        return this.levelId;
    }
    
    public void setLevelId(long levelId) {
        this.levelId = levelId;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
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
    public Set getYears() {
        return this.years;
    }
    
    public void setYears(Set years) {
        this.years = years;
    }




}

