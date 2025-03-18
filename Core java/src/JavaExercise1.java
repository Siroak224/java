import java.util.Scanner;
public class JavaExercise1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int o = k.nextInt();
        int[] A = new int[o];

        for (int i = 0; i < o; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            A[i] = k.nextInt();
        }

        for (int j = 0; j < o; j++) {
            System.out.println("Your entered value is: " + A[j]);
            if (A[j] > max) {
                max = A[j];
            }
            if (A[j] < min) {
                min = A[j];
            }
            total += A[j];
        }

        System.out.println("Maximum value is " + max);
        System.out.println("Minimum value is " + min);
        System.out.println("Total: " + total);
        System.out.println("Average: " + total / o);
    }
}
