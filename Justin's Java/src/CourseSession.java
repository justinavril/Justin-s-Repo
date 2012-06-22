import java.util.*;

public class CourseSession {
	private String department;
	private String number;
	private ArrayList<Student> students;
	
	public CourseSession(String department, String number){
		this.department = department;
		this.number = number;
		this.students = new ArrayList<Student>();
	}
	
	public String getDepartment (){
		return this.department;
	}
	
	public String getNumber(){
		return this.number;
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
