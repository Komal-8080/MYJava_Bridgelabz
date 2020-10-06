public class EmpWagePractice 
{
	public static void main(String[] args)
	{
		System.out.println(" !! WELCOME TO EMPLOYEE WAGE COMPUTATION !!");
	int attendence = (int)(Math.random() * 3);
		System.out.println("Attendence status : " +attendence);
	final int full_time = 1;
	final int part_time = 2;
	final int Absent = 0;
	final int empWagePerHour = 20;
	int empHrs = 0;
	int empWage = 0;

switch (attendence){
	case full_time:
		System.out.println("Employee Present");
		empHrs = 8;
		break;
	case part_time:
		System.out.println("Employee Present");
		empHrs = 4;
		break;
	default:
		System.out.println("Employee Absent");
		empHrs = 0;
	}
	empWage = empHrs * empWagePerHour;
		System.out.println("Employee Salary Per Day is : " + empWage);
	}
}
