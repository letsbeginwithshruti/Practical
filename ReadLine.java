package fileReaderWriter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;

public class ReadLine {
	public static void main(String[] args) {
		BufferedReader b=null;
		String s=" ";
		try {
			LineNumberReader l=new LineNumberReader(new InputStreamReader(new FileInputStream("D://test3.txt")));
			while(((s=l.readLine())!=null) && l.getLineNumber()<=3)  { //condition to read 1st 3 lines 
				System.out.println(s);  //print the ouput
			}
			l.close();
			}catch (FileNotFoundException e)  {
			System.err.println("File not found");  
		} catch(IOException ae)  {
			System.err.println("Unable to read file");
		}
	}
}
