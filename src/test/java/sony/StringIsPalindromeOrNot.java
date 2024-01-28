package sony;

public class StringIsPalindromeOrNot {
	
	
	public static void main(String[] args) {
		
		String f="malayalam";
		System.out.println("before reverse "+f);
		String rev="";
		
		for(int i=f.length()-1;i>=0;i--)
		{
			rev=rev+f.charAt(i);
		}
		System.out.println("after revrese "+rev );
		
		if(f.equalsIgnoreCase(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("not a palindrome string");
		}
	}

}
