import javax.swing.*;

/**
 * @author Maxi Agrippa
 */
public class Main
{
    public static void main (String[] args)
    {
        JFrame jFrame = new JFrame("NewForm");
        jFrame.setContentPane(new NewForm().rootPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
