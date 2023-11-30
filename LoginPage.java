import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class LoginPage extends JFrame{


    JButton Initiative;
    JButton Settings;
    JButton volunteer;
    JTextArea Place;
    JButton Back;
    JTable x;
    
    
    Container c;



    private class ALinitiative implements ActionListener{
        public void actionPerformed(ActionEvent e){     
            InitiativeFrame x = new InitiativeFrame();
            dispose();
            

        }
    }
    private class ALsettings implements ActionListener{
        public void actionPerformed(ActionEvent e){     
            Settings x = new Settings();
            dispose();
            
            

        }
    }
    private class ALvolunteer implements ActionListener{
        public void actionPerformed(ActionEvent e){     
            //VolunteerFrame v = new VolunteerFrame();
            ArrayList <String> test = new ArrayList<String>();
            int r = x.getSelectedRow();
            test.add(x.getValueAt(r,2).toString());
            System.out.println(test);
            
            


            

        }
    }
    

    private class ALback implements ActionListener{
        public void actionPerformed(ActionEvent e){ 
            Hamdan x = new Hamdan(); 
            dispose();   
        }
    }





    LoginPage(){

    //A must on Jframes
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    c = getContentPane();
    c.setLayout(null);
    setSize(900,700);
    setTitle("Earth App");


    
    JLabel initiative = new JLabel ("Welcome to the Earth App Here you can Volunteer and Create Initiative to help save the world bit by bit!");
    initiative.setBounds(150,0,600,150);

    


    




    //buttons

    Initiative = new JButton("Create An Initiative");
    Initiative.setBounds(250,100,400,50);
    Settings = new JButton("Settings");
    Settings.setBounds(0,580,150,80);

    volunteer = new JButton("VOLUNTEER");
    volunteer.setBounds(300,550,300,30);
    
    Back = new JButton("Back");
    Back.setBounds(0,0,100,30);
    
    
    
    ALinitiative Ini = new ALinitiative();
    Initiative.addActionListener(Ini);
    ALsettings sett = new ALsettings();
    Settings.addActionListener(sett);
    ALvolunteer vol = new ALvolunteer();
    volunteer.addActionListener(vol);











    //Jtable 
    String column [] = {"Counter","ID "," Initiative","Description","Credit Hour","Time","Date"};

    String row [][] = {{"Dino1", "Dino2","Dino3","Dino4","Dino 5","Dino6","Dino7"},
                        {"Bear 1", "Bear2","Bear3","Bear4","Bear 5","Bear6","Bear7"},
                    {"Moose 1", "Moose2","Moose3","Moose4","Moose 5","Moose6","Moose7"},
                    {"Rabbit 1", "Rabbit2","Rabbit3","Rabbit4","Rabbit 5","Rabbit 6","Rabbit 7"},
                    {"dog 1", "dog2","dog3","dog4","dog 5","dog6","dog 7"},
                    {"cat 1", "cat 2","cat3","cat4","cat 5","cat 6","cat 7"},
                    {"wolf 1", "wolf2","wolf3","wolf4","wolf 5","wolf 6","wolf 7"},
                
                
                
                
                };


DefaultTableModel model = new DefaultTableModel( row,  column) {


public boolean isCellEditable(int row, int column) {
    return false;
    }
  };
                

    
    x = new JTable(model);
    JScrollPane y = new JScrollPane(x);
    y.setBounds(200,200,500,100);
    x.getTableHeader().setReorderingAllowed(false);
    x.getTableHeader().setResizingAllowed(false);

 
    //adding assests
    c.add(initiative);
    c.add(Settings);
    c.add(Initiative);
    c.add(volunteer);
    c.add(Back);
    c.add(y);







        setLocationRelativeTo(null);
    }



}
