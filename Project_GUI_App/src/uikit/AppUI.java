package uikit;

import javax.swing.*;   //Import for GUI
import java.awt.*;      //Import for Container to hold GUI components

public class AppUI extends JFrame {

    //Creating components
    private JLabel lblUsername, lblPassword;
    private JButton btnLogin, btnReset;
    private JTextField txtUsername, txtPassword;
    
    //Constructor for UI
    public AppUI() {

        //Completing the creation of components
        lblUsername = new JLabel("Username");
        lblPassword = new JLabel("Password");

        btnLogin = new JButton("Login");
        btnReset = new JButton("Reset");

        txtUsername = new JTextField(10);
        txtPassword = new JPasswordField(10);

        Container mainScreen = this.getContentPane();

        //Setting the layout to FlowLayout
        mainScreen.setLayout(new GridLayout(3, 2));         //If didn't the default will be CardLayout().

        mainScreen.add(lblUsername);
        mainScreen.add(txtUsername);
        mainScreen.add(lblPassword);
        mainScreen.add(txtPassword);
        mainScreen.add(btnLogin);
        mainScreen.add(btnReset);

        setSize(400,130);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);              //Stop the program when clicking the close button(If not it will not be stopped even if the window get closed)

    }
    
    public static void main(String[] args) {
        AppUI appUi = new AppUI();
    }
    
}
