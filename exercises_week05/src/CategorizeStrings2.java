import java.util.Scanner;

public class CategorizeStrings2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings, or STOP  to terminate");
        String sent = sc.nextLine();

        int x = 0, y = 0, z = 0, s =0;
        String[] sentences = new String[10];
        String[] list1 = new String[10];
        String[] list2 = new String[10];
        String[] list3 = new String[10];

        while (!sent.equals("STOP") && (x != 10))
        {
            sentences[x++] = sent;
            int whiteSpace = 0;
            for (int i = 0; i < sent.length(); i++)
            {
                if (Character.isWhitespace(sent.charAt(i)))
                    whiteSpace++;
            }

            if (whiteSpace == 1)
                list1[y++] = sent;

            else if (whiteSpace > 1)
                list2[z++] = sent;

            else
                list3[s++] = sent;


            System.out.println("Enter strings, or STOP  to terminate");
            sent = sc.nextLine();
        }

        System.out.println("Which list should be displayed? \n1- 1 whitespace" +
                " \n2- More than 1 whitespace \n3 - No whitespace");
        int num = sc.nextInt();

        if(num == 1)
        {
            System.out.println("The strings with 1 whitespace are: ");
            for (int i = 0; i < y; i++)
            {
                System.out.println(list1[i]);
            }
        }

        else if (num == 2)
        {
            System.out.println("The strings with more than 1 whitespace are: ");
            for (int i = 0; i < z; i++)
            {
                System.out.println(list2[i]);
            }
        }

        else if (num ==3)
        {
            System.out.println("The strings with 0 whitespace are: ");
            for (int i = 0; i < s; i++)
            {
                System.out.println(list3[i]);
            }
        }

        else
        {
            System.out.println("All strings are: ");
            for (int i = 0; i < x; i++)
            {
                System.out.println(sentences[i]);
            }
        }

    }
}
