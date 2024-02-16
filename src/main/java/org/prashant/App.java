package org.prashant;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        char ch = 'y';
        System.out.println("------ Simple Calculator Program ------");
        Scanner sc = new Scanner(System.in);
        CalculatorFunctions fun = new CalculatorFunctions();
        while(ch == 'y') {
            System.out.print("1. Square root of a number \n2. Factorial of a number \n3. Natural Log of a number \n4. Power of a number \nEnter the operation you want to perform(1, 2, 3 or 4): ");

            int op = sc.nextInt();
            switch(op) {
                case 1:
                    System.out.print("\nEnter the number: ");
                    System.out.println("\nSquare root is: " + fun.sqrt(sc.nextDouble()));
                    break;
                case 2:
                    System.out.print("\nEnter the number: ");
                    System.out.println("\nFactorial is: " + fun.fact(sc.nextInt()));
                    break;
                case 3:
                    System.out.print("\nEnter the number: ");
                    System.out.println("\nNatural Log is: " + fun.log(sc.nextDouble()));
                    break;
                case 4:
                    System.out.print("\nEnter the numbers: ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    System.out.println("\nPower is: " + fun.pow(a, b));
                    break;
                default : System.out.println("\n------ Wrong choice ------");
                    break;
            }

            System.out.print("\nDo you want to perform any other operation? Press y or n: ");
            ch = sc.next().charAt(0);
        }

        System.out.println("\n------ Ending Of Program ------");
    }
}
