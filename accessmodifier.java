package oops;

class Student{
	public String name = "Raj";
	private int age = 20;
	protected String grade = "A";
	String school = "ABC School";
	
	
	public void displayInfo() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Grade:"+grade);
		System.out.println("School:"+school);

	}
}
public class accessmodifier {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.displayInfo();
		System.out.println("Public Name:"+s1.name);
		System.out.println("Default School:" +s1.school);
		//System.out.println("Private age: "+ student.age);
		//System.out.println("Protected Grade");



	}

}
