import java.sql.*;
public class JDBC {
     public static void main(String[] args) throws SQLException{
    	 String gusqlurl="jdbc:mysql://94.231.103.7/bennedsen_org_db";
    	 String guusername="bennedsen_org";
    	 String gupassword="esigelec";
    	 Connection guconnection = DriverManager.getConnection(gusqlurl, guusername, gupassword);
    	 DatabaseMetaData gudbMetaData=
    			 guconnection.getMetaData();
    			 String productName=
    			 gudbMetaData.getDatabaseProductName();
    			 System.out.println("Database: " + productName);
    			 String productVersion=
    			 gudbMetaData.getDatabaseProductVersion();
    			 System.out.println("Version: " + productVersion);
        guconnection.close();
     }
}
