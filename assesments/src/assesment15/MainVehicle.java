package assesment15;

import java.util.Scanner;

public class MainVehicle {

	public static void main(String[] args)
	{
		int n,count1=0,count2=0;	
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the number of vehicles");
	      n=sc.nextInt();
	      
	    int[] fare;
	    fare=new int[n];
	    System.out.println("Enter the fare collected for each vehicles");
		for(int i=0;i<n;i++)
		{
			fare[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(fare[i]>50)
				count1++;
			else
				if(fare[i]>0 && fare[i]<50)
					count2++;
		}
		
		System.out.println("Number of heavy vehicles"+count1+" and the number of light weight vehicles is"+count2);
		
	}

}
