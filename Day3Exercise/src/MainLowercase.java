import java.util.Scanner;

public class MainLowercase
{
	
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	
	Lowercase obj=new Lowercase();
	
	System.out.print("Enter string : ");
	obj.s=sc.nextLine();
	
	obj.lowercase();
	
	System.out.println("After converting all characters to lowercase, the string is :"+obj.s);
}
}
