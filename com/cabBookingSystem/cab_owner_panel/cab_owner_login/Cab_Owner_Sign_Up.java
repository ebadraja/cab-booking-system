package com.cabBookingSystem.cab_owner_panel.cab_owner_login;

import com.cabBookingSystem.cab_owner_panel.cab_owner_panel_a.Cab_Owner_Panel_A;
import com.cabBookingSystem.passenger_panel.passenger_login.Passenger_Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cab_Owner_Sign_Up implements ActionListener {

    //**************************************** Declaration Section ********************************************

    JFrame cab_owner_frame;
    JPanel main_panel;
    JPanel header_panel;

    JLabel driver_name_label;
    JLabel password_label;
    JLabel contact_label;
    JLabel address_label;

    JLabel header_label;

    JTextField cab_owner_name_textField;
    JPasswordField user_PasswordField;
    JTextField contact_textField;
    JTextField address_textField;

    JButton cab_owner_signUp_button;
    JButton back_button;

    //****************************************** Declaration Done ********************************************

    //*************************************** Initialization Section *****************************************

    public Cab_Owner_Sign_Up() {

        //****************************************** Main Panel ******************************************

        main_panel = new JPanel();
        main_panel.setLayout(null);
        main_panel.setLocation(0, 90);
        main_panel.setSize(750, 400);
        main_panel.setBackground(Color.DARK_GRAY);

        //***************************************** Header Panel *****************************************

        header_panel = new JPanel();
        header_panel.setLayout(null);
        header_panel.setLocation(0, 0);
        header_panel.setSize(750, 89);
        header_panel.setBackground(Color.black);

        //************************************** Header Panel Label **************************************

        header_label = new JLabel("CAB BOOKING SYSTEM");
        header_label.setFont(new Font("Serif", Font.BOLD, 28));
        header_label.setForeground(Color.WHITE);
        header_label.setBounds(180, 15, 390, 70);

        //**************************************** Driver Label ******************************************

        driver_name_label = new JLabel("User");
        driver_name_label.setBounds(170, 20, 150, 40);
        driver_name_label.setForeground(Color.WHITE);
        driver_name_label.setFont(new Font("Serif", Font.BOLD, 18));

        //***************************************** Password Label ***************************************

        password_label = new JLabel("Password");
        password_label.setBounds(170, 90, 150, 40);
        password_label.setForeground(Color.WHITE);
        password_label.setFont(new Font("Serif", Font.BOLD, 18));

        //***************************************** Contact Label ***************************************

        contact_label = new JLabel("Contact");
        contact_label.setBounds(170, 160, 150, 40);
        contact_label.setForeground(Color.WHITE);
        contact_label.setFont(new Font("Serif", Font.BOLD, 18));

        //***************************************** Address Label ***************************************

        address_label = new JLabel("Address");
        address_label.setBounds(170, 220, 150, 40);
        address_label.setForeground(Color.WHITE);
        address_label.setFont(new Font("Serif", Font.BOLD, 18));

        //************************************** Cab Owner TextField *************************************

        cab_owner_name_textField = new JTextField(25);
        cab_owner_name_textField.setBounds(320, 17, 250, 40);
        cab_owner_name_textField.setFont(new Font("Serif", Font.BOLD, 16));

        //************************************ Cab Owner PasswordField ***********************************

        user_PasswordField = new JPasswordField();
        user_PasswordField.setBounds(320, 87, 250, 40);
        user_PasswordField.setFont(new Font("Serif", Font.BOLD, 16));

        //*************************************** Contact TextField **************************************

        contact_textField = new JTextField(25);
        contact_textField.setBounds(320, 157, 250, 40);
        contact_textField.setFont(new Font("Serif", Font.BOLD, 16));

        //*************************************** Address TextField **************************************

        address_textField = new JTextField(25);
        address_textField.setBounds(320, 217, 250, 40);
        address_textField.setFont(new Font("Serif", Font.BOLD, 16));

        //*********************************** Cab Owner Sign up Button ***********************************

        cab_owner_signUp_button = new JButton("Sign Up");
        cab_owner_signUp_button.setBounds(420, 300, 150, 40);
        cab_owner_signUp_button.setFont(new Font("Serif", Font.BOLD, 18));
        cab_owner_signUp_button.setBackground(Color.BLACK);
        cab_owner_signUp_button.setForeground(Color.WHITE);
        cab_owner_signUp_button.setFocusable(false);
        cab_owner_signUp_button.addActionListener(this);

        //***************************************** Back Button *****************************************

        back_button = new JButton("< BACK");
        back_button.setBounds(0, 0, 100, 20);
        back_button.setBackground(Color.darkGray);
        back_button.setForeground(Color.WHITE);
        back_button.setFocusable(false);
        back_button.addActionListener(this);

        //************************************** Main Panel Items ***************************************

        main_panel.add(driver_name_label);
        main_panel.add(password_label);
        main_panel.add(contact_label);
        main_panel.add(address_label);

        main_panel.add(cab_owner_name_textField);
        main_panel.add(user_PasswordField);
        main_panel.add(contact_textField);
        main_panel.add(address_textField);
        main_panel.add(cab_owner_signUp_button);

        //*************************************** Header Panel Items *************************************

        header_panel.add(header_label);
        header_panel.add(back_button);

        //***************************************** Cab Owner Frame **************************************

        cab_owner_frame = new JFrame("Cab Owner Sign up");

        //*****************************************  Frame Items *****************************************

        cab_owner_frame.add(main_panel);
        cab_owner_frame.add(header_panel);

        //***************************************** Cab Owner Frame **************************************

        cab_owner_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cab_owner_frame.setBounds(380, 100, 750, 500);
        cab_owner_frame.setLayout(null);
        cab_owner_frame.setVisible(true);

        //******************************************* GUI End ********************************************

    }

    //**************************************** Implementation Section ****************************************

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource() == cab_owner_signUp_button)
        {
            if (!cab_owner_name_textField.getText().equals("") &&
                    !user_PasswordField.getText().equals("") &&
                    !contact_textField.getText().equals("") &&
                    !address_textField.getText().equals(""))
            {
                cab_owner_frame.dispose();
                new Cab_Owner_Panel_A();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please fill all details.");
            }
        }
        else if (actionEvent.getSource() == back_button)
        {
            cab_owner_frame.dispose();
            new Passenger_Login();

        }
    }

    //**************************************** Implementation Done *****************************************
}
