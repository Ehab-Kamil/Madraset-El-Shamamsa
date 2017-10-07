/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSFBeans;

import DAO.Managers.StudentManager;
import DAO.StudentDAO;
import Entities.StdStudent;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import screenObject.StudentScreenObject;

/**
 *
 * @author Ehab
 */
@ManagedBean(name = "studentBean")
public class studentBean {

//    private StudentScreenObject studentSO = new StudentScreenObject();
    private long studentId;
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
    private String educationalStage;
    private String educationalStageYear;
    private Boolean isMarshoum;
    private String rankAtChurch;
    private String description;
    private Date creatioinDate;
    private String createdBy;
    private Date lastModificationDate;
    private String lastModifiedBy;
    private ArrayList<StdStudent> students;

    private Map<String, String> educationalStageMap;
    private Map<String, String> educationalStageYearMap;

    /**
     * Creates a new instance of StudentBean
     */
    public studentBean() {
        educationalStageMap = new LinkedHashMap<>();
        educationalStageMap.put("e3dadi", "e3dadi");
        educationalStageMap.put("sanawy", "sanawy");
        educationalStageMap.put("gam3a", "gam3a");

        educationalStageYearMap = new LinkedHashMap<>();
        educationalStageYearMap.put("2oula", "2oula");
        educationalStageYearMap.put("tania", "tania");
        educationalStageYearMap.put("talta", "talta");

    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebookName() {
        return facebookName;
    }

    public void setFacebookName(String facebookName) {
        this.facebookName = facebookName;
    }

    public String getAddStreet() {
        return addStreet;
    }

    public void setAddStreet(String addStreet) {
        this.addStreet = addStreet;
    }

    public String getAddBuildingNo() {
        return addBuildingNo;
    }

    public void setAddBuildingNo(String addBuildingNo) {
        this.addBuildingNo = addBuildingNo;
    }

    public String getAddFloorNo() {
        return addFloorNo;
    }

    public void setAddFloorNo(String addFloorNo) {
        this.addFloorNo = addFloorNo;
    }

    public String getAddFlatNo() {
        return addFlatNo;
    }

    public void setAddFlatNo(String addFlatNo) {
        this.addFlatNo = addFlatNo;
    }

    public String getAddDesc() {
        return addDesc;
    }

    public void setAddDesc(String addDesc) {
        this.addDesc = addDesc;
    }

    public String getConfFather() {
        return confFather;
    }

    public void setConfFather(String confFather) {
        this.confFather = confFather;
    }

    public String getConfFatherChurch() {
        return confFatherChurch;
    }

    public void setConfFatherChurch(String confFatherChurch) {
        this.confFatherChurch = confFatherChurch;
    }

    public String getEducationalStage() {
        return educationalStage;
    }

    public void setEducationalStage(String educationalStage) {
        this.educationalStage = educationalStage;
    }

    public String getEducationalStageYear() {
        return educationalStageYear;
    }

    public void setEducationalStageYear(String educationalStageYear) {
        this.educationalStageYear = educationalStageYear;
    }

    public Boolean getIsMarshoum() {
        return isMarshoum;
    }

    public void setIsMarshoum(Boolean isMarshoum) {
        this.isMarshoum = isMarshoum;
    }

    public String getRankAtChurch() {
        return rankAtChurch;
    }

    public void setRankAtChurch(String rankAtChurch) {
        this.rankAtChurch = rankAtChurch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatioinDate() {
        return creatioinDate;
    }

    public void setCreatioinDate(Date creatioinDate) {
        this.creatioinDate = creatioinDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public ArrayList<StdStudent> getStudents() {
        StudentDAO dao = new StudentDAO();
        students = (ArrayList<StdStudent>) dao.findAll(StdStudent.class);
        return students;
    }

    public void setStudents(ArrayList<StdStudent> students) {
        this.students = students;
    }

    public Map<String, String> getEducationalStageMap() {
        return educationalStageMap;
    }

    public void setEducationalStageMap(Map<String, String> educationalStageMap) {
        educationalStageMap = educationalStageMap;
    }

    public Map<String, String> getEducationalStageYearMap() {
        return educationalStageYearMap;
    }

    public void setEducationalStageYearMap(Map<String, String> educationalStageYearMap) {
        educationalStageYearMap = educationalStageYearMap;
    }

//    public StudentScreenObject getStudentSO() {
//        return studentSO;
//    }
//
//    public void setStudentSO(StudentScreenObject studentSO) {
//        this.studentSO = studentSO;
//    }
    public boolean addStudent() {
        boolean result = false;
        StdStudent newStudent = new StdStudent();
        StudentScreenObject std = new StudentScreenObject();
        std.setFirstName(firstName);
        std.setMiddleName(middleName);

//        StudentDAO dao = new StudentDAO();
        StudentManager STDManager = new StudentManager();
        STDManager.create(std);
//        try {
////            dao.create(newStudent);
//            result = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//            result = false;
//        } finally {
//            HibernateFactory.close(dao.session);
//        }
        return result;
    }

}
