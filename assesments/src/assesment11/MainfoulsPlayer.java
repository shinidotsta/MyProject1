package assesment11;

import java.util.Scanner;

public class MainfoulsPlayer {

	public static void main(String[] args) 
	{
	
		int n;
		int[] arr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the number of fouls made by each player");
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		
		int min=arr[0];
		int pos=0;
		for(int i=1;i<n;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
				pos=i;
			}
		}
		System.out.println("The eligible player is player no:"+(pos+1)+"("+min+"fouls)");
		
	}

}
