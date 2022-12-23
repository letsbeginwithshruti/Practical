package fileReaderWriter;

import java.io.FileInputStream;

public class SingleChar {
	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("D:\\Test1.txt");
		int i=f.read();
		System.out.print((char)i+"\n");	
		System.out.println("Done");
		}catch(Exception e) {
			System.out.println(e);
		}
	}}