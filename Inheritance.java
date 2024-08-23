import java.util.*;
class Vehicle{
	double speed;
	void go() {
		System.out.println("this vehicle is moving");
	}
	void stop() {
		System.out.println("this vehicle is stopped");
	}
}
class bike extends Vehicle{
	double speed = 40.0;
	
}
public class Inheritance {

	public static void main(String[] args) {
		// inheritance = a process where one class aquires the attributes and methods of another
		bike b1 = new bike();
		b1.go();
		System.out.println(b1.speed +"km/hr");

	}

}
