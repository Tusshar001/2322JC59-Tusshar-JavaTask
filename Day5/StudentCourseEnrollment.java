package day5;
import java.util.*;

public class StudentCourseEnrollment {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();
        HashMap<String, ArrayList<String>> enrollments = new HashMap<>();

        int choice;
        do {
            System.out.println("\n--- Student Course Enrollment System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Enroll Student in Course");
            System.out.println("3. Remove Student");
            System.out.println("4. Display All Enrollments");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String student = sc.nextLine();
                    if (!students.contains(student)) {
                        students.add(student);
                        enrollments.put(student, new ArrayList<>());
                        System.out.println("Student added.");
                    } else {
                        System.out.println("Student already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter student name to enroll: ");
                    String sName = sc.nextLine();
                    if (students.contains(sName)) {
                        System.out.print("Enter course name: ");
                        String course = sc.nextLine();
                        enrollments.get(sName).add(course);
                        System.out.println("Course added.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter student name to remove: ");
                    String removeStudent = sc.nextLine();
                    if (students.remove(removeStudent)) {
                        enrollments.remove(removeStudent);
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Student Enrollments ---");
                    for (String s : students) {
                        System.out.print(s + " enrolled in: ");
                        ArrayList<String> courses = enrollments.get(s);
                        if (courses.isEmpty()) {
                            System.out.println("No courses");
                        } else {
                            for (String c : courses) {
                                System.out.print(c + " ");
                            }
                            System.out.println();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}


