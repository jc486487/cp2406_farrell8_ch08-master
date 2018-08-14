public class TwelveInts
{
    public static void main(String args[])
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        System.out.println("In original order: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

        System.out.println("In reverse order: ");
        for (int i = array.length - 1; i >=0; i--)
            System.out.println(array[i]);
    }
}
