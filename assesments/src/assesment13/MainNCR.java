package assesment13;

import java.util.Scanner;

public class MainNCR {

	public static void main(String[] args)
	{
      long n,r,nf=1,rf=1,nrf=1,NCR=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of n");
      n=sc.nextInt();
      System.out.println("Enter the value of r");
      r=sc.nextInt();
     for(int i=1;i<=n;i++)
    	 nf=nf*i;
     for(int i=1;i<=r;i++)
    	 rf=rf*i;
     for(int i=1;i<=(n-r);i++)
    	 nrf=nrf*i;
     
      NCR=nf/(rf*nrf);
     System.out.println("The NCR factor for given values is "+""+NCR);
	}

}
