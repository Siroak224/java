import java.util.Scanner;
public class LeftShift {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter values");
		int length= s.nextInt();
		int []A = new int[length];
		for(int i=0; i<length; i++) {
			System.out.println("enter values is "+ (i+1));
			A[i]=s.nextInt();}
		for(int j=0; j<length; j++) {
			System.out.println("before values are "+ A[j]);
		}
		int temp=A[0];
		for(int k=0; k<length-1; k++) {
			A[k]=A[k+1];
		}
		A[length-1]=temp;
		for(int i=0; i<length; i++) {
		System.out.println("after values are "+ A[i]);
		}
	}
	}

