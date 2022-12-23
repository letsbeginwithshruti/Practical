package fileReaderWriter;

import java.io.FileInputStream;
import java.io.OutputStream;

public class WriteStringFOS {
		public static void main(String[] args) {
			try {
				FileInputStream f=new FileInputStream("D:\\Test.txt");
				f.write(67);
				f.close();
				System.out.println("done");}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}

