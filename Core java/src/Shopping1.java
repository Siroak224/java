import java.util.Scanner;

public class Shopping1{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Write Item ");
        int item = k.nextInt();
        int total = 0;
        int max=0;
        int min=0;
        for (int i = 1; i <= item; i++) {
            System.out.println("Enter Item " + i + " Amount");
            int amount = k.nextInt();
            if(i==1)
            	max=amount;
            else {if (amount>max)
            	max=amount;
            }
            if(i==1)
            	min=amount;
            else {if(amount<min)
            	min=amount;
            }
        
            
            total += amount;
        }
        
        System.out.println("Maximum Amount: " + max);
        System.out.println("Minimum Amount: " + min);
        System.out.println("Average Amount: " + total / item);
        System.out.println("Total Amount: " + total);
    }
}
    
