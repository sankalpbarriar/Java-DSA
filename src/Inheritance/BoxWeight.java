package Inheritance;

public class BoxWeight extends Box {
    double weight;
    double side;
    public BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(double side, double weight){
        super(side);    //will look for constructor in Box class contains 1 arguments
        this.weight=weight;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {

    super(l,h,w);    //calling the parent class constructor,it is used initialize values present in parent class
    this.weight=weight;

}
}
