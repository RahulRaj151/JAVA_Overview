
public class array_2D {

	public static void main(String[] args) {
		//2D array = an array of arrays
		
		String[][] name = { {"a1","a2","a3"},{"b1","b2","b3"},{"c1","c2","c3"} };
		for(int i=0; i<name.length; i++)
		{
			System.out.println();
			for(int j=0; j<name[1].length; j++)
			{
				System.out.print(name[i][j]+" ");
			}
		}
		
	}

}
