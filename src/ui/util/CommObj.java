
package ui.util;

/**
 *
 * @author Salim
 */
public class CommObj implements Comparable<CommObj> {
    /**
     * 0-Social, 1-Info, 2-Comm/Message
     */
    private String resposeType;
    /**
     * 
     */
    private String fieldType;
    /**
     * data is main Object to send or receive
     */
    private Object data;
    /**
     * sent time format yyyy-mm-dd hh:mm:ss
     */
    private String timeSent;
    /**
     * receive time format yyyy-mm-dd hh:mm:ss
     */
    private String timeRec;
    /**
     * priority 0-9  (1 is highest priority and so on)
     */
    private int priority;

    /**
     * set when acknowledgement receive 
     */
    private boolean ack;
    
    private String targetNode;
    private String sourceNode;
    private String mssgId;

    
    //constructor
    public CommObj(String mssgId, String responseType, String fieldType, Object data, String source, String target, String time, int priority)
    {
        this.mssgId = mssgId;
        this.resposeType = responseType;
        this.fieldType = fieldType;
        this.data = data;
        this.sourceNode =source;
        this.targetNode = target;
        this.timeSent = time; 
        this.priority = priority;
    }

    public boolean isAck() {
        return ack;
    }

    public void setAck(boolean ack) {
        this.ack = ack;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getResposeType() {
        return resposeType;
    }

    public void setResposeType(String resposeType) {
        this.resposeType = resposeType;
    }

    public String getTimeRec() {
        return timeRec;
    }

    public void setTimeRec(String timeRec) {
        this.timeRec = timeRec;
    }

    public String getTimeSent() {
        return timeSent;
    }

    public void setTimeSent(String timeSent) {
        this.timeSent = timeSent;
    }

    public String getSourceNode() {
        return sourceNode;
    }

    public void setSourceNode(String sourceNode) {
        this.sourceNode = sourceNode;
    }

    public String getTargetNode() {
        return targetNode;
    }

    public void setTargetNode(String targetNode) {
        this.targetNode = targetNode;
    }

    public String getMssgId() {
        return mssgId;
    }

    public void setMssgId(String mssgId) {
        this.mssgId = mssgId;
    }
    
    
    
    
    @Override
    public int compareTo(CommObj obj) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;
        
        if(this.priority == obj.priority)
            return EQUAL;
       if (this.priority < obj.priority) 
           return BEFORE;
       else 
           return AFTER;
    }
    
}
