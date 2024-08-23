import java.util.Scanner;

public class nested_loop {

	public static void main(String[] args) {
		// nested loop = loop inside another loop
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers of row");
		int row = sc.nextInt();
		
		System.out.println("enter the number of colomn");
		int column = sc.nextInt();
		
		for (int i=1; i<=row; i++) 
		{
			System.out.println();
			for (int j=1; j<=column; j++)
			{
				System.out.print(j);
			}
			
		}
		

	}

}
