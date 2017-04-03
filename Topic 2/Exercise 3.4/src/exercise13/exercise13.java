package exercise13;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.OptionalInt;
import java.util.Random;

public class exercise13{

public static void main(String[] args){
	
	Random random = new Random();
	
	OptionalInt randomNumberMonth = random.ints(0,12).findFirst();
	
	String monthAsText = Month.of(randomNumberMonth.getAsInt())
			.getDisplayName(TextStyle.FULL, Locale.US);
	
	System.out.println("A random month is: " + monthAsText);		
	
}
}