package assesment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
	  int n;
	  float[] arr;
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the no of students");
	  n=sc.nextInt();
	  arr=new float[n];
	  System.out.println("Enter the height of students");
	  for(int i=0;i<n;i++)
	  {
		  arr[i]=sc.nextFloat();
	  }
     Student stu=new  Student(arr,n);
	}

}
