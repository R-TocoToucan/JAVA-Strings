
public class Consonants {

	public static String countConsonants(String string) {
		int count = 0;
		String str = string.toLowerCase();
		
		StringBuilder myString = new StringBuilder(str);
		
		for (int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				continue;
			} else {
				count++;
				myString.setCharAt(i, '*');
			}
		}
		
		return (string + "\n" +  myString.toString() + " - There are total "+ count + " consonants.");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "On it like a bonnet";
		System.out.println(countConsonants(sentence));

	}

}
