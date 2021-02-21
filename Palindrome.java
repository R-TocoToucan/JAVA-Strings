
public class Palindrome {
	
	public static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		String str = s.toLowerCase();
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	
	public static void main(String[] args) {
		
		String sentence1 = "Tacocat";
		String sentence2 = "I am a palindrome";
		
		if (isPalindrome(sentence1)) {
			System.out.println(sentence1 + " is a Palindrome");
		} else {
			System.out.println(sentence1 + " is not a Palindrome");
		}
		
		if (isPalindrome(sentence2)) {
			System.out.println(sentence2 + " is a Palindrome");
		} else {
			System.out.println(sentence2 + " is not a Palindrome");
		}
		
	}
}
