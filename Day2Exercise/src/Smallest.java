
public class Smallest {
	
        int a,b,c;
        
        int smallest()
        {
        	if(a<b && a<c)
        		return a;
        	
        	else if(b<c)
        		return b;
        	
        	return c;
        }
}
