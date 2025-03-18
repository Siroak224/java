import java.util.Scanner;
public class calculator1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number 1");
		int num1=s.nextInt();
		System.out.println("enter number 2");
		int num2=s.nextInt();
		System.out.println("enter opertion 1234");
		System.out.println("enter  1 opertion is sum");
		System.out.println("enter  2 opertion is minus");
		System.out.println("enter  3 opertion is multiply");
		System.out.println("enter  4 opertion is divided");
		int opration=s.nextInt();
		switch (opration) {
		case 1:System.out.println(Sum(num1,num2));break;
		case 2:System.out.println(M(num1,num2));break;
		case 3:System.out.println(multiply(num1,num2));break;
		case 4:System.out.println(divided(num1,num2));break;
		default:
		}
	}
		public static int Sum(int a,int b) {
		return(a+b);
		}
		public static int M(int a,int b) {
			return(a-b);
		}
		public static int multiply(int a,int b) {
			return(a*b);
		}
		public static int divided(int a,int b) {
			return(a/b);
		}
		}
		
