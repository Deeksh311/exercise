import java.util.Scanner;

public class MainSmallest {
	
     public static void main(String args[])
     {
    	 
    	 Scanner s=new Scanner(System.in);
    	 
    	 Smallest sm=new Smallest();
    	 
    	 System.out.println("Enter three numbers : ");
    	 
    	 sm.a=s.nextInt();
    	 sm.b=s.nextInt();
    	 sm.c=s.nextInt();
    	 
    	 System.out.println("The smallest of three numbers is : " + sm.smallest());
     }
}
