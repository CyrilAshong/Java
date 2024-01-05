package Abstraction;

public class Trucks extends Vehicle {
    private int tires;

    public Trucks() {
        super();
        this.tires = 16;
    }

    public Trucks(int tires) {
        super();
        this.tires = tires;
    }

    @Override
    public int accelerate(int acceleration) {
        this.acceleration = acceleration;
        return this.currentSpeed += (this.acceleration + 15);
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
