import java.util.Scanner;
public class train {

	public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter value a ");
        System.out.println("Enter value b ");
        int a= s.nextInt();
        int b=s.nextInt();
        System.out.println("Enter value a is "+ a);
        System.out.println("Enter value b is "+ b);
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Enter value a is "+ a);
        System.out.println("Enter value b is "+ b);
	}
	

}
