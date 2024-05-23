package exercise;

public class LC_09_PalindromeNumber {
	
	/* Given an integer x, return true if x is a 
			palindrome
			, and false otherwise.

			Example 1:

			Input: x = 121
			Output: true
			Explanation: 121 reads as 121 from left to right and from right to left. */

	
	public static void exam(String number) {
		
		
		StringBuilder stringBuilder = new StringBuilder(number);
		
		System.out.println(stringBuilder.capacity());
		
		
		if(stringBuilder.reverse().toString().equals(number)) {
			System.out.println("This is palindrome Number");
		}
		else {
			System.out.println("This is not palindrome number");
		}
	}
	
	public static void main(String args[]) {
		exam("12");
	}

}
