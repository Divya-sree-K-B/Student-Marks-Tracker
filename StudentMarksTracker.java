
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
        System.out.printf("Average mark: %.2f%n" + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Marks Tracker");
        System.out.println("Welcome!");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter rollno. :");
        int roll = sc.nextInt();

        int marks[] = new int[3];
        String subjects[] = { "Java", "DS", "OS" };
        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.print("Enter " + subjects[i] + " mark: ");
                marks[i] = sc.nextInt();

                if (marks[i] >= 0 && marks[i] <= 100) {
                    break;
                }

                System.out.println("Invalid mark! Enter a mark between 0 and 100.");
            }
        }

        System.out.println("\nStudent name: " + name);
        System.out.println("Roll Number: " + roll);

        for (int i = 0; i < 3; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }

        StudentMarksTracker s1 = new StudentMarksTracker();
        s1.calculateTotalAvg(marks);

        sc.close();
    }
}
