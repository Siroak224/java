import java.util.Scanner;
import java.util.Random;
public class GuessGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k=new Scanner(System.in);
		Random r=new Random();
		int random=r.nextInt(21);
		System.out.print("Guess numberm 0 to 20 ");
		System.out.println("Guess number ");
		int guess=k.nextInt();
		while(random!=guess) {
			System.out.println("No you loss");
			System.out.println("try again");
			guess=k.nextInt();}
		{System.out.println("Wow!!! you got it right");
		System.out.println("Game Ended");
			
			
		}
		
	}

}
