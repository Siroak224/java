import java.util.Scanner;
import java.util.Random;
public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k=new Scanner(System.in);
		Random r=new Random();
		int random=r.nextInt(7);
		System.out.print("Guess number ");
		int guess=k.nextInt();
		if(random==guess) {
			System.out.println("You win");}
			else
				System.out.println("You lose");
		

	}

}
