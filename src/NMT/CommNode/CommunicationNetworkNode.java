/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NMT.CommNode;

import business.bean.CommObj;


/**
 *
 * @author Salim
 */
public class CommunicationNetworkNode {
    
    private final int nodeId;
    private NMTData nmtData;
    
    public CommunicationNetworkNode(int nodeId)
    {
        this.nodeId = nodeId;
        this.nmtData = new NMTData();
    }
    
    public void validateCommObj(CommObj commObj) throws IllegalArgumentException
    {
        String errorMssg = isValidateCommObj(commObj);
        if(errorMssg.length()>0)
            throw new IllegalArgumentException(errorMssg);
        
        //if CommObj as a data then
        nmtData.putIntoMessgQueue(commObj);
    }
    
    private static String isValidateCommObj(CommObj commObj)
    {
        StringBuilder errorMssg = new StringBuilder();
        if(commObj.getPriority()>10 || commObj.getPriority()<1)
            errorMssg.append("Invalid priority: "+commObj.getPriority()+"\n");
        if(commObj.getTargetNode()== 0)
            errorMssg.append("Invalid targetNode: "+commObj.getTargetNode()+"\n");
        if(commObj.getSrcNode()==0)
            errorMssg.append("Invalid source node: "+commObj.getSrcNode()+"\n");
        if(!isValidateResponseType(commObj.getNodeType()))
            errorMssg.append("Invalid responseType field: "+commObj.getNodeType()+"\n");
        
        return errorMssg.toString();
    }
    
    private static boolean isValidateResponseType(int nodeType)
    {
        if(nodeType != 0 && nodeType!=1 && nodeType!=2)
            return false;
        return true;
    }
    
}
