package Person;

public class Main {
	  public static void main(String[] args) {
	        Person person = new Person("Alice", "123 Main St");
	        Student student = new Student("Bob", "456 College Rd", "Computer Science", 2, 15000.0);
	        Staff staff = new Staff("Charlie", "789 School Ln", "XYZ High School", 50000.0);
	        
	        System.out.println(person);
	        System.out.println(student);
	        System.out.println(staff);
	    }
	}
