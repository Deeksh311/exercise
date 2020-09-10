public class LargestNumber {

	int FirstNumber;
	int SecondNumber;
	int ThirdNumber;
	
	int Number()
	{
		
		if(FirstNumber > SecondNumber && FirstNumber > ThirdNumber) 
			return FirstNumber;
			
			else if(SecondNumber > ThirdNumber) 
			return SecondNumber;
			
			else 
			return ThirdNumber;
		
	}

}

