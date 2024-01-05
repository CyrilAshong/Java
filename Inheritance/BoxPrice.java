package Inheritance;

public class BoxPrice extends Inheritance.BoxWeight {
    double cost;

    public BoxPrice (){
        super();
        this.cost = 500.40;
    }

    public BoxPrice(double l, double w, double h, double weight, double cost) {
        super();
        this.cost = cost;
    }



}
