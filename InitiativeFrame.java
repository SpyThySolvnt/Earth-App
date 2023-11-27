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





    InitiativeFrame(){
    

    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    c = getContentPane();
    c.setLayout(null);
    setSize(500,500);
    setTitle("Create an Initiative");



    JLabel theme = new JLabel("What's The Theme?");
    theme.setBounds(190,0,150,50);
    Theme = new JTextField();
    Theme.setBounds(30,50,425,30);
    JLabel desc = new JLabel("What's The description?");
    desc.setBounds(170,100,150,50);
    Description = new JTextArea();
    Description.setBounds(30,160,425,200);
    Submit = new JButton("Submit");
    Submit.setBounds(300,400,100,30); 
    Back = new JButton("Back");
    Back.setBounds(100,400,100,30);  


    ALsubmit o = new ALsubmit();
    Submit.addActionListener(o);

    ALback s = new ALback();
    Back.addActionListener(s);



    c.add(theme);
    c.add(Theme);
    c.add(desc);
    c.add(Description);
    c.add(Back);
    c.add(Submit);



    setLocationRelativeTo(null);

    }

}
