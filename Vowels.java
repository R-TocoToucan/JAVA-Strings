
public class Vowels {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "It's much more difficult to play tennis with a bowling ball than it is to bowl with a tennis ball.";
		int count = 0;
		for (int i=0; i<sentence.length(); i++) {
			if (isVowel(sentence.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        	return true;
        } else {
        	return false;
        }
	}

}
