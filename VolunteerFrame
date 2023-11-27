import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;




public class VolunteerFrame extends JFrame{

	JLabel vol_options;
    JButton participate;
    JButton withdraw;
    JButton Back;
    Container c; 


    
    private class ALback implements ActionListener{
        public void actionPerformed(ActionEvent e){ 
            Hamdan x = new Hamdan(); 
            dispose();   
            
            

        }
    }
  
    private class ALparticipate implements ActionListener{
        public void actionPerformed(ActionEvent e){    

            Hamdan x =new Hamdan();
            dispose();
            

        }
    }
    private class ALwithdraw implements ActionListener{
        public void actionPerformed(ActionEvent e){    

            Hamdan x =new Hamdan();
            dispose();
            

        }
    }




    VolunteerFrame(){


        
    //A must on Jfranes
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    c = getContentPane();
    c.setLayout(null);
    setSize(400,400);
    setTitle("VOLUNTEER");







        //buttons
        participate = new JButton("PARTICIPATE");
        participate.setBounds(100,80,200,50);
        ALparticipate pa = new ALparticipate();
        participate.addActionListener(pa);

        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(100,180,200,50);
        ALwithdraw wi =new ALwithdraw();
        withdraw.addActionListener(wi);
        
        Back = new JButton("Back");
        Back.setBounds(100,280,200,50);
       
        JLabel vol_options = new JLabel("Volunteering Options:");
        vol_options.setBounds(140,0,200,100);

        
        
        ALback b = new ALback();
        Back.addActionListener(b);

        c.add(vol_options);
        c.add(participate);
        c.add(withdraw);
        c.add(Back);


        setLocationRelativeTo(null);
        


    }

}
