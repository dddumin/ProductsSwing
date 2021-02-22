package gui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Product;
import model.ProductList;

public class AvailableProductForm extends javax.swing.JFrame {
    private ProductList prodList;
    public AvailableProductForm(ProductList prodList) {
        initComponents();
        this.prodList = prodList;
        jList1.setModel(new DefaultComboBoxModel<>(this.prodList.getListOfProducts()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Available Products"));

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Save as...");
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

    public static File getSelectedFileWithExtension(JFileChooser c) {
        File file = c.getSelectedFile();
        if (c.getFileFilter() instanceof FileNameExtensionFilter) {
            String[] exts = ((FileNameExtensionFilter)c.getFileFilter()).getExtensions();
            String nameLower = file.getName().toLowerCase();
            for (String ext : exts) { 
                if (nameLower.endsWith('.' + ext.toLowerCase())) {
                    return file; 
                }
            }

            file = new File(file.toString() + '.' + exts[0]);
        }
        return file;
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Text files", "txt"));
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("CSV files", "csv"));        
        int res = chooser.showSaveDialog(jPanel1);        
        if(res == JFileChooser.APPROVE_OPTION){       
            File file = getSelectedFileWithExtension(chooser);
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                String[] mass = file.getName().split("\\.");
                String str = "";
                if(mass[mass.length - 1].equals("csv")){
                    for (int i = 0; i < this.prodList.getCount(); i++) {
                        Product product = this.prodList.get(i);
                        str += product.getName() + ";" + product.getDesc() + ";" + product.getQtyOnHand() +";" + product.getPrice() + ";" + product.getMinOrderQty() + "\r\n";
                    }
                    writer.write(str);
                }
                else    
                    writer.write(this.prodList.toString());
                JOptionPane.showMessageDialog(rootPane, "Product List Saved!", "Result", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(AvailableProductForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Product> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
