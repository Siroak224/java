package Workout;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
    int pdCode;
    String pdName;
    double pdPrice; 

    public Product(int pdCode, String pdName, double pdPrice) {
        this.pdCode = pdCode;
        this.pdName = pdName;
        this.pdPrice = pdPrice;
    }
    public String toString() {
        return "Product Code: " + pdCode + ", Name: " + pdName + ", Price: " + pdPrice;
    }
}
public class ProductBean {
    public static void main(String[] args) {
    	Map<Integer, Product> productMap = new HashMap<>();
    	
    	productMap.put(1, new Product(12345, "Laptop", 750000.50));
        productMap.put(2, new Product(123456, "phone", 5000000.00));
        productMap.put(3, new Product(1234567, "Headphones", 50000.75));
        productMap.put(4, new Product(12345678, "TV", 2000000.30));
        productMap.put(5, new Product(123456789, "Keyboard", 300000.00));
        System.out.print("Enter product code to search: ");
        Scanner scanner = new Scanner(System.in);
        int searchCode = scanner.nextInt();
        Product foundProduct = productMap.get(searchCode);
        
        if ( foundProduct!= null) {
            System.out.println(foundProduct.toString());
        } else {
            System.out.println("Product with code " + searchCode + " not found.");
        }
        }
    }

        
        
        
        
        
        
        