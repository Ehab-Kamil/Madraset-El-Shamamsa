package Entities;
// Generated Oct 5, 2017 11:18:29 AM by Hibernate Tools 4.3.1



/**
 * SetSequencers generated by hbm2java
 */
public class SetSequencers  implements java.io.Serializable {


     private long seqId;
     private String code;
     private Integer currentSequence;
     private Integer nextSequence;
     private Integer entityType;

    public SetSequencers() {
    }

	
    public SetSequencers(long seqId) {
        this.seqId = seqId;
    }
    public SetSequencers(long seqId, String code, Integer currentSequence, Integer nextSequence, Integer entityType) {
       this.seqId = seqId;
       this.code = code;
       this.currentSequence = currentSequence;
       this.nextSequence = nextSequence;
       this.entityType = entityType;
    }
   
    public long getSeqId() {
        return this.seqId;
    }
    
    public void setSeqId(long seqId) {
        this.seqId = seqId;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public Integer getCurrentSequence() {
        return this.currentSequence;
    }
    
    public void setCurrentSequence(Integer currentSequence) {
        this.currentSequence = currentSequence;
    }
    public Integer getNextSequence() {
        return this.nextSequence;
    }
    
    public void setNextSequence(Integer nextSequence) {
        this.nextSequence = nextSequence;
    }
    public Integer getEntityType() {
        return this.entityType;
    }
    
    public void setEntityType(Integer entityType) {
        this.entityType = entityType;
    }




}


