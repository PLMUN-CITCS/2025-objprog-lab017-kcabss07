import java.util.Scanner;

public class GradeCalculator {

    
    public static double getStudentScore() {
        try (Scanner scanner = new Scanner(System.in)) {
            double score = -1;  
            while (score < 0 || score > 100) {  
                System.out.print("Enter the student's score (0-100): ");
                if (scanner.hasNextDouble()) {
                    score = scanner.nextDouble();
                    if (score < 0 || score > 100) {
                        System.out.println("Invalid score. Please enter a number between 0 and 100.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();  
                }
            }
            return score;
        }
    }

    
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
     
        double score = getStudentScore();

      
        String grade = calculateGrade(score);

        System.out.println("The calculated grade is: " + grade);
    }
}