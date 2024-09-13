
package bank.mngment.system;
import java.sql.*; // sql library

/*import Interview question
*JDBC Connectivity have 5 Steps
*1)Register the Driver
*2)Create Connection
*3)Create Statement
*4)Execute Query (check Sinup class for this step)
*5)Close Connection
*/
public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try{
            // step 1)register the driver
            // onecs you have mysql coonector you can remove the line below
           
           //2)Create Connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "password");
            //3) Create Statement
            s = c.createStatement();
        }catch(Exception e) {
           System.out.println(e);
        }
    }
}
