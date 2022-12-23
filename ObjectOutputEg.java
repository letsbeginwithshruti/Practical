package fileReaderWriter;
 
import java.io.*;

//convert writing state of an object into byte stream---> serialization
class Student implements Serializable {
	transient int id,  fees;
	String name;
	public Student(int id, String name, int fees) {
		this.id=id;
		this.name=name;
		this.fees=fees;
	}
}
public class ObjectOutputEg {
	public static void main(String[] args) {
		try {
			Student s = new Student(101,"Shifa",2000);
			FileOutputStream f = new FileOutputStream ("D:\\test3.txt");
			ObjectOutputStream ob=new ObjectOutputStream(f);
			ob.writeObject(s);
			ob.close();
			System.out.println("\nDONE");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
