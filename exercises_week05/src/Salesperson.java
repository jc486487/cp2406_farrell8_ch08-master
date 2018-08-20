public class Salesperson
{
    public static void main(String args[])
    {
        DemoSalesperson sales[] = new DemoSalesperson[10];
        int id = 111;
        int amt = 25000;
        for (int i = 0; i < 10; i++)
        {
            sales[i] = new DemoSalesperson(111, 25000);
            sales[i].setIdNumber(id++);
            sales[i].setSalesAmt(amt);
            amt += 5000;
        }

        for (int j = 0; j < 10; j++)
        {
            System.out.println("Salesperson " + (j + 1) + "- ID number: " + sales[j].getIdNumber() + ", Annual Sales Amount: "
                        + sales[j].getSalesAmt());
        }
    }
}
