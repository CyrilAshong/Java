package Static;

public class Main {
    public static void main(String[] args) {
        Humans Cyril = new Humans("Cyril", 20000, true);
        Humans Ashong = new Humans("Ashong", 30000, false);

        System.out.println(Cyril.salary);

        System.out.println(Humans.population);


    }
    static void fun() {
        Main obj = new Main();
        obj.greeting();
    }
    void greeting() {
        System.out.println("how are you?");
    }
}
