import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Client extends JFrame{
    public Client() {
       
        //FRAME SETTINGS

        setTitle("Login Page");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(232,244,240));

        //MAIN PANEL
        JPanel mainPanel = new JPanel( new GridBagLayout());
        mainPanel.setBackground(getBackground());
        add(mainPanel);
    }
}