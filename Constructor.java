class Human{
	String name;
	int age;
	double weight;
	
	Human (String name, int age, double weight){
		
		this.name = name;
		this.age= age;
		this.weight = weight;
	}
	void eat() {
		System.out.println("he is eating");
	}
}
public class Constructor {

	public static void main(String[] args) {
		Human Human1 = new Human("Rahul", 20, 56.6);
		Human Human2 = new Human("Raj", 19, 52.4);
		
		System.out.println(Human1.name);
		Human2.eat();
		}

	}


