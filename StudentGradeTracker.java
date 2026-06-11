import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Input grades
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            grades.add(sc.nextInt());
        }

        int highest = grades.get(0);
        int lowest = grades.get(0);
        int sum = 0;

        // Calculate highest, lowest and sum
        for (int grade : grades) {
            sum += grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = (double) sum / n;

        // Display Report
        System.out.println("\n----- STUDENT GRADE REPORT -----");

        for (int i = 0; i < grades.size(); i++) {
            System.out.println("Student " + (i + 1) + " : " + grades.get(i));
        }

        System.out.println("\nAverage Score : " + average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score : " + lowest);

        sc.close();
    }
}