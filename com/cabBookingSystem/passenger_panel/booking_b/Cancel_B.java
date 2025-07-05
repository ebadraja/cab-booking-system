package com.cabBookingSystem.passenger_panel.booking_b;

import com.cabBookingSystem.passenger_panel.panel.Passenger_Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cancel_B implements ActionListener
{
    JFrame cancel_frame;
    JPanel panel;
    JButton yes;
    JButton no;
    JLabel sure;

    public Cancel_B() {

        panel = new JPanel();
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(350, 200);
        panel.setBackground(Color.DARK_GRAY);

        yes = new JButton("YES");
        yes.setBounds(90, 90, 60, 30);
        yes.setBackground(Color.BLACK);
        yes.setForeground(Color.WHITE);
        yes.setFocusable(false);
        yes.addActionListener(this);

        no = new JButton("NO");
        no.setBounds(190, 90, 60, 30);
        no.setBackground(Color.BLACK);
        no.setForeground(Color.WHITE);
        no.setFocusable(false);
        no.addActionListener(this);

        sure = new JLabel("Are you sure you wanna cancel ride?");
        sure.setBounds(40, 40, 300, 30);
        sure.setFont(new Font("Serif", Font.BOLD, 14));
        sure.setForeground(Color.WHITE);

        panel.add(yes);
        panel.add(no);
        panel.add(sure);

        cancel_frame = new JFrame("Cancel Booking");

        cancel_frame.add(panel);

        cancel_frame.setBounds(560, 285, panel.getWidth(), panel.getHeight());
        cancel_frame.setLayout(null);
        cancel_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cancel_frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == no)
        {
            cancel_frame.dispose();
            new Booking_Details_B();

        }
        else if (actionEvent.getSource() == yes)
        {
            cancel_frame.dispose();
            new Passenger_Panel();

        }
    }
}
