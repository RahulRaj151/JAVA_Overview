import java.util.*;
class Mammal{
	void sound() {
		System.out.println("no animal selected");
	}
}
class cat extends Mammal{
	@Override
	void sound() {
		System.out.println("the cat sounds meow");
	}
}
class mouse extends Mammal{
	@Override
	void sound() {
		System.out.println("The mouse sound like.... i don't know");
	}
}
public class Dynamic_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal mammal ;
		System.out.println("the your choice"+"\n"+"1: Cat"+"\n"+ "2: mouse");
		Scanner sc= new Scanner (System.in);
		int c = sc.nextInt();
		if (c==1) {
			mammal = new cat();
			mammal.sound();
		}
		else if(c==2) {
			mammal= new mouse(); 
			mammal.sound();
		}
		else {
			mammal = new Mammal();
			System.out.println("invalid choice");
			mammal.sound();
		}

	}

}
