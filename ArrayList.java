import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		//Arraylist = a resizable array
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("allo");
		food.add("Pizza");
		food .add("roti");
		
		food.set(0, "Rice");
		food.remove(3);
		food.clear();
		
		for(int i = 0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}

}
