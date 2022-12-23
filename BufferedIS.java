package fileReaderWriter;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedIS {
	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("D:\\test1.txt");  //destination
			BufferedInputStream b= new BufferedInputStream(f);
			//String s="Welcome to coding world";
			int i;
			while((i=b.read())!=-1)  {
				System.out.println((char)i);  //convert it into character
			}
			f.close();
			b.close();
		}catch(Exception e)  {
				System.out.println(e);
			}
		}
	}

