import java.sql.*;

class JDBC
{  
public static void main(String args[])
{  
try{  
	Class.forName("org.h2.Driver");
    Connection con=DriverManager.getConnection("jdbc:h2:~/test","sa","");  
//	Class.forName("oracle.jdbc.driver.OracleDriver");  
//	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:8080:xe","system","517325");  
	Statement stmt=con.createStatement();  
	con.close();  
	}
catch(Exception e)
	{ 
	System.out.println(e);
	}   
}  
}  
