package assesments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException
	{
		String Name;
		String Age;
		String Degree;
		String Branch;
		String Contactno;
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name");
		Name=br.readLine();
		System.out.println("Enter your Age");
		Age=br.readLine();
		System.out.println("Enter your Degree");
		Degree=br.readLine();
		System.out.println("Enter your Branch");
		Branch=br.readLine();
		System.out.println("Enter your ContactNo");
		Contactno=br.readLine();
		 
		
		Resume rem=new Resume(Name,Age,Degree,Branch,Contactno);
		rem.dispaly();
		

	}



}
