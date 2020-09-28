import java.util.Scanner;

public class MainSubstring {
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	Substring obj=new Substring();
	
	System.out.println("Enter string :");
	obj.s=sc.nextLine();
	
	System.out.println("Enter first and second indexes :");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	System.out.println("The substring is :"+obj.substr(a,b));
}
}
