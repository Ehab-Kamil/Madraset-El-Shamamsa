package Entities;
// Generated Oct 5, 2017 11:18:29 AM by Hibernate Tools 4.3.1

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Content generated by hbm2java
 */
public class Content implements AbstractEntity, Serializable {

    private long contentId;
    private Content content;
    private Serializable code;
    private Serializable name;
    private Integer type;
    private Integer durationInHours;
    private Boolean isParent;
    private String lastModifiedBy;
    private Date creationDate;
    private String createdBy;
    private Date lastModifiedDate;
    private Set contents = new HashSet(0);
    private Set lessonContents = new HashSet(0);

    public Content() {
    }

    public Content(long contentId) {
        this.contentId = contentId;
    }

    public Content(long contentId, Content content, Serializable code, Serializable name, Integer type, Integer durationInHours, Boolean isParent, String lastModifiedBy, Date creationDate, String createdBy, Date lastModifiedDate, Set contents, Set lessonContents) {
        this.contentId = contentId;
        this.content = content;
        this.code = code;
        this.name = name;
        this.type = type;
        this.durationInHours = durationInHours;
        this.isParent = isParent;
        this.lastModifiedBy = lastModifiedBy;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.lastModifiedDate = lastModifiedDate;
        this.contents = contents;
        this.lessonContents = lessonContents;
    }

    public long getContentId() {
        return this.contentId;
    }

    public void setContentId(long contentId) {
        this.contentId = contentId;
    }

    public Content getContent() {
        return this.content;
    }

    public void setContent(Content content) {
        this.content = content;
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

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDurationInHours() {
        return this.durationInHours;
    }

    public void setDurationInHours(Integer durationInHours) {
        this.durationInHours = durationInHours;
    }

    public Boolean getIsParent() {
        return this.isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
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

    public Set getContents() {
        return this.contents;
    }

    public void setContents(Set contents) {
        this.contents = contents;
    }

    public Set getLessonContents() {
        return this.lessonContents;
    }

    public void setLessonContents(Set lessonContents) {
        this.lessonContents = lessonContents;
    }

}
