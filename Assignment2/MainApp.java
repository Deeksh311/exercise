import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		
			Calculator cal1 = new Calculator();
			
			cal1.studentNo=1;
			cal1.studentFirstname = "Deeksha";
			cal1.studentLastname ="Killari";
			cal1.studentFullname=cal1.studentFirstname+ cal1.studentLastname;
			cal1.age=22;
			cal1.gender='F';
			cal1.englishMarks=84.5f;
			cal1.mathsMarks=95.3f;
			cal1.major="E.C.E";
			
			Calculator cal2 = new Calculator();
			
			cal2.studentNo=2;
			cal2.studentFirstname="Chandana";
			cal2.studentLastname="Hari";
			cal2.studentFullname=cal2.studentLastname+ cal2.studentFirstname;
			cal2.age=21;
			cal2.gender='F';
			cal2.englishMarks=94.5f;
			cal2.mathsMarks=97.5f;
			cal2.major="E.E.E";
			
   System.out.println("press the number according to the below requirements");
   
    System.out.println("1.print all the details of all students");
    System.out.println("2.search by student Fullname");
    System.out.println("3.search by student number");
    
    Scanner sc=new Scanner(System.in);
    
    int l=sc.nextInt();
    
    switch(l)
    {
    
    case 1:
    	
      cal1.student();
      System.out.println();
      cal2.student();
      
      break;
      
    case 2:
    	
    	System.out.print("Enter student Fullname : ");
      String s=sc.next();
      
      if(s.equals(cal2.studentFullname))
    	  cal2.student();
      
      else if(s.equals(cal1.studentFullname))
    		  cal1.student();
      
      else
    	System.out.println("Not found");
      
      break;
      
    case 3:
    	
    	System.out.println("Enter student number : ");
    	int id=sc.nextInt();
    	
    	if(id==cal1.studentNo)
    		cal1.student();
    	
    	else if(id==cal2.studentNo)
    		cal2.student();
    	
    	else
    	System.out.println("Not found");
    	
    	break;
    	
    	default:
    		break;
    }
    
	}
			}
	


