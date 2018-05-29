import java.sql.*;

class SQLPrac{

   public static void main(String args[]){
      String dbULR = "jdbc:mysql://localhost:3306/jumpstart";
      try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection myConn = DriverManager.getConnection(dbULR, /*username*,  /*passwd*/);
      }catch(Exception e){
         e.printStackTrace();
      }
   }

}
