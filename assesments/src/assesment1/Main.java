package assesment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.Scanner; 


public class Main {

	public static void main(String[] args) throws IOException 
	{
		int num;
	Scanner	br=new Scanner(System.in);
		
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		num=br.nextInt();
	
		int temp=num;
	//	 System.out.println(num);
		int count=0;
		int rem,sum=0;
		
		while(num!=0)
		{
			count++;
			num=num/10;
			//System.out.println(count);
		}
		num=temp;
	
		while(num!=0)
		{
			rem=num%10;
		
			sum = (int) (sum+Math.pow(rem,count)); 
			num=num/10;		
		}
		
	//	System.out.println(sum);

 if(temp==sum)
	 System.out.println("Armstrong No");
 else
	 System.out.println("Not Armstrong No");

	}

}
