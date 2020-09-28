
public class Pangram {
String s;
boolean pangram()
{
	s=s.toLowerCase();
	int arr[]=new int[26];
	int i;
	for(i=0;i<26;i++)
	{
		arr[i]=0;
	}
	for(i=0;i<s.length();i++)
	{
		Character ch=s.charAt(i);
		if(ch>='a' && ch<='z')
		arr[ch-'a']++;
	}
	for(i=0;i<26;i++)
	{
		if(arr[i]==0)
		return false;
	}
	return true;
}
}
