package Workout;
import java.util.Scanner;
public class capital {
public static void main(String[]argu) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter String");
	String input=s.nextLine();
	String replace=input.replaceAll("[aA]","@");
	String result=replace.toUpperCase();
System.out.print(result);	
}

}
