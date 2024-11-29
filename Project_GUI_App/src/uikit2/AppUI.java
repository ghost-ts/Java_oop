package uikit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppUI extends JFrame implements ActionListener{

    private JLabel lblNumber1, lblNumber2, lblTotal;
    private JTextField txtNumber1, txtNumber2, txtTotal;
    private JButton btnAdd, btnReset;

    public AppUI() {

        lblNumber1 = new JLabel("Number 1");
        lblNumber2 = new JLabel("Number 2");
        lblTotal = new JLabel("Total");

        txtNumber1 = new JTextField(10);
        txtNumber2 = new JTextField(10);
        txtTotal = new JTextField(20);

        btnAdd = new JButton("Add");
        btnReset = new JButton("Reset");

        Container mainScreen = this.getContentPane();

        mainScreen.setLayout(new GridLayout(4, 2));

        mainScreen.add(lblNumber1);
        mainScreen.add(txtNumber1);
        mainScreen.add(lblNumber2);
        mainScreen.add(txtNumber2);
        mainScreen.add(lblTotal);
        mainScreen.add(txtTotal);
        mainScreen.add(btnAdd);
        mainScreen.add(btnReset);

        btnAdd.addActionListener(this);
        btnReset.addActionListener(this);

        setSize(400,130);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        AppUI appUi = new AppUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btnAdd) {
            //JOptionPane.showMessageDialog(rootPane, "Add Button Pressed.");
            //txtTotal.setText(""+total);
            //txtTotal.setText(Double.toString(total));
            txtTotal.setText(Double.toString(Double.parseDouble(txtNumber1.getText())+Double.parseDouble(txtNumber2.getText())));
        }
        if(e.getSource()==btnReset) {
            //JOptionPane.showMessageDialog(rootPane, "Reset Button Pressed.");
            txtNumber1.setText("");
            txtNumber2.setText("");
            txtTotal.setText("");
        }

    }
    
}
