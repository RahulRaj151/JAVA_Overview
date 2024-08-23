class Food{
	String name;
	Food(String name){
		this.name = name;
		
	}
}
public class Array_of_object {

	public static void main(String[] args) {
		
		//Food[] fridge = new Food [3];
		
		Food food1 = new Food("Pizza");
		Food food2 = new Food("burger");
		Food food3 = new Food("roti");
		
		Food[] fridge = {food1, food2, food3};
		
		//fridge[0] = food1;
		//fridge[1] = food2;
		//fridge[2] = food3;
		
		System.out.println(fridge[0].name );

	}

}
