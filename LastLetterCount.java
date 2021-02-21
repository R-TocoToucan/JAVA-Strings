import java.util.ArrayList;
import java.util.StringTokenizer;

public class LastLetterCount {

	public static String LastLetter(String string) {
		
		int countS = 0;
		int countY = 0;
		
		StringTokenizer st = new StringTokenizer(string, " ");
		StringBuilder newSentence = new StringBuilder();
		
		String firstS = "";
		String firstY = "";
		
		ArrayList<String> myArray = new ArrayList<String>();
		
		while (st.hasMoreTokens()) {
			String word = st.nextToken();
			if (word.charAt(word.length()-1) == 'y') {
				countY++;
				if (firstY == "") {
					firstY = word;
				}
			}
			if (word.charAt(word.length()-1) == 's') {
				countS++;
				if (firstS == "") {
					firstS = word;
				}
			}
			myArray.add(word);
			
		}
		if (firstS != "" && firstY != "") {
			int indexS = myArray.indexOf(firstS);
			int indexY = myArray.indexOf(firstY);
			myArray.set(indexY, firstS);
			myArray.set(indexS, firstY);
		}
		
		for (String word : myArray) {
			newSentence.append(word + " ");
		}
		
		return (newSentence.toString() + " has total " + countS + " words ending with s and total " + countY + " words ending with y.");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "She wanted a pet platypus but ended up getting a duck and a ferret instead.";
		System.out.println(LastLetter(sentence));

	}

}
