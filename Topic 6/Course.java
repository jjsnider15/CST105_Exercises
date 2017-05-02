package exercise_13_13;

public class Course implements Cloneable{
	
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course (String courseName) {
		
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents() {
		
		return students;
	}
	
	public int getNumberOfStudents() {
		
		return numberOfStudents;
	}
	
	public String getCourseName() {
		
		return courseName;
	}
	
	@Override
	public Course clone() throws CloneNotSupportedException {
		
		Course courseClone = (Course)super.clone();
		
		courseClone.students = students.clone();
		return courseClone;
	}
	
	public void dropStudent(String student) {
		
		
	}
	
}
