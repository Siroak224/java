package Workout;

public class EmployeeMain {
public static void main(String[]args) {
	Employee emp=new Employee();
	emp.setEmpId(1);
	emp.setName("mgmg");
	System.out.println(emp.getEmpId());
	System.out.println(emp.getName());
	System.out.println(emp);
}
}