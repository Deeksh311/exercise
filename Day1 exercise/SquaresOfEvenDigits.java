
public class SquaresOfEvenDigits {
	
  static int sumOfSquaresOfEvenDigits(int number)
  {
	  int sum=0;
	  
	  while(number>0)
	  {
		  int digit=number%10;
		  
		  if(digit%2==0)
			  sum=sum+(digit*digit);
		  
		  number=number/10;
	  }
	  
	  return sum;
  }
}
