/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSFBeans;

import Managers.StudentManager;
import DAO.StudentDAO;
import Entities.StdStudent;
import java.util.ArrayList;
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

    private StudentScreenObject studentSO;
    private ArrayList<StdStudent> students;

    private Map<String, String> educationalStageMap;
    private Map<String, String> educationalStageYearMap;

    /**
     * Creates a new instance of StudentBean
     */
    public studentBean() {
        studentSO = new StudentScreenObject();
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

    public void addStudent() {
        StudentManager STDManager = new StudentManager();
        STDManager.create(studentSO);

    }

    public StudentScreenObject getStudentSO() {
        return studentSO;
    }

    public void setStudentSO(StudentScreenObject studentSO) {
        this.studentSO = studentSO;
    }

}
