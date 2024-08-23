
public class Printf {

	public static void main(String[] args) {
		// printf() = an optional method to control, format, and display text to console window
		//System.out.printf("this number %d is a random number" , 123);
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Rahul";
		int myInt = 20;
		double mydouble = 1000000.0;
		
		//System.out.printf("%b", myBoolean);
		//System.out.printf("%c", myChar);
		//System.out.printf("%s", myString);
		//System.out.printf("%d", myInt);
		//System.out.printf("%f", mydouble);
		
		//width
		System.out.printf("hello %10s", myString);
		//precision
		System.out.printf("you have %.2f amount", mydouble);
		//flag
		System.out.printf("you have %,f amount", mydouble);
	}

}
