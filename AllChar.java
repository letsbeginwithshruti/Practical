package fileReaderWriter;

import java.io.FileInputStream;

public class AllChar {
	public static void main(String[] args) {
		try {
			FileInputStream f= new FileInputStream("D:\\test1.txt");
			//read all character
			int i=0;
			while((i=f.read())!=-1) {
				System.out.println((char)i);
			}
			f.close();
		} catch (Exception e)  {
			System.out.println(e);
		}
	}

}
