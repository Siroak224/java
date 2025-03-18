package Workout;
import java.util.Scanner;
public class reverse {
public static void main(String[]argu) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter something");
	String input=s.nextLine();
	StringBuffer string=new StringBuffer(input);
	string.reverse();
	System.out.println(string);
}
}
