package Conditional_Loops;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        /*
        Syntax
        if(condition) {
            body
        }else if{
            print this
        }
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Emter your Salary: ");
        int number = input.nextInt();
        if (number > 50000) {
            number += 200;
        } else if (number > 40000) {
            number += 300;
        }else {
            number += 30;
        }
        System.out.println("Your Salary is: " + number);

    }

}
