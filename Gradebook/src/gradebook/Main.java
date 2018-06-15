package gradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("STUDENT CLASS");
		System.out.println("Teacher name: Mr Goran Savovic");

		Student students[] = new Student[5];

		try (Scanner sc = new Scanner(System.in)) {

			for (int i = 0; i < students.length; i++) {

				int position = i + 1;

				System.out.println("Enter Student's No. " + position + " Name");
				String firstName = sc.next();
				System.out.println("Enter Student's Surname");
				String lastName = sc.next();
				System.out.println("Enter Students's Grade");
				double grade = sc.nextDouble();

				students[i] = new Student(firstName, lastName, grade);
			}

			double totalGrade = 0.0;

			for (int i = 0; i < students.length; i++) {
				Student student = students[i];
				double grade = student.getGrade();
				totalGrade += grade;
			}

			double averageGrade = totalGrade / 5;
	
			for (int i = 0; i < students.length; i++) {
				Student student = students[i];
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
