//Referred: https://dev.mysql.com/doc/connector-j/5.1/en/connector-j-usagenotes-connect-drivermanager.html#connector-j-examples-connection-drivermanager
//But the above link's heuristic is not much different from the other learning sources I've followed...

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCThing{
	public static void main(String[] args){
		try{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "uBoBoBo*67");
			Statement myStmt = (Statement) conn.createStatement();
			ResultSet myRs = myStmt.executeQuery("select * from stuff");
			while(myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}