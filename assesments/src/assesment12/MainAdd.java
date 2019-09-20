package assesment12;

import java.util.Scanner;

public class MainAdd {

	public static void main(String[] args) 
	{
		int n,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("Enter the Number");
		n=sc.nextInt();	
		temp=n;
	   while(n>0)
	   {
		 sum=sum+n;
		 n--;
	   }

		}while(temp<0);
            System.out.println(sum);
	}

}
