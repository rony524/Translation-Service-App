import javax.swing.*;
import java.awt.*;

public class MDashboard extends JFrame{
    
    public MDashboard() {
       
        //FRAME SETTINGS

        setTitle("Login Page");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(232,244,240));
    }
}