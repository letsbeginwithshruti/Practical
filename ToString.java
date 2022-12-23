package string;
import java.lang.String;
//represent any object to string, we can return value of object instead of hashcode
public class ToString 
{
	int rollNo;
	String name,address;
	ToString(int rollNo,String name, String address)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.address=address;				
	}
	public String toString() //return object into string
	{
		return rollNo+" "+name+" "+address;
	}
	public static void main(String[] args) {
		ToString t=new ToString(101,"Shifa","Asansol");
		ToString t1=new ToString(102,"Nisha","Asansol");
		System.out.println(t);
		System.out.println(t1);
	}
}
