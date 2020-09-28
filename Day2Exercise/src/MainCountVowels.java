import java.util.Scanner;

public class MainCountVowels {
	
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	
	CountVowels obj=new CountVowels();
	
	obj.s=sc.nextLine();
	
	System.out.println("Number of vowels in the string : "+obj.countvowels());
}
}
