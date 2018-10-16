package BoundAndUnboundWildcard;

import java.util.ArrayList;
import java.util.List;

abstract class classDisplay{
	abstract void displayStudent();
}
class Student  {
	private int id;
	private String name;
	private String dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	void displayStudent() {	
		System.out.println(getId() + " " + getName() + " " + getDept());
}

}

class Department extends Student {

	private String name;
	private List<Student> students;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String name, List<Student> students) {
		this.name = name;
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}
	void displayStudent() {
		System.out.println(getName());
		
		for(Student s: students) {
			System.out.println(s.getId() + " " + s.getName() + " " +s.getDept());
		}
	}

}

class Institute {
	private String name;
	private List<Department> departments;

	public Institute() {
		// TODO Auto-generated constructor stub
	}

	public Institute(String name, List<Department> departments) {
		this.name = name;
		this.departments = departments;
	}

	public int getToalStudentsInInstitute() {
		int noOfStudents = 0;
		List<Student> students;
		for (Department dept : departments) {
			students = dept.getStudents();
			for (Student s : students) {
				noOfStudents++;
				System.out.println(s.getName() + " " + s.getId() + " " + s.getDept());
			}
		}
		return noOfStudents;
	}
    //Generics upper bound method
	public void DisplayStudentDetails(List<? extends Student> sList) {
		for(Student s: sList) {
			//calling method of Students class by child class instance 
			s.displayStudent();
		}
		}
	}



public class UpperBoundedWildCardTest {
	public static void main(String[] args) {
		
		//Create instance for CSE
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Mahadi");
		s1.setDept("CSE");
		Student s2 = new Student();
		s2.setId(102);
		s2.setName("Sekh");
		s2.setDept("CSE");
		// making a List of
		// CSE Students.
		List<Student> cse_students = new ArrayList<Student>();
		cse_students.add(s1);
		cse_students.add(s2);
		//Create instance for EE
		Student s3 = new Student();
		s3.setId(103);
		s3.setName("Shekh");
		s3.setDept("EE");
		Student s4 = new Student();
		s4.setId(104);
		s4.setName("Rupon");
		s4.setDept("EE");
		// making a List of
		// EE Students
		List<Student> ee_students = new ArrayList<Student>();
		ee_students.add(s3);
		ee_students.add(s4);

		Department CSE = new Department("CSE", cse_students);
		Department EE = new Department("EE", ee_students);

		List<Department> departments = new ArrayList<Department>();
		departments.add(CSE);
		departments.add(EE);
		
		
		// creating an instance of Institute.
		Institute institute = new Institute("BITS", departments);
		Institute ins = new Institute();
		//calling Generics upper bound wild card method
		ins.DisplayStudentDetails(cse_students);
		ins.DisplayStudentDetails(ee_students);
		ins.DisplayStudentDetails(departments);
		System.out.print("Total students in institute: ");
		System.out.print(institute.getToalStudentsInInstitute());

	}
}
