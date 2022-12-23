package fileReaderWriter;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOS {
public static void main(String[] args) {
	try {
		FileOutputStream f=new FileOutputStream("D:\\test1.txt");  //destination
		BufferedOutputStream b= new BufferedOutputStream(f);
		String s="Welcome to coding world";
		byte b1[]=s.getBytes();  //converting string into byte array
		f.write(b1);
		f.close();
		System.out.println("done"); 
		}
		catch(Exception e)  {
			System.out.println(e);
		}
	}
}
