import java.util.*;
class Friends{
	String name;
	static int numberofFriends;
	Friends (String name){
		this.name=name;
		numberofFriends++;
		
	}
	static void dispalyFriends() {
		System.out.println("you have "+ numberofFriends+ " Friends");
	}
}
public class Static_Keyword {

	public static void main(String[] args) {
		// Static = modifier. a single copy of variable/method is shared
		//			the calss "owns" the static members
		Friends f1 = new Friends("Rahul");
		Friends f2 = new Friends("raj");
		Friends.dispalyFriends();
		

	}

}
