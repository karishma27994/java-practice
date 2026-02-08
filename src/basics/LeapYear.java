/*Input a year and find whether it is a leap year or not.

A year is a leap year if:
Divisible by 400 OR Divisible by 4 AND not divisible by 100 */

package basics;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a year");
        if(!sc.hasNextInt()) {
            System.out.println("Enter an integer");
        }
        else
        {
            int year = sc.nextInt();
            if(year%400==0)
            {
                System.out.println("Its a Leap year");
            }
            else if((year%4==0) && (year%100!=0))
            {
                System.out.println("Its a Leap Year");
            }

            else System.out.println("Not a Leap year");
        }
    }
}
