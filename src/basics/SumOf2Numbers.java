//Take two numbers and print the sum of both.
package basics;
import java.util.Scanner;

public class SumOf2Numbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            if (sc.hasNextInt()) {
                int num2 = sc.nextInt();
                sum = num1 + num2;
                System.out.println("Sum of 2 numbers is: " + sum);
            }
            else {
                System.out.println("Second input is not an integer number");
            }
        } else {
            System.out.println("First input is not an integer number");
        }
    }
}
