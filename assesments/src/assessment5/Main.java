package assessment5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int n,count=0;
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
	  if(arr[i]<50)
	  {
		  count++;
	  }
	  }
	  
	  System.out.println("Number of students appearing for retest is "+""+count);
	  

	}

}
