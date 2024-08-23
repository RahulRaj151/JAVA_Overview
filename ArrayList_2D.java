import java.util.*;
public class ArrayList_2D {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> dinner = new ArrayList();

		ArrayList<String> food = new ArrayList<String>();
		food.add("allo");
		food.add("Pizza");
		food.add("roti");
		
		ArrayList<String> drink = new ArrayList<String>();
		drink.add("mango");
		drink.add("oreo");
		drink.add("juice");
		
		dinner.add(drink);
		dinner.add(food);
		System.out.println(dinner);
		

	}

}
