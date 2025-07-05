package com.cabBookingSystem.cab_owner_panel.cab_owner_login;


import com.cabBookingSystem.Main.Home_Windows;
import com.cabBookingSystem.cab_owner_panel.cab_owner_panel_a.Cab_Owner_Panel_A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cab_Owner_Login implements ActionListener
{

    //**************************************** Declaration Section ********************************************

    JFrame cab_owner_frame;
    JPanel main_panel;
    JPanel header_panel;

    JLabel cab_owner_label;
    JLabel password_label;

    JLabel header_label;

    JTextField cab_owner_TextField;
    JPasswordField cab_owner_PasswordField;

    JButton cab_owner_login_button;
    JButton cab_owner_signUp_button;
    JButton back_button;

    //****************************************** Declaration Done ********************************************

    //*************************************** Initialization Section *****************************************

    public Cab_Owner_Login() {

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

        //**************************************** Driver Label ******************************************

        cab_owner_label = new JLabel("Cab Owner");
        cab_owner_label.setBounds(170, 69, 150, 50);
        cab_owner_label.setForeground(Color.WHITE);
        cab_owner_label.setFont( new Font("Serif",Font.BOLD,22));

        //***************************************** Password Label ***************************************

        password_label = new JLabel("Password");
        password_label.setBounds(170, 159, 150, 50);
        password_label.setForeground(Color.WHITE);
        password_label.setFont( new Font("Serif",Font.BOLD,22));

        //************************************** Cab Owner TextField *************************************

        cab_owner_TextField = new JTextField(25);
        cab_owner_TextField.setBounds(320, 60, 250, 50);
        cab_owner_TextField.setFont( new Font("Serif",Font.BOLD,20));

        //************************************ Cab Owner PasswordField ***********************************

        cab_owner_PasswordField = new JPasswordField();
        cab_owner_PasswordField.setBounds(320, 150, 250, 50);
        cab_owner_PasswordField.setFont( new Font("Serif",Font.BOLD,20));

        //************************************ Cab Owner Login Button ***********************************

        cab_owner_login_button = new JButton("Login");
        cab_owner_login_button.setBounds(170, 260, 150, 40);
        cab_owner_login_button.setFont( new Font("Serif",Font.BOLD,18));
        cab_owner_login_button.setBackground(Color.BLACK);
        cab_owner_login_button.setForeground(Color.WHITE);
        cab_owner_login_button.setFocusable(false);
        cab_owner_login_button.addActionListener(this);

        //************************************** Cab Owner Sign UP *************************************

        cab_owner_signUp_button = new JButton("Sign Up");
        cab_owner_signUp_button.setBounds(420, 260, 150, 40);
        cab_owner_signUp_button.setFont( new Font("Serif",Font.BOLD,18));
        cab_owner_signUp_button.setBackground(Color.BLACK);
        cab_owner_signUp_button.setForeground(Color.WHITE);
        cab_owner_signUp_button.setFocusable(false);
        cab_owner_signUp_button.addActionListener(this);

        //****************************************** Back Button *****************************************

        back_button = new JButton("< BACK");
        back_button.setBounds(0,0,100,20);
        back_button.setBackground(Color.darkGray);
        back_button.setForeground(Color.WHITE);
        back_button.setFocusable(false);
        back_button.addActionListener(this);

        //************************************** Main Panel Items ***************************************

        main_panel.add(cab_owner_label);
        main_panel.add(password_label);
        main_panel.add(cab_owner_TextField);
        main_panel.add(cab_owner_PasswordField);
        main_panel.add(cab_owner_login_button);
        main_panel.add(cab_owner_signUp_button);

        //*************************************** Header Panel Items *************************************

        header_panel.add(header_label);
        header_panel.add(back_button);

        //***************************************** Cab Owner Frame **************************************

        cab_owner_frame = new JFrame("Cab Owner Login");

        //*****************************************  Frame Items *****************************************

        cab_owner_frame.add(main_panel);
        cab_owner_frame.add(header_panel);

        //***************************************** Cab Owner Frame **************************************

        cab_owner_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cab_owner_frame.setBounds(380,100,750,500);
        cab_owner_frame.setLayout(null);
        cab_owner_frame.setVisible(true);

        //************************************** Cab Owner GUI End ***************************************

    }

    //**************************************** Implementation Section ****************************************

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (cab_owner_TextField.getText().equals("Hamza") && cab_owner_PasswordField.getText().equals("driver"))
        {
            JOptionPane.showMessageDialog(null,"Welcome Hamza");
            if (actionEvent.getSource() == cab_owner_login_button)
            {
                cab_owner_frame.dispose();
                Cab_Owner_Panel_A driver_panel = new Cab_Owner_Panel_A();

                try
                {

                    driver_panel.wait();

                }
                catch (InterruptedException e)
                {

                    e.printStackTrace();
                    System.out.println(e.getMessage());

                }

            }
        }
        else if (cab_owner_TextField.getText().equals("Mohsin") && cab_owner_PasswordField.getText().equals("driver"))
        {
            JOptionPane.showMessageDialog(null,"Welcome Mohsin");
            if (actionEvent.getSource() == cab_owner_login_button)
            {
                cab_owner_frame.dispose();
                new Cab_Owner_Panel_A();

            }
        }
        else if (cab_owner_TextField.getText().equals("Talha") && cab_owner_PasswordField.getText().equals("driver"))
        {
            JOptionPane.showMessageDialog(null,"Welcome Talha");
            if (actionEvent.getSource() == cab_owner_login_button)
            {
                cab_owner_frame.dispose();
                new Cab_Owner_Panel_A();

            }
        }
        else if (actionEvent.getSource() == cab_owner_signUp_button)
        {
            cab_owner_frame.dispose();
            new Cab_Owner_Sign_Up();

        }
        else if (actionEvent.getSource() == back_button)
        {
            cab_owner_frame.dispose();
            new Home_Windows();

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid Login!");
        }
    }

    //**************************************** Implementation Done *****************************************
}
