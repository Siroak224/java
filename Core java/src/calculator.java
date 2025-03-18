import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number 1");
		int num1=s.nextInt();
		System.out.println("enter number 2");
		int num2=s.nextInt();
		System.out.println("enter opertion 1234");
		System.out.println("enter  1 opertion is sum");
		System.out.println("enter  1 opertion is minus");
		System.out.println("enter  1 opertion is multiply");
		System.out.println("enter  1 opertion is divided");
		int opration=s.nextInt();
		switch (opration) {
		case 1:Sum(num1,num2);break;
		case 2:M(num1,num2);break;
		case 3:multiply(num1,num2);break;
		case 4:divided(num1,num2);break;
		default:
		}
	}
		public static void Sum(int a,int b) {
			System.out.println(a+b);
		}
		public static void M(int a,int b) {
			System.out.println(a-b);
		}
		public static void multiply(int a,int b) {
			System.out.println(a*b);
		}
		public static void divided(int a,int b) {
			System.out.println(a/b);
		}
		}
		

	


