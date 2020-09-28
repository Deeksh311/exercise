
public class Room {
	
   int roomno,roomarea;
   String roomtype;
   String ACmachine;
   
   void setdata(int no,String type,int area,String AC)
   {
	   roomno=no;
	   
	   roomtype=type;
	   
	   roomarea=area;
	   
	   ACmachine=AC;
   }
   
   void displaydata()
   {
	   System.out.println("The roomno is :"+roomno);
	   
	   System.out.println("The roomtype is :"+roomtype);
	   
	   System.out.println("The roomarea is :"+roomarea);
	   
	   System.out.println("The ACmachine is :"+ACmachine);
   }
}
