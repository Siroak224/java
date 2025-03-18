import java.util.Scanner;
public class Mark {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter length 1");
		int l1=s.nextInt();
		System.out.println("enter length 2");
		int l2=s.nextInt();
		int[][] A=new int[l1][l2];
		for(int i=0; i<l1;i++) {
			for(int j=0; j<l2;j++) {
				System.out.println("enter value");
				A[i][j]=s.nextInt();
			}
		}
		for(int i=0; i<l1;i++) {
			for(int j=0; j<l2;j++) {
				System.out.println("enter value are"+A[i][j]);
			}
		}
	}

}
