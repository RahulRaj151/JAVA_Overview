import java.util.*;
class Dice{
	Dice(){
		Random random;
		Random random1 = new Random();
		int number = 0;
		roll(random1, number);
	}
	void roll(Random random, int number) {
		int number1 = random.nextInt(6)+1;
		System.out.println(number1);
	}
}
public class Variable_scope {

	public static void main(String[] args) {
		// local = Declare inside the methiod
		//globle = declare outside the method but inside the class
		Dice dice = new Dice();
		

	}

}
