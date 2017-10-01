package Entities;
// Generated Sep 29, 2017 12:28:05 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Term generated by hbm2java
 */
public class Term  implements AbstractEntity, Serializable {


     private long termId;
     private Level level;
     private String code;
     private String year;
     private Date startDate;
     private Date endDate;
     private Date creationDate;
     private String createdBy;
     private Date lastModifiedDate;
     private String lastModifiedBy;
     private Set years = new HashSet(0);

    public Term() {
    }

	
    public Term(long termId, Date lastModifiedDate) {
        this.termId = termId;
        this.lastModifiedDate = lastModifiedDate;
    }
    public Term(long termId, Level level, String code, String year, Date startDate, Date endDate, Date creationDate, String createdBy, Date lastModifiedDate, String lastModifiedBy, Set years) {
       this.termId = termId;
       this.level = level;
       this.code = code;
       this.year = year;
       this.startDate = startDate;
       this.endDate = endDate;
       this.creationDate = creationDate;
       this.createdBy = createdBy;
       this.lastModifiedDate = lastModifiedDate;
       this.lastModifiedBy = lastModifiedBy;
       this.years = years;
    }
   
    public long getTermId() {
        return this.termId;
    }
    
    public void setTermId(long termId) {
        this.termId = termId;
    }
    public Level getLevel() {
        return this.level;
    }
    
    public void setLevel(Level level) {
        this.level = level;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getYear() {
        return this.year;
    }
    
    public void setYear(String year) {
        this.year = year;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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


