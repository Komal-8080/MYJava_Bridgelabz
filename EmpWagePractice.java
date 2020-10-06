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
	final int MaxHours = 100;
	int empHrs = 0;
	int totalHours = 0;
	int totalWorkingDays = 0;

	while (totalHours <= MaxHours && totalWorkingDays < empWorkingDaysInMonth)
	{
	totalWorkingDays++;
	int attendence = (int)(Math.random() * 3);
                System.out.println("Attendence status : " +attendence);
	switch (attendence)
	{
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
	totalHours += empHrs;
		System.out.println("Day: " + totalWorkingDays + " Employee Hours: " +empHrs);
	}
	int wagePerMonth = totalHours * empWagePerHour;
		System.out.println("Total Wages Per Month: " +wagePerMonth);
	}
}
