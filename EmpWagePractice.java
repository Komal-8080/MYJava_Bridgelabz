public class EmpWagePractice 
{
	public static void main(String[] args)
	{
		System.out.println(" !! WELCOME TO EMPLOYEE WAGE COMPUTATION !!");
	int attendence = (int)(Math.random() * 2);
		System.out.println("Attendence status : " +attendence);
	int full_time = 1;
	int Absent = 0;

	if (attendence == full_time) {
		System.out.println("Employee Present");
	}
	else {
		System.out.println("Employee Absent");
	}
	}
}
