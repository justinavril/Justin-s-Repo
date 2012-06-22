import java.util.*;

public class CourseSession {
	private String department;
	private String number;
	private ArrayList<Student> students;
	private Date startDate;
	
	public CourseSession(String department, String number){
		this.department = department;
		this.number = number;
		this.students = new ArrayList<Student>();
	}
	
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
	
	public Date getEndDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		
		calendar.setTime(startDate);
		
		int numberOfDays = 16*7-3;
		
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
}
