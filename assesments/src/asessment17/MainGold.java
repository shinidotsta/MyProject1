package asessment17;

import java.util.Scanner;

public class MainGold {

	public static void main(String[] args)
	{
		int n,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the kgs of gold");
		n=sc.nextInt();
		rem=n/5;
		System.out.println("Number of Sculptors can be made is "+""+(n+rem));

	}

}
