public class EmpWagePractice 
{
	public static final int full_time = 1;
	public static final int part_time = 2;
	public static final int Absent = 0;
	public static final int empWagePerHour = 20;
	public static final int empWorkingDaysInMonth = 20;
	public static final int MaxHours = 100;

	public static int computeEmpWage()
	{
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
	return wagePerMonth;
	}
	 public static void main(String[] args)
        {
                System.out.println(" !! WELCOME TO EMPLOYEE WAGE COMPUTATION !!");
		computeEmpWage();
	}

}
