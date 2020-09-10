import java.util.Scanner;

public class MainLongestWord {
	
public static void main(String args[])
{
	LongestWord l=new LongestWord();
	
	Scanner s=new Scanner(System.in);
	
	System.out.print("Enter string : ");
	String str=s.nextLine();
	
	System.out.println("The largest word is : "+l.getLargestWord(str));
}
}
