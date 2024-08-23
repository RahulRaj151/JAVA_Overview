
public class array {

	public static void main(String[] args) {
		// array store multiple value in single variable
		//                  0		1	   2 		3			4
		String[] name = {"Rahul","Rahu","rohit","superman","spiderman"};
		System.out.println(name[3]);
		
		String[] name1 = new String[3];
		name1[0] = "ayush";
		name1[1] = "aman";
		name1[2] = "aditya";
		
		for(int i=0; i<name1.length; i++) 
		{
			System.out.println(name1[i]);
		}
	}

}
