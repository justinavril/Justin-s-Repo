import junit.framework.*;

public class AllTests {
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		
		suite.addTestSuite(StudentTest.class);
		suite.addTestSuite(CourseSessionTest.class);
		
		return suite;
	}
}
