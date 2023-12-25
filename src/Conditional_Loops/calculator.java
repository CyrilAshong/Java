package Conditional_Loops;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your operand: ");
        char op = input.next().trim().charAt(0);

        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (op == '+') {
            System.out.println(num1 + num2);
        } else if (op == '-') {
            System.out.println(num1 - num2);
        } else if (op == '*') {
            System.out.println(num1 * num2);
        } else if (op == '/') {
            System.out.println(num1 / num2);
        }else {
            System.out.println("Enter valid operand");
        }
    }
}
