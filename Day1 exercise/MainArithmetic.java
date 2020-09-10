import java.util.Scanner;

public class MainArithmetic {
	
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	
	ArithmeticOperations obj=new ArithmeticOperations();
	
	System.out.print("Enter first number : ");
	obj.FirstNumber=s.nextInt();
	
	System.out.print("Enter second number : ");
	obj.SecondNumber=s.nextInt();
	
	System.out.println("addition : "+obj.add());
	
	System.out.println("subtraction : "+obj.subtract());
	
	System.out.println("multiplication : "+obj.multiply());
	
	System.out.println("division : "+obj.division());
	
	System.out.println("remainder : "+obj.remainder());
}
}
