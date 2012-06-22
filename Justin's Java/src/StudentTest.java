import junit.framework.*;

public class StudentTest extends TestCase {
	public void testCreate() {
		final String firstName = "Jane Doe";
		
		Student firstStudent = new Student (firstName);		
		assertEquals(firstName, firstStudent.getName());
		
		final String secondName = "Justin Wu";
		
		Student secondStudent = new Student (secondName);
		assertEquals(secondName, secondStudent.getName());
	}
	
	
}
