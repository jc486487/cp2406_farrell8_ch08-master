public class DemoSalesperson
{
    int idNumber;
    double salesAmt;

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
        this.idNumber = idNumber;
    }

    public void setSalesAmt (double salesAmt)
    {
        this.salesAmt = salesAmt;
    }
}
