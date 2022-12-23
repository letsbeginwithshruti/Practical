package pack.com;
import java.lang.String;
class MainClass{//main class
	//declaring
	int student_no;
	String name,mail,address;
	double fees;
	static double increasedFees;
	MainClass(int sn,String name,String mail,String address){
		this.student_no=sn;
		this.name=name;
		this.mail=mail;
		this.address=address;}
	//method for initializing fees to student
	void fees(double f ) 
	{
		fees=f;  //assigning passing value
		
	}
	//method for printing output
	void display() //for concatenation and sop output
	{
		this.fees=this.fees+increasedFees;//updating fees before printing
		System.out.println("ID_"+this.student_no+"   Name-"+this.name+"   Mail-"+this.mail+"    Adress-"+this.address);
	}
	static void increasefees(int n,double f) {
		if(f<2000) {//condition
			f=10*f/100;//logic for increasing fees
			increasedFees=f;
		}
	}

	public static void main(String[] args) {
		MainClass[]student=new MainClass[5];
		 student[0]=new MainClass(101,"Rita","rita345@gmail.com","Bihar");
		 student[1]=new MainClass(102,"Sita","Sita378@gmail.com","west Bengal");
		 student[2]=new MainClass(103,"Ratna","ratna945@gmail.com","Jharkhand");
		 student[3]=new MainClass(104,"Rita","rita345@gmail.com","Meghalaya");
		 student[4]=new MainClass(105,"Ram","ram376@gmail.com","Delhi");
		 student[0].fees(1064);
		 student[1].fees(2056);
		 student[2].fees(957);
		 student[3].fees(1999);
		 student[4].fees(2001);
		increasefees(100,1064);
		increasefees(102,957);
		increasefees(103,1999);
System.out.println("____Details of the students____");
for(MainClass i:student) {
	i.display();
}}}