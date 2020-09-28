import java.util.Scanner;

public class MainPalindrome {
	
 public static void main(String args[])
 {
	 
	 Scanner sc=new Scanner(System.in);
	 
	 Palindrome obj=new Palindrome();
	 
	 System.out.print("Enter string :");
	 obj.s=sc.nextLine();
	 
	 if(obj.palindrome())
	 System.out.println("Yes");
	 
	 else
	System.out.println("No");
	 
 }
}
