import java.util.Scanner;

public class MainAddition {
	
 public static void main(String args[])
 {
	 
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter no of numbers :");
	 int n=sc.nextInt();
	 
	 System.out.println("Enter numbers :");
	 
	 int i;
	 
	 int arr[]=new int[n];
	 
	 for(i=0;i<n;i++)
	 {
       arr[i]=sc.nextInt();
	 }
	 
	 Addition obj=new Addition();
	 obj.addition(arr,n);
 }
}
