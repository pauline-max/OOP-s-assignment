import java.util.Scanner;

class Student {
    private String name;
    private double marks;

    // The constructor to initialize the attributes
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // the method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }

    public double getMarks() {
        return marks;
    }
}

// the gradeCalculator class
class GradeCalculator {
    // Method to calculate grade based on marks
    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}

// MainApp class
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting user input for student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student marks: ");
        double marks = scanner.nextDouble();

        // Creating a Student object
        Student student = new Student(name, marks);

        // Creating a GradeCalculator object
        GradeCalculator gradeCalculator = new GradeCalculator();

        // Calculating the grade
        String grade = gradeCalculator.calculateGrade(student.getMarks());

        // Displaying student details and grade
        student.displayDetails();
        System.out.println("Student Grade: " + grade);

        scanner.close();
    }
}