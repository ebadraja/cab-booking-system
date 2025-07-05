package com.cabBookingSystem.admin_panel.admin;


import com.cabBookingSystem.admin_panel.modify_data.Modify_Cab_Data;
import com.cabBookingSystem.admin_panel.modify_data.Modify_Passenger_Data;
import com.cabBookingSystem.Main.Home_Windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin_Panel implements ActionListener {

    //**************************************** Declaration Section ********************************************

    JFrame admin_panel_frame;
    JPanel main_panel;
    JPanel header_panel;

    JButton modify_cab_data_button;
    JButton modify_passenger_data_button;
    JButton logout_button;

    JLabel header_label;


    //****************************************** Declaration Done ********************************************

    //*************************************** Initialization Section *****************************************

    public Admin_Panel() {

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

        //************************************* Header Panel Label **************************************

        header_label = new JLabel("CAB BOOKING SYSTEM");
        header_label.setFont(new Font("Serif", Font.BOLD, 28));
        header_label.setForeground(Color.WHITE);
        header_label.setBounds(180, 15, 390, 70);

        //************************************** Modify Cab Button **************************************

        modify_cab_data_button = new JButton("Modify Cab Data");
        modify_cab_data_button.setBounds(220, 70, 300, 60);
        modify_cab_data_button.setBackground(Color.BLACK);
        modify_cab_data_button.setForeground(Color.WHITE);
        modify_cab_data_button.setFont(new Font("Serif", Font.BOLD, 18));
        modify_cab_data_button.setFocusable(false);
        modify_cab_data_button.addActionListener(this);

        //************************************** Modify User Button *************************************

        modify_passenger_data_button = new JButton("Modify Passenger Data");
        modify_passenger_data_button.setBounds(220, 140, 300, 60);
        modify_passenger_data_button.setBackground(Color.BLACK);
        modify_passenger_data_button.setForeground(Color.WHITE);
        modify_passenger_data_button.setFont(new Font("Serif", Font.BOLD, 18));
        modify_passenger_data_button.setFocusable(false);
        modify_passenger_data_button.addActionListener(this);

        //*************************************** Logout Button ****************************************

        logout_button = new JButton("Logout");
        logout_button.setBounds(220, 210, 300, 60);
        logout_button.setBackground(Color.BLACK);
        logout_button.setForeground(Color.WHITE);
        logout_button.setFont(new Font("Serif", Font.BOLD, 18));
        logout_button.setFocusable(false);
        logout_button.addActionListener(this);

        //************************************** Main Panel Items **************************************

        main_panel.add(modify_cab_data_button);
        main_panel.add(modify_passenger_data_button);
        main_panel.add(logout_button);

        //************************************* Header Panel Item *************************************

        header_panel.add(header_label);

        //************************************* Admin Panel Frame *************************************

        admin_panel_frame = new JFrame("Admin Panel");

        //***************************************  Frame Items ****************************************

        admin_panel_frame.add(main_panel);
        admin_panel_frame.add(header_panel);

        //************************************* Admin Panel Frame *************************************

        admin_panel_frame.setBounds(380, 100, 750, 500);
        admin_panel_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        admin_panel_frame.setLayout(new BorderLayout());
        admin_panel_frame.setVisible(true);

        //************************************ Admin Panel GUI End ************************************
    }

    //**************************************** Implementation Section ****************************************

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource() == modify_cab_data_button) {

            admin_panel_frame.dispose();
            Modify_Cab_Data modify_cab = new Modify_Cab_Data();
            modify_cab.modify_cab_data_method();



        } else if (actionEvent.getSource() == modify_passenger_data_button) {

            admin_panel_frame.dispose();
            Modify_Passenger_Data modify_user = new Modify_Passenger_Data();
            modify_user.modify_passenger_data_method();

        }
        else if (actionEvent.getSource() == logout_button)
        {

            admin_panel_frame.dispose();
            new Home_Windows();

        }
    }

    //**************************************** Implementation Done *****************************************
}
