
public class Words {

	public static String wordCount(String str) {
		int count = 1;
		
		if (str.isEmpty()) {
			return "There are no words here!";
		}
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		return ("There are total " + count + " words in this sentence.");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence1 = "Thank you Mario! But our Princess is in another castle!";
		String sentence2 = "It's time to kick ass and chew bubblegum... and I'm all outta gum.";
		
		System.out.println(sentence1);
		System.out.println(wordCount(sentence1));
		System.out.println(sentence2);
		System.out.println(wordCount(sentence2));
	}

}
