package exercise_11_2;

public class exercise_11_2 {
	
	public static void main(String[] args) {
		
		Person person = new Person("John", "12 Bell Street", "3475550000", "john123@gmail.com");
		
		Student student = new Student("Mary", "100 Town Ave", "5145558764", "mary999@gmail.com", Student.FRESHMAN);
		
		Employee employee = new Employee("Mike", "34 West Street", "6185554673", "mike342@gmail.com", 910, 6000);
		
		Faculty faculty = new Faculty("Sue", "178 Carmel Rd", "7895554657", "sue574@gmail.com", 101, 50000, "4pm to 6pm", "Professor");
		
		Staff staff = new Staff("Tom", "429 Waterford Lakes", "4075555489", "tommy758@gmail.com", 12, 65000, "Executive Assistant");
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
	
}