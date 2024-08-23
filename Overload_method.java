
public class Overload_method {

	public static void main(String[] args) {
		//overload method =  methoda that share same name but different parameters
		
		double x = add(1, 3);
		System.out.println(x);
	}
		
		static int add(int a, int b) {
			System.out.println("this is overload");
			return a+b;
			}
		 static int add(int a, int b, int c) {
			 return a+b+c;
		 }

	}