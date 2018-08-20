public class Salesperson2
{
    public static void main(String args[])
    {
        int idNumber = 111;
        double salesAmt = 25000.0;
        DemoSalesperson ds = new DemoSalesperson(idNumber, salesAmt);

        int x = 1;

        for (int i = 0; i < 1; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.println("Salesperson " + x + "- ID number: " + ds.getIdNumber() + ", Annual Sales Amount: $ "
                        + ds.getSalesAmt());
                x++;
            }
        }
    }
}
