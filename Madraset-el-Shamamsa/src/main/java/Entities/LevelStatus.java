package Entities;
// Generated Sep 8, 2017 9:11:07 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * LevelStatus generated by hbm2java
 */
public class LevelStatus  implements java.io.Serializable {


     private long statusId;
     private String name;
     private Set studentLevelStates = new HashSet(0);

    public LevelStatus() {
    }

	
    public LevelStatus(long statusId) {
        this.statusId = statusId;
    }
    public LevelStatus(long statusId, String name, Set studentLevelStates) {
       this.statusId = statusId;
       this.name = name;
       this.studentLevelStates = studentLevelStates;
    }
   
    public long getStatusId() {
        return this.statusId;
    }
    
    public void setStatusId(long statusId) {
        this.statusId = statusId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getStudentLevelStates() {
        return this.studentLevelStates;
    }
    
    public void setStudentLevelStates(Set studentLevelStates) {
        this.studentLevelStates = studentLevelStates;
    }




}


