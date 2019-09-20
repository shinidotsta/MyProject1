package assesment3;

import java.util.Scanner;

import assesment2.Student;

public class Main {

	public static void main(String[] args) 
	{
		 int n;
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
		  Mark stu=new  Mark(arr,n);

	}

}
