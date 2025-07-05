package com.cabBookingSystem.admin_panel.modify_data;

import com.cabBookingSystem.admin_panel.admin.Admin_Panel;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;

public class Modify_Passenger_Data implements ActionListener
{

    //**************************************** Declaration Section ********************************************

    DefaultTableModel tableModel;
    JTable table;
    JScrollPane scrollPane;

    JTextField passenger_name_textField;
    JTextField contact_textField;
    JTextField address_textField;

    JLabel passenger_data_label;
    JLabel passenger_name_label;
    JLabel contact_label;
    JLabel address_label;
    JLabel header_label;

    JPanel panel1;
    JPanel panel2;

    JButton add;
    JButton remove;
    JButton back;
    JFrame frame;

    //****************************************** Declaration Done ********************************************

    //*************************************** Initialization Section *****************************************

    public void modify_passenger_data_method()
    {

        //****************************************** Main Panel ******************************************

        panel1 =new JPanel();
        panel1.setLayout(null);
        panel1.setLocation(0,90);
        panel1.setSize(750,500);
        panel1.setBackground(Color.DARK_GRAY);

        //***************************************** Header Panel *****************************************

        panel2 =new JPanel();
        panel2.setLayout(null);
        panel2.setLocation(0,0);
        panel2.setSize(750,89);
        panel2.setBackground(Color.black);

        //************************************** Header Panel Label **************************************

        header_label = new JLabel("CAB BOOKING SYSTEM");
        header_label.setFont( new Font("Serif",Font.BOLD,28));
        header_label.setForeground(Color.WHITE);
        header_label.setBounds(180,15,390,70);

        //****************************************** Table Model *****************************************

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Passenger Name");
        tableModel.addColumn("Contact");
        tableModel.addColumn("Address");

        //****************************************** Table Item *****************************************

        table = new JTable(tableModel);

        //***************************************** Scroll Pane *****************************************

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(110,55,500,68);
        scrollPane.setFont( new Font("Serif",Font.PLAIN,16));

        //*********************************** Passenger Name TextField **********************************

        passenger_name_textField = new JTextField();
        passenger_name_textField.setLocation(370,150);
        passenger_name_textField.setSize(200,30);
        passenger_name_textField.setFont( new Font("Serif",Font.PLAIN,14));

        //*************************************** Contact TextField **************************************

        contact_textField = new JTextField();
        contact_textField.setLocation(370,190);
        contact_textField.setSize(200,30);
        contact_textField.setFont( new Font("Serif",Font.PLAIN,14));

        //*************************************** Address TextField *************************************

        address_textField = new JTextField();
        address_textField.setLocation(370,230);
        address_textField.setSize(200,30);
        address_textField.setFont( new Font("Serif",Font.PLAIN,14));

        //************************************ Passenger Data Label ************************************

        passenger_data_label = new JLabel("Passenger Data");
        passenger_data_label.setBounds(240,0,250,40);
        passenger_data_label.setForeground(Color.WHITE);
        passenger_data_label.setFont( new Font("Serif",Font.BOLD,22));

        //************************************ Passenger Name Label ************************************

        passenger_name_label = new JLabel("Passenger Name");
        passenger_name_label.setBounds(170,149,200,40);
        passenger_name_label.setForeground(Color.WHITE);
        passenger_name_label.setFont( new Font("Serif",Font.BOLD,18));

        //**************************************** Contact Label ***************************************

        contact_label = new JLabel("Contact");
        contact_label.setBounds(170,189,200,40);
        contact_label.setForeground(Color.WHITE);
        contact_label.setFont( new Font("Serif",Font.BOLD,18));

        //**************************************** Address Label ***************************************

        address_label = new JLabel("Address");
        address_label.setBounds(170,229,200,40);
        address_label.setForeground(Color.WHITE);
        address_label.setFont( new Font("Serif",Font.BOLD,18));

        //***************************************** Add Button *****************************************

        add = new JButton("ADD");
        add.setBounds(205,310,120,30);
        add.setBackground(Color.decode("#165d00"));
        add.setFont( new Font("Serif",Font.BOLD,14));
        add.setForeground(Color.WHITE);
        add.setFocusable(false);
        add.addActionListener(this);

        //*************************************** Remove Button ****************************************

        remove = new JButton("REMOVE");
        remove.setBounds(415,310,120,30);
        remove.setBackground(Color.decode("#790000"));
        remove.setFont( new Font("Serif",Font.BOLD,14));
        remove.setForeground(Color.WHITE);
        remove.setFocusable(false);
        remove.addActionListener(this);

        //**************************************** Back Button *****************************************

        back = new JButton("< BACK");
        back.setBounds(0,0,100,20);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.WHITE);
        back.setFocusable(false);
        back.addActionListener(this);

        //************************************** Main Panel Items ***************************************

        panel1.add(scrollPane);
        panel1.add(passenger_data_label);
        panel1.add(passenger_name_label);
        panel1.add(contact_label);
        panel1.add(address_label);
        panel1.add(passenger_name_textField);
        panel1.add(contact_textField);
        panel1.add(address_textField);
        panel1.add(add);
        panel1.add(remove);

        //*************************************** Header Panel Items *************************************

        panel2.add(back);
        panel2.add(header_label);

        //********************************** Modify Passenger Data Frame *********************************

        frame = new JFrame("Passenger Data Modification");;

        //*****************************************  Frame Items *****************************************

        frame.add(panel1);
        frame.add(panel2);

        //********************************** Modify Passenger Data Frame *********************************

        frame.setBounds(370,90,750,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //******************************************* GUI End *******************************************

    }

    //**************************************** Implementation Section ****************************************

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == add) {
            if (!passenger_name_textField.getText().equals("") && !contact_textField.getText().equals("") && !address_textField.getText().equals("")) {
                String s1 = passenger_name_textField.getText();
                String s2 = contact_textField.getText();
                String s3 = address_textField.getText();

                String[] strings = {s1, s2, s3};
                tableModel.addRow(strings);
                passenger_name_textField.setText("");
                contact_textField.setText("");
                address_textField.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "please fill all details");
            }
        }
        else if (actionEvent.getSource() == remove)
        {

            if (table.getRowCount() >= 1) {

                tableModel.removeRow(table.getSelectedRow());
            }

        }
        else if (actionEvent.getSource() == back)
        {

            frame.dispose();
            new Admin_Panel();

        }
    }

    //**************************************** Implementation Done *****************************************
}
