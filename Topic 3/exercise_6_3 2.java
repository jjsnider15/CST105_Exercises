package exercise_6_3;

public class exercise_6_3{
	
	public static void main(String[] args){
		String word = "reliefpfpfeiller";
		char[] array = word.toCharArray();
		System.out.println(istPalindrom(array));
	}
	
	public static boolean istPalindrom(char[] word){
		int i1 = 0;
		int i2 = word.length - 1;
		while (i2 > i1) {
			if (word[i1] !=word[i2]) {
				return false;
			}
			++i1;
			--i2;
		}
		return true;
	}
}