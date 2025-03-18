package Workout;
import java.util.ArrayList;
import java.util.LinkedList; 

public class StudentBeanMain {
	public static void main(String[]argu) {
		ArrayList<StudentBean>Array=new ArrayList<>();
		Array.add(new StudentBean(1, "LwinGyi", 100));
        Array.add(new StudentBean(2, "KyawGyi", 9));
        Array.add(new StudentBean(3, "ChanGyi", 7));
        Array.add(new StudentBean(4, "OakGyi", 21));
        Array.add(new StudentBean(5, "MaGyi", 60));
        System.out.println("under20");
        for (StudentBean under20 : Array) {
            if (under20.getage() < 20) {
   
                System.out.println(under20);
            }
        }
        LinkedList<StudentBean>Linked=new LinkedList<>();
        Linked.add(new StudentBean(1, "LwinGyi", 100));
        Linked.add(new StudentBean(2, "KyawGyi", 9));
        Linked.add(new StudentBean(3, "ChanGyi", 7));
        Linked.add(new StudentBean(4, "OakGyi", 21));
        Linked.add(new StudentBean(5, "MaGyi", 60));
        System.out.println("=========================================");
        System.out.println("over20");
        for (StudentBean over20 : Linked) {
            if (over20.getage() > 20) {
            	
                System.out.println(over20);
            }
        }
	}

}
