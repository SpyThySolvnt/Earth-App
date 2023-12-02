import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AdminPage extends JFrame{


    JButton Approve;
    JTextArea Initiatives;
    JTable z;
    JButton Reject;
    JButton AllUsers;
    JButton Allini;
    JButton RUser;
    JButton Rini;
    JButton VAini;
    JButton Back;
    Container c;
    DefaultTableModel model;




//////////////////
private static void removeRowFile(String filePath, int rowIndexToRemove) {
    
    ArrayList<String> lines = new ArrayList<>();
    try (Scanner scanner = new Scanner(new FileReader(filePath))) {
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
    } catch (IOException x) {
        x.printStackTrace();
        return; 
    }

    
    if (rowIndexToRemove >= 0 && rowIndexToRemove <= lines.size()) {
        lines.remove(rowIndexToRemove);
    } else {
        System.out.println("Invalid row index to remove.");
        return;
    }

    
    try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
        for (String line : lines) {
            writer.println(line);
        }
    } catch (IOException ex) {
        ex.printStackTrace();
        
    }
}
//////////////

       private class ALreject implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (model != null && z.getSelectedRow() != -1) {
                
                Object[] shew = new Object[model.getColumnCount()];
                for (int i = 0; i < model.getColumnCount(); i++) {
                    shew[i] = model.getValueAt(z.getSelectedRow(), i);
                }
    
                
                model.removeRow(z.getSelectedRow());
    
                
                RejectedData(shew);

                removeRowFile("PendingAdmin.txt",z.getSelectedRow()+1);

                
            } else {
                JOptionPane.showMessageDialog(AdminPage.this, "Please select a row to reject.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
            }
        }
    }



    private void RejectedData(Object[] rowData) {
        try (PrintWriter wx = new PrintWriter(new FileWriter("Rejected.txt", true))) {
            for (Object data : rowData) {
                wx.print(data + " ");
            }
            wx.println();  
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error writing to Rejected.txt");
        }
    }
//////////////////

private void ApprovedData(Object[] rowData) {
        try (PrintWriter wx = new PrintWriter(new FileWriter("Approved.txt", true))) {
            for (Object data : rowData) {
                wx.print(data + " ");
            }
            wx.println();  
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error writing to Rejected.txt");
        }
    }
    ///////////////////
    private class ALapprove implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                if (model != null && z.getSelectedRow() != -1) {
                   if (model != null && z.getSelectedRow() != -1) {
                // Get the data of the rejected row
                Object[] shew = new Object[model.getColumnCount()];
                for (int i = 0; i < model.getColumnCount(); i++) {
                    shew[i] = model.getValueAt(z.getSelectedRow(), i);
                }
    
                
                model.removeRow(z.getSelectedRow());
    
                
                ApprovedData(shew);

                removeRowFile("PendingAdmin.txt",z.getSelectedRow()+1);

                
            } else {
                JOptionPane.showMessageDialog(AdminPage.this, "Please select a row to approve.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    }
    private class ALuser implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            AllUsers v = new AllUsers();
        }
    }
    private class ALini implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            AllInitiatives i = new AllInitiatives();



        }
    }
    private class ALremoveuser implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            RemoveUser z = new RemoveUser();


        }
    }
    private class ALrini implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            RemoveInitiatives z = new RemoveInitiatives();

        }
    }
    private class ALvini implements ActionListener {
        public void actionPerformed(ActionEvent e) {   
            ViewIni vini = new ViewIni();

            
        }
    }
    private class ALback implements ActionListener{
        public void actionPerformed(ActionEvent e){ 
            Hamdan x = new Hamdan();
            dispose();
        }
    }

    public void loadTable() {
        try (Scanner nm = new Scanner(new FileReader("PendingAdmin.txt"))) {
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


    AdminPage() {
        // A must on JFrames
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        setSize(900, 700);
        setTitle("Admin");

       
        JLabel sel = new JLabel("Select Your Initiative To Approve Or Reject!");
        sel.setForeground(Color.WHITE);
        sel.setBounds(180,150,500,60);


        VAini = new JButton("Approved Initiatives");
        VAini.setBounds(700,100,150,50);
        VAini.setBackground(new Color(200, 184, 138));

        Reject = new JButton("Reject");
        Reject.setBounds(100, 450, 150, 50);
        Reject.setBackground(new Color(200, 184, 138));

        Approve = new JButton("Approve");
        Approve.setBounds(370, 450, 150, 50);
        Approve.setBackground(new Color(200, 184, 138));

        AllUsers = new JButton("View All Users");
        AllUsers.setBounds(700,500,150,50);
        AllUsers.setBackground(new Color(200, 184, 138));

        Allini = new JButton("View All Initiatives");
        Allini.setBounds(700,400,150,50);
        Allini.setBackground(new Color(200, 184, 138));

        RUser = new JButton("Remove User");
        RUser.setBounds(700,300,150,50);
        RUser.setBackground(new Color(200, 184, 138));

        Rini = new JButton("Remove Initiatives");
        Rini.setBounds(700,200,150,50);
        Rini.setBackground(new Color(200, 184, 138));


        Back = new JButton("Back");
        Back.setBounds(0,0,100,30);
        Back.setBackground(new Color(200, 184, 138));

        ALback s = new ALback();
        Back.addActionListener(s);


        ALvini vini = new ALvini();
        VAini.addActionListener(vini);


        ALrini meow = new ALrini();
        Rini.addActionListener(meow);


        ALremoveuser ru = new ALremoveuser();
        RUser.addActionListener(ru);

        ALini i = new ALini();
        Allini.addActionListener(i);

        ALuser u = new ALuser();
        AllUsers.addActionListener(u);

        ALreject r = new ALreject();
        Reject.addActionListener(r);

        ALapprove a = new ALapprove();
        Approve.addActionListener(a);


        // Jtable
        String column[] = {"Counter", "ID ", " Initiative", "Description", "Credit Hour", "Time", "Date"};

        String row[][] = {};  // You may want to initialize with more rows

        model = new DefaultTableModel(row, column) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        z = new JTable(model);
        JScrollPane y = new JScrollPane(z);
        y.setBounds(60, 200, 500, 200);
        z.getTableHeader().setReorderingAllowed(false);
        z.getTableHeader().setResizingAllowed(false);

        
        c.add(y);
        c.add(Reject);
        c.add(Approve);
        c.add(AllUsers);
        c.add(Allini);
        c.add(RUser);
        c.add(Rini);
        c.add(sel);
        c.add(VAini);
        c.add(Back);
        loadTable();
        c.setBackground(new Color(71, 105, 48));
        setLocationRelativeTo(null);
    }
}