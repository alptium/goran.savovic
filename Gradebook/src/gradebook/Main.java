package gradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("STUDENT CLASS");
		System.out.println("Teacher name: Mr Goran Savovic");
	
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter Student's No.1 Name");
			String student1name = sc.next();
			System.out.println("Enter Student's Surname");
			String student1surname = sc.next();
			System.out.println("Enter Students's Grade");
			double grade1 = sc.nextDouble();
			
			System.out.println("Enter Student's No.2 Name");
			String student2name = sc.next();
			System.out.println("Enter Student's Surname");
			String student2surname = sc.next();
			System.out.println("Enter Student's Grade");
			double grade2 = sc.nextDouble();
			
			System.out.println("Enter Student's No.3 Name");
			String student3name = sc.next();
			System.out.println("Enter Student's Surname");
			String student3surname = sc.next();
			System.out.println("Enter Student's Grade");
			double grade3 = sc.nextDouble();
			
			System.out.println("Enter Student's No.4 Name");
			String student4name = sc.next();
			System.out.println("Enter Student's Surname");
			String student4surname = sc.next();
			System.out.println("Enter Student's Grade");
			double grade4 = sc.nextDouble();
			
			System.out.println("Enter Student's No.5 Name");
			String student5name = sc.next();
			System.out.println("Enter Student's Surname");
			String student5surname = sc.next();
			System.out.println("Enter Student's Grade");
			double grade5 = sc.nextDouble();
		
			double totalGrade = (grade1 + grade2 + grade3 + grade4 + grade5) / 5 ;
			System.out.println("Total grade is :" + totalGrade);
	}
	}
}
