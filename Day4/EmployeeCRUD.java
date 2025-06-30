package day4;
import java.io.*;
import java.util.*;

public class EmployeeCRUD {
	static final String FILE_NAME = "employees.txt";

    // Create (Add Employee)
    public static void addEmployee(String id, String name, String salary) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(id + "," + name + "," + salary);
            writer.newLine();
            System.out.println("Employee added successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Read (View all Employees)
    public static void viewEmployees() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("Employee Records:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Update Employee by ID
    public static void updateEmployee(String id, String newName, String newSalary) {
        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            
            String line;
            boolean updated = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(id)) {
                    writer.write(id + "," + newName + "," + newSalary);
                    writer.newLine();
                    updated = true;
                } else {
                    writer.write(line);
                    writer.newLine();
                }
            }

            if (updated) {
                inputFile.delete();
                tempFile.renameTo(inputFile);
                System.out.println("Employee updated successfully.");
            } else {
                tempFile.delete();
                System.out.println("Employee not found.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Delete Employee by ID
    public static void deleteEmployee(String id) {
        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            
            String line;
            boolean deleted = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(id)) {
                    deleted = true;
                    continue; // Skip this line (delete)
                }
                writer.write(line);
                writer.newLine();
            }

            if (deleted) {
                inputFile.delete();
                tempFile.renameTo(inputFile);
                System.out.println("Employee deleted successfully.");
            } else {
                tempFile.delete();
                System.out.println("Employee not found.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Main Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEmployee Record System");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    String salary = sc.nextLine();
                    addEmployee(id, name, salary);
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    String uid = sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Salary: ");
                    String newSalary = sc.nextLine();
                    updateEmployee(uid, newName, newSalary);
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    String did = sc.nextLine();
                    deleteEmployee(did);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}


