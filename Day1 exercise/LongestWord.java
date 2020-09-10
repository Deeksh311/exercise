
public class LongestWord {
	
 static String getLargestWord(String str)
 {
	 
	 String words[]=str.split(" ");
	 
	 String res="";
	 int max=0;
	 
	 for(int i=0;i<words.length;i++)
	 {
		 if(max<words[i].length())
		 {
			 max=words[i].length();
			 res=words[i];
		 }
	 }
	 
	 return res;
 }
}
