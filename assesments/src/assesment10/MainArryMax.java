package assesment10;

import java.util.Scanner;

public class MainArryMax {

	public static void main(String[] args) 
	{
		int n;
		int[] arr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of applications");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the amount(in crores)");
		for(int i=0;i<n;i++)
		   arr[i]=sc.nextInt();
		
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
	System.out.println("The winning bid is "+max+" croresmax");	
		
		
	}

}
