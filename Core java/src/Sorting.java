import java.util.Scanner;
public class Sorting {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter how many values");
		int lenght=s.nextInt();
		int []A=new int [lenght];
		for(int i=0; i<lenght;i++) {
			System.out.println("enter values is "+ (i+1));
			A[i]=s.nextInt();
		}
		for(int j=0; j<lenght;j++) {
			System.out.println("Befor values are "+ A[j]);
		}
		
		for(int o=0; o<lenght-1; o++) {
			for(int j=o+1;j<lenght;j++) {
				if(A[j]<A[o]) {
					int temp=0;
					temp=A[j];
					A[j]=A[o];
					A[o]=temp;}
					
			}
		}
					for(int k=0; k<lenght; k++) {
						System.out.println("after values are "+ A[k]);}
				
				}
}

	


