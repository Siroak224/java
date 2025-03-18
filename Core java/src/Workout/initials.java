package Workout;
import java.util.Scanner;
public class initials {
public static void main(String[]argu) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter full name");
	String Fullname=s.nextLine();
	String[]Name=Fullname.split(" ");
	String intitial="";
	for(String part:Name) {
		intitial+=part.charAt(0);
	}
	System.out.println(intitial);
}
}
