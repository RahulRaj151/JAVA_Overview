import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		
		
		do{
			System.out.print("Enter your name:");
			name = sc.nextLine();
		}while(name.isBlank());
		
		System.out.println("Hello "+ name);

	}

}
