package gradebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

// CRUD application

// Menu:
// Add a student
// Edit a student
// Delete a student
// Find a student (by index / name)
// View all students (listing of all students and grades)
// View summary (statistics)
// Save & Exit (saving into file --- csv / tab --- or database)
// Quit without saving


public class Main {

	public static void main(String[] args) {

		System.out.println("STUDENT CLASS");
		System.out.println("Teacher name: Mr Goran Savovic");

		ArrayList<Student> students = new ArrayList<Student>();

		try (Scanner sc = new Scanner(System.in)) {
			
			while(true) {
				boolean continueExecution = executeMenuOption(sc, students);	
				
				if(!continueExecution) {
					break;
				}
			}
		}
	}
	
	private static boolean executeMenuOption(Scanner sc, ArrayList<Student> students) {
		
		boolean continueExecution = true;
		
		System.out.println("Please select a menu option: ");
		System.out.println("1. Add a student");
		System.out.println("2. Edit a student");
		System.out.println("3. Delete a student");
		System.out.println("4. Find a student");
		System.out.println("5. View all students");
		System.out.println("6. View summary");
		System.out.println("7. Save and Exit");
		System.out.println("8. Quit without saving");
		
		int menuOption = sc.nextInt();

		switch (menuOption) {
		case 1:
			addStudent(sc, students);
			break;
		case 2:
			editStudent(sc, students);
			break;
		case 3:
			deleteStudent();
			break;
		case 4:
			findStudent();
			break;
		case 5:
			viewAllStudents(students);
			break;
		case 6:
			viewSummary(students);
			break;
		case 7:
			saveAndExit();
			continueExecution = false;
			break;
		case 8:
			quitWithoutSaving();
			continueExecution = false;
			break;
		default:
			System.out.println("Invalid option");
		}

		return continueExecution;
	}

	private static void addStudent(Scanner sc, ArrayList<Student> students) {
		
		System.out.println("Enter Student's Number");
		String studentNumber = sc.next();
		System.out.println("Enter Student's First Name");
		String firstName = sc.next();
		System.out.println("Enter Student's Surname");
		String lastName = sc.next();
		System.out.println("Enter Students's Grade");
		double grade = sc.nextDouble();

		Student student = new Student(studentNumber, firstName, lastName, grade);
		students.add(student);

	}

	private static void editStudent(Scanner sc, ArrayList<Student> students) {
		
		System.out.println("Enter Student's Number");
		String studentNumber = sc.next();
		
		Optional<Student> optional = students.stream()
                .filter(x -> x.getStudentNumber().equals(studentNumber))
                .findFirst();
		
		if(optional.isPresent()) {
			Student student = optional.get();
		
			System.out.println("Enter updated Student's First Name");
			String firstName = sc.next();
			System.out.println("Enter updated Student's Surname");
			String lastName = sc.next();
			System.out.println("Enter updated Students's Grade");
			double grade = sc.nextDouble();
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setGrade(grade);
		
		}
	}

	private static void deleteStudent() {
		// TODO Auto-generated method stub

	}

	private static void findStudent() {
		// TODO Auto-generated method stub

	}

	private static void viewAllStudents(ArrayList<Student> students) {
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			String firstName = student.getFirstName();
			String lastName = student.getLastName();
			double grade = student.getGrade();

			System.out.println("Student full name is " + firstName +
					" " + lastName + " and the grade is " + grade);
		}

	}

	private static void viewSummary(ArrayList<Student> students) {
		
		double totalGrade = 0.0;

		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			double grade = student.getGrade();
			totalGrade += grade;
		}

		double averageGrade = totalGrade / students.size();



		System.out.println("Total grade is : " + totalGrade);
		System.out.println("Average grade is: " + averageGrade);

	}

	private static void saveAndExit() {
		// TODO Auto-generated method stub

	}

	private static void quitWithoutSaving() {
		System.out.println("END");

	}

}
