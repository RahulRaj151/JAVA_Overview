import java.util.*;
class garage{
	public void park(Car car){
		System.out.println("this "+car.name+ " has been parked in garage");
	}
}
class Car{
	String name;
	Car(String name){
		this.name=name;
	}
}
public class Object_Passing {

	public static void main(String[] args) {
		garage garage = new garage();
		Car c1 = new Car("BMW");
		garage.park(c1);

	}

}
