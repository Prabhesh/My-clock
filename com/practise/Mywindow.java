package com.practise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Mywindow  extends JFrame {
    private JLabel heading;
    private JLabel clockLable;
    private Font font=new Font("",Font.BOLD,35);
    public Mywindow(){
        super.setTitle("My Clock");
        super.setSize(400,400);
        super.setLocation(300,50);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }
    public void createGUI()
    {
        heading = new JLabel("My Clock");
        clockLable = new JLabel("clock");
                heading.setFont(font);
        clockLable.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLable);

    }
    public void startClock(){
        Timer timer=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String dateTime=new Date().toString();
                String dateTime=new Date().toLocaleString();
                clockLable.setText(dateTime);
            }
        });
        timer.start();
    }
}
