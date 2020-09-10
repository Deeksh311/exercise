import java.util.Scanner;

public class MainSquaresOfEvenDigits {
	
public static void main(String args[])
{
	
	Scanner s=new Scanner(System.in);
	
	SquaresOfEvenDigits se=new SquaresOfEvenDigits();
	
	System.out.print("Enter number :");
	int number=s.nextInt();
	
	System.out.println("Sum of squares of a even digits of a "+number+" is :"+se.sumOfSquaresOfEvenDigits(number));
}
}
