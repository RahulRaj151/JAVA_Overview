import java.util.Scanner;
public class logical_operator {

	public static void main(String[] args) {
		/*
		 * && (AND)- both conditions are true
		 * || (OR)- either one condition is true
		 * ! (NOT)- reverse boolean value of the condition 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to paly or 5 to quit");
		int Res = sc.nextInt();
		if(Res>1 && Res<=5) 
		{
			System.out.println("you play the game");
			}
		else if(Res>5 || Res<1) 
		{
			System.out.println("you quit the game");
			}
		else {
			System.out.println("you can't play the game");
			
		}

	}

}
