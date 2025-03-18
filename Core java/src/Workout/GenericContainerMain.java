package Workout;

class GenericContainerMain {

	public static void main(String[] args) {
		GenericContainer<String>stringContainer=new GenericContainer<>("Hello");
        System.out.println(stringContainer);
        GenericContainer<Integer>intContainer=new GenericContainer<>(34);
        System.out.println(intContainer);
	}

}
class GenericContainer<T> {
private T obj;

public GenericContainer(T obj) {
	this.obj=obj;
}
public String toString() {
	return "GenericContainer: "+ obj.toString();
}
}