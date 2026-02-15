//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package conditions_loops;
import java.util.*;
public class UserInputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String userInput;
        System.out.println("Enter numbers as input until user enters 'X or 'x' to stop the program");
        while(true)
        {
                userInput = sc.nextLine();
                if (userInput.equalsIgnoreCase("x")) {
                    System.out.println("Stop user inputs");
                    break;
                }
                try {

                    sum = sum + Integer.parseInt(userInput);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input entered! Enter integers if you need to continue with the program or 'X' to stop the program");
                }
            }
        System.out.println("Sum of the user inputs is: " + sum);
        sc.close();
        }

    }

