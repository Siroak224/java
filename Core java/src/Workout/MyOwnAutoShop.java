package Workout;

public class MyOwnAutoShop {
public static void main(String[]argu) {
	Car C=new Car(10,200,"green");
	Truck T=new Truck(10,200,"red",1000);
	Ford F=new Ford(20,200,"blue",20,2000);
	Sedan S=new Sedan(30,300,"white",4);
	System.out.println("Sedan sale price " + S.getSalePrice());
    System.out.println("Ford sale price " + F.getSalePrice());
    System.out.println("Truck sale price " + T.getSalePrice());
    System.out.println("Car sale price " + C.getSalePrice());
}
}
