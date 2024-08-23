public class Method_Chaining {

	public static void main(String[] args) {
		
		// method chaining = 	a common syntax for invoking multiple method calls in OOP
		//						condense code into less lines
		
		String name = "Rahul";
		
		//name = name.concat(" code   ");
		//name = name.toUpperCase();
		//name = name.trim();
		
		name = name.concat("raj").toUpperCase().trim();
		
		System.out.println(name);
			
	}
}