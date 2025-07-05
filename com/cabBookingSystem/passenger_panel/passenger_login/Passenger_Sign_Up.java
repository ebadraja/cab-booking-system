package com.cabBookingSystem.passenger_panel.passenger_login;

import com.cabBookingSystem.passenger_panel.panel.Passenger_Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Passenger_Sign_Up implements ActionListener {


    JFrame user_frame;

    JPanel main_panel;
    JPanel header_panel;

    JLabel userName_label;
    JLabel password_label;
    JLabel contact_label;
    JLabel address_label;

    JLabel header_label;

    JTextField userName_textField;
    JPasswordField user_passwordField;
    JTextField contact_textField;
    JTextField address_textField;

    JButton passenger_signUp_button;
    JButton back_button;


    public Passenger_Sign_Up() {


        main_panel = new JPanel();
        main_panel.setLayout(null);
        main_panel.setLocation(0, 90);
        main_panel.setSize(750, 400);
        main_panel.setBackground(Color.DARK_GRAY);

        header_panel = new JPanel();
        header_panel.setLayout(null);
        header_panel.setLocation(0, 0);
        header_panel.setSize(750, 89);
        header_panel.setBackground(Color.black);

        header_label = new JLabel("CAB BOOKING SYSTEM");
        header_label.setFont(new Font("Serif", Font.BOLD, 28));
        header_label.setForeground(Color.WHITE);
        header_label.setBounds(180, 15, 390, 70);

        userName_label = new JLabel("User");
        userName_label.setBounds(170, 20, 150, 40);
        userName_label.setForeground(Color.WHITE);
        userName_label.setFont(new Font("Serif", Font.BOLD, 18));

        password_label = new JLabel("Password");
        password_label.setBounds(170, 90, 150, 40);
        password_label.setForeground(Color.WHITE);
        password_label.setFont(new Font("Serif", Font.BOLD, 18));

        contact_label = new JLabel("Contact");
        contact_label.setBounds(170, 160, 150, 40);
        contact_label.setForeground(Color.WHITE);
        contact_label.setFont(new Font("Serif", Font.BOLD, 18));

        address_label = new JLabel("Address");
        address_label.setBounds(170, 220, 150, 40);
        address_label.setForeground(Color.WHITE);
        address_label.setFont(new Font("Serif", Font.BOLD, 18));


        userName_textField = new JTextField(25);
        userName_textField.setBounds(320, 17, 250, 40);
        userName_textField.setFont(new Font("Serif", Font.BOLD, 16));

        user_passwordField = new JPasswordField();
        user_passwordField.setBounds(320, 87, 250, 40);
        user_passwordField.setFont(new Font("Serif", Font.BOLD, 16));

        contact_textField = new JTextField(25);
        contact_textField.setBounds(320, 157, 250, 40);
        contact_textField.setFont(new Font("Serif", Font.BOLD, 16));

        address_textField = new JTextField(25);
        address_textField.setBounds(320, 217, 250, 40);
        address_textField.setFont(new Font("Serif", Font.BOLD, 16));

        passenger_signUp_button = new JButton("Sign Up");
        passenger_signUp_button.setBounds(420, 300, 150, 40);
        passenger_signUp_button.setFont(new Font("Serif", Font.BOLD, 18));
        passenger_signUp_button.setBackground(Color.BLACK);
        passenger_signUp_button.setForeground(Color.WHITE);
        passenger_signUp_button.setFocusable(false);
        passenger_signUp_button.addActionListener(this);

        back_button = new JButton("< BACK");
        back_button.setBounds(0, 0, 100, 20);
        back_button.setBackground(Color.darkGray);
        back_button.setForeground(Color.WHITE);
        back_button.setFocusable(false);
        back_button.addActionListener(this);


        main_panel.add(userName_label);
        main_panel.add(password_label);
        main_panel.add(contact_label);
        main_panel.add(address_label);

        main_panel.add(userName_textField);
        main_panel.add(user_passwordField);
        main_panel.add(contact_textField);
        main_panel.add(address_textField);
        main_panel.add(passenger_signUp_button);

        header_panel.add(header_label);
        header_panel.add(back_button);

        user_frame = new JFrame("Passenger Sign up");

        user_frame.add(main_panel);
        user_frame.add(header_panel);

        user_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        user_frame.setBounds(380, 100, 750, 500);
        user_frame.setLayout(null);
        user_frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource() == passenger_signUp_button)
        {
            if (!userName_textField.getText().equals("") &&
                !user_passwordField.getText().equals("") &&
                !contact_textField.getText().equals("") &&
                !address_textField.getText().equals(""))
            {
                user_frame.dispose();
                new Passenger_Panel();

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please fill all details.");
            }
        }
        else if (actionEvent.getSource() == back_button)
        {
            user_frame.dispose();
            new Passenger_Login();

        }
    }
}
