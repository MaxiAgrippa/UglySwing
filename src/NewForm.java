import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Maxi Agrippa
 */
public class NewForm
{
    public JPanel rootPanel;
    private JTextArea textArea1;
    private JButton button1;

    public NewForm ()
    {
        button1.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked (MouseEvent e)
            {
                super.mouseClicked(e);
                textArea1.setText("Button1 Mouse Clicked");
            }
        });
    }
}
