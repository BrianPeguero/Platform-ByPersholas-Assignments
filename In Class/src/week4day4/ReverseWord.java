package week4day4;

public class ReverseWord {
	
	public static String reverseWord(String word) {
		String drow = "";
		for (int i = word.length()-1; i >= 0; i--) {
			drow = drow + word.charAt(i);
		}
		return drow;
	}
	
	public static String reversePhrase(String phrase) {
		String reversedPhrase = "";
		String[] phraseArray = phrase.split(" ");
		for (int i = 0; i <= phraseArray.length - 1; i++) {
			String reversedWord = reverseWord(phraseArray[i]) + " ";
			reversedPhrase = reversedPhrase + reversedWord;
		}
		return reversedPhrase;
	}
	
	public static void display(String phrase) {
		System.out.println(phrase);
	}
	
	public static void main(String[] args) {
		String reversedPhrase = reversePhrase("Hello there");
		display(reversedPhrase);

	}

}
