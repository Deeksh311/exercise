
public class Addition {
	
  void addition(int arr[],int n)
  {
	  
	  int sum=arr[0],i,j;
	  
	  for(i=1;i<n;i++)
	  {
		  
		  sum=sum+arr[i];
		  
		  System.out.print(arr[0]);
		  
		  for(j=1;j<=i;j++)
		  {
			  System.out.print("+"+arr[j]);
		  }
		  
		  System.out.println("="+sum);
	  }
  }
}
