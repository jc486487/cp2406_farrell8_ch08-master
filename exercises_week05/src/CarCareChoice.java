import javax.swing.*;

public class CarCareChoice
{
    public static void main(String args[])
    {
        String prompt = "Welcome to Cody's Car Care Shop! \nChoose your service:" +
                "\nOil change \nTire rotation \nBattery check \nBrake inspection";

        String entry = JOptionPane.showInputDialog(null, prompt);

        while (!(entry.equals("Oil change")) && !(entry.equals("Tire rotation")) && !(entry.equals("Battery rotation"))
                && !(entry.equals("Brake inspection"))) {
            entry = JOptionPane.showInputDialog(null, prompt);
        }


        if (entry.equals("Oil change"))
            JOptionPane.showMessageDialog(null, "Its $25 for oil change");

        else if (entry.equals("Tire rotation"))
            JOptionPane.showMessageDialog(null, "Its $22 for tire rotation");

        else if (entry.equals("Battery check"))
            JOptionPane.showMessageDialog(null, "Its $15 for battery check");

        else
            JOptionPane.showMessageDialog(null, "Its $5 for brake inspection");

    }
}
