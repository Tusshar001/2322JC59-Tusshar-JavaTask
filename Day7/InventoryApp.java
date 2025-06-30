package day7;
import java.sql.*;
import java.util.Scanner;

public class InventoryApp {
	static final String URL = "jdbc:mysql://localhost:3306/inventory_db";
    static final String USER = "root";
    static final String PASSWORD = "your_password"; // <-- change this

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            int choice;
            do {
                System.out.println("\n--- Inventory App ---");
                System.out.println("1. Add Product");
                System.out.println("2. View All Products");
                System.out.println("3. Search Product by Name");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter Product ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Product Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();

                        String insertSQL = "INSERT INTO product (id, name, price) VALUES (?, ?, ?)";
                        PreparedStatement pstmt = conn.prepareStatement(insertSQL);
                        pstmt.setInt(1, id);
                        pstmt.setString(2, name);
                        pstmt.setDouble(3, price);
                        pstmt.executeUpdate();
                        System.out.println("Product added successfully.");
                        break;

                    case 2:
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT * FROM product");
                        System.out.println("\nID\tName\t\tPrice");
                        while (rs.next()) {
                            System.out.printf("%d\t%-10s\t%.2f\n",
                                    rs.getInt("id"),
                                    rs.getString("name"),
                                    rs.getDouble("price"));
                        }
                        break;

                    case 3:
                        System.out.print("Enter product name to search: ");
                        String searchName = sc.nextLine();
                        String searchSQL = "SELECT * FROM product WHERE name LIKE ?";
                        PreparedStatement searchStmt = conn.prepareStatement(searchSQL);
                        searchStmt.setString(1, "%" + searchName + "%");
                        ResultSet searchResult = searchStmt.executeQuery();

                        boolean found = false;
                        System.out.println("\nID\tName\t\tPrice");
                        while (searchResult.next()) {
                            found = true;
                            System.out.printf("%d\t%-10s\t%.2f\n",
                                    searchResult.getInt("id"),
                                    searchResult.getString("name"),
                                    searchResult.getDouble("price"));
                        }
                        if (!found) {
                            System.out.println("No product found with name: " + searchName);
                        }
                        break;

                    case 4:
                        System.out.println("Exiting app.");
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


