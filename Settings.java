import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;


public class Settings extends JFrame{

    JButton EditInfo;
    JButton Complaint;
    JButton Signout;
    Container c; 


    private class ALeditinfo implements ActionListener{
        public void actionPerformed(ActionEvent e){     
            EditInfo z = new EditInfo();
            dispose();
            

        }
    }



    private class ALcomplaint implements ActionListener{
        public void actionPerformed(ActionEvent e){    

            Complaint x =new Complaint();
            dispose();
            

        }
    }
    private class ALsignout implements ActionListener{
        public void actionPerformed(ActionEvent e){    

            Hamdan x =new Hamdan();
            dispose();
            

        }
    }




    Settings(){


        
    //A must on Jfranes
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    c = getContentPane();
    c.setLayout(null);
    setSize(400,400);
    setTitle("Settings");







        //buttons
        EditInfo = new JButton("Edit Info");
        EditInfo.setBounds(100,80,200,50);
        ALeditinfo ei = new ALeditinfo();
        EditInfo.addActionListener(ei);

        Complaint = new JButton("Complaint");
        Complaint.setBounds(100,180,200,50);
        ALcomplaint cm =new ALcomplaint();
        Complaint.addActionListener(cm);
        
        Signout = new JButton("Sign Out");
        Signout.setBounds(100,280,200,50);
        ALsignout r = new ALsignout();
        Signout.addActionListener(r);




        c.add(EditInfo);
        c.add(Complaint);
        c.add(Signout);


        setLocationRelativeTo(null);
        


    }

}