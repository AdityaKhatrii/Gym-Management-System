
package internalframes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import project.ConnectionProvider;
public class UpdateRawMaterialInternal extends javax.swing.JInternalFrame {

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    myframes.MainFrame1 mf;
    
    public UpdateRawMaterialInternal(myframes.MainFrame1 mainframe) {
        this.mf = mainframe;
        initComponents();
        incorrectID.setVisible(false);
    }
private void resetAll(boolean status){
    nameTxt.setText("");
    supplierTxt.setText("");
    unitTxt.setText("");
    Date date = new Date();
    purchaseDateChoose.setDate(date);
    quantityTxt.setText("");
    incorrectID.setVisible(status);
    searchTxt.setText("");
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        myButton4 = new buttons.MyButton();
        jPanel2 = new javax.swing.JPanel();
        searchTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        myButton7 = new buttons.MyButton();
        updateBtn = new buttons.MyButton();
        searchBtn = new buttons.MyButton();
        incorrectID = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantityTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        unitTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        supplierTxt = new javax.swing.JTextField();
        purchaseDateChoose = new com.toedter.calendar.JDateChooser();

        setBorder(null);
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(246, 233, 178));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Raw Material");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 6, 450, 90));

        myButton4.setBorder(null);
        myButton4.setText("Prev");
        myButton4.setBorderPainted(false);
        myButton4.setColor(new java.awt.Color(153, 0, 0));
        myButton4.setColorClick(new java.awt.Color(0, 153, 153));
        myButton4.setColorOver(new java.awt.Color(0, 102, 255));
        myButton4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        myButton4.setRadius(35);
        myButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(myButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 40, 100, -1));

        jPanel2.setBackground(new java.awt.Color(243, 202, 82));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchTxt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        searchTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchTxtMouseEntered(evt);
            }
        });
        searchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtActionPerformed(evt);
            }
        });
        jPanel2.add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 59, 433, 45));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 104, 71));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 145, 85, 32));

        nameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 195, 374, 32));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(10, 104, 71));
        jLabel5.setText("Purchase Date: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 149, 188, -1));

        myButton7.setBorder(null);
        myButton7.setText("Reset");
        myButton7.setColor(new java.awt.Color(122, 186, 120));
        myButton7.setColorOver(new java.awt.Color(0, 102, 204));
        myButton7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        myButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(myButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(827, 411, 151, 39));

        updateBtn.setBorder(null);
        updateBtn.setText("Update");
        updateBtn.setColor(new java.awt.Color(122, 186, 120));
        updateBtn.setColorOver(new java.awt.Color(255, 255, 255));
        updateBtn.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(827, 326, 151, 39));

        searchBtn.setBorder(null);
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchBtn.setText("search");
        searchBtn.setBorderPainted(false);
        searchBtn.setColor(new java.awt.Color(122, 186, 120));
        searchBtn.setColorClick(new java.awt.Color(0, 153, 153));
        searchBtn.setColorOver(new java.awt.Color(0, 102, 255));
        searchBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchBtn.setRadius(35);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel2.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 59, 113, 49));

        incorrectID.setBackground(new java.awt.Color(0, 0, 0));
        incorrectID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        incorrectID.setForeground(new java.awt.Color(255, 0, 0));
        incorrectID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        incorrectID.setText("Incorrect id");
        jPanel2.add(incorrectID, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 138, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(10, 104, 71));
        jLabel6.setText("Quantity:-");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 265, 184, 28));

        quantityTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        quantityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTxtActionPerformed(evt);
            }
        });
        jPanel2.add(quantityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 311, 332, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 104, 71));
        jLabel4.setText("Unit:-");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 359, 184, 28));

        unitTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        unitTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitTxtActionPerformed(evt);
            }
        });
        jPanel2.add(unitTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 399, 332, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(10, 104, 71));
        jLabel3.setText("Supplier:-");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 236, 184, 28));

        supplierTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        supplierTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierTxtActionPerformed(evt);
            }
        });
        jPanel2.add(supplierTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 276, 332, 30));

        purchaseDateChoose.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(purchaseDateChoose, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 192, 330, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton4ActionPerformed
        // TODO add your handling code here:
        mf.switchInternalFrames("Show Raw Materials");
        
    }//GEN-LAST:event_myButton4ActionPerformed

    private void searchTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTxtMouseClicked
        // TODO add your handling code here:
        //      searchTxt.setText("");
    }//GEN-LAST:event_searchTxtMouseClicked

    private void searchTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtMouseEntered

    private void searchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtActionPerformed

    private void myButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton7ActionPerformed
        // TODO add your handling code here:
        resetAll(false);
    }//GEN-LAST:event_myButton7ActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if(searchTxt.getText().isEmpty())
        {
            incorrectID.setVisible(true);
            return;
        }

        String id = searchTxt.getText();
        String name= nameTxt.getText();
        String quantityString = quantityTxt.getText();
        int quantity = Integer.parseInt(quantityString);
        String unit = unitTxt.getText();
        String supplier = supplierTxt.getText();
        Date date = purchaseDateChoose.getDate();
        String purchaseDate = sdf.format(date);
        Connection con = ConnectionProvider.getCon();
        PreparedStatement pmt = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "root");
            //  String query = "select * from member where mid = ? ";

            pmt = con.prepareStatement("update raw_materials set rm_name = ?, quantity = ?,unit = ?, supplier = ?,purchase_date = ? where rm_id = ?");
            pmt.setString(1, name);
            pmt.setInt(2, quantity);
            pmt.setString(3, unit);
            pmt.setString(4, supplier);
            pmt.setString(5, purchaseDate);
            pmt.setString(6, id);
            pmt.executeUpdate();
            resetAll(false);
            JOptionPane.showMessageDialog(null, "Member updated successfully");

            con.close();
            pmt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        // DB CONNECTION ENDED
    }//GEN-LAST:event_updateBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        if(searchTxt.getText().isEmpty())
        {
            incorrectID.setVisible(true);
            return;
        }

        String id = searchTxt.getText();
        Connection con = ConnectionProvider.getCon();
        PreparedStatement pmt = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "root");
            //  String query = "select * from member where mid = ? ";

            pmt = con.prepareStatement("select * from raw_materials where rm_id = ?");
            pmt.setString(1, id);
            rs = pmt.executeQuery();

            int flag = 0;
            String name = "",date = "",unit = "",supplier="";
            int quantity=0;

            if(rs.next())
            {
                //     table.addRow(new Object[] { resultSet.getString("column_name_1"), resultSet.getString("column_name_2") });}
            flag++;
            name = rs.getString("rm_name");
            unit = rs.getString("unit");

            supplier = rs.getString("supplier");
            date = rs.getString("purchase_date");

            quantity = rs.getInt("quantity");

        }

        if(flag >= 1)
        {
            nameTxt.setText(name);
            Date d = sdf.parse(date);
            purchaseDateChoose.setDate(d);

            supplierTxt.setText(supplier);
            unitTxt.setText(unit);
            quantityTxt.setText(String.valueOf(quantity));
        }
        else{
            resetAll(true);
        }
        con.close();
        pmt.close();
        rs.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(UpdateRawMaterialInternal.class.getName()).log(Level.SEVERE, null, ex);
        } 
        // DB CONNECTION ENDED
    }//GEN-LAST:event_searchBtnActionPerformed

    private void quantityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTxtActionPerformed

    private void unitTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitTxtActionPerformed

    private void supplierTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel incorrectID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private buttons.MyButton myButton4;
    private buttons.MyButton myButton7;
    private javax.swing.JTextField nameTxt;
    private com.toedter.calendar.JDateChooser purchaseDateChoose;
    private javax.swing.JTextField quantityTxt;
    private buttons.MyButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTextField supplierTxt;
    private javax.swing.JTextField unitTxt;
    private buttons.MyButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
