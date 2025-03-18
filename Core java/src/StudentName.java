import java.util.Scanner;

public class StudentName {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter number of students");
        int length = k.nextInt(); 
        String[] A = new String[length]; 
        k.nextLine(); 

        for (int i = 0; i < length; i++) {
            System.out.println("Enter name " + (i + 1));
            A[i] = k.nextLine();
        }

        System.out.println("Your entered student names are: ");
        System.out.println("All students");
        System.out.println("==    =====");
        for (int j = 0; j < length; j++) {
            System.out.println((j + 1) + "    " + A[j]);
        }
    }
}
