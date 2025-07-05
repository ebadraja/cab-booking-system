package com.cabBookingSystem.cab_owner_panel.cab_owner_panel_a;

import com.cabBookingSystem.cab_owner_panel.cab_owner_panel_b.Cab_Owner_Panel_B;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cancel_Ride_A implements ActionListener
{

    //**************************************** Declaration Section ********************************************

    JFrame cancel_frame;
    JPanel main_panel;
    JButton yes_button;
    JButton no_button;
    JLabel sure_label;

    //****************************************** Declaration Done ********************************************

    //*************************************** Initialization Section *****************************************

    public Cancel_Ride_A()
    {


        main_panel = new JPanel();
        main_panel.setLayout(null);
        main_panel.setSize(350,200);
        main_panel.setBackground(Color.DARK_GRAY);

        yes_button = new JButton("YES");
        yes_button.setBounds(90,90,60,30);
        yes_button.setBackground(Color.BLACK);
        yes_button.setForeground(Color.WHITE);
        yes_button.setFocusable(false);
        yes_button.addActionListener(this);

        no_button = new JButton("NO");
        no_button.setBounds(190,90,60,30);
        no_button.setBackground(Color.BLACK);
        no_button.setForeground(Color.WHITE);
        no_button.setFocusable(false);
        no_button.addActionListener(this);

        sure_label = new JLabel("Are you sure you wanna cancel ride?");
        sure_label.setBounds(40,40,300,30);
        sure_label.setFont( new Font("Serif",Font.BOLD,14));
        sure_label.setForeground(Color.WHITE);

        main_panel.add(yes_button);
        main_panel.add(no_button);
        main_panel.add(sure_label);

        cancel_frame = new JFrame("Cancel Ride");

        cancel_frame.add(main_panel);

        cancel_frame.setBounds(530,220,main_panel.getWidth(),main_panel.getHeight());
        cancel_frame.setLayout(null);
        cancel_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cancel_frame.setVisible(true);

    }
    public void initialization_of_GUI()
    {


        //*************************************** Cancel  Ride Frame *************************************

        cancel_frame.add(main_panel);

        cancel_frame.setBounds(530,220,main_panel.getWidth(),main_panel.getHeight());
        cancel_frame.setLayout(null);
        cancel_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cancel_frame.setVisible(true);

    }


    //**************************************** Implementation Section ****************************************

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == no_button)
        {
            cancel_frame.dispose();
            new Picked_Ride_A();


        }
        else if (actionEvent.getSource() == yes_button)
        {
            cancel_frame.dispose();
            new Cab_Owner_Panel_B();

        }
    }

    //**************************************** Implementation Done *****************************************

}