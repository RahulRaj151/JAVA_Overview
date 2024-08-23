import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String Name = sc.nextLine();
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Hello "+ Name);
		System.out.println("You are "+ age + "years old");
		
	}

}
