package uikit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppUI extends JFrame implements ActionListener{

    private JLabel lblCatogary, lblDistance, lblBillAmount;
    // private JTextField txtCatogary;
    private JComboBox<String> cbVehicleCategory;
    private JTextField txtDistance, txtBillAmount;
    private JButton btnSubmit, btnReset;
    

    public AppUI() {

        lblCatogary = new JLabel("Enter Catagory: ");
        lblDistance = new JLabel("Enter Distance (KM): ");
        lblBillAmount = new JLabel("Bill Amount: ");


        cbVehicleCategory = new JComboBox<>(new String[]{"", "Light", "Heavy"});
        //txtCatogary = new JTextField(10);
        txtDistance = new JTextField(3);
        txtBillAmount = new JTextField(10);
        txtBillAmount.setEditable(false);

        btnReset = new JButton("Reset");
        btnSubmit = new JButton("Submit");

        Container mainScreen = this.getContentPane();

        mainScreen.setLayout(new GridLayout(4,2));

        mainScreen.add(lblCatogary);
        // mainScreen.add(txtCatogary);
        mainScreen.add(cbVehicleCategory);
        mainScreen.add(lblDistance);
        mainScreen.add(txtDistance);
        mainScreen.add(btnSubmit);
        mainScreen.add(btnReset);
        mainScreen.add(lblBillAmount);
        mainScreen.add(txtBillAmount);

        btnSubmit.addActionListener(this);
        btnReset.addActionListener(this);

        setSize(400,130);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void setDetails() {

        try {

            String catogary = cbVehicleCategory.getSelectedItem().toString();
            double distanceTraveled = Double.parseDouble(txtDistance.getText());

            if(catogary.trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Catogary cannot be empty");
            }

            if(distanceTraveled<0) {
                JOptionPane.showMessageDialog(rootPane, "Distance cannot be negative");
            }

            if(catogary.trim().toLowerCase().equals("light")) {
                calculateLightRental(distanceTraveled);
            }
            else if (catogary.trim().toLowerCase().equals("heavy")) {
                calculateHeavyRental(distanceTraveled);
            }
            // else {
            //     JOptionPane.showMessageDialog(rootPane, "Invalid Catogary");
            // }

        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Distance");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Unnexpected Error");
        }
    }

    public void calculateLightRental(double distanceTraveled) {
        if(distanceTraveled>50) {
            txtBillAmount.setText(""+(5000+400+((distanceTraveled-50)*150)));
        }
        else {
            txtBillAmount.setText(""+(5000+400));
        }
    }

    public void calculateHeavyRental(double distanceTraveled) {
        if(distanceTraveled>70) {
            txtBillAmount.setText(""+(8000+700+((distanceTraveled-70)*200)));
        }
        else {
            txtBillAmount.setText(""+(8000+700));
        }
    }

    public static void main(String[] args) {
        AppUI appUI = new AppUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnReset) {
            cbVehicleCategory.setSelectedIndex(0);
            txtDistance.setText("");
            txtBillAmount.setText("");
        }
        if(e.getSource()==btnSubmit) {
            setDetails();
        }
    }
}
