public class ArrayMethodDemo
{
    public static int sum = 0;

    public static void display(int[] num10)
    {
        System.out.println("All the integers");
        for (int i = 0; i < num10.length; i++)
        {
            System.out.print(num10[i] + " ");
        }
        System.out.println();
    }

    public static void displayReverse(int[] num10)
    {
        System.out.println("All integers in reverse order:");
        for (int i = num10.length - 1; i>=0; i--)
        {
            System.out.print(num10[i] + " ");
        }
        System.out.println();
    }

    public static void displaySum(int[] num10)
    {
        for (int i = 0; i < num10.length; i++)
        {
            sum += num10[i];
        }
        System.out.println("The sum of the integers = " + sum);
    }

    public static void displayLess(int[] num10)
    {
        int limitingArgument = 5;
        System.out.println("Integers less than limiting argument 5: ");
        for (int i = 0; i < num10.length; i++)
        {
            if (num10[i] < limitingArgument)
                System.out.print(num10[i] + " ");
        }
        System.out.println();
    }

    public static void displayHigherAve(int[] num10)
    {
        int length = num10.length;
        int average = sum/length;

        System.out.println("Integers higher than the average " + average);
        for (int i = 0; i < length; i++)
        {
            if (num10[i] > average)
                System.out.print(num10[i] + " ");
        }
        System.out.println();
    }


    public static void main(String args[])
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        display(array);
        displayReverse(array);
        displaySum(array);
        displayLess(array);
        displayHigherAve(array);
    }
}
