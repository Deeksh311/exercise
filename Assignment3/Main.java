import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		LargestNumber big = new LargestNumber();
		
		Scanner s = new Scanner(System.in); 
		
		System.out.println("Enter the first number:");
		big.FirstNumber = s.nextInt();
		
		System.out.println("Enter the second number:");
		big.SecondNumber = s.nextInt();
		
		System.out.println("Enter the third number:");
		big.ThirdNumber = s.nextInt();
		
		System.out.println("Largest number is:" +big.Number());
		
		Sorting S = new Sorting();
		System.out.println("Enter number of elements you want in array:");
		S.number = s.nextInt();
		int arr[] = new int[S.number];
		System.out.println("Enter all the elements:");
		for(int i=0; i<S.number;i++) {
			arr[i] = s.nextInt();
		}
			S.Sort(arr);
			System.out.println("Ascending order of the elements:");
			for(int i=0;i<S.number;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println("Descending order of the elements:");
			for(int i=S.number-1;i>=0;i--) {
				System.out.print(arr[i]+" ");
		}
			System.out.println();
			System.out.println("Enter marks:");
			int marksarr[]= new int[2];
			marksarr[0]=s.nextInt();
			marksarr[1]=s.nextInt();
			
			Average a=new Average();
			int sumaverage=a.marks(marksarr);
			System.out.println("Average marks:" +sumaverage);
}
}
		
			
			
		
		
		
	



		
	
