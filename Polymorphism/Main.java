package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Motors royal = new Motors();
        Cars ferrari = new Cars();
        Trucks toyota = new Trucks();

        royal.accelerate(10);
        ferrari.accelerate(20);
        toyota.accelerate(30);

        System.out.println(royal);
        System.out.println(ferrari);
        System.out.println(toyota);



    }
}
