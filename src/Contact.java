import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Contact extends JFrame{
    public Contact() {
       
        //FRAME SETTINGS

        setTitle("Login Page");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(232,244,240));

        //MAIN PANEL
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(new TitledBorder(new EtchedBorder(), "Login"));
        mainPanel.setBackground(new Color(232,244,248));
        mainPanel.setLayout(new BorderLayout(10,10));
        mainPanel.setVisible(true);
        add(mainPanel);
    }
}