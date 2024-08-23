import java.util.ArrayList;

public class For_each_loop {

	public static void main(String[] args) {
		// for-each = Tranversing tenchnique to iterate thorungh the element in an arry/collection
		
		ArrayList<String> animal = new ArrayList<String>();
		
		animal.add("cat");
		animal.add("dog");
		animal.add("bird");
		
		for(String i :animal) {
			System.out.println(i);
		}

	}

}
