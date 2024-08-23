import java.util.*;
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name +"\n" + age+"\n";
		
	}
}
class Hero extends Person{
	String power;
	Hero(String name, int age, String power){
		super(name, age);
		this.power = power;
	}
	public String toString() {
		return super.toString()+this.power;
	}
}
public class Super_Keyword {

	public static void main(String[] args) {
		// Super = keyword refers to superclass (parent) of an object
		//         very similar to this keyword
		Hero h1 = new Hero("Ironman" , 44, "money");
		Hero h2 = new Hero("Superman", 43, "everything");
		System.out.println(h2.toString());
		

	}

}
