package exercise_10_9;

public class exercise_10_9{
	public static void main(String[] args){
		
		Course math101 = new Course("math101");
		
		math101.addStudent("Mark");
		math101.addStudent("Tom");
		math101.addStudent("Joan");
		
		math101.dropStudent("Tom");
		
		System.out.println("\nThe students in the course " +
		math101.getCourseName() + ":");
		String[] students = math101.getStudents();
		for(int i = 0; i < math101.getNumberOfStudents(); i++) {
			System.out.print(students[i] + " ");
		}
		System.out.println();
	}
}