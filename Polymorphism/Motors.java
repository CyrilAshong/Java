package Polymorphism;

public class Motors extends Vehicle {
    private int tires;

    public Motors() {
        super();
        this.tires = 2;
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
