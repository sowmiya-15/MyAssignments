package week2.day1;

public class pseudocode {
	public static void main(String[] args) {
		String text="madam";
		String rev="";
		char[] charArray=text.toCharArray();
		for (int i = charArray.length-1;i>=0;i--) 
		{
		//System.out.println(charArray[i]);
		rev=rev+charArray[i];
		
		}
		System.out.println(rev);
		if (rev.equals(text))
		{
		System.out.println("madam is an palindrome");
		}
		else
			System.out.println("not a palindrome");
		
		}
		
		
		
		
		
		
	
}