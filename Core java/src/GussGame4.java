import java.util.Scanner;
import java.util.Random;

public class GussGame4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String playAgain;
        Random r = new Random();
        do {
            int random = r.nextInt(21); 
            System.out.println("Guess a number between 0 and 20:");
            int count = 1;
            int guess = k.nextInt();

            while(random!=guess){
    			if(guess<0 || guess>20) {
    			System.out.println("Read the game info idiot, guess the number between 0 and 20.");
    			System.out.println(" Guess again");
    			guess=k.nextInt();
    			count++;}
    			else
    		{
    			if(guess-random<=3 && guess-random>=-3)
    		{
    				System.out.println("No!! You got it wrong!! Your number is close to my number");
    		System.out.println("Guess again");
    		guess=k.nextInt();
    		count++;}
    		else {{System.out.println("No!! You got it wrong!! Your number is too far to my number");}
    		System.out.println("Guess again");
    		guess=k.nextInt();
    		count++;}
    		}
    		}
            System.out.println("Wow!!! You got it right in " + count + " attempts.");
            System.out.print("Wanna try again? (y/n): ");
            playAgain = k.next();

            while (!playAgain.equals("y") && !playAgain.equals("n")) {
                System.out.println("Please enter 'y' or 'n':");
                playAgain = k.next();
            }
        } while (playAgain.equals("y"));
    }
}
