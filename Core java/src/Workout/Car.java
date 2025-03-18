package Workout;

public class Car {
int speed;
double regularPrice;
String colour;

Car(int speed,double regularPrice,String colour){
	this.speed=speed;
	this.colour=colour;
	this.regularPrice=regularPrice;
}
double getSalePrice() {
return regularPrice;
}
}
