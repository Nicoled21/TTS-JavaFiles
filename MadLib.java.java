
import java.util.*;

public class MadLib {
     public static void main(String[] args){

         Scanner userInput = new Scanner(System.in);


         Scanner input = new Scanner(System.in);
         int ageLimit = 18;
           System.out.println("What is your age: ");
           int age = input.nextInt();
           if(age >= ageLimit) {
               System.out.println("You may continue!");
           } else {
               System.out.println("Bring an adult!");
               System.exit(0);
           }


         System.out.println("Enter a name: ");
         String name = userInput.nextLine();
         System.out.println("Give me an adjective: ");
         String adjective = userInput.nextLine();
         System.out.println("Give me a verb: ");
         String verbOne = userInput.nextLine();
         System.out.println("Give me another verb: ");
         String verbTwo = userInput.nextLine();
         System.out.println("Give me a number: ");
         String number = userInput.nextLine();
         System.out.println("Give me your name: ");
         String yourName = userInput.nextLine();

         System.out.printf("Here is your story: \n");
         System.out.printf("\n Dear %s,", name);
         System.out.printf("\n You are extremely %s and I want to %s you!", adjective, verbOne);
         System.out.printf("\n I want to %s you %s times.", verbTwo, number);
         System.out.printf("\n Sincerely, %s \n", yourName);




    }
}