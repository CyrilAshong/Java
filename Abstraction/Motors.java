package Abstraction;

public class Motors extends Vehicle {
    private int tires;

    public Motors() {
        super();
        this.tires = 2;
    }

    @Override
    public int accelerate(int acceleration) {
            this.acceleration = acceleration;
            return this.currentSpeed += (this.acceleration + 25);
    }

    public Motors(int tires) {
        this.tires = tires;
    }

    public Motors(int acceleration, int currentSpeed, int tires) {
        super();
        this.tires = tires;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }
}
