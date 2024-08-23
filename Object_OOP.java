class Phone{
	
	String name = "apple";
	int price = 1000000;
	void work() {
		System.out.println("it works");
	}
	
}
public class Object_OOP {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		System.out.println(p1.name);
		p1.work();
	}
}
