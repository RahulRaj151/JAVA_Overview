import java.util.*;
class Animal{
	void speak() {
		System.out.println("the animal is speaking");
	}
}
class Dog extends Animal{
	@Override
	void speak() {
		System.out.println("the dog is barking");
	}
}

public class Method_overriding {

	public static void main(String[] args) {
		//Method Overriding = Declearing the method in sub class which is already present in parent class, 
		//					  so that the child class can give its own implementaion
		Animal animal = new Animal();
		Dog dog = new Dog();
		dog.speak();

	}

}
