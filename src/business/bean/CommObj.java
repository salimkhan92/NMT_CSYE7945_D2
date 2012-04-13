/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.bean;

/**
 *
 * @author btapiawa
 */
public class CommObj {
    private int msgId;
    private int targetNode;
    private int srcNode;
    private int nodeType;
    private String fieldType;
    private Object Data;
    private long timeSent;
    private long timeRec;
    private int priority;
    private boolean ack;

    public Object getData() {
        return Data;
    }

    public void setData(Object Data) {
        this.Data = Data;
    }

    public boolean isAck() {
        return ack;
    }

    public void setAck(boolean ack) {
        this.ack = ack;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public int getNodeType() {
        return nodeType;
    }

    public void setNodeType(int nodeType) {
        this.nodeType = nodeType;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getSrcNode() {
        return srcNode;
    }

    public void setSrcNode(int srcNode) {
        this.srcNode = srcNode;
    }

    public int getTargetNode() {
        return targetNode;
    }

    public void setTargetNode(int targetNode) {
        this.targetNode = targetNode;
    }

    public long getTimeRec() {
        return timeRec;
    }

    public void setTimeRec(long timeRec) {
        this.timeRec = timeRec;
    }

    public long getTimeSent() {
        return timeSent;
    }

    public void setTimeSent(long timeSent) {
        this.timeSent = timeSent;
    }
    
    @Override
    public boolean equals(Object others)
    {
            return super.equals(others);
    }   
}
