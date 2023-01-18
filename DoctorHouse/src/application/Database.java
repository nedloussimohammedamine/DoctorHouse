package application;
import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

	

	
		
		 public static Connection connection = null;
		
			static {
			    String databaseName = "doctorhouse";
	            String databaseUser = "root";
			    String databasePassword = "0000";
	            String url = "jdbc:mysql://localhost:3306/"+databaseName+"?autoReconnect=true&useSSL=false&characterEncoding=utf8";
	     
			    
			    
			   try {
				   System.out.println("before connection");
				   Class.forName("com.mysql.cj.jdbc.Driver");
				   connection =  DriverManager.getConnection(url,databaseUser,databasePassword);
				   System.out.println("After connexion");
			   }catch (Exception e) {
				   e.printStackTrace();
				   e.getCause();
			   }
			}
			
			public static Connection getConnection()
		    {
		        return connection;
		    }
	


}
