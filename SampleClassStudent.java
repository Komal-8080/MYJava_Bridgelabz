class student
{
	String name;
	int standard;
	int rollNo;
	double percentage;

public student(String name, int standard, int rollNo, double percentage)
	{
	this.name = name;
	this.standard = standard;
	this.rollNo = rollNo;
	this.percentage = percentage;
	}
public void studentDetails()
		{
		System.out.println("Student Name : " +name);
		System.out.println("Standard :" +standard);
		System.out.println("Student RollNo : "+rollNo);
		System.out.println("Student Percentage : "+percentage);
		System.out.println();
		}
}
public class SampleClassStudent
{
	public static void main(String[] args)
	{
	student student1 = new student("Sony", 2, 201, 84.5);
	student student2 = new student("Lucky", 9, 917, 75.8);
	student student3 = new student("Gayu", 7, 706, 84.4);
		student1.studentDetails();
		student2.studentDetails();
		student3.studentDetails();
	}
}
