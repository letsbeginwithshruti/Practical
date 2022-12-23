package string;
import java.lang.String;
	import java.util.StringTokenizer;
	// Simple way to break a string, package: java.util.StringTokenzer
	public class StringTokenizerEg 
	{
		public static void show()  //show method
		{
			StringTokenizer st=new StringTokenizer("Anudip Foundation skill and career development center");
			while(st.hasMoreTokens())  //boolean method, it checks if there is more token available or not
			{
				System.out.println();
				System.out.print(st.nextToken(" ")); //String method, it returns the next token from string tokenizer object
				StringTokenizer st1=new StringTokenizer("I am Shifa Iqbal, and I'm learning Java");
				while(st.hasMoreTokens()) 
				{
					System.out.println();
					System.out.println(st1.nextToken(","));
			}
		}
	}
		public static void main(String[] args) {
			show();
		}
	}

