import java.io.*;
public class File_Class {

	public static void main(String[] args) {
		// file = An abstract representation of file and directory pathname
		File file = new File("C:/Users/Win11/OneDrive/Desktop/file.txt");
		if(file.exists()) {
			System.out.println("File exist");
			System.out.println("file path: "+ file.getPath());
			System.out.println("is the file is a file: "+ file.isFile());
			file.delete();
			
		}
		else {
			System.out.println("the file didn't Exist");
		}

	}

}
