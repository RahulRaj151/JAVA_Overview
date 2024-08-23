import java.util.*;
class Section{
	void begin() {
	}
}
class A extends Section{
	@Override
	void begin() {
		System.out.println("The class A begin");
	}
}
class B extends Section{
	@Override
	void begin() {
		System.out.println("The class B begin");
	}
}
class C extends Section{
	@Override
	void begin() {
		System.out.println("The class C begin");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// polymorphism = an ability of an object to identify more then one type
		A A = new A();
		B B = new B();
		C C = new C();
		
		Section[] S = {A,B,C};
		
		for (Section x : S) {
			x.begin();
		}
		

	}

}
