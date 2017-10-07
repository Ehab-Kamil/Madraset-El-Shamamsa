package Entities;
// Generated Oct 5, 2017 11:18:29 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * StdStudent generated by hbm2java
 */
public class StdStudent implements AbstractEntity, java.io.Serializable {


     private long studentId;
     private EducationalState educationalState;
     private Term term;
     private String code;
     private String firstName;
     private String middleName;
     private String lastName;
     private String jobTitle;
     private Date birthdate;
     private String email;
     private String facebookName;
     private String addStreet;
     private String addBuildingNo;
     private String addFloorNo;
     private String addFlatNo;
     private String addDesc;
     private String confFather;
     private String confFatherChurch;
     private byte[] image;
     private Boolean isMarshoum;
     private String rankAtChurch;
     private String description;
     private Date creatioinDate;
     private String createdBy;
     private Date lastModificationDate;
     private String lastModifiedBy;
     private Set studentLessonAttendences = new HashSet(0);
     private Set stdPhones = new HashSet(0);
     private Set usrSubscribers = new HashSet(0);

    public StdStudent() {
    }

	
    public StdStudent(long studentId, Term term) {
        this.studentId = studentId;
        this.term = term;
    }
    public StdStudent(long studentId, EducationalState educationalState, Term term, String code, String firstName, String middleName, String lastName, String jobTitle, Date birthdate, String email, String facebookName, String addStreet, String addBuildingNo, String addFloorNo, String addFlatNo, String addDesc, String confFather, String confFatherChurch, byte[] image, Boolean isMarshoum, String rankAtChurch, String description, Date creatioinDate, String createdBy, Date lastModificationDate, String lastModifiedBy, Set studentLessonAttendences, Set stdPhones, Set usrSubscribers) {
       this.studentId = studentId;
       this.educationalState = educationalState;
       this.term = term;
       this.code = code;
       this.firstName = firstName;
       this.middleName = middleName;
       this.lastName = lastName;
       this.jobTitle = jobTitle;
       this.birthdate = birthdate;
       this.email = email;
       this.facebookName = facebookName;
       this.addStreet = addStreet;
       this.addBuildingNo = addBuildingNo;
       this.addFloorNo = addFloorNo;
       this.addFlatNo = addFlatNo;
       this.addDesc = addDesc;
       this.confFather = confFather;
       this.confFatherChurch = confFatherChurch;
       this.image = image;
       this.isMarshoum = isMarshoum;
       this.rankAtChurch = rankAtChurch;
       this.description = description;
       this.creatioinDate = creatioinDate;
       this.createdBy = createdBy;
       this.lastModificationDate = lastModificationDate;
       this.lastModifiedBy = lastModifiedBy;
       this.studentLessonAttendences = studentLessonAttendences;
       this.stdPhones = stdPhones;
       this.usrSubscribers = usrSubscribers;
    }
   
    public long getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }
    public EducationalState getEducationalState() {
        return this.educationalState;
    }
    
    public void setEducationalState(EducationalState educationalState) {
        this.educationalState = educationalState;
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
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return this.middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getJobTitle() {
        return this.jobTitle;
    }
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public Date getBirthdate() {
        return this.birthdate;
    }
    
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFacebookName() {
        return this.facebookName;
    }
    
    public void setFacebookName(String facebookName) {
        this.facebookName = facebookName;
    }
    public String getAddStreet() {
        return this.addStreet;
    }
    
    public void setAddStreet(String addStreet) {
        this.addStreet = addStreet;
    }
    public String getAddBuildingNo() {
        return this.addBuildingNo;
    }
    
    public void setAddBuildingNo(String addBuildingNo) {
        this.addBuildingNo = addBuildingNo;
    }
    public String getAddFloorNo() {
        return this.addFloorNo;
    }
    
    public void setAddFloorNo(String addFloorNo) {
        this.addFloorNo = addFloorNo;
    }
    public String getAddFlatNo() {
        return this.addFlatNo;
    }
    
    public void setAddFlatNo(String addFlatNo) {
        this.addFlatNo = addFlatNo;
    }
    public String getAddDesc() {
        return this.addDesc;
    }
    
    public void setAddDesc(String addDesc) {
        this.addDesc = addDesc;
    }
    public String getConfFather() {
        return this.confFather;
    }
    
    public void setConfFather(String confFather) {
        this.confFather = confFather;
    }
    public String getConfFatherChurch() {
        return this.confFatherChurch;
    }
    
    public void setConfFatherChurch(String confFatherChurch) {
        this.confFatherChurch = confFatherChurch;
    }
    public byte[] getImage() {
        return this.image;
    }
    
    public void setImage(byte[] image) {
        this.image = image;
    }
    public Boolean getIsMarshoum() {
        return this.isMarshoum;
    }
    
    public void setIsMarshoum(Boolean isMarshoum) {
        this.isMarshoum = isMarshoum;
    }
    public String getRankAtChurch() {
        return this.rankAtChurch;
    }
    
    public void setRankAtChurch(String rankAtChurch) {
        this.rankAtChurch = rankAtChurch;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getCreatioinDate() {
        return this.creatioinDate;
    }
    
    public void setCreatioinDate(Date creatioinDate) {
        this.creatioinDate = creatioinDate;
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
    public Set getStudentLessonAttendences() {
        return this.studentLessonAttendences;
    }
    
    public void setStudentLessonAttendences(Set studentLessonAttendences) {
        this.studentLessonAttendences = studentLessonAttendences;
    }
    public Set getStdPhones() {
        return this.stdPhones;
    }
    
    public void setStdPhones(Set stdPhones) {
        this.stdPhones = stdPhones;
    }
    public Set getUsrSubscribers() {
        return this.usrSubscribers;
    }
    
    public void setUsrSubscribers(Set usrSubscribers) {
        this.usrSubscribers = usrSubscribers;
    }




}


