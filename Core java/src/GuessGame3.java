import java.util.Scanner;
import java.util.Random;
public class GuessGame3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k=new Scanner(System.in);
		Random r=new Random();
		int random=r.nextInt(21);
		System.out.print("Guess numberm 0 to 20 ");
		System.out.println("Guess number ");
		int count=1;
		int guess=k.nextInt();
		while(random!=guess){
			if(guess<0 || guess>20) {
			System.out.println("Read the game info idiot, guess the number between 0 and 20.");
			System.out.println(" Guess again");
			guess=k.nextInt();
			count++;
			}
		
			else
		{
			if(guess-random<=3 && guess-random>=-3)
		{
				System.out.println("No!! You got it wrong!! Your number is close to my number");
		System.out.println("Guess again");
		guess=k.nextInt();
		count++;
		}
		
		else {{System.out.println("No!! You got it wrong!! Your number is too far to my number");}
		System.out.println("Guess again");
		guess=k.nextInt();
		count++;
		}
		}
		}
		{System.out.println("Wow!!! you got it right "+ count + " at time");}
		
	}
		
		
	}


