public class EmpWagePractice 
{
	public static void main(String[] args)
	{
		System.out.println(" !! WELCOME TO EMPLOYEE WAGE COMPUTATION !!");
	int attendence = (int)(Math.random() * 2);
		System.out.println("Attendence status : " +attendence);
	int full_time = 1;
	int Absent = 0;
	int empWagePerHour = 20;
	int empHrs = 0;
	int empWage = 0;

	if (attendence == full_time) {
		System.out.println("Employee Present");
	empHrs = 8;
	}
	else {
		System.out.println("Employee Absent");
	empHrs = 0;
	}
	empWage = empHrs * empWagePerHour;
		System.out.println("Employee Salary Per Day is : " + empWage);
	}
}
