package Input_and_Output;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Java converts float's to integers automatically but does not convert integers to float automatically
       // We can do that by Casting


       int num = (int)(659.45);
        System.out.println(num);
    }
}
