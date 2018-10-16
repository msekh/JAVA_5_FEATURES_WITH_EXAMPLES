package BoundAndUnboundWildcard;

import java.util.ArrayList;
import java.util.List;

class StudentLower {
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

class DepartmentLower extends StudentLower {

	private String name;
	private List<StudentLower> students;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DepartmentLower() {
		// TODO Auto-generated constructor stub
	}

	public DepartmentLower(String name, List<StudentLower> students) {
		this.name = name;
		this.students = students;
	}

	public List<StudentLower> getStudents() {
		return students;
	}



	void displayStudent() {
		System.out.println(getName());

		for (StudentLower s : students) {
			System.out.println(s.getId() + " " + s.getName() + " " + s.getDept());
		}
	}

}

class InstitueLower {
	private String name;
	private List<DepartmentLower> departments;

	public InstitueLower() {
		// TODO Auto-generated constructor stub
	}

	public InstitueLower(String name, List<DepartmentLower> departments) {
		this.name = name;
		this.departments = departments;
	}

	public int getToalStudentsInInstitueLower() {
		int noOfStudents = 0;
		List<StudentLower> students;
		for (DepartmentLower dept : departments) {
			students = dept.getStudents();
			for (StudentLower s : students) {
				noOfStudents++;
				System.out.println(s.getName() + " " + s.getId() + " " + s.getDept());
			}
		}
		return noOfStudents;
	}

	// Generics upper bound method
	public void displayStudentDetails(List<? super DepartmentLower> list) {
		for (Object s : list) {
			// calling method of Students class by child class instance
			 ((StudentLower) s).displayStudent();
		}
	}
}

public class LowerBoundWildCardTest {
	public static void main(String[] args) {

		// Create instance for CSE
		StudentLower s1 = new StudentLower();
		s1.setId(101);
		s1.setName("Mahadi");
		s1.setDept("CSE");
		StudentLower s2 = new StudentLower();
		s2.setId(102);
		s2.setName("Sekh");
		s2.setDept("CSE");
		// making a List of
		// CSE Students.
		List<StudentLower> cse_students = new ArrayList<StudentLower>();
		cse_students.add(s1);
		cse_students.add(s2);
		
		
		// Create instance for EE
		StudentLower s3 = new StudentLower();
		s3.setId(103);
		s3.setName("Shekh");
		s3.setDept("EE");
		StudentLower s4 = new StudentLower();
		s4.setId(104);
		s4.setName("Rupon");
		s4.setDept("EE");
		// making a List of
		// EE Students
		List<StudentLower> ee_students = new ArrayList<StudentLower>();
		ee_students.add(s3);
		ee_students.add(s4);

		DepartmentLower CSE = new DepartmentLower("CSE", cse_students);
		DepartmentLower EE = new DepartmentLower("EE", ee_students);

		DepartmentLower dpt=new DepartmentLower();
		List<DepartmentLower> departments = new ArrayList<DepartmentLower>();
		departments.add(CSE);
		departments.add(EE);

		// creating an instance of InstitueLower.
		InstitueLower institute = new InstitueLower("BITS", departments);
		InstitueLower ins = new InstitueLower();
		// calling Generics upper bound wild card method
		//ins.displayStudentDetails(cse_students);
		//ins.displayStudentDetails(ee_students);
		ins.displayStudentDetails(departments);
		System.out.print("Total students in institute: ");
		System.out.print(institute.getToalStudentsInInstitueLower());

	}

}
