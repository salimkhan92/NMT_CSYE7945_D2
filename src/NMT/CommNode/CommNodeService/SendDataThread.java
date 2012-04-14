/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NMT.CommNode.CommNodeService;



/**
 *
 * @author Salim
 */
public class SendDataThread implements Runnable{
    
    public SendDataThread()
    {
        
    }

    @Override
    public void run() {
        while(true)
        {
            try{
            
            /*
             *call E-team API to send data 
             */
            }
            catch(Exception e)
            {
                System.out.println("Error occured during pulling CommObj in sendData() method");
                break;
            }
        }
    }
    
}
