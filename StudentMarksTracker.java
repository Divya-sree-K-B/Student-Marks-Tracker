
import java.util.Scanner;
public class StudentMarksTracker {

    void calculateTotalAvg(int mark[]) {
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += mark[i];
        }

        double avg = (double) sum / 3;

        System.out.println("\n----- Student Report -----");
        System.out.println("Total marks: " + sum);
        System.out.println("Average mark: " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Marks Tracker");
        System.out.println("Welcome!");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter rollno. :");
        int roll=sc.nextInt();

        int marks[] = new int[3];
        String subjects[] = {"Java", "DS", "OS"};
        boolean valid = true;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + subjects[i] + " mark: ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid mark! Marks must be between 0 and 100.");
                valid = false;
                break;
            }
        }

        if (valid) {
            System.out.println("\nStudent name: " + name);
            System.out.println("Roll Number: "+roll);
            for (int i = 0; i < 3; i++) {
                System.out.println(subjects[i] + ": " + marks[i]);
            }

            StudentMarksTracker s1 = new StudentMarksTracker();
            s1.calculateTotalAvg(marks);
        } else {
            System.out.println("Report cannot be generated. Please run the program again.");
        }

        sc.close();
    }
}
