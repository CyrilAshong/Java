package OOP_CALCULATOR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TwoOperandCalculator calculate = new TwoOperandCalculator();
        int result = 0;

            while (true){
                System.out.print("Enter first Number: ");
                int num1 = input.nextInt();

                System.out.print("Enter second num: ");
                int num2 = input.nextInt();

                System.out.print("Enter Valid Operand: ");
                char op = input.next().trim().charAt(0);

                switch (op) {
                    case '+':
                        result = calculate.add(num1, num2);
                        break;
                    case '-':
                        result = calculate.subtract(num1, num2);
                        break;
                    case '*':
                        result = calculate.multiply(num1, num2);
                        break;
                    case '/':
                        result = calculate.divide(num1, num2);
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }

                System.out.println("Your result is: " + result);

                System.out.println("Do you want to continue?");
                System.out.println("Y for Yes and N for No");

                char response = input.next().trim().charAt(0);

                if (response == 'N'){
                    break;
                }
            }


    }
}
