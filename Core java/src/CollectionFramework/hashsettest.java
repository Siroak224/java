package CollectionFramework;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashsettest {
    public static void main(String[] args) {
      
        HashSet<String> set1 = new HashSet<>();
        set1.add("John");
        set1.add("Marry");
        set1.add("David");
        set1.add("Smith");

        System.out.println("HashSet: " + set1);

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("John");
        set2.add("Marry");
        set2.add("David");
        set2.add("Smith");
        set2.add(null); 

        System.out.println("LinkedHashSet: " + set2);
    }
}