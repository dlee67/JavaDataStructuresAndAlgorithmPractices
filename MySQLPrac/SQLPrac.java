import java.sql.*;

class SQLPrac{
   public static void main(String args[]){
      String dbULR = "jdbc:mysql://localhost:3306/jumpstart";
      try{
         Connection myConn = DriverManager.getConnection(dbULR, /*username*/, /*Password*/);
      }catch(Exception e){
         e.printStackTrace();
      }
   }
}
