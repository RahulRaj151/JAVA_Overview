class MyGenericClass <T>{
	
	T x;
	
	MyGenericClass(T x){
		 this.x = x;
	}
	public T getValue() {
		return x;
	}
}
public class Generic_Class {

	public static void main(String[] args) {
		MyGenericClass <Integer> myInt = new MyGenericClass<>(2);
		MyGenericClass <Double>myDouble = new MyGenericClass<>(3.14);
		MyGenericClass <Character>myChar = new MyGenericClass<>('@');
		MyGenericClass <String>myString = new MyGenericClass<>("hello");
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
	}

}
