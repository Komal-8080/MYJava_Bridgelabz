import java.util.Scanner;
public class PrimeNumbersUptoN
{
   public static void main (String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the value of n:");
      int n = scanner.nextInt();
      System.out.println("Prime Numbers are:");
	for (int i = 2; i <= n; i++)
      	{
         int count=0;
         for(int j = 1; j <= i; j++)
         {
	    if(i%j==0)
	    {
		count = count + 1;
	    }
	 }
	 if (count == 2)
	 {
	System.out.println(i+ " " );
	 }
      }
   }
}
