import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RemoveUser extends JFrame{


    JTable re;
    Container c;
    JButton Back;
    JButton Remove;
    DefaultTableModel model;

    public void loadTable() {
        try (Scanner nm = new Scanner(new FileReader("UserPass.txt"))) {
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
   
    private static void removeRowFile(String filePath, int rowIndexToRemove) {
        // Read the content of the original file
        ArrayList<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader(filePath))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (IOException x) {
            x.printStackTrace();
            return; // Handle the error or log it
        }
    
        // Remove the specified row index
        if (rowIndexToRemove >= 0 && rowIndexToRemove < lines.size()) {
            lines.remove(rowIndexToRemove);
        } else {
            System.out.println("Invalid row index to remove.");
            return;
        }
    
        // Write the modified content back to the original file
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            // Handle the error or log it
        }
    }
    private class ALback implements ActionListener{
        public void actionPerformed(ActionEvent e){ 

            dispose();
        }
    }


    private class ALremoveU implements ActionListener{
        public void actionPerformed(ActionEvent e){ 
            if (model != null && re.getSelectedRow() != -1) {
                if (model != null && re.getSelectedRow() != -1) {
             // Get the data of the rejected row
             Object[] shew = new Object[model.getColumnCount()];
             for (int i = 0; i < model.getColumnCount(); i++) {
                 shew[i] = model.getValueAt(re.getSelectedRow(), i);
             }
 
             // Remove the row from the table
 
             // Write the rejected data to a separate file (e.g., Rejected.txt)
            //  plswork(shew);

             removeRowFile("UserPass.txt",re.getSelectedRow());
             model.removeRow(re.getSelectedRow());
             System.out.println(re.getSelectedRow());   
             
         } else {
             JOptionPane.showMessageDialog(RemoveUser.this, "Please select a row to approve.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
         }
     }        
  }
}





    RemoveUser(){



        // A must on JFrames
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        setSize(500, 500);
        setTitle("Remove A User");


        Back = new JButton("Back");
        Back.setBackground(new Color(200, 184, 138));
        Back.setBounds(0,0,100,30);

        Remove = new JButton("Remove");
        Remove.setBackground(new Color(200, 184, 138));
        Remove.setBounds(150,410,200,50);

        ALremoveU u = new ALremoveU();
        Remove.addActionListener(u);

        ALback s = new ALback();
        Back.addActionListener(s);
        
                

        // Jtable
        String column[] = {"DataBase","Name","Password","Phone#","Email","Address","Date Of Birth"};

        String row[][] = {};  
        
        model = new DefaultTableModel(row, column) {
        public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        re = new JTable(model);
        JScrollPane y = new JScrollPane(re);
        y.setBounds(50, 100, 400, 300);
        re.getTableHeader().setReorderingAllowed(false);
        re.getTableHeader().setResizingAllowed(false);

        

        c.add(y);
        c.add(Back);
        c.add(Remove);
        loadTable();

        c.setBackground(new Color(71, 105, 48));
        setLocationRelativeTo(null);


    }




}
    

