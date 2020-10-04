
public class EmpWage_Computation{
	public static void main(String[] args){
	//int Present = 1; this is to check for attendence only
	double empcheck = Math.floor(Math.random()*3);
			System.out.println("WELCOM TO EMPLOYEE WAGE COMPUTAION PROGRAM");
			System.out.println(empcheck);
	int fullTime = 1;
	int Absent = 0;
	int wagePerHour = 20;
        int fullDayHours = 8;
	int salaryPerDayFT = (20 * 8 );
		if (empcheck == fullTime)
				//System.out.println("Employee Present");
				System.out.println("Salary Per Day for Full Time is : "+salaryPerDayFT);
		else
			System.out.println("Employee Absent");
	}
}
