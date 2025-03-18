package Workout;

class StudentBean {
	private int id;
	private String name;
	private int age;
public StudentBean(int id,String name,int age) {
	this.id=id;
	this.name=name;
	this.age=age;
}
public int getage() {
return age;
}
public String toString() {
	return "Student[id= " + id + ", name= " + name + ", age= " + age + "]";
}
}
