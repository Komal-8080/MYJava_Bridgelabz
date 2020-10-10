
public class DiceExample
{
	public static void main(String args[])
	{
	int[] array = new int [10];
	for ( int i=1; i<=array.length; i++)
	{
	int dice = (int)(Math.random() * 6);
	dice += 1;
	System.out.println("Your number is" +dice);
	}
	}
}
