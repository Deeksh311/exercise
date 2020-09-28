import java.util.Scanner;

public class MainSearching {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter numbers :");
		 
		 int i;
		 
		 int arr[]=new int[10];
		 
		 for(i=0;i<10;i++)
		 {
	       arr[i]=sc.nextInt();
		 }
		 
		 System.out.print("Enter element to be searched : ");
		 int element=sc.nextInt();
		 
		 Searching obj=new Searching();
		 
		 if(obj.searching(arr,element))
		 System.out.println("The element is present in the array");
		 
		 else
	     System.out.println("The element is not present in the array");
	}
}
