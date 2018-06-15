package gradebook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("STUDENT CLASS");
		System.out.println("Teacher name: Mr Goran Savovic");

		ArrayList<Student> students = new ArrayList<Student>();
			
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter the number of students");
			
			int numStudents = sc.nextInt();
			
			for (int i = 0; i < numStudents; i++) {

				int position = i + 1;

				System.out.println("Enter Student's No. " + position + " Name");
				String firstName = sc.next();
				System.out.println("Enter Student's Surname");
				String lastName = sc.next();
				System.out.println("Enter Students's Grade");
				double grade = sc.nextDouble();

				Student student = new Student(firstName, lastName, grade);
				students.add(student);
			}

			double totalGrade = 0.0;

			for (int i = 0; i < students.size(); i++) {
				Student student = students.get(i);
				double grade = student.getGrade();
				totalGrade += grade;
			}

			double averageGrade = totalGrade / students.size();
	
			for (int i = 0; i < students.size(); i++) {
				Student student = students.get(i);
				String firstName = student.getFirstName();
				String lastName = student.getLastName();
				double grade = student.getGrade();
	
				System.out.println("First student full name is " + firstName + " " + lastName + " and the grade is " + grade);
			}
			
			System.out.println("Total grade is : " + totalGrade);
			System.out.println("Average grade is: " + averageGrade);
		}
	}
}
