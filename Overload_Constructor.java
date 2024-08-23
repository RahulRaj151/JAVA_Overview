class Pizza{
	
	String Bread;
	String sauce;
	String Cheese;
	
	Pizza(String Bread,String sauce,String Cheese){
		
		this.Bread = Bread;
		this.sauce = sauce;
		this.Cheese = Cheese;
		
	}
}
public class Overload_Constructor {

	public static void main(String[] args) {
		// 
		Pizza pizza =new Pizza("Thicc", "tomato", "maozerella");
		System.out.println("the ingregieance of tpizza is ");
		System.out.println(pizza.Bread);
		System.out.println(pizza.Cheese);
		System.out.println(pizza.sauce);
	}

}
