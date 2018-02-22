package gradebook;

public class Main {

	public static void main(String[] args) {
		String studentsName1 = "Pera";
		String studentsLastname1 = "Peric";
		int grade1 = 8;
		
		String studentsName2 = "Mika";
		String studentsLastname2 = "Mikic";
		int grade2 = 9;
		
		String studentsName3 = "Laza";
		String studentsLastname3 = "Lazic";
		int grade3 = 8;
		
		String studentsName4 = "Joka";
		String studentsLastname = "Jokic";
		int grade4 = 7;
		
		String studentsName5 = "Ana";
		String studentsLastname5 = "Anic";
		int grade5 = 9;
		
		int gradeSum = grade1 + grade2 + grade3 + grade4 + grade5;
		System.out.println("The sum of the students' grades is "+gradeSum);
	}

}
