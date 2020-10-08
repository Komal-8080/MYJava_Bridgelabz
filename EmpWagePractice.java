public class EmpWagePractice 
{
	public static final int full_time = 1;
	public static final int part_time = 2;
	public static final int Absent = 0;

	private final String company;
	private final int empWagePerHour;
	private final int empWorkingDaysInMonth;
	private final int maxHours;
	private int wagePerMonth;

	public EmpWagePractice(String company, int empWagePerHour, int empWorkingDaysInMonth, int maxHours)
	{
	this.company = company;
	this.empWagePerHour = empWagePerHour;
	this.empWorkingDaysInMonth = empWorkingDaysInMonth;
	this.maxHours = maxHours;
	}

	public void computeEmpWage()
	{
	int empHrs = 0, totalHours = 0, totalWorkingDays = 0;

	while (totalHours <= maxHours && totalWorkingDays < empWorkingDaysInMonth)
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
	wagePerMonth = totalHours * empWagePerHour ;
	}
	public String toString()
	{
	return "Total Emp Wage for company " +company+ " is "+wagePerMonth;
	}
	 public static void main(String[] args)
        {
                System.out.println(" !! WELCOME TO EMPLOYEE WAGE COMPUTATION !!");

		EmpWagePractice wipro = new EmpWagePractice("Wipro", 20, 20, 100);
		EmpWagePractice iifl = new EmpWagePractice("IIFL", 30, 25, 150);
                EmpWagePractice cnw = new EmpWagePractice("C&W", 25, 25, 100);

		wipro.computeEmpWage();
			System.out.println(wipro);
		iifl.computeEmpWage();
                        System.out.println(iifl);
		cnw.computeEmpWage();
                        System.out.println(cnw);
	}

}
