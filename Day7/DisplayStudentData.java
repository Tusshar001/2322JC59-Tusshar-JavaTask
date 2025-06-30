package day7;
import java.sql.*;
public class DisplayStudentData {
	 public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/your_database"; // Replace with your DB name
	        String user = "root";           // Replace with your username
	        String password = "your_password"; // Replace with your password

	        try {
	            // Load JDBC driver (optional for newer versions)
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Connect to database
	            Connection conn = DriverManager.getConnection(url, user, password);

	            // Create and execute SQL SELECT query
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

	            // Display data
	            System.out.println("ID\tName\tMarks");
	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                int marks = rs.getInt("marks");
	                System.out.println(id + "\t" + name + "\t" + marks);
	            }

	            // Close connection
	            conn.close();
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}

}
