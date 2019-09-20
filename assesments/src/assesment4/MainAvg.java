package assesment4;

import java.util.Scanner;

public class MainAvg {

	public static void main(String[] args) 
	{
		int n,sum=0;
        int[] arr;
		 
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the no of students");
		  n=sc.nextInt();
		  
		  arr=new int[n];
		  
		  System.out.println("Enter the mark of students");
		  for(int i=0;i<n;i++)
		  {
			  arr[i]=sc.nextInt();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
			 sum=sum+arr[i];
		  }
		  System.out.println("The average is");
		  System.out.println(sum/n);
	}

}
