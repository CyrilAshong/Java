package Polymorphism;

public class Vehicle {
    private int acceleration;
    private int currentSpeed;

    public int accelerate() {
       return this.currentSpeed += acceleration;
    }
    public void decelerate() {
        this.currentSpeed -= acceleration;
    }
    public Vehicle() {
        this.acceleration = 10;
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
}
