import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewIni extends JFrame{

    JTable sos;
    Container c;
    JButton Back;
    DefaultTableModel model;

    public void loadTable() {
        try (Scanner nm = new Scanner(new FileReader("Approved.txt"))) {
            while (nm.hasNextLine()) {
                Scanner lin = new Scanner(nm.nextLine());
                Object[] rw = new Object[7];
                for (int i = 0; i < 7 && lin.hasNext(); i++) {
                    rw[i] = lin.next();
                }
                model.addRow(rw);
                lin.close();
            }
        } catch (IOException an) {
            an.printStackTrace();
        }
    }
    private class ALback implements ActionListener{
        public void actionPerformed(ActionEvent e){ 

            dispose();
        }
    }




    ViewIni(){



        // A must on JFrames
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        setSize(500, 500);
        setTitle("All Initiatives");


        Back = new JButton("Back");
        Back.setBackground(new Color(200, 184, 138));
        Back.setBounds(0,0,100,30);

        ALback s = new ALback();
        Back.addActionListener(s);
        
                

        // Jtable
        String column[]  = {"Counter","Initiator "," Initiative","Description","Credit Hour","Time","Date"};

        String row[][] = {};  
        
        model = new DefaultTableModel(row, column) {
        public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        sos = new JTable(model);
        JScrollPane y = new JScrollPane(sos);
        y.setBounds(50, 100, 400, 300);
        sos.getTableHeader().setReorderingAllowed(false);
        sos.getTableHeader().setResizingAllowed(false);

        

        c.add(y);
        c.add(Back);
        loadTable();

        c.setBackground(new Color(71, 105, 48));
        setLocationRelativeTo(null);


    }




}

