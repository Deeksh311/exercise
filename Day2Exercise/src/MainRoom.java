import java.util.Scanner;

public class MainRoom {
	
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.print("Enter the roomno : ");
	   int roomno=sc.nextInt();
	   
	   System.out.print("Enter the roomtype : ");
	   String roomtype=sc.next();
	   
	   System.out.print("Enter the roomarea : ");
	   int roomarea=sc.nextInt();
	   
	   System.out.print("Enter the ACmachine details : ");
	   String ACmachine=sc.next();
	   
	   Room obj=new Room();
	   
	   System.out.println();
	   
	   System.out.println("Setting the data");
	   obj.setdata(roomno,roomtype,roomarea,ACmachine);
	   
	   System.out.println("displaying the data");
	   obj.displaydata();
   }
}
