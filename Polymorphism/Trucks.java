package Polymorphism;

public class Trucks extends Vehicle{
    private int tires;

    public Trucks() {
        super();
        this.tires = 16;
    }

    public Trucks(int tires) {
        this.tires = tires;
    }

    public Trucks(int acceleration, int currentSpeed, int tires) {
        super(acceleration, currentSpeed);
        this.tires = tires;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }
}
