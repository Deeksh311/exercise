import java.util.Scanner;

public class MainReplace {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		Replace obj=new Replace();
		
		System.out.print("Enter string : ");
		obj.s=sc.nextLine();
		
		obj.replace();
		
		System.out.println("After replacing the characters 'd' with 'h',the string is :"+obj.s);
}
}
