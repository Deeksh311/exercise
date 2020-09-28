import java.util.Scanner;

public class MainSorting {
	
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
	 
	 Sorting obj=new Sorting();
	 
	 obj.sorting(arr);
	 
	 System.out.println("After sorting the numbers are :");
	 for(i=0;i<10;i++)
	 {
		 System.out.print(arr[i]+" ");
	 }
}
}
