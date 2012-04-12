/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.util;

import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Salim
 */
public class TimerScript implements Runnable {
 
    Thread runner;
    private JLabel timeTextField;
    public TimerScript(JLabel timeTextField)
    {
        this.timeTextField = timeTextField;
        start();
    }
 
     public String timeNow()
     {
       Calendar now = Calendar.getInstance();
       int month = now.get(Calendar.MONTH)+1;
       int day = now.get(Calendar.DAY_OF_MONTH);
       int year = now.get(Calendar.YEAR);
       int hrs = now.get(Calendar.HOUR_OF_DAY);
       int min = now.get(Calendar.MINUTE);
       int sec = now.get(Calendar.SECOND);
 
       //String time = zero(hrs)+":"+zero(min)+":"+zero(sec);
       String time = month+"-"+day+"-"+year+" "+zero(hrs)+":"+zero(min)+":"+zero(sec);
 
       return time;
     }
 
          public String zero(int num)
     {
       String number=( num < 10) ? ("0"+num) : (""+num);
       return number;                                    //Add leading zero if needed
 
     }
 
 
     public void start()
     {
       if(runner == null) runner = new Thread(this);
       runner.start();                                                      //method to start thread
     }
 
 
     public void run()
     {
 
       while (runner == Thread.currentThread() )
       {
        timeTextField.setText(timeNow());
                                                         //define thread task
           try
             {
               Thread.sleep(1000);
             }
              catch(InterruptedException e)
                  {
                    System.out.println("Thread failed");
                  }
       }
     }

}
