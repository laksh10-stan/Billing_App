
import java.sql.Connection;
import java.sql.DriverManager;

public class re {
    public static Connection getCon()
    {
        Connection con=null;
       
        try
         {
          //con=DriverManager.getConnection("Jdbc:Odbc:Billing_System");
String dbUrl="jdbc:ucanaccess://F:\\Study Material\\Projects\\Billing_System\\BILLING_SYSTEM.mdb";
con=DriverManager.getConnection(dbUrl,"","");
        }
        catch(Exception ex)
        {
System.out.println("Error in Database Connection");
        }
        return con;
    }

}
