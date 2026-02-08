//Take a number as input and print the multiplication table for it.
package conditions_loops;
import java.util.Scanner;

public class PrintTable {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a number");
            if(sc.hasNextInt()) {
                int number = sc.nextInt();
                int i = 1;
                while (i <= 10) {
                    System.out.printf("%d * %d = %d%n", number, i, number * i);
                    i++;
                }
            }
            else System.out.println("Enter the number as integer only");
            sc.close();
        }

    }

