package exercise_6_12;

public class exercise_6_12{
	public static void main(String[] args){
		
		final int NUMBER_OF_CHARS_PER_LINE = 10;
		char ch1 = '1';
		char ch2 = 'Z';
		System.out.print("\nCharacters 1 to Z");
		printChars(ch1, ch2, NUMBER_OF_CHARS_PER_LINE);
		System.out.println();
	}
	public static void printChars(char ch1, char ch2, int numberPerLine){
		for (char c = ch1, count = 1; c <= ch2; c++, count++) {
			if (count % numberPerLine ==0)
				System.out.print(c);
			else
				System.out.print(c + " ");
		}
	}
}