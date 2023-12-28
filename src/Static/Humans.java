package Static;

public class Humans {
    String name;
    int salary;
    boolean gender;
    static long population;


    public Humans(String name, int salary, boolean gender) {
        this.name = name;
        this.salary = salary;
        this.gender= gender;
        Humans.population += 1;
    }

}
