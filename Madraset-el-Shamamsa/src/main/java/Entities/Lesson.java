package Entities;
// Generated Oct 5, 2017 11:18:29 AM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.List;

/**
 * Lesson generated by hbm2java
 */
public class Lesson implements java.io.Serializable, AbstractEntity {

	private static final long serialVersionUID = 1L;
	private long lessonId;
	private Term term;
	private String code;
	private String name;
	private Integer durationInHours;
	private Date creationDate;
	private String createdBy;
	private Date lastModifiedDate;
	private String lastModifiedBy;
	private List<LessonContent> lessonContents;

	public Lesson() {
	}

	public Lesson(long lessonId) {
		this.lessonId = lessonId;
	}

	public long getLessonId() {
		return this.lessonId;
	}

	public void setLessonId(long lessonId) {
		this.lessonId = lessonId;
	}

	public Term getTerm() {
		return this.term;
	}

	public void setTerm(Term term) {
		this.term = term;
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

	public List<LessonContent> getLessonContents() {
		return lessonContents;
	}

	public void setLessonContents(List<LessonContent> lessonContents) {
		this.lessonContents = lessonContents;
	}

}
