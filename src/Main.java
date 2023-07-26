import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile("Mary", "Doe", "CS", 2.1, 2025);

        StudentProfile profileTwo = new StudentProfile("Mary", "Doe", "CS", 2.1, 2025);

             profileTwo.incrementExpectedGraduationYear();
             System.out.println(profileTwo.expectedYearToGraduate);
    }
}