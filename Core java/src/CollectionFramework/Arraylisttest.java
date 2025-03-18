package CollectionFramework;
import java.util.ArrayList;
import java.util.List;
import Workout.Employee;
public class Arraylisttest {

	
		public static void main(String []argu) {
			List st=new ArrayList();
		st.add(1);
		st.add('c');
		st.add(true);
		st.add(2.3);
		st.add("java");
		
		System.out.println(st);
		
		st.add(new Employee());
		System.out.println(st);
		System.out.println(st.get(1));
		
		double number=(double) st.get(3);
		List<String> languages=new ArrayList<String>();
		languages.add("java");
		
		String value= languages.get(0);
		System.out.println(value);
			System.out.println(value);
	}
}
