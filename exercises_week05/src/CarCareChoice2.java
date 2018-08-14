import javax.swing.*;

public class CarCareChoice2
{
    public static void main(String args[])
    {
        String prompt = "Welcome to Cody's Car Care Shop! \nChoose your service:" +
                "\n1 - Oil change \n2 - Tire rotation \n3 - Battery check \n4 - Brake inspection";

        String entry = JOptionPane.showInputDialog(null, prompt);

        while (!(entry.equals("1")) && !(entry.equals("2")) && !(entry.equals("3"))
                && !(entry.equals("4"))) {
            entry = JOptionPane.showInputDialog(null, prompt);
        }

        int num = Integer.parseInt(entry);

        if (num == 1)
            JOptionPane.showMessageDialog(null, "Its $25 for oil change");

        else if (num == 2)
            JOptionPane.showMessageDialog(null, "Its $22 for tire rotation");

        else if (num == 3)
            JOptionPane.showMessageDialog(null, "Its $15 for battery check");

        else
            JOptionPane.showMessageDialog(null, "Its $5 for brake inspection");

    }
}
