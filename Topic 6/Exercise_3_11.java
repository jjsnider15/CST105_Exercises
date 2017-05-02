package Exercise_3_11;

public class Exercise_3_11 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Octagon octagon1 = new Octagon(5);
		
		System.out.println("\nOctagon: \nArea: " + octagon1.getArea() + "\nPerimeter: " + octagon1.getPerimeter());
		
		
		System.out.println("Cloning Octagon...");
		Octagon octagon2 = (Octagon)octagon1.clone();
		
		int result = (octagon1.compareTo(octagon2));
		if (result == 1)
			System.out.println("Octagon is greater than its clone.");
		else if (result == -1)
			System.out.println("Octagon is less than its close.");
		else 
			System.out.println("Octagon is equal to its close.");
		
	}
}