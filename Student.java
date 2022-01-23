package week1.day1;

public class Student {
	int number = 01;
	String StudentName="Ajay";

	public String College() {
	String Group = "Science";
	return Group;
	}
	public void printName() {
	System.out.println("Student profile");
	}

public static void main(String[] args) {
	
	Student Object = new Student();
		Object.printName();
		int num =  Object.number;
		System.out.println(num);
		String StudentName = Object.StudentName;
		System.out.println(StudentName);
		String Group= Object.College();	
		System.out.println(Group);
}

}
