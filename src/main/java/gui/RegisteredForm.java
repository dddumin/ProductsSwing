package gui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Product;
import model.ProductList;
import model.RandomNumberGenerator;

public class RegisteredForm extends javax.swing.JFrame {
private ProductList prodList;
    public RegisteredForm(ProductList productList) {
        initComponents();
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        this.prodList = productList;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registered Product"));

        jLabel1.setText("Name");

        jLabel2.setText("Description");

        jLabel3.setText("Price");

        jButton1.setText("Add Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("The product is already on the list");

        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Description must be between 1 and 50 characters long");

        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("jLabel6");

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(10, 10, 10))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Load");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name;
        ArrayList<Integer> keys = new ArrayList<>();
        while (true) {
            name = jTextField1.getText().trim();
            if (!this.prodList.nameMatch(name)) {
                keys.add(1);
            }
            if (name.length() < 3 || name.length() > 25) {
                keys.add(2);
            }
            jLabel4.setVisible(false);
            break;
        }
        String desc = "";
        while (true) {
            desc = jTextField2.getText().trim();
            if (desc.length() < 1 || desc.length() > 50){
                keys.add(3);
            }
            jLabel5.setVisible(false);
            break;
        }           
            double price = 0;
            try{
                price = Integer.parseInt(jTextField3.getText());
                if (price <= 0) {
                    keys.add(5);
                }
                jLabel6.setVisible(false);
                for (int i = 0; i < keys.size(); i++) {
                    switch(keys.get(i)){
                        case (1):
                        jLabel4.setVisible(true);
                        jLabel4.setText("The product is already on the list");
                        break;
                        case (2):
                        jLabel4.setVisible(true);
                        jLabel4.setText("Name must be between 3 and 25 characters long");
                        break;
                        case (3):
                        jLabel5.setVisible(true);
                        break;
                        case (4):
                        jLabel6.setVisible(true);
                        jLabel6.setText("Enter a number");
                        break;
                        case (5):
                        jLabel6.setVisible(true);
                        jLabel6.setText("Please enter a number greater than 0");
                        break;
                    }
                }
                if(keys.size() > 0)
                    return;
                Product product = new Product(name, desc, price, new RandomNumberGenerator(0, 10).generate(), new RandomNumberGenerator(1, 5).generate());
                this.prodList.addProduct(product);
                JOptionPane.showMessageDialog(rootPane, "Product added", "Result", JOptionPane.INFORMATION_MESSAGE);
                jButton2ActionPerformed(evt);
                if (this.prodList.isFull()) {
                    JOptionPane.showMessageDialog(rootPane, "Added the maximum quantity of goods", "Result", JOptionPane.ERROR_MESSAGE);
                    this.dispose();
                    return;
                }                
            } catch(NumberFormatException e){
                if (price <= 0) {
                    keys.add(5);
                }
                jLabel6.setVisible(false);
                for (int i = 0; i < keys.size(); i++) {
                    switch(keys.get(i)){
                        case (1):
                        jLabel4.setVisible(true);
                        jLabel4.setText("The product is already on the list");
                        break;
                        case (2):
                        jLabel4.setVisible(true);
                        jLabel4.setText("Name must be between 3 and 25 characters long");
                        break;
                        case (3):
                        jLabel5.setVisible(true);
                        break;
                        case (4):
                        jLabel6.setVisible(true);
                        jLabel6.setText("Enter a number");
                        break;
                        case (5):
                        jLabel6.setVisible(true);
                        jLabel6.setText("Please enter a number greater than 0");
                        break;
                    }
                }
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Text files", "txt"));        
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("CSV files", "csv"));
        int res = chooser.showOpenDialog(jPanel1);        
        int count = 0;
        String format = "";
        if(res == JFileChooser.APPROVE_OPTION){             
            try(BufferedReader reader = new BufferedReader(new FileReader(chooser.getSelectedFile()))){  
                String[] products;                  
                String[] fileName = chooser.getSelectedFile().getName().split("\\.");
                format = fileName[fileName.length - 1];
                while(reader.ready()){ 
                    if(format.equals("txt")) 
                        products = reader.readLine().split(" ");                   
                    else 
                        products = reader.readLine().split(";");
                    String name = products[0];
                    if (!this.prodList.nameMatch(name) || name.length() < 3 || name.length() > 25) 
                        continue;                                       
                    String desc = products[1];
                    if(desc.length() < 1 || desc.length() > 50)
                        continue;                   
                    double price = Double.parseDouble(products[2]);
                    if(price <= 0)
                        continue;
                    this.prodList.addProduct(new Product(name, desc, price, new RandomNumberGenerator(0, 10).generate(), new RandomNumberGenerator(1, 5).generate()));
                    count++;
                }                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RegisteredForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException ignored) {                
            } catch (IOException ex) {
                Logger.getLogger(RegisteredForm.class.getName()).log(Level.SEVERE, null, ex);
            }             
            JOptionPane.showMessageDialog(rootPane, count + " Product Added", "Result", JOptionPane.INFORMATION_MESSAGE);
            if (this.prodList.isFull()) {
                    JOptionPane.showMessageDialog(rootPane, "Added the maximum quantity of goods", "Result", JOptionPane.ERROR_MESSAGE);
                    this.dispose();                    
                }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
