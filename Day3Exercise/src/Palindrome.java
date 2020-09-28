
public class Palindrome {
	
	String s;
	
 boolean palindrome()
 {
	 String st="";
	 
	 int i;
	 
	 for(i=s.length()-1;i>=0;i--)
	 {
		 st=st+s.charAt(i);
	 }
	 
	 if(st.equals(s))
		 return true;
	 
	 return false;
 }
 
}
