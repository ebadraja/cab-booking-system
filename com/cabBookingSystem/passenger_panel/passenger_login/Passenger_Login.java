package com.cabBookingSystem.passenger_panel.passenger_login;

import com.cabBookingSystem.Main.Home_Windows;
import com.cabBookingSystem.passenger_panel.panel.Passenger_Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Passenger_Login implements ActionListener
{

    JFrame user_frame;
    JPanel main_panel;
    JPanel header_panel;

    JLabel user_label;
    JLabel password_label;

    JLabel header_label;

    JTextField user_TextField;
    JPasswordField user_PasswordField;

    JButton passenger_login_button;
    JButton passenger_signUp_button;
    JButton back_button;


    public Passenger_Login() {


        main_panel = new JPanel();
        main_panel.setLayout(null);
        main_panel.setLocation(0,90);
        main_panel.setSize(750,400);
        main_panel.setBackground(Color.DARK_GRAY);

        header_panel = new JPanel();
        header_panel.setLayout(null);
        header_panel.setLocation(0,0);
        header_panel.setSize(750,89);
        header_panel.setBackground(Color.black);

        header_label = new JLabel("CAB BOOKING SYSTEM");
        header_label.setFont( new Font("Serif",Font.BOLD,28));
        header_label.setForeground(Color.WHITE);
        header_label.setBounds(180,15,390,70);

        user_label = new JLabel("User");
        user_label.setBounds(170, 69, 150, 50);
        user_label.setForeground(Color.WHITE);
        user_label.setFont( new Font("Serif",Font.BOLD,22));

        password_label = new JLabel("Password");
        password_label.setBounds(170, 159, 150, 50);
        password_label.setForeground(Color.WHITE);
        password_label.setFont( new Font("Serif",Font.BOLD,22));

        user_TextField = new JTextField(25);
        user_TextField.setBounds(320, 60, 250, 50);
        user_TextField.setFont( new Font("Serif",Font.BOLD,20));

        user_PasswordField = new JPasswordField();
        user_PasswordField.setBounds(320, 150, 250, 50);
        user_PasswordField.setFont( new Font("Serif",Font.BOLD,20));

        passenger_login_button = new JButton("Login");
        passenger_login_button.setBounds(170, 260, 150, 40);
        passenger_login_button.setFont( new Font("Serif",Font.BOLD,18));
        passenger_login_button.setBackground(Color.BLACK);
        passenger_login_button.setForeground(Color.WHITE);
        passenger_login_button.setFocusable(false);
        passenger_login_button.addActionListener(this);

        passenger_signUp_button = new JButton("Sign Up");
        passenger_signUp_button.setBounds(420, 260, 150, 40);
        passenger_signUp_button.setFont( new Font("Serif",Font.BOLD,18));
        passenger_signUp_button.setBackground(Color.BLACK);
        passenger_signUp_button.setForeground(Color.WHITE);
        passenger_signUp_button.setFocusable(false);
        passenger_signUp_button.addActionListener(this);

        back_button = new JButton("< BACK");
        back_button.setBounds(0,0,100,20);
        back_button.setBackground(Color.darkGray);
        back_button.setForeground(Color.WHITE);
        back_button.setFocusable(false);
        back_button.addActionListener(this);

        main_panel.add(user_label);
        main_panel.add(password_label);
        main_panel.add(user_TextField);
        main_panel.add(user_PasswordField);

        main_panel.add(passenger_login_button);
        main_panel.add(passenger_signUp_button);

        header_panel.add(header_label);
        header_panel.add(back_button);

        user_frame = new JFrame("Passenger Login");

        user_frame.add(main_panel);
        user_frame.add(header_panel);

        user_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        user_frame.setBounds(380,100,750,500);
        user_frame.setLayout(null);
        user_frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (user_TextField.getText().equals("Osama") && user_PasswordField.getText().equals("user"))
        {

            if (actionEvent.getSource() == passenger_login_button)
            {
                JOptionPane.showMessageDialog(null,"Welcome Osama");
                user_frame.dispose();
                new Passenger_Panel();

            }
        }
        else if (user_TextField.getText().equals("Omer") && user_PasswordField.getText().equals("user"))
        {

            if (actionEvent.getSource() == passenger_login_button)
            {
                JOptionPane.showMessageDialog(null,"Welcome Omer");
                user_frame.dispose();
                new Passenger_Panel();

            }
        }

        else if (user_TextField.getText().equals("Mubashir") && user_PasswordField.getText().equals("user"))
        {

            if (actionEvent.getSource() == passenger_login_button)
            {
                JOptionPane.showMessageDialog(null,"Welcome Mubashir");
                user_frame.dispose();
                new Passenger_Panel();

            }
        }
        else if (actionEvent.getSource() == passenger_signUp_button)
        {
            user_frame.dispose();
            new Passenger_Sign_Up();

        }
        else if (actionEvent.getSource() == back_button)
        {
            user_frame.dispose();
            new Home_Windows();

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid Login!");
        }
    }
}