import junit.framework.*;
import java.util.*;

public class CourseSessionTest extends TestCase {
	private CourseSession session;
	private Date startDate;
	
	public Date createDate(int year, int month, int date){
		GregorianCalendar calendar = new GregorianCalendar();
		
		calendar.clear();
		calendar.set(year, month-1, date);
		
		return calendar.getTime();
	}
	
	public void setUp(){
		startDate = createDate(2003, 1, 6);
		session = new CourseSession("ENGL", "101", startDate);
	}
	
	public void testCreate(){
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents()); 
		assertEquals(startDate, session.getStartDate());
	}
	
	public void testEnrollStudents(){				
		Student student1 = new Student("Cain DiVoe");
		session.enroll(student1);
		assertEquals(1, session.getNumberOfStudents());
		assertEquals(student1, session.get(0));
		
		Student student2 = new Student("Coralee DeVaughn");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
		assertEquals(student1, session.get(0));
		assertEquals(student2, session.get(1));
	}
	
	public void testCourseDates(){

		Date sixteenWeeksOut = createDate(2003, 4, 25);
		
		assertEquals(sixteenWeeksOut, session.getEndDate());
	}
	
	public void testRosterReport(){
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));
		
		String rosterReport = session.getRosterReport();
		assertEquals(CourseSession.ROSTER_REPORT_HEADER +"A"+ CourseSession.NEWLINE +"B"+ CourseSession.NEWLINE + 
					CourseSession.ROSTER_REPORT_FOOTER +"2"+ CourseSession.NEWLINE, rosterReport);
	}
}
