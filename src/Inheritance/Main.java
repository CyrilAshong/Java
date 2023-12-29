package Inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(2.3, 5.6, 8.4, 3.1);
        BoxWeight box2 = new BoxWeight();
        BoxPrice box3 = new BoxPrice();

        System.out.println(box3.cost);
    }
}
