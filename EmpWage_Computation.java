   
public class EmpWage_Computation
{
	public static void main(String[] args)
	{
	int empcheck = (int)(Math.random() * 3);
			System.out.println("WELCOM TO EMPLOYEE WAGE COMPUTAION PROGRAM");
			System.out.println(empcheck);
	int fullTime = 1;
	int partTime = 2;
	int Absent = 0;
	int workingHours;
	int workingHoursPerMonth;
	int wagePerHour = 20;
	int Month = 20;
	int totalWorkingHours = 100;
		switch (empcheck) 
		{
		case 1:
		workingHours = 8;
		workingHoursPerMonth = Month * workingHours;
			System.out.println("Salary Per Day for Full Time is : " +(wagePerHour * workingHours));
			System.out.println("Salary Per Month for Full Time is : " +(Month*wagePerHour*workingHours));
		if (workingHoursPerMonth < totalWorkingHours) 
			{
                        System.out.println("Salary for 20 Days is"   +(Month*workingHoursPerMonth));
                        }
                else {
                        System.out.println("Salary for 100 Working Hours is"  +(totalWorkingHours*wagePerHour));
                        }

		break;
		case 2:
		workingHours = 4;
		workingHoursPerMonth = Month * workingHours;
			System.out.println("Salary Per Day for Part Time is : " +(wagePerHour * workingHours));
			System.out.println("Salary per Month for Part Time is : "+(Month*wagePerHour*workingHours));
		if (workingHoursPerMonth < totalWorkingHours) {
                        System.out.println("Salary for 20 Days is"  +(Month*workingHoursPerMonth));
                        }
                else {
                        System.out.println("Salary for 100 Working Hours is"  +(totalWorkingHours*wagePerHour));
                        }
		break;
		case 0:
		workingHours = 0;
		 workingHoursPerMonth = Month * workingHours;
			System.out.println("Employee Absent");
		break;
		}
	}
}

