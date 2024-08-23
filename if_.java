import java.util.Scanner;

public class if_ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		if(age<=18) {
			System.out.println("You are an Adult");
		}
		else if(age>18) {
			System.out.println("You are grown");
		}
		else {
			System.out.println("you are still a kid");
			
		}
		

	}

}
