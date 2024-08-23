class Iphone{
	
	String name = "apple";
	int price = 1000000;
	
	public String toString() {
		
		String myString = name +"\n" + price;
		return myString;
		
	}

}
public class toStringe_method {

	public static void main(String[] args) {
		// toString() = special methods that all object inherit, that reture\n a string y\that textially repersent an object
		//				can be use both implicity and explicity
		
		Iphone p1 =new Iphone();
		
		System.out.println(p1.toString());
		System.out.println(p1);

	}

}
