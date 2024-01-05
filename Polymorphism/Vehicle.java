package Polymorphism;

public class Vehicle {
    protected int acceleration;
    protected int currentSpeed;

    public Vehicle() {
        this.acceleration = 20;
        this.currentSpeed = 0;
    }

    public int accelerate(int acceleration) {
        this.acceleration = acceleration;
        return this.currentSpeed += this.acceleration;
    }
    public void decelerate() {
        this.acceleration = acceleration;
        this.currentSpeed -= acceleration;
    }
    public Vehicle(int acceleration) {
        this.acceleration = acceleration;
        currentSpeed = 0;
    }
    public Vehicle(int acceleration, int currentSpeed) {
        this.acceleration = acceleration;
        this.currentSpeed = currentSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String toString() {
        return String.format( "{ Acceleration: %d, CurrentSpeed: %d }", acceleration, currentSpeed );
    }
}

