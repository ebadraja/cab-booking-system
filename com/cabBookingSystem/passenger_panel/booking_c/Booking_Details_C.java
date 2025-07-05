package com.cabBookingSystem.passenger_panel.booking_c;

import com.cabBookingSystem.passenger_panel.panel.Passenger_Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Booking_Details_C implements ActionListener
{
    JFrame booking_details_frame;
    JPanel main_panel;
    JPanel header_panel;

    JButton cancel_button;
    JButton back_button;
    JButton complete_button;

    JLabel header_label;
    JLabel successful_booking_label;
    JLabel driver_name_label;
    JLabel driver_Time_To_reach_label;
    JLabel driver_Contact_label;
    JLabel cab_Name_label;
    JLabel cab_number_label;

    JTextField name_textField;
    JTextField time_textField;
    JTextField contact_textField;
    JTextField cab_name_textField;
    JTextField number_plate_textField;


    public Booking_Details_C() {


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

        cancel_button = new JButton("Cancel");
        cancel_button.setBounds(185, 310, 110, 30);
        cancel_button.setFont( new Font("Serif",Font.BOLD,14));
        cancel_button.setBackground(Color.BLACK);
        cancel_button.setForeground(Color.WHITE);
        cancel_button.addActionListener(this);
        cancel_button.setFocusable(false);

        complete_button = new JButton("Complete");
        complete_button.setBounds(420, 310, 110, 30);
        complete_button.setFont( new Font("Serif",Font.BOLD,14));
        complete_button.setForeground(Color.WHITE);
        complete_button.setBackground(Color.BLACK);
        complete_button.addActionListener(this);
        complete_button.setFocusable(false);

        back_button = new JButton("< BACK");
        back_button.setBounds(0, 0, 100, 20);
        back_button.setBackground(Color.DARK_GRAY);
        back_button.setForeground(Color.WHITE);
        back_button.addActionListener(this);
        back_button.setFocusable(false);

        driver_name_label = new JLabel("Captain");
        driver_name_label.setBounds(180,90,160,30);
        driver_name_label.setFont( new Font("Serif",Font.BOLD,16));
        driver_name_label.setForeground(Color.WHITE);

        driver_Contact_label = new JLabel("Contact No.");
        driver_Contact_label.setBounds(180,130,160,30);
        driver_Contact_label.setFont( new Font("Serif",Font.BOLD,16));
        driver_Contact_label.setForeground(Color.WHITE);

        driver_Time_To_reach_label = new JLabel("Estimated Time");
        driver_Time_To_reach_label.setBounds(180,170,160,30);
        driver_Time_To_reach_label.setFont( new Font("Serif",Font.BOLD,16));
        driver_Time_To_reach_label.setForeground(Color.WHITE);

        cab_Name_label = new JLabel("Cab Name");
        cab_Name_label.setBounds(180,210,160,30);
        cab_Name_label.setFont( new Font("Serif",Font.BOLD,16));
        cab_Name_label.setForeground(Color.WHITE);

        cab_number_label = new JLabel("Cab Number");
        cab_number_label.setBounds(180,250,160,30);
        cab_number_label.setFont( new Font("Serif",Font.BOLD,16));
        cab_number_label.setForeground(Color.WHITE);

        successful_booking_label = new JLabel("Your Rider will be on your way shortly");
        successful_booking_label.setBounds(180,40,380,30);
        successful_booking_label.setFont( new Font("Serif",Font.BOLD,16));
        successful_booking_label.setForeground(Color.WHITE);

        name_textField = new JTextField();
        name_textField.setBounds(410, 90, 130, 30);
        name_textField.setFont(new Font("Serif", Font.BOLD, 14));
        name_textField.setText("Talha");
        name_textField.setEditable(false);
        name_textField.setBackground(Color.YELLOW);
        name_textField.setForeground(Color.BLACK);

        contact_textField = new JTextField();
        contact_textField.setBounds(410, 130, 130, 30);
        contact_textField.setFont(new Font("Serif", Font.BOLD, 14));
        contact_textField.setText("03451375785");
        contact_textField.setEditable(false);
        contact_textField.setBackground(Color.YELLOW);
        contact_textField.setForeground(Color.BLACK);

        time_textField = new JTextField();
        time_textField.setBounds(410, 170, 130, 30);
        time_textField.setFont(new Font("Serif", Font.BOLD, 14));
        time_textField.setText("10 minutes");
        time_textField.setEditable(false);
        time_textField.setBackground(Color.YELLOW);
        time_textField.setForeground(Color.BLACK);

        cab_name_textField = new JTextField();
        cab_name_textField.setBounds(410,210,130,30);
        cab_name_textField.setFont( new Font("Serif",Font.BOLD,14));
        cab_name_textField.setText("Suzuki Cultus");
        cab_name_textField.setEditable(false);
        cab_name_textField.setBackground(Color.YELLOW);
        cab_name_textField.setForeground(Color.BLACK);

        number_plate_textField = new JTextField();
        number_plate_textField.setBounds(410, 250, 130, 30);
        number_plate_textField.setFont(new Font("Serif", Font.BOLD, 14));
        number_plate_textField.setText("LHR-125");
        number_plate_textField.setEditable(false);
        number_plate_textField.setBackground(Color.YELLOW);
        number_plate_textField.setForeground(Color.BLACK);


        main_panel.add(cancel_button);
        main_panel.add(complete_button);

        main_panel.add(driver_name_label);
        main_panel.add(driver_Contact_label);
        main_panel.add(driver_Time_To_reach_label);
        main_panel.add(cab_Name_label);
        main_panel.add(cab_number_label);
        main_panel.add(successful_booking_label);

        main_panel.add(name_textField);
        main_panel.add(contact_textField);
        main_panel.add(time_textField);
        main_panel.add(cab_name_textField);
        main_panel.add(number_plate_textField);

        header_panel.add(back_button);
        header_panel.add(header_label);

        booking_details_frame = new JFrame("Booking Details");

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
        if (actionEvent.getSource() == cancel_button)
        {
            booking_details_frame.dispose();
            new Cancel_C();

        }
        else if (actionEvent.getSource() == back_button)
        {

            booking_details_frame.dispose();
            new Passenger_Panel();

        }
        else if (actionEvent.getSource() == complete_button)
        {
            JOptionPane.showMessageDialog(null,"You have completed the ride\n\nRs: 470");
            booking_details_frame.dispose();
            new Passenger_Panel();

        }
    }
}
