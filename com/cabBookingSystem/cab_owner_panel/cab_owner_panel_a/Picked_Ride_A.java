package com.cabBookingSystem.cab_owner_panel.cab_owner_panel_a;

import com.cabBookingSystem.cab_owner_panel.cab_owner_panel_b.Cab_Owner_Panel_B;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Picked_Ride_A implements ActionListener
{
    //**************************************** Declaration Section ********************************************

    JFrame ride_details_frame;

    JPanel main_panel;
    JPanel header_panel;

    JButton cancel_ride_button;
    JButton start_ride_button;
    JButton complete_ride_button;

    JLabel Passenger_name_label;
    JLabel Passenger_Contact_label;
    JLabel Pick_up_location_label;
    JLabel Destination_location_label;
    JLabel header_label;

    JTextField passenger_name_textField;
    JTextField contact_textField;
    JTextField pick_up_location_of_passenger_textField;
    JTextField Destination_of_passenger_textField;

    //****************************************** Declaration Done ********************************************

    //*************************************** Initialization Section *****************************************

    public Picked_Ride_A()
    {

        //****************************************** Main Panel ******************************************

        main_panel = new JPanel();
        main_panel.setLayout(null);
        main_panel.setLocation(0,90);
        main_panel.setSize(750,400);
        main_panel.setBackground(Color.DARK_GRAY);

        //************************************** Header Panel Label **************************************

        header_panel = new JPanel();
        header_panel.setLayout(null);
        header_panel.setLocation(0,0);
        header_panel.setSize(750,89);
        header_panel.setBackground(Color.black);

        //*************************************** Pick Ride Button ***************************************

        header_label = new JLabel("CAB BOOKING SYSTEM");
        header_label.setFont( new Font("Serif",Font.BOLD,28));
        header_label.setForeground(Color.WHITE);
        header_label.setBounds(180,15,390,70);

        //************************************** Cancel Ride Button **************************************

        cancel_ride_button = new JButton("Cancel");
        cancel_ride_button.setBounds(130, 250, 120, 30);
        cancel_ride_button.setBackground(Color.BLACK);
        cancel_ride_button.setForeground(Color.WHITE);
        cancel_ride_button.setFont( new Font("Serif",Font.BOLD,14));
        cancel_ride_button.addActionListener(this);
        cancel_ride_button.setFocusable(false);

        //************************************** Start Ride Button ***************************************

        start_ride_button = new JButton("Start");
        start_ride_button.setBounds(305, 250, 120, 30);
        start_ride_button.setBackground(Color.BLACK);
        start_ride_button.setForeground(Color.WHITE);
        start_ride_button.setFont( new Font("Serif",Font.BOLD,14));
        start_ride_button.addActionListener(this);
        start_ride_button.setFocusable(false);

        //************************************* Complete Ride Button *************************************

        complete_ride_button = new JButton("Completed");
        complete_ride_button.setBounds(480, 250, 120, 30);
        complete_ride_button.setBackground(Color.BLACK);
        complete_ride_button.setForeground(Color.WHITE);
        complete_ride_button.setFont( new Font("Serif",Font.BOLD,14));
        complete_ride_button.addActionListener(this);
        complete_ride_button.setFocusable(false);
        complete_ride_button.setEnabled(false);

        //************************************* Passenger Name Label *************************************

        Passenger_name_label = new JLabel("Passenger");
        Passenger_name_label.setBounds(170,50,170,30);
        Passenger_name_label.setFont( new Font("Serif",Font.BOLD,18));
        Passenger_name_label.setForeground(Color.WHITE);

        //************************************** Contact No. Label ***************************************

        Passenger_Contact_label = new JLabel("Contact No.");
        Passenger_Contact_label.setBounds(170,90,170,30);
        Passenger_Contact_label.setFont( new Font("Serif",Font.BOLD,18));
        Passenger_Contact_label.setForeground(Color.WHITE);

        //**************************************** From Label ********************************************

        Pick_up_location_label = new JLabel("From");
        Pick_up_location_label.setBounds(170,130,170,30);
        Pick_up_location_label.setForeground(Color.WHITE);
        Pick_up_location_label.setFont( new Font("Serif",Font.BOLD,18));

        //***************************************** To Label *********************************************

        Destination_location_label = new JLabel("To");
        Destination_location_label.setBounds(170,170,170,30);
        Destination_location_label.setForeground(Color.WHITE);
        Destination_location_label.setFont( new Font("Serif",Font.BOLD,18));

        //************************************** Name TextField ******************************************

        passenger_name_textField = new JTextField();
        passenger_name_textField.setBounds(400,50,170,30);
        passenger_name_textField.setFont( new Font("Serif",Font.BOLD,14));
        passenger_name_textField.setText("Osama");
        passenger_name_textField.setEditable(false);
        passenger_name_textField.setBackground(Color.YELLOW);

        //************************************ Contact TextField ****************************************

        contact_textField = new JTextField();
        contact_textField.setBounds(400,90,170,30);
        contact_textField.setFont( new Font("Serif",Font.BOLD,14));
        contact_textField.setText("03216934567");
        contact_textField.setEditable(false);
        contact_textField.setBackground(Color.YELLOW);

        //******************************** Pick up Location TextField ************************************

        pick_up_location_of_passenger_textField = new JTextField();
        pick_up_location_of_passenger_textField.setBounds(400,130,170,30);
        pick_up_location_of_passenger_textField.setFont( new Font("Serif",Font.BOLD,14));
        pick_up_location_of_passenger_textField.setText("Sadder");
        pick_up_location_of_passenger_textField.setEditable(false);
        pick_up_location_of_passenger_textField.setBackground(Color.YELLOW);

        //******************************** Destination Location TextField ************************************

        Destination_of_passenger_textField = new JTextField();
        Destination_of_passenger_textField.setBounds(400,170,170,30);
        Destination_of_passenger_textField.setFont( new Font("Serif",Font.BOLD,14));
        Destination_of_passenger_textField.setText("Faizabad");
        Destination_of_passenger_textField.setEditable(false);
        Destination_of_passenger_textField.setBackground(Color.YELLOW);

        //************************************** Main Panel Items ***************************************

        main_panel.add(cancel_ride_button);
        main_panel.add(start_ride_button );
        main_panel.add(complete_ride_button );
        main_panel.add(Passenger_name_label);
        main_panel.add(Passenger_Contact_label);
        main_panel.add(Pick_up_location_label);
        main_panel.add(Destination_location_label);

        main_panel.add(passenger_name_textField);
        main_panel.add(contact_textField);
        main_panel.add(pick_up_location_of_passenger_textField);
        main_panel.add(Destination_of_passenger_textField);

        //************************************* Header Panel Items **************************************

        header_panel.add(header_label);

        //*************************************** Ride Details Frame ************************************

        ride_details_frame = new JFrame("Ride Details");

        //***************************************** Frame Items *****************************************

        ride_details_frame.add(main_panel);
        ride_details_frame.add(header_panel);

        //*************************************** Ride Details Frame ************************************

        ride_details_frame.setBounds(380,100,750,500);
        ride_details_frame.setLayout(null);
        ride_details_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ride_details_frame.setVisible(true);

        //******************************************* GUI End ********************************************

    }

    //**************************************** Implementation Section ****************************************

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == cancel_ride_button)
        {
            ride_details_frame.dispose();
            new Cancel_Ride_A();

        }
        else if (actionEvent.getSource() == start_ride_button )
        {
            JOptionPane.showMessageDialog(null,"You have started the ride.");

            start_ride_button.setEnabled(false);
            cancel_ride_button.setEnabled(false);
            complete_ride_button.setEnabled(true);
        }
        else if (actionEvent.getSource() == complete_ride_button )
        {
            JOptionPane.showMessageDialog(null,"You have completed the ride\n\nRs: 430");
            ride_details_frame.dispose();
            new Cab_Owner_Panel_B();

        }
    }
    //**************************************** Implementation Done *****************************************
}