import java.util.Scanner;

public class DistanceFromAverage
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double number within 20 \nor \n99999 to quit");
        int num = sc.nextInt();
        int[] array = new int[20];
        int x = 0;
        int STOP = 99999;

        while(num != STOP && num>=10)
        {
            array[x++] = num;
            System.out.println("Enter another double number within 20 \nor \n99999 to quit");
            num = sc.nextInt();
        }

        System.out.println("End of tries to enter a number.");
        int sum = 0;
        for (int i = 0; i < x; i++)
        {
            sum += array[i];
        }
        int average = sum/x;

        for (int i = 0; i < x; i++)
        {
            if (average>array[i])
                System.out.println(array[i] + " is " + (average-array[i]) + " steps close to the average" + average);
            else
                System.out.println(array[i] + " is " + (array[i] - average) + " steps close to the average" + average);
        }
    }
}
