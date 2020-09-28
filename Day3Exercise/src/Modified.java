import java.util.Scanner;
public class Modified {
  static String getString(String s)
  {
	  Character ch=s.charAt(0);
	  if(ch!='k' && ch!='b')
		return s.substring(2);
	  else if(ch=='k' && ch!='b')
		  return s.substring(0,1)+s.substring(2);
		 return s.substring(1);
  }
  public static void main(String args[])
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter string :");
	 String s=sc.nextLine();
	 System.out.println("The modified string is :"+getString(s));
  }
}
