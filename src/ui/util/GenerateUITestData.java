/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Salim
 */
public class GenerateUITestData {
    
    
    public static void generate(JTable table1, JTable table2, JTable table3, JTable table4){
    List<CommObj> sentPackets = new ArrayList<CommObj>();
    List<CommObj> receivedPackets = new ArrayList<CommObj>();
    List<CommObj> readyToSend = new ArrayList<CommObj>();
    List<CommObj> pendingPackets = new ArrayList<CommObj>();
    
    fillList(sentPackets);
    fillList(receivedPackets);
    fillList(readyToSend);
    fillList(pendingPackets);
    
    populateJTable(table1,sentPackets);
    populateJTable(table2,receivedPackets);
    populateJTable(table3,readyToSend);
    populateJTable(table4,pendingPackets);
    
    }
    
    public static void fillList(List<CommObj> list)
    {
        Calendar now = Calendar.getInstance();
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:S");
        CommObj obj = new CommObj("123","social", "test", null, "Test-1", "Test-2",dtf.format(now.getTime()),5);
        CommObj obj1 = new CommObj("124","social", "test", null, "Test-1", "Test-2",dtf.format(now.getTime()),6);
        CommObj obj2 = new CommObj("125","info", "test", null, "Test-1", "Test-3",dtf.format(now.getTime()),7);
        CommObj obj3 = new CommObj("126","info", "test", null, "Test-1", "Test-3",dtf.format(now.getTime()),7);
        CommObj obj4 = new CommObj("127","social", "test", null, "Test-1", "Test-2",dtf.format(now.getTime()),9);
    
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
    }
    
    public static void populateJTable(JTable table, List<CommObj> list)
    {
        for (CommObj obj : list) {
            Object[] rowObject = new Object[6];
            rowObject[0] = obj.getMssgId();
            rowObject[1] = obj.getSourceNode();
            rowObject[2] = obj.getTargetNode();
            rowObject[3] = obj.getResposeType();
            rowObject[4] = obj.getPriority();
            rowObject[5] = obj.getTimeSent();

            ((DefaultTableModel) table.getModel()).addRow(rowObject);
        }
    }
}
