import java.util.Scanner;
public class JavaExercise {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter number of value ");
		int Total=0;
		int max=0;
		int min=0;
		int o=k.nextInt();
		int[]A=new int[o];
		for (int i=0; i<o; i++) {
			System.out.print("Enter value "+ (i+1)+" is ");
			A[i]=k.nextInt();
			if(i==0)
				max=A[i];
			else{if(A[i]>max);{
			max=A[i];}
			}
			if(i==0)
				min=A[i];
			else {if(A[i]<min);{
			min=A[i];}}
			Total+=A[i];
		}{
		for(int j=0; j<o; j++) {
			System.out.print("Your entered values is ");
			System.out.println(" "+A[j]);
		}
		}
		System.out.println("Maximum value is "+max);
		System.out.println("Minimum value is "+min);
		System.out.println("Total "+Total);
		System.out.println("Average "+Total/o);
		}
		}

	

