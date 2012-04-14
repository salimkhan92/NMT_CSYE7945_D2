/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.------test
 */
package business.bean.databaseService;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Salim
 */
public class DBUtil {
    
    private static final String URL = "jdbc:mysql://localhost:3306/ dbname";
    private static final String USERNAME = "root";
    private static final String PWD="";
    private static final String DB_NAME ="wockets";
    private static Connection connection;
    
    public static Connection getDBConnection()
    {
        if(connection == null)
        {
            try{ 
                Class.forName ("com.mysql.jdbc.Driver").newInstance ();
                String url = "jdbc:mysql://localhost:3306/"+DB_NAME;
                connection = DriverManager.getConnection(url, USERNAME, PWD);
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
            return connection;
    }
    
public static void test()
{
   try{
    Connection conn = getDBConnection();
    Statement s = conn.createStatement();
   int count;
   s.executeUpdate ("DROP TABLE IF EXISTS animal");
   s.executeUpdate (
               "CREATE TABLE animal ("
               + "id INT UNSIGNED NOT NULL AUTO_INCREMENT,"
               + "PRIMARY KEY (id),"
               + "name CHAR(40), category CHAR(40))");
   count = s.executeUpdate (
               "INSERT INTO animal (name, category)"
               + " VALUES"
               + "('snake', 'reptile'),"
               + "('frog', 'amphibian'),"
               + "('tuna', 'fish'),"
               + "('racoon', 'mammal')");
   s.close ();
   System.out.println (count + " rows were inserted");
    
   }
   catch(Exception e)
   {
       e.printStackTrace();
   }
}
}
