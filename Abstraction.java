import java.util.*;
abstract class Machine{
	abstract void go();
}
class bycyle extends Machine{

	@Override
	void go() {
		System.out.println("the bycyle is moving");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// abstract = abstract classes cannot be intantiated, but can have subclasses
		//			  abstract methods are declare without an implementation
		bycyle b1 = new bycyle();
		b1.go();

	}

}
