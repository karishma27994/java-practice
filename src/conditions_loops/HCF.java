//Take 2 numbers as inputs and find their HCF and LCM.
package conditions_loops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        int num1,num2 ;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number 1");
            if (sc.hasNextInt()) {
                num1 = sc.nextInt();
                break;
            } else {
                System.out.println("Enter an integer value for input 1");
                sc.next();
            }
        }
        while (true) {
            System.out.println("Enter number 2");
            if (sc.hasNextInt()) {
                num2 = sc.nextInt();
                break;
            } else {
                System.out.println("Enter an integer value for input 2");
                sc.next();
            }
        }
            if (num1 == 0 && num2 == 0) {
                System.out.println("HCF is 0");
                System.out.println("LCM is 0");
                return;
            }
            if (num1 < 0) {
                num1=-num1; //Math.abs function can be use to convert negative number to positive number
            }
            if (num2 < 0) {
                num2=-num2;
            }
        int a = num1;
        int b = num2;
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            int HCF = a;
            int LCM = (num1/HCF) * num2; // This is also correct but there is an Integer overflow risk so dividing first is safer.: (num1*num2)/HCF;
        if(LCM<0) LCM = -LCM;

        System.out.println("HCF of 2 numbers is: " + HCF);
        System.out.println("LCM of 2 numbers is: " + LCM);

    }

    }


