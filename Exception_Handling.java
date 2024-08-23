import java.util.*;
public class Exception_Handling {

	public static void main(String[] args) {
		// Exception = an event that occur in an execution of the Program that disrupt ythe normal flow of instruction
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("enter the number to divide: ");
			int x = sc.nextInt();
			System.out.print("enter the number to divide with: ");
			int y = sc.nextInt();
			int z = x/y;
			System.out.println("Result: " + z);
		}
		catch(Exception e) {
			System.out.println("Something went Wrong");
		}
		finally {
			System.out.println("this will always Print");
		}
	}

}
