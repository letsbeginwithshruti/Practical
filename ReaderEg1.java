package fileReaderWriter;

import java.io.FileReader;

public class ReaderEg1 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\test3.txt"); //Read
			int i;
			while((i = fr.read())!=-1) {  //loop to read
				System.out.print((char)i);  //prints the file contents
			}
			fr.close();
			System.out.println("\nDONE");
		}catch(Exception e)  {
			System.out.println(e);
		}
	}
}
