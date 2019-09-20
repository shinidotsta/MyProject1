package assesment8;

import java.util.Scanner;

public class MainLeap {

	public static void main(String[] args) 
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter theb year");
		year=sc.nextInt();
		
		if((year%400==0) || (year%4==0) && (year%100!=0))
			System.out.println("Leap year");
		else
			System.out.println("Not a Leap year");

	}

}
