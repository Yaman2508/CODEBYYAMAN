import java.util.Scanner;

public class studentgrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");           // Input: Number of subjects
        int numSubjects = sc.nextInt();
        sc.nextLine(); // newline

        String[] subjects = new String[numSubjects];
        int[] marks = new int[numSubjects];
        int total = 0;

        for (int i = 0; i < numSubjects; i++) {              // Input: Subject names and their marks
            System.out.print("Enter name of subject " + (i + 1) + ": ");
            subjects[i] = sc.nextLine();

            System.out.print("Enter marks obtained in " + subjects[i] + " (out of 100): ");
            marks[i] = sc.nextInt();
            sc.nextLine(); // newline
            total += marks[i];
        }
        
        double average = (double) total / numSubjects;       // Calculate average percentage

        // Grade calculation
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Output results
        System.out.println("\n--- Result ---");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjects[i] + ": " + marks[i] + "/100");
        }
        System.out.println("Total Marks: " + total + "/" + (numSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
