package package1;
import package2.*;
public class A {

	public static void main(String[] args) {
		C c = new C();
		B b = new B();
		System.out.println(c.PublicMessage);
		System.out.println(b.defaultMessage);

	}

}
