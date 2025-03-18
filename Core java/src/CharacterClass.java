import java.util.Scanner;

public class CharacterClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character ");
        char input = s.next().charAt(0);
        int value = (int) input;
        
        if (65 <= value && value <= 90) {
            System.out.println(input+ " is a Capital Letter.");
        } else if (97 <= value && value <= 122) {
            System.out.println(input+ " is a Small Case Letter.");
        } else if (48 <= value && value <= 57) {
            System.out.println(input + " is a Digit.");
        } else {
            System.out.println(input + " is a Special Symbol.");
        }
    }
}
