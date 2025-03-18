import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int length =k.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            array[i] = k.nextInt();
        }

        System.out.println("Enter the number to search: ");
        int searchNumber = k.nextInt();

        int position = Arrays.binarySearch(array, searchNumber);

        if (position >= 0) {
            System.out.println("Number " + searchNumber + " found at position: " + position);
        } else {
            System.out.println("Number " + searchNumber + " not found in the array.");
        }
    }
}
