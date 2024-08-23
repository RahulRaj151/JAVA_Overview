import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer_Reader {

	public static void main(String[] args) {
			
		// File Writer = Write/Modify a Specific txt file
			try {
				FileWriter writer = new FileWriter("file.txt");
				writer.write("my name is someone \nhi ");
				//writer.append("by someone");
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			/* File Reader = read a content of file as a stream of character, one by one
			 				 read() returns an int value which contains the byte value
			 				 when read return -1, then there is no more data to return*/
			try {
				FileReader read = new FileReader("file.txt");
				int data = read.read();
				while(data != -1) {
					System.out.print((char)data);
					data = read.read();
				}
				read.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}

}
