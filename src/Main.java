import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double studentGPA = 3.45;
        String studentFirstName = "Mary";
        String studentLastName = "Doe";

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What would you like to update it to?");
        
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
    }
}