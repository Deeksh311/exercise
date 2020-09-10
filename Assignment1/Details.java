import java.util.Scanner;

public class Details {


	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
	Employee emp1=new Employee();

	emp1.employeeId=5188;
	emp1.Name="Deeksha";
	emp1.Salary=53.08f;

	Employee emp2=new Employee();

	emp2.employeeId=6557;
	emp2.Name="Vandu";
	emp2.Salary=67.06f;

	System.out.println(" First employee details");
	emp1.display();

	System.out.println(" Second employee details");
	emp2.display();

	if(emp1.Salary>emp2.Salary)
	{
	System.out.println("Employee 1 is getting more salary");
	System.out.println("The difference of their salary is:" +(emp1.Salary-emp2.Salary));
	}
	else
	{
	System.out.println("Employee 2 is getting more salary");
	System.out.println("The difference of their salary is:" +(emp2.Salary-emp1.Salary));
	}
	System.out.println("If you want to replace the First employeename press 1 or to replace the Second employeename press 2 otherwise press 0");
	int l = s.nextInt();
	if(l == 1) {
		System.out.print("enter the new name : ");
		String S = s.next();
		emp1.Name = S;
		System.out.println("First employee Name : " +emp1.Name);
	}
	else if(l == 2) {
		System.out.print("enter the new name : ");
		String S = s.next();
		emp2.Name = S;
		System.out.println("Second employee Name : " +emp2.Name);
	}
	}
}
