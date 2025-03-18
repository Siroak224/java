import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int length = k.nextInt();

        int[] a = new int[length];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            a[i] = k.nextInt();
        }
        int start = 0;
        int end = length - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}