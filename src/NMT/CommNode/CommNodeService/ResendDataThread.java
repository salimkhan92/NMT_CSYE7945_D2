/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NMT.CommNode.CommNodeService;

/**
 *
 * @author Salim
 */
public class ResendDataThread implements Runnable{


    public ResendDataThread()
    {

    }
    @Override
    public void run() {
        while(true)
        {
            
            try{
                
            }
            catch(Exception e)
            {
                System.out.println("Error in resend thread run method.");
                break;
            }
        }
    }
    
}
