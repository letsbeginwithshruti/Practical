package fileReaderWriter;
 import java.io.Closeable;
import java.io.FileOutputStream;

//byte to string
import java.io.PrintStream;
import java.io.Writer;
 
public class FileOutputStreamEg {
	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream("D:\\test.txt");  //destination
			String s ="Welcome to Anudip Foundation";
			byte b[]=s.getBytes();  //converting string into byte array
			      f.write(b);
			f.close();
			System.out.println("done");
	} catch(Exception e)  {
		System.out.println(e);
	}
}
}
