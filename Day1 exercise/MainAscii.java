import java.util.Scanner;

public class MainAscii {
	
public static void main(String args[])
{
	
	Scanner s=new Scanner(System.in);
	
	Ascii a=new Ascii();
	
	System.out.print("Enter character : ");
	a.character=s.next().charAt(0);
	
	System.out.println("The ascii value of "+a.character+" is : "+a.ascii());
	
}
}
