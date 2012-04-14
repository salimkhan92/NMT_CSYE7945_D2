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
    private int MsgId;
    private int TargetNode;
    private int SrcNode;
    private int NodeType;
    private String FieldType;
    private Object Data;
    private long TimeSend;
    private long TimeRec;
    private int Priority;
    private boolean Ack;
    
    public Object getData() {
        return Data;
    }

    public void setData(Object Data) {
        this.Data = Data;
    }

    public boolean isAck() {
        return Ack;
    }

    public void setAck(boolean Ack) {
        this.Ack = Ack;
    }

    public String getFieldType() {
        return FieldType;
    }

    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }

    public int getMsgId() {
        return MsgId;
    }

    public void setMsgId(int MsgId) {
        this.MsgId = MsgId;
    }

    public int getNodeType() {
        return NodeType;
    }

    public void setNodeType(int NodeType) {
        this.NodeType = NodeType;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int Priority) {
        this.Priority = Priority;
    }

    public int getSrcNode() {
        return SrcNode;
    }

    public void setSrcNode(int SrcNode) {
        this.SrcNode = SrcNode;
    }

    public int getTargetNode() {
        return TargetNode;
    }

    public void setTargetNode(int TargetNode) {
        this.TargetNode = TargetNode;
    }

    public long getTimeRec() {
        return TimeRec;
    }

    public void setTimeRec(long TimeRec) {
        this.TimeRec = TimeRec;
    }

    public long getTimeSend() {
        return TimeSend;
    }

    public void setTimeSent(long TimeSend) {
        this.TimeSend = TimeSend;
    }
    
    @Override
    public boolean equals(Object others)
    {
            return super.equals(others);
    }   
}
