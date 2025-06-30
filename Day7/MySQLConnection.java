package day7;
import java.sql.*;
public class MySQLConnection {
	  public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/your_database_name"; // Change DB name
	        String user = "root";     // Change username if needed
	        String password = "your_password"; // Change to your MySQL password

	        try {
	            // Load the MySQL JDBC driver (optional for newer Java versions)
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Connect to the database
	            Connection conn = DriverManager.getConnection(url, user, password);
	            System.out.println("Connection successful!");

	            // Close the connection
	            conn.close();
	        } catch (Exception e) {
	            System.out.println("Connection failed: " + e.getMessage());
	        }
	    }
	}

}
