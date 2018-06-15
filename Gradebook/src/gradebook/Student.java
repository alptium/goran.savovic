package gradebook;

public class Student {
	private String firstName;
	private String lastName;
	private double grade;
	
	public Student(String firstName, String lastName, double grade) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setGrade(grade);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
}
