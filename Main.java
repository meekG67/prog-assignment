import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Arrays of ArrayLists to store student information
    private static ArrayList<String>[] students = new ArrayList[5];

    public static void main(String[] args) {
        // Initialize the array of ArrayLists
        for (int i = 0; i < students.length; i++) {
            students[i] = new ArrayList<>();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("******************************************************");
        System.out.print("Enter (1) to launch menu or any other key to exit: ");

        String input = scanner.nextLine();

        if ("1".equals(input)) {
            while (true) {
                displayMenu();
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        captureNewStudent(scanner);
                        break;
                    case 2:
                        searchForStudent(scanner);
                        break;
                    case 3:
                        deleteStudent(scanner);
                        break;
                    case 4:
                        printStudentReport();
                        break;
                    case 5:
                        System.out.println("Exiting Application...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Exiting Application...");
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nPlease select one of the following menu items:");
        System.out.println("(1) Capture a new student.");
        System.out.println("(2) Search for a student.");
        System.out.println("(3) Delete a student.");
        System.out.println("(4) Print student report.");
        System.out.println("(5) Exit Application.");
        System.out.print("Enter your choice: ");
    }

    private static void captureNewStudent(Scanner scanner) {
        System.out.println("\nCAPTURE A NEW STUDENT");
        System.out.println("********************************************");

        System.out.print("Enter the student ID: ");
        students[0].add(scanner.nextLine());

        System.out.print("Enter the student name: ");
        students[1].add(scanner.nextLine());

        System.out.print("Enter the student age: ");
        students[2].add(scanner.nextLine());

        System.out.print("Enter the student email: ");
        students[3].add(scanner.nextLine());

        System.out.print("Enter the student course: ");
        students[4].add(scanner.nextLine());

        System.out.print("Student captured successfully! Enter (1) to launch menu or any other key to exit: ");
        if (!"1".equals(scanner.nextLine())) {
            System.out.println("Exiting Application...");
            System.exit(0);
        }
    }

    private static void searchForStudent(Scanner scanner) {
        // Placeholder for searching a student
        System.out.println("Searching for a student...");
        // Implement search logic here
    }

    private static void deleteStudent(Scanner scanner) {
        // Placeholder for deleting a student
        System.out.println("Deleting a student...");
        // Implement delete logic here
    }

    private static void printStudentReport() {
        System.out.println("\nSTUDENT REPORT");
        System.out.println("********************************************");

        if (students[0].isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (int i = 0; i < students[0].size(); i++) {
                System.out.println("Student ID: " + students[0].get(i));
                System.out.println("Name: " + students[1].get(i));
                System.out.println("Age: " + students[2].get(i));
                System.out.println("Email: " + students[3].get(i));
                System.out.println("Course: " + students[4].get(i));
                System.out.println("--------------------------------------------");
            }
        }

        System.out.print("Enter (1) to return to the menu or any other key to exit: ");
        Scanner scanner = new Scanner(System.in);
        if (!"1".equals(scanner.nextLine())) {
            System.out.println("Exiting Application...");
            System.exit(0);
        }
    }
}