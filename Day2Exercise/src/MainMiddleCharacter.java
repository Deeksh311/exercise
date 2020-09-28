import java.util.Scanner;

public class MainMiddleCharacter {
	
 public static void main(String args[])
 {
	 
	 Scanner s=new Scanner(System.in);
	 
	 MiddleCharacter obj=new MiddleCharacter();
	 
	 System.out.print("Enter a string: ");
	 obj.s=s.next();
	 
	 System.out.println("The middle characters of the string are : "+obj.middlecharacter());
 }
}
