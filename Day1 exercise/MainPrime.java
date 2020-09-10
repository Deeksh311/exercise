import java.util.Scanner;

public class MainPrime {
	
  public static void main(String args[])
  {
	  
	  Scanner s=new Scanner(System.in);
	  
	  Prime p=new Prime();
	  
     System.out.print("Enter number :");
	  p.number=s.nextInt();
	  
	  if(p.prime())
		 System.out.println(p.number+" is a prime number");
	  
	  else
		  System.out.println(p.number+" is not a prime number");
  }
}
