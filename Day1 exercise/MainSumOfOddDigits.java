import java.util.Scanner;

public class MainSumOfOddDigits {
	
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	
	SumOfOddDigits so=new SumOfOddDigits();
	
	System.out.print("Enter number : ");
	int number=s.nextInt();
	
	if(so.checkSum(number)==1)
		System.out.println("Sum of odd digits is odd.");
	
	else
	System.out.println("Sum of odd digits is even.");
	
	
		
}
}
