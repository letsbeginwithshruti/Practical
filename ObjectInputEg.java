package fileReaderWriter;

import java.io.*;
// Read content from byte-stream to Object --->Deserialization
class Student implements Serializable {
	int id,  fees;
	String name;
	public Student(int id, String name, int fees) {
		this.id=id;
		this.name=name;
		this.fees=fees;
	}
}

public class ObjectInputEg {
	public static void main(String[] args, int name) {
		//FileOutputStream f = new FileOutputStream ("D:\\test3.txt");
	try {
		ObjectInputStream ob=new ObjectInputStream(new FileInputStream("D:\\test3.txt"));
	Student s = (Student)ob.readObject();
	System.out.println(s.id+" "+s.name+" "+s.fees);
	ob.close();
}catch(Exception e) {
	System.out.println(e);
}
}
}

