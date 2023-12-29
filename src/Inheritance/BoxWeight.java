package Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        super();
        this.weight = 2.7;
    }
    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }
}
