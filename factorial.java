import java.util.Scanner;

public class factorial
{
	public static int factorial( int n )
	{
	if (n == 0)
	return 1;
	else
	return (n * factorial(n-1));
	}
	public static void main(String args[])
	{
	int fact = 1;
	Scanner num = new Scanner(System.in);
		System.out.println("Enter Your Number");
	int number = num.nextInt();
	fact = factorial(number);
	System.out.println("Factorial of " +number+ " is " +fact);
	}
}
