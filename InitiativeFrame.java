import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class InitiativeFrame extends JFrame{

    JTextField Theme;
    JTextArea Description;
    JButton Submit;
    JButton Back;
    Container c;
    JComboBox Day;
    JComboBox Month;
    JComboBox Year;
    JComboBox Time;
    JComboBox CreditHour;
    




    private class ALsubmit implements ActionListener{
        public void actionPerformed(ActionEvent e){ 
        	  Hamdan x = new Hamdan(); 
            dispose();   
            
            

        }
    }
    private class ALback implements ActionListener{
        public void actionPerformed(ActionEvent e){ 
        	
            Hamdan x = new Hamdan(); 
            dispose();   
            
            

        }
    }
    private class ALday implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
        }
    }
    private class ALmonth implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
        }
    }
    private class ALyear implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
        }
    }
    private class ALtime implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
        }
    }
    private class ALcredithour implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
        }
    }

    InitiativeFrame(){
    

    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    c = getContentPane();
    c.setLayout(null);
    setSize(500,800);
    setTitle("Create an Initiative");



    JLabel theme = new JLabel("What's The Name Of The Initiative?");
    theme.setBounds(190,0,150,50);
    Theme = new JTextField();
    Theme.setBounds(30,50,425,30);
    JLabel desc = new JLabel("What's The description?");
    desc.setBounds(170,100,150,50);
    Description = new JTextArea();
    Description.setBounds(30,160,425,100);
    Submit = new JButton("Submit");
    Submit.setBounds(300,700,100,30); 
    Back = new JButton("Back");
    Back.setBounds(100,700,100,30);
    JLabel DOB = new JLabel("Date Of Initiative?");
    DOB.setBounds(40,300,150,30);
    JLabel Ti = new JLabel("Time Of Initiative?");
    Ti.setBounds(40,400,150,30);
    
    String[] r = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String[] rr = {"January","Febuary","March","April","May","June","July","August","October","November","December"};
    String[] rrr = {"2023","2024"};
    String[] time = {"0000","0030","0100","0130","0200","0230","0300","0330","0400","0430","0500","0530","0600","0630","0700","0730","0800","0830","0900","0930","1000","1030","1100","1130","1200","1230","1300","1330","1400","1430","1500",
                    "1530","1600","1630","1700","1730","1800","1830","1900","1930","2000","2030","2100","2130","2200","2230","2300","2330"};


    Day = new JComboBox(r);
    Month = new JComboBox(rr);
    Year = new JComboBox(rrr);
    Time = new JComboBox(time);

    Day.setBounds(150,300,50,30);
    Month.setBounds(200,300,80,30);
    Year.setBounds(280,300,80,30);
    Time.setBounds(200,400,80,30);





    ALsubmit o = new ALsubmit();
    Submit.addActionListener(o);

    ALback s = new ALback();
    Back.addActionListener(s);

    ALday d = new ALday();
    Day.addActionListener(d);

    ALmonth m = new ALmonth();
    Month.addActionListener(m);

    ALyear y = new ALyear();
    Year.addActionListener(y);

    ALtime t = new ALtime();
    Time.addActionListener(t);



    c.add(theme);
    c.add(Theme);
    c.add(desc);
    c.add(Description);
    c.add(Back);
    c.add(Submit);
    c.add(Day);
    c.add(Month);
    c.add(Year);
    c.add(DOB);
    c.add(Time);
    c.add(Ti);



    setLocationRelativeTo(null);

    }

}
