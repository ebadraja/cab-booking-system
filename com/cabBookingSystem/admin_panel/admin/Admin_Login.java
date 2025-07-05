package com.cabBookingSystem.admin_panel.admin;

import com.cabBookingSystem.Main.Home_Windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin_Login implements ActionListener
{
    //**************************************** Declaration Section ********************************************

    JFrame adminFrame;
    JPanel main_panel;
    JPanel header_panel;

    JLabel admin_label;
    JLabel password_label;
    JLabel invalidLoginLabel;
    JLabel header_label;

    JTextField admin_textField;
    JPasswordField admin_passwordField;
    JButton admin_login_button;
    JButton back_button;

    //****************************************** Declaration Done ********************************************

    //*************************************** Initialization Section *****************************************

    public Admin_Login()
    {

        //****************************************** Main Panel ******************************************

        main_panel = new JPanel();
        main_panel.setLayout(null);
        main_panel.setLocation(0,90);
        main_panel.setSize(750,400);
        main_panel.setBackground(Color.DARK_GRAY);

        //***************************************** Header Panel *****************************************

        header_panel = new JPanel();
        header_panel.setLayout(null);
        header_panel.setLocation(0,0);
        header_panel.setSize(750,89);
        header_panel.setBackground(Color.black);

        //************************************** Header Panel Label **************************************

        header_label = new JLabel("CAB BOOKING SYSTEM");
        header_label.setFont( new Font("Serif",Font.BOLD,28));
        header_label.setForeground(Color.WHITE);
        header_label.setBounds(180,15,390,70);

        //***************************************** Admin Label ******************************************

        admin_label = new JLabel("Admin");
        admin_label.setBounds(170, 69, 150, 50);
        admin_label.setForeground(Color.WHITE);
        admin_label.setFont( new Font("Serif",Font.BOLD,22));

        //***************************************** Password Label ***************************************

        password_label = new JLabel("Password");
        password_label.setBounds(170, 159, 150, 50);
        password_label.setForeground(Color.WHITE);
        password_label.setFont( new Font("Serif",Font.BOLD,22));

        //*************************************** Invalid Login Label *************************************

        invalidLoginLabel = new JLabel(" ");
        invalidLoginLabel.setBounds(500, 245, 305, 30);
        invalidLoginLabel.setForeground(Color.white);
        invalidLoginLabel.setFont( new Font("Serif",Font.BOLD,20));

        //**************************************** Admin TextField ***************************************

        admin_textField = new JTextField(25);
        admin_textField.setBounds(320, 60, 250, 50);
        admin_textField.setFont( new Font("Serif",Font.BOLD,20));

        //************************************** Admin PasswordField *************************************

        admin_passwordField = new JPasswordField();
        admin_passwordField.setBounds(320, 150, 250, 50);
        admin_passwordField.setFont( new Font("Serif",Font.BOLD,20));

        //************************************** Admin Login Button **************************************

        admin_login_button = new JButton("Login");
        admin_login_button.setBounds(320, 240, 150, 40);
        admin_login_button.setFont( new Font("Serif",Font.BOLD,18));
        admin_login_button.setBackground(Color.BLACK);
        admin_login_button.setForeground(Color.WHITE);
        admin_login_button.setFocusable(false);
        admin_login_button.addActionListener(this);

        //****************************************** Back Button *****************************************

        back_button = new JButton("< BACK");
        back_button.setBounds(0,0,100,20);
        back_button.setBackground(Color.darkGray);
        back_button.setForeground(Color.WHITE);
        back_button.setFocusable(false);
        back_button.addActionListener(this);

        //************************************** Main Panel Items ***************************************

        main_panel.add(admin_label);
        main_panel.add(password_label);
        main_panel.add(admin_textField);
        main_panel.add(admin_passwordField);
        main_panel.add(admin_login_button);
        main_panel.add(invalidLoginLabel);

        //*************************************** Header Panel Items *************************************

        header_panel.add(header_label);
        header_panel.add(back_button);

        //*****************************************  Admin Frame *****************************************

        adminFrame = new JFrame("Admin Login");

        //*****************************************  Frame Items *****************************************

        adminFrame.add(main_panel);
        adminFrame.add(header_panel);

        //***************************************** Admin Frame ******************************************

        adminFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        adminFrame.setBounds(380,100,750,500);
        adminFrame.setLayout(null);
        adminFrame.setVisible(true);

        //**************************************** Admin GUI End *****************************************
    }

    //**************************************** Implementation Section ****************************************

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (admin_textField.getText().equals("Muneeb") && admin_passwordField.getText().equals("admin"))
        {
            if (actionEvent.getSource() == admin_login_button)
            {
                JOptionPane.showMessageDialog(null,"Welcome Muneeb");
                adminFrame.dispose();
                new Admin_Panel();

            }
        }

        else if (actionEvent.getSource() == back_button)
        {
            adminFrame.dispose();
            new Home_Windows();


        }

        else
        {
            invalidLoginLabel.setText("Invalid Login!");
        }
    }

    //**************************************** Implementation Done *****************************************
}