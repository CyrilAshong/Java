package Functions_and_methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }


    static int sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter num 2 : ");
        int num2 = input.nextInt();
        int total = num1 + num2;

        return total;
}


    }
