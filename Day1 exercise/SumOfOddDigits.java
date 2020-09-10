
public class SumOfOddDigits {
	

static int checkSum(int number)
{
	int sum=0;
	
	while(number>0)
	{
		int digit=number%10;
		
		if(digit%2!=0)
		sum=sum+digit;
		
		number=number/10;
	}
	
	if(sum%2==0)
		return -1;
	
	return 1;
}
}
