import java.util.Scanner;

public class FrequencyOfDigit
{    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number :");

        int inputNumber = num.nextInt();
        int[] digitCount = new int[10];
        while (inputNumber != 0)
        {
            int lastDigit = inputNumber % 10;
            digitCount[lastDigit]++;
            inputNumber = inputNumber / 10;
        }
        System.out.println("===================");

        System.out.println("Digits : Frequency");
      System.out.println("===================");

        for (int i = 0; i < digitCount.length; i++)
        {
            if(digitCount[i] != 0)
            {
                System.out.println("   "+i+"   :   "+digitCount[i]);
            }
        }
        }
}
