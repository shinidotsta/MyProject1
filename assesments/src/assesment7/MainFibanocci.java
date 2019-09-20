package assesment7;

import java.util.Scanner;

public class MainFibanocci {

	public static void main(String[] args) 
	{
		 int n,first=0,second=1,next;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the number");
	      n=sc.nextInt();
        System.out.println(first);
        System.out.println(second);
        for(int i=0;i<=n;i++)
        {
        	next=first+second;
        	System.out.println(next);
        	first=second;
        	second=next;
        }
        
	}

}
