import java.util.Scanner;

public class MainAverage {

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		Average a=new Average();
		
		System.out.print("Enter first number : ");
		a.FirstNumber=s.nextInt();
		
		System.out.print("Enter second number : ");
		a.SecondNumber=s.nextInt();
		
		System.out.print("Enter third number : ");
		a.ThirdNumber=s.nextInt();
		
		System.out.println("Average of three numbers is : "+a.average());
		
	}
}
