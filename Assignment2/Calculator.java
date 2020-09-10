
public class Calculator {

	    int studentNo;
	    String studentFirstname;
		String studentLastname;
		String studentFullname;
		int age;
		char gender;
		float englishMarks;
		float mathsMarks;
		String major;
		float totalMarks;
		float averageMarks;
		
		void student()
		{
			
		System.out.println("Student Complete Details are");
		
		System.out.println("Student FullName ="+ studentFullname);
		
		System.out.println("Age ="+ age);
		
		System.out.println("Gender ="+ gender);
		
		System.out.println("Major =" +major);
		
        totalMarks = englishMarks+mathsMarks;
        
		System.out.println("Total Marks =" +totalMarks);
		
		averageMarks = totalMarks/2;
		
		System.out.println("Average Marks =" +averageMarks);
		}
		
		}

