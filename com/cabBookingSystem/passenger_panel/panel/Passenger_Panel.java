package com.cabBookingSystem.passenger_panel.panel;

import com.cabBookingSystem.Main.Home_Windows;
import com.cabBookingSystem.passenger_panel.booking_a.Booking_Details_A;
import com.cabBookingSystem.passenger_panel.booking_b.Booking_Details_B;
import com.cabBookingSystem.passenger_panel.booking_c.Booking_Details_C;
import com.cabBookingSystem.passenger_panel.passenger_login.Passenger_Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Passenger_Panel implements ActionListener {

    JFrame passenger_panel_frame;

    JPanel main_panel;
    JPanel header_panel;

    JButton back_button;
    JButton book_button;
    JButton logout_button;

    JComboBox Pick_Up_comboBox;
    JComboBox Destination_comboBox;

    JLabel estimated_rate_label;
    JLabel header_label;
    JTextField rate_label;

    public Passenger_Panel() {


        main_panel = new JPanel();
        main_panel.setLayout(null);
        main_panel.setLocation(0, 90);
        main_panel.setSize(750, 500);
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


        back_button = new JButton("< Back");
        back_button.setBounds(0, 0, 100, 20);
        back_button.setBackground(Color.DARK_GRAY);
        back_button.setForeground(Color.WHITE);
        back_button.setFont(new Font("Serif", Font.BOLD, 14));
        back_button.addActionListener(this);
        back_button.setFocusable(false);

        book_button = new JButton("Book");
        book_button.setBounds(210, 280, 120, 40);
        book_button.setBackground(Color.BLACK);
        book_button.setForeground(Color.WHITE);
        book_button.setFont(new Font("Serif", Font.BOLD, 14));
        book_button.addActionListener(this);
        book_button.setFocusable(false);

        logout_button = new JButton("Logout");
        logout_button.setBounds(430, 280, 120, 40);
        logout_button.setBackground(Color.BLACK);
        logout_button.setForeground(Color.WHITE);
        logout_button.setFont(new Font("Serif", Font.BOLD, 14));
        logout_button.addActionListener(this);
        logout_button.setFocusable(false);

        estimated_rate_label = new JLabel("Estimated Rate");
        estimated_rate_label.setBounds(190, 215, 180, 30);
        estimated_rate_label.setForeground(Color.WHITE);
        estimated_rate_label.setFont(new Font("Serif", Font.BOLD, 16));

        rate_label = new JTextField(" ");
        rate_label.setBounds(410, 215, 180, 30);
        rate_label.setBackground(Color.YELLOW);
        rate_label.setFont(new Font("Serif", Font.BOLD, 16));
        rate_label.setText("");
        rate_label.setEditable(false);


        String[] pick_up = {"PICK UP", "Sadder", "Faizabad", "PIMS"};
        Pick_Up_comboBox = new JComboBox(pick_up);
        Pick_Up_comboBox.setBounds(190, 100, 180, 30);
        Pick_Up_comboBox.setBackground(Color.cyan);
        Pick_Up_comboBox.addActionListener(this);

        String[] destination = {"Destination", "Sadder", "Faizabad", "PIMS"};
        Destination_comboBox = new JComboBox(destination);
        Destination_comboBox.setBounds(410, 100, 180, 30);
        Destination_comboBox.setBackground(Color.cyan);
        Destination_comboBox.addActionListener(this);


        main_panel.add(book_button);
        main_panel.add(logout_button);
        main_panel.add(Pick_Up_comboBox);
        main_panel.add(Destination_comboBox);
        main_panel.add(estimated_rate_label);
        main_panel.add(rate_label);

        header_panel.add(header_label);
        header_panel.add(back_button);

        passenger_panel_frame = new JFrame("Passenger Panel");

        passenger_panel_frame.add(main_panel);
        passenger_panel_frame.add(header_panel);

        passenger_panel_frame.setBounds(380, 100, 750, 500);
        passenger_panel_frame.setLayout(null);
        passenger_panel_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        passenger_panel_frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {


        if (Pick_Up_comboBox.getSelectedIndex() == 0 || Destination_comboBox.getSelectedIndex() == 0)
        {
            if (actionEvent.getSource() == book_button)
            {
                JOptionPane.showMessageDialog(null, "Please select both");
            }

        }
        else if (Pick_Up_comboBox.getSelectedIndex() == 1 && Destination_comboBox.getSelectedIndex() == 1)
        {
            if (actionEvent.getSource() == book_button) {
                JOptionPane.showMessageDialog(null, "Pick up location & Destination cannot be same");
            }
        }
        else if (Pick_Up_comboBox.getSelectedIndex() == 1 && Destination_comboBox.getSelectedIndex() == 2)
        {
            rate_label.setText("   450 - 480 Rs");

            if (actionEvent.getSource() == book_button)
            {
                passenger_panel_frame.dispose();
                new Booking_Details_A();

            }

        }
        else if (Pick_Up_comboBox.getSelectedIndex() == 1 && Destination_comboBox.getSelectedIndex() == 3)
        {
            rate_label.setText("   600 - 650 Rs");

            if (actionEvent.getSource() == book_button)
            {
                passenger_panel_frame.dispose();
                new Booking_Details_B();

            }
        }
        else if (Pick_Up_comboBox.getSelectedIndex() == 2 && Destination_comboBox.getSelectedIndex() == 1)
        {
            rate_label.setText("   450 - 490 Rs");

            if (actionEvent.getSource() == book_button)
            {
                passenger_panel_frame.dispose();
                new Booking_Details_C();

            }
        }
        else if (Pick_Up_comboBox.getSelectedIndex() == 2 && Destination_comboBox.getSelectedIndex() == 2)
        {
            if (actionEvent.getSource() == book_button) {
                JOptionPane.showMessageDialog(null, "Pick up location & Destination cannot be same");
            }
        }
        else if (Pick_Up_comboBox.getSelectedIndex() == 2 && Destination_comboBox.getSelectedIndex() == 3)
        {
            rate_label.setText("   400 - 470 Rs");

            if (actionEvent.getSource() == book_button)
            {
                passenger_panel_frame.dispose();
                new Booking_Details_A();

            }
        }
        else if (Pick_Up_comboBox.getSelectedIndex() == 3 && Destination_comboBox.getSelectedIndex() == 1)
        {
            rate_label.setText("   600 - 660 Rs");

            if (actionEvent.getSource() == book_button) {
                passenger_panel_frame.dispose();
                new Booking_Details_B();

            }
        }
        else if (Pick_Up_comboBox.getSelectedIndex() == 3 && Destination_comboBox.getSelectedIndex() == 2)
        {
            rate_label.setText("   400 - 470 Rs");

            if (actionEvent.getSource() == book_button)
            {
                passenger_panel_frame.dispose();
                new Booking_Details_C();

            }
        }
        else if (Pick_Up_comboBox.getSelectedIndex() == 3 && Destination_comboBox.getSelectedIndex() == 3)
        {
            if (actionEvent.getSource() == book_button)
            {
                JOptionPane.showMessageDialog(null, "Pick up location & Destination cannot be same");
            }
        }
        if (actionEvent.getSource() == logout_button)
        {
            passenger_panel_frame.dispose();
            new Home_Windows();

        }
        if (actionEvent.getSource() == back_button)
        {
            passenger_panel_frame.dispose();
            new Passenger_Login();

        }
    }
}
