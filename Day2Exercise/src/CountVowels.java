
public class CountVowels {
	
 String s;
 
 int countvowels()
 {
	 
	 int i,count=0;
	 
	 for(i=0;i<s.length();i++)
	 {
		 
		 char ch=s.charAt(i);
		 
		 if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
		 count++;
		 
	 }
	 
	 return count;
 }
}
