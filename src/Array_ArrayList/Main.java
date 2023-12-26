package Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        syntax
        datatype[] reference_var = new datatype[size];
        */

//        int [] arr = new int[5];
//        System.out.println(arr[0]);


//        String[] arr = new String[5];
//        System.out.println(arr[4]);

        String [] str = new String [5];

        for (int i = 0; i < str.length; i++) {
             str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
