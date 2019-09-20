package assesment3;

public class Mark {

	public Mark(int[] arr, int n) 
	{
		int i,j;
		int temp;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
            {
				if(arr[i]<arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
	        }
		}
		System.out.println("The Marks in order are");
		for(i=0;i<n;i++)
		System.out.println(arr[i]);
	}

}
