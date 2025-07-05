package com.cabBookingSystem.cab_owner_panel.cab_owner_panel_a;


import com.cabBookingSystem.Main.Home_Windows;
import com.cabBookingSystem.cab_owner_panel.cab_owner_login.Cab_Owner_Login;
import com.cabBookingSystem.cab_owner_panel.cab_owner_panel_b.Cab_Owner_Panel_B;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cab_Owner_Panel_A implements ActionListener
{

    //**************************************** Declaration Section ********************************************

    JFrame booking_details_frame;
    JPanel main_panel;
    JPanel header_panel;

    JButton pick_ride_button;
    JButton decline_ride_button;
    JButton logout_button;
    JButton back_button;

    JLabel distance_label;
    JLabel time_To_reach_label;
    JLabel pick_up_location_label;
    JLabel destination_location_label;
    JLabel header_label;

    JTextField time_textField;
    JTextField distance_TO_and_from_textField;
    JTextField pick_up_location_of_passenger_textField;
    JTextField Destination_of_passenger_textField;


    //****************************************** Declaration Done ********************************************

    //*************************************** Initialization Section *****************************************

    public Cab_Owner_Panel_A()
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

        //*************************************** Pick Ride Button ***************************************

        pick_ride_button = new JButton("PICK");
        pick_ride_button.setBounds(120, 250, 120, 37);
        pick_ride_button.setBackground(Color.BLACK);
        pick_ride_button.setForeground(Color.WHITE);
        pick_ride_button.setFont( new Font("Serif",Font.BOLD,14));
        pick_ride_button.addActionListener(this);
        pick_ride_button.setFocusable(false);

        //************************************* Decline Ride Button *************************************

        decline_ride_button = new JButton("Decline");
        decline_ride_button.setBounds(300, 250, 120, 37);
        decline_ride_button.setBackground(Color.BLACK);
        decline_ride_button.setForeground(Color.WHITE);
        decline_ride_button.setFont( new Font("Serif",Font.BOLD,14));
        decline_ride_button.addActionListener(this);
        decline_ride_button.setFocusable(false);

        //*************************************** Logout Button ****************************************

        logout_button = new JButton("Logout");
        logout_button.setBounds(480, 250, 120, 37);
        logout_button.setBackground(Color.BLACK);
        logout_button.setForeground(Color.WHITE);
        logout_button.setFont( new Font("Serif",Font.BOLD,14));
        logout_button.addActionListener(this);
        logout_button.setFocusable(false);

        //**************************************** Back Button *****************************************

        back_button = new JButton("< BACK");
        back_button.setBounds(0, 0, 100, 20);
        back_button.setBackground(Color.DARK_GRAY);
        back_button.setForeground(Color.WHITE);
        back_button.setFont( new Font("Serif",Font.BOLD,12));
        back_button.addActionListener(this);
        back_button.setFocusable(false);

        //************************************ Time To Reach Label ************************************

        time_To_reach_label = new JLabel("Estimated Time");
        time_To_reach_label.setBounds(170,50,170,30);
        time_To_reach_label.setForeground(Color.WHITE);
        time_To_reach_label.setBackground(Color.BLACK);
        time_To_reach_label.setFont( new Font("Serif",Font.BOLD,18));

        //************************************** Distance Label **************************************

        distance_label = new JLabel("Distance");
        distance_label.setBounds(170,90,170,30);
        distance_label.setForeground(Color.WHITE);
        distance_label.setBackground(Color.BLACK);
        distance_label.setFont( new Font("Serif",Font.BOLD,18));

        //********************************* Pick Up Location Label **********************************

        pick_up_location_label = new JLabel("From");
        pick_up_location_label.setBounds(170,130,170,30);
        pick_up_location_label.setForeground(Color.WHITE);
        pick_up_location_label.setBackground(Color.BLACK);
        pick_up_location_label.setFont( new Font("Serif",Font.BOLD,18));

        //********************************* Destination Location Label **********************************

        destination_location_label = new JLabel("To");
        destination_location_label.setBounds(170,170,170,30);
        destination_location_label.setForeground(Color.WHITE);
        destination_location_label.setBackground(Color.BLACK);
        destination_location_label.setFont( new Font("Serif",Font.BOLD,18));

        //********************************** Time To Reach TextField ***********************************


        time_textField = new JTextField();
        time_textField.setBounds(400,50,170,30);
        time_textField.setFont( new Font("Serif",Font.BOLD,14));
        time_textField.setText("15 minutes");
        time_textField.setBackground(Color.ORANGE);
        time_textField.setEditable(false);

        //************************************ Distance TextField *************************************

        distance_TO_and_from_textField = new JTextField();
        distance_TO_and_from_textField.setBounds(400,90,170,30);
        distance_TO_and_from_textField.setFont( new Font("Serif",Font.BOLD,14));
        distance_TO_and_from_textField.setText("9.3 KM");
        distance_TO_and_from_textField.setEditable(false);
        distance_TO_and_from_textField.setBackground(Color.ORANGE);

        //********************************** Pick Up Location TextField ***********************************

        pick_up_location_of_passenger_textField = new JTextField();
        pick_up_location_of_passenger_textField.setBounds(400,130,170,30);
        pick_up_location_of_passenger_textField.setFont( new Font("Serif",Font.BOLD,14));
        pick_up_location_of_passenger_textField.setText("Sadder");
        pick_up_location_of_passenger_textField.setEditable(false);
        pick_up_location_of_passenger_textField.setBackground(Color.ORANGE);

        //********************************** Destination Location TextField ***********************************

        Destination_of_passenger_textField = new JTextField();
        Destination_of_passenger_textField.setBounds(400,170,170,30);
        Destination_of_passenger_textField.setFont( new Font("Serif",Font.BOLD,14));
        Destination_of_passenger_textField.setText("Faizabad");
        Destination_of_passenger_textField.setEditable(false);
        Destination_of_passenger_textField.setBackground(Color.ORANGE);

        //************************************** Main Panel Items ***************************************

        main_panel.add(pick_ride_button);
        main_panel.add(decline_ride_button);
        main_panel.add(logout_button);
        main_panel.add(distance_label);
        main_panel.add(time_To_reach_label);
        main_panel.add(pick_up_location_label);
        main_panel.add(destination_location_label);

        main_panel.add(distance_TO_and_from_textField);
        main_panel.add(time_textField);
        main_panel.add(pick_up_location_of_passenger_textField);
        main_panel.add(Destination_of_passenger_textField);

        //*************************************** Header Panel Items *************************************

        header_panel.add(header_label);
        header_panel.add(back_button);

        //************************************** Booking Details Frame ***********************************

        booking_details_frame = new JFrame("Cab Owner Panel");

        //****************************************** Frame Items *****************************************

        booking_details_frame.add(main_panel);
        booking_details_frame.add(header_panel);

        //************************************** Booking Details Frame ***********************************

        booking_details_frame.setBounds(380,100,750,500);
        booking_details_frame.setLayout(null);
        booking_details_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        booking_details_frame.setVisible(true);

        //******************************************* GUI End ********************************************

    }

    //**************************************** Implementation Section ****************************************

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == pick_ride_button)
        {
            booking_details_frame.dispose();
            new Picked_Ride_A();

        }

        else if (actionEvent.getSource() == decline_ride_button)
        {
            booking_details_frame.dispose();
            new Cab_Owner_Panel_B();


        }

        else if (actionEvent.getSource() == logout_button)
        {
            booking_details_frame.dispose();
            new Home_Windows();


        }
        else if (actionEvent.getSource() == back_button)
        {
            booking_details_frame.dispose();
            new Cab_Owner_Login();

        }
    }

    //**************************************** Implementation Done *****************************************
}
