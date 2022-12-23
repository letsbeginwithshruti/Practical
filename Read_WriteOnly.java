package pack.com;
//We can read only (only getter method)
//We can write only(only setter method)
public class Read_WriteOnly
{
	//private String name="Pallabi"; //private data member
	private String name;
	public void setName(String name)
	{
		this.name=name;
	/*public String getName()
	{
		return name;*/
	}
	public static void main(String args[])
	{
		Read_WriteOnly obj=new Read_WriteOnly();
		//obj.set_name("Shifa"); //We can't change the value  of the name
		//System.out.println("Name:- "+obj.getName());//We can't get the value as get method is not there
		System.out.println(obj.name);
	}
}
