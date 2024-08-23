package package2;
import package1.*;
public class subA extends B {
	public static void main(String[]agrs) {
		subA sa = new subA();
		C c = new C();
		System.out.println(sa.protectedMessage);
		System.out.println(c.defaultMessage);

	}

}
