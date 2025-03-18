import java.util.Scanner;
public class HelloEcho {
public static void main(String[]argu) {
	Scanner s=new Scanner(System.in);
	System.out.print("What is your name");
	String name=s.nextLine();
	System.out.println("How many time");
	int time=s.nextInt();
	for (int i=1;i<time;i++)
	System.out.println("hello "+ name);
	System.out.print("Well "+name +"Have a good day!!!");
	
		
}
}
