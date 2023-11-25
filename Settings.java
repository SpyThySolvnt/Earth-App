import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;


public class Settings extends JFrame{

    JButton EditInfo;
    JButton Complaint;
    Container c; 


    private class ALeditinfo implements ActionListener{
        public void actionPerformed(ActionEvent e){     
            
            

        }
    }



    private class ALcomplaint implements ActionListener{
        public void actionPerformed(ActionEvent e){     
            
            

        }
    }




    Settings(){


        
    //A must on Jfranes
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    c = getContentPane();
    c.setLayout(null);
    setSize(420,420);
    setTitle("Settings");







        //buttons
        EditInfo = new JButton("Edit Info");
        EditInfo.setBounds(100,100,200,50);
        ALeditinfo ei = new ALeditinfo();
        EditInfo.addActionListener(ei);

        Complaint = new JButton("Complaint");
        Complaint.setBounds(100,200,200,50);
        ALcomplaint cm =new ALcomplaint();
        Complaint.addActionListener(cm);




        c.add(EditInfo);
        c.add(Complaint);


        setLocationRelativeTo(null);
        


    }

}