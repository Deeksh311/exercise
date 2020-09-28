
public class MiddleCharacter {
	
  String s;
  
 String middlecharacter()
 {
	 
	 String a="";
	 
	 int length=s.length();
	 
	 if(length%2!=0)
	 a=a+s.charAt(length/2);
	 
	 else
	 a=a+s.charAt((length/2)-1)+s.charAt(length/2);
	 
	 return a;
 }
}
