package com.cabBookingSystem.Main;

import com.cabBookingSystem.admin_panel.admin.Admin_Login;
import com.cabBookingSystem.cab_owner_panel.cab_owner_login.Cab_Owner_Login;
import com.cabBookingSystem.passenger_panel.passenger_login.Passenger_Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home_Windows implements ActionListener {

    //**************************************** Declaration Section ********************************************

    JFrame home_windows_frame;
    JPanel main_panel;
    JPanel header_panel;

    JButton login_as_admin_button;
    JButton login_as_passenger_button;
    JButton login_as_cab_owner_button;

    JLabel header_label;

    //****************************************** Declaration Done ********************************************

    //*************************************** Initialization Section *****************************************

    public Home_Windows() {

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

        //************************************* Header Panel Label **************************************

        header_label = new JLabel("CAB BOOKING SYSTEM");
        header_label.setFont( new Font("Serif",Font.BOLD,28));
        header_label.setForeground(Color.WHITE);
        header_label.setBounds(180,15,390,70);

        //**************************************** Admin Button *****************************************

        login_as_admin_button = new JButton("Login as Admin");
        login_as_admin_button.setBounds(220, 70, 300, 60);
        login_as_admin_button.setBackground(Color.BLACK);
        login_as_admin_button.setForeground(Color.WHITE);
        login_as_admin_button.setFont( new Font("Serif",Font.BOLD,18));
        login_as_admin_button.setFocusable(false);
        login_as_admin_button.addActionListener(this);

        //***************************************** User Button *****************************************

        login_as_passenger_button = new JButton("Login as Passenger");
        login_as_passenger_button.setBounds(220, 140, 300, 60);
        login_as_passenger_button.setBackground(Color.BLACK);
        login_as_passenger_button.setForeground(Color.WHITE);
        login_as_passenger_button.setFont( new Font("Serif",Font.BOLD,18));
        login_as_passenger_button.setFocusable(false);
        login_as_passenger_button.addActionListener(this);

        //**************************************** Driver Button *****************************************

        login_as_cab_owner_button = new JButton("Login as Cab Owner ");
        login_as_cab_owner_button.setBounds(220, 210, 300, 60);
        login_as_cab_owner_button.setBackground(Color.BLACK);
        login_as_cab_owner_button.setForeground(Color.WHITE);
        login_as_cab_owner_button.setFont( new Font("Serif",Font.BOLD,18));
        login_as_cab_owner_button.setFocusable(false);
        login_as_cab_owner_button.addActionListener(this);

        //************************************** Main Panel Items **************************************

        main_panel.add(login_as_admin_button);
        main_panel.add(login_as_passenger_button);
        main_panel.add(login_as_cab_owner_button);

        //************************************* Header Panel Item *************************************

        header_panel.add(header_label);

        //************************************* Home Screen Frame *************************************

        home_windows_frame = new JFrame("Home Screen");

        //***************************************  Frame Items ****************************************

        home_windows_frame.add(main_panel);
        home_windows_frame.add(header_panel);

        //************************************* Home Screen Frame *************************************

        home_windows_frame.setBounds(380,100,750,500);
        home_windows_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        home_windows_frame.setLayout(new BorderLayout());
        home_windows_frame.setVisible(true);

        //************************************ Home Screen GUI End ************************************

    }

    //**************************************** Implementation Section ****************************************

    @Override
    public void actionPerformed(ActionEvent actionEvent) {


        if (actionEvent.getSource() == login_as_admin_button) {

            home_windows_frame.dispose();
            new Admin_Login();


        }
        else if (actionEvent.getSource() == login_as_passenger_button) {

            home_windows_frame.dispose();
            new Passenger_Login();


        }
        else if (actionEvent.getSource() == login_as_cab_owner_button) {

            home_windows_frame.dispose();
            new Cab_Owner_Login();



        }
    }

    //**************************************** Implementation Done *****************************************
}