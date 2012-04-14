/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NMT.CommNode;

import business.bean.CommObj;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 *
 * @author Salim
 */
public class NMTData {
    
    private PriorityBlockingQueue<CommObj> messageQueue;
    private LinkedBlockingQueue<CommObj> messageBuket;
    
    public NMTData()
    {
        this.messageQueue = new PriorityBlockingQueue<CommObj>();
        this.messageBuket = new LinkedBlockingQueue<CommObj>();
    }

    public LinkedBlockingQueue<CommObj> getMessageBuket() {
        return messageBuket;
    }

    public PriorityBlockingQueue<CommObj> getMessageQueue() {
        return messageQueue;
    }
    
    public synchronized void putIntoMessgQueue(CommObj commObj)
    {
        messageQueue.put(commObj);
        notifyAll();
    }
    
    
}
