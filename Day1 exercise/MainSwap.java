import java.util.Scanner;

public class MainSwap {
	
public static void main(String args[])
{
	
	Scanner s=new Scanner(System.in);
	
	Swap sw=new Swap();
	
	System.out.print("Enter first number : ");
	sw.FirstNumber=s.nextInt();
	
	System.out.print("Enter second number : ");
	sw.SecondNumber=s.nextInt();
	
	System.out.println("Before swapping the numbers are : "+sw.FirstNumber+"and"+sw.SecondNumber);
	
	sw.swap();
	
	System.out.println("After swapping the numbers are : "+sw.FirstNumber+"and"+sw.SecondNumber);
}
}
