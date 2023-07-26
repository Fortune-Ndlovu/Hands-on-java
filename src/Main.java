import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String question = "Do you like pies, cakes, or scones?";
       String choiceOne = "pies";
       String choiceTwo = "cakes";
       String choiceThree = "scones";

        // Write a print statement asking the question
        System.out.println(question);

        // Write a print statement giving the answer choices
        System.out.println("Please pick one " + choiceOne +
        " or " + choiceTwo + " or " + choiceThree +
        " but it would make me happy if you picked " + choiceOne);

        // Have the user input an answer
        Scanner answer = new Scanner(System.in);
        String userInput = answer.next();
        
        if (userInput.equals("pies")) {
            System.out.println("Yeyy you made me happy!");
        } else {
            System.out.println("No you made me sad :(");
        }
    }
}