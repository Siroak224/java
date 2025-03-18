import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Write Item ");
        int item = k.nextInt();
        int total = 0;
        
       
        int maxAmount = Integer.MIN_VALUE;
        int minAmount = Integer.MAX_VALUE;
        
        for (int i = 1; i <= item; i++) {
            System.out.println("Enter Item " + i + " Amount");
            int amount = k.nextInt();
            
            if (amount > maxAmount) {
                maxAmount = amount;
            }
            if (amount < minAmount) {
                minAmount = amount;
            }
            
            total += amount;
        }
        
        System.out.println("Maximum Amount: " + maxAmount);
        System.out.println("Minimum Amount: " + minAmount);
        System.out.println("Average Amount: " + total / item);
        System.out.println("Total Amount: " + total);
    }
}
