package assesment6;

import java.util.Scanner;

public class MainFactorial {

	public static void main(String[] args)
	{
      int n,fact=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number alphabets in your name");
      n=sc.nextInt();
     for(int i=1;i<=n;i++)
    	 fact=fact*i;
     System.out.println("The number of combination is");
     System.out.println(fact);
       
	}

}
