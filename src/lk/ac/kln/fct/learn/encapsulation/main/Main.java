package lk.ac.kln.fct.learn.encapsulation.main;

import lk.ac.kln.fct.learn.encapsulation.control.StudentController;
import lk.ac.kln.fct.learn.encapsulation.core.Student;

public class Main {
	private static StudentController controller = new StudentController();
	
	public static void main(String[] args) {
		controller.addNewStudent(new Student("100","Adam","CS"));
		controller.addNewStudent(new Student("101","Jack","ASE"));	
		controller.addNewStudent(new Student("102","Finn","ICT"));
		
		modifyStudents();
		test();
	}
	
	public static void modifyStudents() {
		StudentController newController = controller.clone();
		newController.students.get("100").setDegree("ICT");
		newController.students.get("102").setName("Peter");
	}
	
	public static void test() {
		StudentController newController = controller.clone();
		if(newController.students.get("100").getDegree().equals("CS")) {
			System.out.println("Test 1 Passed");
		} else {
			System.out.println("Test 1 Failed");
		}
		if(newController.students.get("102").getName().equals("Finn")) {
			System.out.println("Test 2 Passed");
		} else {
			System.out.println("Test 2 Failed");
		}
	}
}
