
public class Generics {

	public static void main(String[] args) {
		/*Generics= enable types (classes and interfaces)to be parameters when definig: classes, interfaces and methods
		 * 			a benefit is to eliminate the need to create multiple versions of methods or Classes for the various data type
		 * 			Use 1 version for all reference data types*/
		
		Integer[] intArray = {5,4,3,2,1};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		Character [] charArray = {'h','e','l','l','o'};
		String[] striingArray = {"b", "y","e"};
		
		//displayArray(intArray);
		//displayArray(doubleArray);
		//displayArray(charArray);
		//displayArray(striingArray);
		
		System.out.println(getFirst(intArray));
	}
	public static <T> void displayArray(T[] array){
		
		for(T x: array) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	public static <T> T getFirst(T[] array) {
		return array[0];
		
	}

}
