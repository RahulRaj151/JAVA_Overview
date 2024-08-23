import java.util.*;
class Boy{
	private String name;
	private int age;
	Boy(String name, int age){
		this.setName(name);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name =name;
	}
	public void setAge(int age) {
		this.age=age;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// Encapsulation = attributes of the class will be hidden or private, can be access only through method (getter & setter)
		Boy b1 = new Boy ("Rahul", 21);
		b1.setAge(23);
		System.out.println(b1.getName());
		System.out.println(b1.getAge());

	}

}
