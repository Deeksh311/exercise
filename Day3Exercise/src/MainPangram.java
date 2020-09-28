import java.util.Scanner;
public class MainPangram {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Pangram obj=new Pangram();
	 
	 System.out.print("Enter string :");
	 obj.s=sc.nextLine();
	 
	 if(obj.pangram())
	 System.out.println("Pangram");
	 
	 else
	System.out.println("Not Pangram");
	 
}
}
