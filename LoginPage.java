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
    JButton MyInitiatives;
    JTable x;
   
    
    public static String row [][] ;
    Container c;





    public void loadTable()  {
        DefaultTableModel t = (DefaultTableModel) x.getModel();

        try (Scanner nm = new Scanner(new FileReader("Approved.txt"))) {

            while (nm.hasNextLine()) {
                Scanner lin = new Scanner(nm.nextLine());
                Object[] rw = new Object[7];
                for (int i = 0; i < 7 && lin.hasNext(); i++) {
                    rw[i] = lin.next();
}
                t.addRow(rw);
                lin.close();
            }

        } catch (IOException an) {
            an.printStackTrace();
        }
    }
// private void writeObjectToFile(PrintWriter writer, Object[] rowData) {
// 		// Modify this method based on your actual object type and how you want to format it in the file
// 		for (Object obj : rowData) {
// 			writer.print(obj + " ");
// 		}
// 		writer.println(); // Move to the next line for the next object
// 	}
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
    private class ALmyini implements ActionListener{
        public void actionPerformed(ActionEvent e){ 


   
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
    initiative.setForeground(Color.WHITE);
    initiative.setBounds(150,0,600,150);

    


    




    //buttons

    Initiative = new JButton("Create An Initiative");
    Initiative.setBackground(new Color(200, 184, 138));
    Initiative.setBounds(250,100,400,50);

    Settings = new JButton("Settings");
    Settings.setBackground(new Color(200, 184, 138));
    Settings.setBounds(0,580,150,80);

    volunteer = new JButton("VOLUNTEER");
    volunteer.setBackground(new Color(200, 184, 138));
    volunteer.setBounds(260,550,150,30);
    
    Back = new JButton("Back");
    Back.setBackground(new Color(200, 184, 138));
    Back.setBounds(0,0,100,30);


    MyInitiatives = new JButton("My Initiatives");
    MyInitiatives.setBackground(new Color(200, 184, 138));
    MyInitiatives.setBounds(500,550,150,30);
    
    
    
    ALinitiative Ini = new ALinitiative();
    Initiative.addActionListener(Ini);
    ALsettings sett = new ALsettings();
    Settings.addActionListener(sett);
    ALvolunteer vol = new ALvolunteer();
    volunteer.addActionListener(vol);
    ALback b = new ALback();
    Back.addActionListener(b);
    ALmyini i = new ALmyini();
    MyInitiatives.addActionListener(i);









    // Vector rows = new Vector(); 

    // rows.add((Database.EventList.));
    







    // Vector columns = new Vector();


    // columns.add("test 1 ");
    // columns.add("test2");

    


    //Jtable 
    String columns[]  = {"Counter","Initiator "," Initiative","Description","Credit Hour","Time","Date"};
    
 
	

  

DefaultTableModel model = new DefaultTableModel(  row ,  columns ) {


public boolean isCellEditable( int rows,  int columns) {
    return false;
    }
  };
                

    
    x = new JTable(model);
    JScrollPane y = new JScrollPane(x);
    y.setBounds(150,200,600,300);
    x.getTableHeader().setReorderingAllowed(false);
    x.getTableHeader().setResizingAllowed(false);
    
//    rows.add(Database.EventList.get(1).getNameOE());
//    System.out.print(rows);
  //adding assests


    loadTable();


    c.add(initiative);
    c.add(Settings);
    c.add(Initiative);
    c.add(volunteer);
    c.add(Back);
    c.add(MyInitiatives);
    c.add(y);
    c.setBackground(new Color(71, 105, 48));





//

        setLocationRelativeTo(null);
    }



}
