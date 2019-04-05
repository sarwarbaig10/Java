import java.io.*;
public class esc4 
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str,str1="",str2;
		char ch;
		int i,l;
		
		System.out.println("enter a string");
		str=br.readLine();
		l=str.length();
		for(i=0;i<l;i++)
		{
			ch=str.charAt(i);
			str1=ch+str1;
		}
		if(str1.compareTo(str)==0)
		{
			System.out.println("Palindrome");
		}
			else
			{
				
			System.out.println(" Not Palindrome");
		}
	}
}
