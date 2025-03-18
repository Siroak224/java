package Workout;

public class Truck extends Car{
int weight;
Truck(int speed, double regularPrice, String colour, int weight) {
	super(speed,regularPrice,colour);
	this.weight=weight;
}
double getSalePrice() {
    if (weight > 2000) {
        return regularPrice * 0.90; // 10% discount
    } else {
        return regularPrice * 0.80; // 20% discount
    }
}
}