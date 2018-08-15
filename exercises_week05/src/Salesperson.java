public class Salesperson
{
    public static void main(String args[])
    {
        DemoSalesperson ds = new DemoSalesperson(9999, 0.0);

        int x = 1;

        for (int i = 0; i < 1; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.println("Salesperson " + x + "- ID number: " + ds.getIdNumber() + ", Annual Sales Amount: "
                + ds.getSalesAmt());
                x++;
            }
        }
    }
}
