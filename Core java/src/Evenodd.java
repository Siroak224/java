import java.util.Scanner;
public class Evenodd {
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter how many Length");
	int number=s.nextInt();
	int []A=new int[number];
	int Evennumber=0;
	int Oddnumber=0;
	for(int i=0; i<number; i++) {
		System.out.println("Enter Value "+(i+1));
		A[i]=s.nextInt();
		if(A[i]%2==0) {
			Evennumber++;
		}
		else {
			Oddnumber++;
		}
	}
		System.out.println("Even numbers are "+ Evennumber);
		System.out.println("Odd numbers are "+ Oddnumber);
}
}
