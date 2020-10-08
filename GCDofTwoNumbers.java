import java.util.Scanner;

public class GCDofTwoNumbers
{
	public static void main(String[] args)
	{
	Scanner num = new Scanner(System.in);
		System.out.println("Enter First Number");
	int firstNumber = num.nextInt();
		System.out.println("Enter Second Number");
	int secondNumber = num.nextInt();
	int gcdofNumber = 1;

	for(int i=1; i<=firstNumber && i<=secondNumber; ++i)
	{
	if( firstNumber % i == 0 && secondNumber %i == 0 )
	gcdofNumber = i;
	}
	System.out.println("G.C.D of " + firstNumber + " and " + secondNumber + " is " + gcdofNumber);
	}
}
