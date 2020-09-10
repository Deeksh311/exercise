
public class Prime {
	
 int number;
 
  boolean prime()
  {
	  
	  for(int i=2;i<number;i++)
	  {
		  if(number%i==0)
			  return false;
	  }
	  
	  return true;
  }
}
