package com.cabBookingSystem.cab_owner_panel.cab_owner_panel_c;

import com.cabBookingSystem.Main.Home_Windows;
import com.cabBookingSystem.cab_owner_panel.cab_owner_login.Cab_Owner_Login;
import com.cabBookingSystem.cab_owner_panel.cab_owner_panel_a.Cab_Owner_Panel_A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cab_Owner_Panel_C implements ActionListener
{
    JFrame booking_details_frame;

    JPanel main_panel;
    JPanel header_panel;

    JButton pick_ride_button;
    JButton decline_ride_button;
    JButton logout_button;
    JButton back_button;

    JLabel distance_label;
    JLabel Time_To_reach_label;
    JLabel Pick_up_location_label;
    JLabel Destination_location_label;
    JLabel header_label;

    JTextField time_textField;
    JTextField distance_TO_and_from_textField;
    JTextField pick_up_location_of_passenger_textField;
    JTextField Destination_of_passenger_textField;


    public Cab_Owner_Panel_C()
    {

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


        pick_ride_button = new JButton("PICK");
        pick_ride_button.setBounds(120, 250, 120, 37);
        pick_ride_button.setBackground(Color.BLACK);
        pick_ride_button.setForeground(Color.WHITE);
        pick_ride_button.setFont( new Font("Serif",Font.BOLD,14));
        pick_ride_button.addActionListener(this);
        pick_ride_button.setFocusable(false);

        decline_ride_button = new JButton("Decline");
        decline_ride_button.setBounds(300, 250, 120, 37);
        decline_ride_button.setBackground(Color.BLACK);
        decline_ride_button.setForeground(Color.WHITE);
        decline_ride_button.setFont( new Font("Serif",Font.BOLD,14));
        decline_ride_button.addActionListener(this);
        decline_ride_button.setFocusable(false);

        logout_button = new JButton("Logout");
        logout_button.setBounds(480, 250, 120, 37);
        logout_button.setBackground(Color.BLACK);
        logout_button.setForeground(Color.WHITE);
        logout_button.setFont( new Font("Serif",Font.BOLD,14));
        logout_button.addActionListener(this);
        logout_button.setFocusable(false);

        back_button = new JButton("< BACK");
        back_button.setBounds(0, 0, 100, 20);
        back_button.setBackground(Color.DARK_GRAY);
        back_button.setForeground(Color.WHITE);
        back_button.setFont( new Font("Serif",Font.BOLD,12));
        back_button.addActionListener(this);
        back_button.setFocusable(false);

        Time_To_reach_label = new JLabel("Estimated Time");
        Time_To_reach_label.setBounds(170,50,170,30);
        Time_To_reach_label.setForeground(Color.WHITE);
        Time_To_reach_label.setBackground(Color.BLACK);
        Time_To_reach_label.setFont( new Font("Serif",Font.BOLD,18));

        distance_label = new JLabel("Distance");
        distance_label.setBounds(170,90,170,30);
        distance_label.setForeground(Color.WHITE);
        distance_label.setBackground(Color.BLACK);
        distance_label.setFont( new Font("Serif",Font.BOLD,18));

        Pick_up_location_label = new JLabel("From");
        Pick_up_location_label.setBounds(170,130,170,30);
        Pick_up_location_label.setForeground(Color.WHITE);
        Pick_up_location_label.setBackground(Color.BLACK);
        Pick_up_location_label.setFont( new Font("Serif",Font.BOLD,18));

        Destination_location_label = new JLabel("To");
        Destination_location_label.setBounds(170,170,170,30);
        Destination_location_label.setForeground(Color.WHITE);
        Destination_location_label.setBackground(Color.BLACK);
        Destination_location_label.setFont( new Font("Serif",Font.BOLD,18));


        time_textField = new JTextField();
        time_textField.setBounds(400,50,170,30);
        time_textField.setFont( new Font("Serif",Font.BOLD,14));
        time_textField.setText("20 minutes");
        time_textField.setEditable(false);
        time_textField.setBackground(Color.ORANGE);

        distance_TO_and_from_textField = new JTextField();
        distance_TO_and_from_textField.setBounds(400,90,170,30);
        distance_TO_and_from_textField.setFont( new Font("Serif",Font.BOLD,14));
        distance_TO_and_from_textField.setText("15.7 KM");
        distance_TO_and_from_textField.setEditable(false);
        distance_TO_and_from_textField.setBackground(Color.ORANGE);

        pick_up_location_of_passenger_textField = new JTextField();
        pick_up_location_of_passenger_textField.setBounds(400,130,170,30);
        pick_up_location_of_passenger_textField.setFont( new Font("Serif",Font.BOLD,14));
        pick_up_location_of_passenger_textField.setText("PIMS");
        pick_up_location_of_passenger_textField.setEditable(false);
        pick_up_location_of_passenger_textField.setBackground(Color.ORANGE);

        Destination_of_passenger_textField = new JTextField();
        Destination_of_passenger_textField.setBounds(400,170,170,30);
        Destination_of_passenger_textField.setFont( new Font("Serif",Font.BOLD,14));
        Destination_of_passenger_textField.setText("Sadder");
        Destination_of_passenger_textField.setEditable(false);
        Destination_of_passenger_textField.setBackground(Color.ORANGE);


        main_panel.add(pick_ride_button);
        main_panel.add(decline_ride_button);
        main_panel.add(logout_button);
        main_panel.add(distance_label);
        main_panel.add(Time_To_reach_label);
        main_panel.add(Pick_up_location_label);
        main_panel.add(Destination_location_label);

        main_panel.add(distance_TO_and_from_textField);
        main_panel.add(time_textField);
        main_panel.add(pick_up_location_of_passenger_textField);
        main_panel.add(Destination_of_passenger_textField);

        header_panel.add(header_label);
        header_panel.add(back_button);

        booking_details_frame = new JFrame("Cab Owner Panel");

        booking_details_frame.add(main_panel);
        booking_details_frame.add(header_panel);

        booking_details_frame.setBounds(380,100,750,500);
        booking_details_frame.setLayout(null);
        booking_details_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        booking_details_frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == pick_ride_button)
        {
            booking_details_frame.dispose();
            new Picked_Ride_C();

        }

        else if (actionEvent.getSource() == decline_ride_button)
        {
            JOptionPane.showMessageDialog(null,"Declining ride will decrease your rating");
            booking_details_frame.dispose();
            new Cab_Owner_Panel_A();

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
}
