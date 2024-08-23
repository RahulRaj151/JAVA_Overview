import java.util.*;
interface prey{
	void flee();
}
interface Praditor{
	void hunt();
}
class Fish implements prey,Praditor{

	@Override
	public void flee() {
		System.out.println("the fish is running away from larger fish");
		
	}

	@Override
	public void hunt() {
		System.out.println("the fish is hunting small fish");
		
	}
	
	
}
public class Interface {

	public static void main(String[] args) {
		// Interface = a templete that can be applied to class,
		//			   class can implement more then 1 interface. similar to inheritance but inhertance is limited to 1 super
		Fish f1 = new Fish ();
		f1.flee();
		f1.hunt();
		

	}

}
