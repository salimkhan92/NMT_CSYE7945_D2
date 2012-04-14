/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NMT.CommNode.CommNodeService;

/**
 *
 * @author Salim
 */
public class CommunicationNetworkService {
    
    private Thread sendThread;
    private Thread resendThread;
    
    public void setCommunicationNetworkNode()
    {
        startThreads();
    }
    
    public void startThreads()
    {
        SendDataThread sdt = new SendDataThread();
        ResendDataThread rsdt = new ResendDataThread();
        
        sendThread = new Thread(sdt);
        resendThread = new Thread(rsdt);
        
        sendThread.start();
        resendThread.start();
    }
    
}
