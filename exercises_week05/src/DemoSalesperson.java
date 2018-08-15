public class DemoSalesperson
{
    int idNumber;
    double salesAmt;
    Object[][] salesperson = new Double[2][10];

    public DemoSalesperson(int idNumber, double salesAmt)
    {
        this.idNumber = idNumber;
        this.salesAmt = salesAmt;
    }

    public int getIdNumber()
    {
        return idNumber;
    }

    public double getSalesAmt ()
    {
        return salesAmt;
    }

    public void setIdNumber(int idNumber)
    {
        salesperson[0] = new Integer[]{9999};
    }

    public void setSalesAmt (double salesAmt)
    {
        salesperson[1] = new Double[]{0.0};
    }
}
