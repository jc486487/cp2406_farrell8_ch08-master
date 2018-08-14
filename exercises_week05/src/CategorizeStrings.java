import java.util.Scanner;

public class CategorizeStrings
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings, or STOP  to terminate");
        String sent = sc.nextLine();

        int x = 0, y = 0, z = 0;
        String[] sentences = new String[10];
        String[] list1 = new String[10];
        String[] list2 = new String[10];

        while (!sent.equals("STOP") && (sentences.length == 10))
        {
            sentences[x++] = sent;
            if (sent.length() <= 10)
                list1[y++] = sent;

            else
                list2[z++] = sent;

            System.out.println("Enter strings, or STOP  to terminate");
            sent = sc.nextLine();
        }

        System.out.println("Which list should be displayed? \n1- short \n2- long");
        int num = sc.nextInt();
        while ((num != 1) && (num != 2))
        {
            System.out.println("Which list should be displayed? \n1- short \n2- long");
            num = sc.nextInt();
        }

        if(num == 1)
        {
            System.out.println("The shorter strings are: ");
            for (int i = 0; i < y; i++)
            {
                System.out.println(list1[i]);
            }
        }

        else
        {
            System.out.println("The longer strings are: ");
            for (int i = 0; i < z; i++)
            {
                System.out.println(list2[i]);
            }
        }


    }
}
