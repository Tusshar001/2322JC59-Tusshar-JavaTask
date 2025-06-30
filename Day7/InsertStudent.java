package day7;
import java.sql.*;

public class InsertStudent {
	 public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/your_database"; // Replace with your DB name
	        String user = "root";           // Replace with your MySQL username
	        String password = "your_password"; // Replace with your MySQL password

	        try {
	            // Load JDBC driver (optional in newer Java versions)
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Connect to MySQL
	            Connection conn = DriverManager.getConnection(url, user, password);

	            // Prepare SQL insert query
	            String sql = "INSERT INTO student (id, name, marks) VALUES (?, ?, ?)";
	            PreparedStatement stmt = conn.prepareStatement(sql);

	            // Set values
	            stmt.setInt(1, 1);                // student ID
	            stmt.setString(2, "Arun");        // student Name
	            stmt.setInt(3, 85);               // student Marks

	            // Execute the insert
	            int rows = stmt.executeUpdate();

	            // Show result
	            if (rows > 0) {
	                System.out.println("Student inserted successfully.");
	            }

	            // Close connection
	            conn.close();
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}

}
