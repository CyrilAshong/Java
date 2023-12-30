package Enculpsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();


        student1.setStudentID("11253767");
        student1.setGender("Male");

        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        student1.setName(name);
        System.out.println("Your name is: " + student1.getName());

    }
}
