

public class ArrayofGCD
{
	public static int gcd(int val_a,int val_b)
	{
      	int result = 0;
      	while (val_b > 0)
	{
        int temp = val_b;
        val_b = val_a % val_b;
         val_a = temp;
      	result = val_a;
      	}
      	return result;
	}
   	public static void main(String arg[])
	{
      	int[] array = {4, 6, 8, 10, 16};
      	int resultofGCD = gcd(array[0],array[1]);
      for(int i = 2; i < array.length; i++)
	{
        resultofGCD = gcd(resultofGCD, array[i]);
        }
      System.out.println("GCD of given numbers is: "+resultofGCD);
   }
}
