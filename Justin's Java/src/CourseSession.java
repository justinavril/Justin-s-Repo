import java.util.*;

/**
 * 
 * Provides a representation of a single-semester
 * session of a specific university course.
 * @author justinwu
 *
 */

public class CourseSession {
	final int sessionLength = 16;
	final int daysInWeek = 7;
	final int daysFromFridayToMonday = 3;
	
	private String department;
	private String number;
	private ArrayList<Student> students;
	private Date startDate;
	
	/**
	 * 
	 * Constructs a CourseSession starting on a specific date
	 * 
	 * @param department the student's department
	 * @param number course number
	 * @param startDate the date on which the CourseSession begins
	 */
	
	public CourseSession(String department, String number, Date startDate){
		this.department = department;
		this.number = number;
		this.students = new ArrayList<Student>();
		this.startDate = startDate;
	}
	
	public String getDepartment (){
		return this.department;
	}
	
	public String getNumber(){
		return this.number;
	}
	
	public Date getStartDate(){
		return this.startDate;
	}
	
	/**
	 * 
	 * @return Date the last date of the course session
	 */
	
	public Date getEndDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		
		calendar.setTime(startDate);
		
		int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
		
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		
		return calendar.getTime();
	}
	
	public int getNumberOfStudents(){
		return this.students.size();
	}
	
	public void enroll (Student student){
		students.add(student);
	}
	
	public Student get(int index){
		return students.get(index);
	}
	
	public String getRosterReport(){
		StringBuilder buffer = new StringBuilder();
		
		buffer.append(ROSTER_REPORT_HEADER);
		
		Student student = students.get(0);
		buffer.append(student.getName());
		buffer.append('\n');
		
		student = students.get(1);
		buffer.append(student.getName());
		buffer.append('\n');
		
		buffer.append(ROSTER_REPORT_FOOTER + students.size() +"\n");
		
		return buffer.toString();
	}
}
