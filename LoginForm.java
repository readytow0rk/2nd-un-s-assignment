import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginForm() {
        setTitle("TBRMS Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        JButton loginButton = new JButton("Login");
        add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = usernameField.getText();
                String pass = String.valueOf(passwordField.getPassword());

                if (validateLogin(user, pass)) {
                    JOptionPane.showMessageDialog(null, "Login Success!");
                    dispose(); // close login
                    new OrderMenu(); // open next window
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed!");
                }
            }
        });

        setVisible(true);
    }

    private boolean validateLogin(String user, String pass) {
        return user.equals("admin") && pass.equals("1234"); // hardcoded test
    }
}