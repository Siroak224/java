enum Season { WINTER, SPRING, SUMMER, FALL }
 public class EnumExample1{
 public static void main(String[] args) {
 for (Season ss : Season.values()) 
System.out.println(ss);
 }
 }