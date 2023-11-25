import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class LoginPage extends JFrame{


    JButton Initiative;
    JButton Settings;
    Container c;



    private class ALinitiative implements ActionListener{
        public void actionPerformed(ActionEvent e){     
            
            

        }
    }
    private class ALsettings implements ActionListener{
        public void actionPerformed(ActionEvent e){     
            
            

        }
    }
    







    LoginPage(){

    //A must on Jfranes
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    c = getContentPane();
    c.setLayout(null);
    setSize(900,700);
    setTitle("Earth App");



    JLabel initiative = new JLabel ("Welcome to the Earth App %n Here you can Volunteer and Create Initiative to help save the world bit by bit!");
    initiative.setBounds(0,0,600,150);






    //buttons

    Initiative = new JButton("Create An Initiative");
    Initiative.setBounds(400,100,400,100);
    Settings = new JButton("Settings");
    Settings.setBounds(100,500,200,100);

    ALinitiative Ini = new ALinitiative();
    Initiative.addActionListener(Ini);
    ALsettings sett = new ALsettings();
    Settings.addActionListener(sett);



    //adding assests
    c.add(initiative);
    c.add(Settings);
    c.add(Initiative);








    }



}