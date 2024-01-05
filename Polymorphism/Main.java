package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Motors royal = new Motors();

        royal.setAcceleration(45);
        royal.setCurrentSpeed(10);

        System.out.println(royal.accelerate());

    }
}
