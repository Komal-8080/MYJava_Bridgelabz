public class EmpWagePractice 
{
	public static void main(String[] args)
	{
		System.out.println(" !! WELCOME TO EMPLOYEE WAGE COMPUTATION !!");

	final int full_time = 1;
	final int part_time = 2;
	final int Absent = 0;
	final int empWagePerHour = 20;
	final int empWorkingDaysInMonth = 20;
	int empHrs = 0;
	int empWage = 0;
	int wagePerMonth = 0;
	
	for (int day=0; day<empWorkingDaysInMonth; day++){
	 int attendence = (int)(Math.random() * 3);
                System.out.println("Attendence status : " +attendence);
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
	wagePerMonth += empWage;
		System.out.println("Employee Salary Per Day is : " + empWage);
	}
		System.out.println("Total Wages Per Month: " +wagePerMonth);
	}
}
