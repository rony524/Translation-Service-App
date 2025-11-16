import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class Login extends JFrame{

    public Login() {
   

//         //FRAME SETTINGS

        setTitle("Login Page");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);        
        getContentPane().setBackground(new Color(232,244,240));
        setVisible(true);


//         //MAIN PANEL
       JPanel mainPanel = new JPanel(new GridBagLayout());
       mainPanel.setBackground(getBackground());    
       add(mainPanel);   
        
        

        JPanel loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setBorder(
                BorderFactory.createCompoundBorder(
                        new EmptyBorder(25,25,25,25),
                        BorderFactory.createTitledBorder(
                                BorderFactory.createLineBorder(new Color(150,150,200),1),
                                "User Login",
                                TitledBorder.CENTER,
                                TitledBorder.TOP,
                                new Font("Arial", Font.BOLD,16),
                                new Color(50,50,100)
                                )
                )
        );
        loginPanel.setBackground(Color.WHITE);
//         //Username

        JLabel usernameLabel = new JLabel("Username: ");
        JTextField usernameTextField = new JTextField(15);
        
        

//         //Password

        JLabel passwordLabel = new JLabel("Password: ");
        JPasswordField passwordTextField = new JPasswordField(15);
        
        
        


//         // forgot Password
        
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(8, 5, 8, 5);

            // Add components with responsive layout logic
            JLabel header = new JLabel(" LOGIN");            
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridwidth = 2;
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            loginPanel.add(header, gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.gridwidth = 1;
            gbc.anchor = GridBagConstraints.EAST;
            gbc.fill = GridBagConstraints.NONE;
            gbc.weightx = 0.0;
            loginPanel.add(usernameLabel, gbc);

            gbc.gridx = 1;
            gbc.gridy = 1;
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            loginPanel.add(usernameTextField,gbc);

            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.weightx =0.0;
            gbc.fill = GridBagConstraints.NONE;
            loginPanel.add(passwordLabel, gbc);

            gbc.gridx = 1;
            gbc.gridy = 2;
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            loginPanel.add(passwordTextField,gbc);
            mainPanel.add(loginPanel);

            JLabel computerLabel = new JLabel("Computer");
            String[] options = {"Computer 1", "Computer 2", "Computer 3"};
            JComboBox<String> selection = new JComboBox<>(options);
            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.weightx = 0.0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            loginPanel.add(computerLabel,gbc);
            

            gbc.gridx = 1;
            gbc.gridy = 3;
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.NONE;
            gbc.anchor = GridBagConstraints.EAST;
            loginPanel.add(selection,gbc);
            

//         //BUTTON PANEL
        JButton loginButton =new JButton("Login");
        loginButton.setBackground(new Color(75,100,200));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        gbc.gridx=0;
        gbc.gridy=4;
        gbc.gridwidth =2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
        loginPanel.add(loginButton,gbc);       
    

     

    
    }

    
}