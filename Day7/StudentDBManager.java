package day7;
import java.sql.*;
import java.util.Scanner;
public class StudentDBManager {
	 static final String URL = "jdbc:mysql://localhost:3306/school";
	    static final String USER = "root";
	    static final String PASSWORD = "your_password"; // <-- change this

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

	            do {
	                System.out.println("\n--- Student DB Manager ---");
	                System.out.println("1. Add Student");
	                System.out.println("2. Display Students");
	                System.out.println("3. Delete Student");
	                System.out.println("4. Exit");
	                System.out.print("Enter choice: ");
	                choice = sc.nextInt();
	                sc.nextLine(); // consume newline

	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter ID: ");
	                        int id = sc.nextInt();
	                        sc.nextLine();
	                        System.out.print("Enter Name: ");
	                        String name = sc.nextLine();
	                        System.out.print("Enter Marks: ");
	                        int marks = sc.nextInt();

	                        String insertSQL = "INSERT INTO student (id, name, marks) VALUES (?, ?, ?)";
	                        PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
	                        insertStmt.setInt(1, id);
	                        insertStmt.setString(2, name);
	                        insertStmt.setInt(3, marks);
	                        insertStmt.executeUpdate();
	                        System.out.println("Student added.");
	                        break;

	                    case 2:
	                        Statement stmt = conn.createStatement();
	                        ResultSet rs = stmt.executeQuery("SELECT * FROM student");
	                        System.out.println("\nID\tName\tMarks");
	                        while (rs.next()) {
	                            System.out.println(rs.getInt("id") + "\t" +
	                                               rs.getString("name") + "\t" +
	                                               rs.getInt("marks"));
	                        }
	                        break;

	                    case 3:
	                        System.out.print("Enter student ID to delete: ");
	                        int delId = sc.nextInt();
	                        String deleteSQL = "DELETE FROM student WHERE id = ?";
	                        PreparedStatement deleteStmt = conn.prepareStatement(deleteSQL);
	                        deleteStmt.setInt(1, delId);
	                        int rows = deleteStmt.executeUpdate();
	                        if (rows > 0) {
	                            System.out.println("Student deleted.");
	                        } else {
	                            System.out.println("Student not found.");
	                        }
	                        break;

	                    case 4:
	                        System.out.println("Exiting...");
	                        break;

	                    default:
	                        System.out.println("Invalid choice.");
	                }
	            } while (choice != 4);

	            conn.close();
	            sc.close();
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}

}
