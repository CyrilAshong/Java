package Polymorphism;

public class Cars extends Vehicle {
    private int tires;

    public Cars() {
        super();
        this.tires = 4;
    }
    @Override
    public int accelerate(int acceleration) {
        this.acceleration = acceleration;
        return this.currentSpeed = this.currentSpeed + (this.acceleration + 5);
    }
    public Cars(int tires) {
        this.tires = tires;
    }

    public Cars(int acceleration, int currentSpeed, int tires) {
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
