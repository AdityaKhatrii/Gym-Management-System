package internalframes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UpdateEquipmentInternal extends javax.swing.JInternalFrame {

    private myframes.MainFrame1 mf;
    
    public UpdateEquipmentInternal(myframes.MainFrame1 mf) {
        this.mf = mf;
        initComponents();
        incorrectID.setVisible(false);
    }

 private void resetAll(boolean status)
{
       incorrectID.setVisible(status);
       searchTxt.setText("");
       maintenanceDateTxt.setText("");
       eqNameTxt.setText("");
       maintenanceDateTxt.setText("");
       
       purchaseDateTxt.setText("");
       
       statusTxt.setText("");
}   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        myButton4 = new buttons.MyButton();
        jPanel2 = new javax.swing.JPanel();
        saveBtn = new buttons.MyButton();
        resetBtn = new buttons.MyButton();
        searchBtn = new buttons.MyButton();
        searchTxt = new javax.swing.JTextField();
        incorrectID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        maintenanceDateTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        statusTxt = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        eqNameTxt = new javax.swing.JTextField();
        purchaseDateTxt = new javax.swing.JTextField();

        setBorder(null);
        setFrameIcon(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 243, 207));
        jPanel1.setPreferredSize(new java.awt.Dimension(1370, 114));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Equipment");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 6, 364, 90));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 120));

        jPanel2.setBackground(new java.awt.Color(232, 200, 114));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1370, 590));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveBtn.setBorder(null);
        saveBtn.setText("Save Changes");
        saveBtn.setColor(new java.awt.Color(99, 122, 159));
        saveBtn.setColorOver(new java.awt.Color(0, 102, 204));
        saveBtn.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel2.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 200, 151, 39));

        resetBtn.setBorder(null);
        resetBtn.setText("Reset");
        resetBtn.setColor(new java.awt.Color(99, 122, 159));
        resetBtn.setColorOver(new java.awt.Color(0, 102, 204));
        resetBtn.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jPanel2.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 270, 151, 39));

        searchBtn.setBorder(null);
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchBtn.setText("search");
        searchBtn.setBorderPainted(false);
        searchBtn.setColor(new java.awt.Color(99, 122, 159));
        searchBtn.setColorClick(new java.awt.Color(0, 153, 153));
        searchBtn.setColorOver(new java.awt.Color(0, 102, 255));
        searchBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchBtn.setRadius(35);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel2.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1157, 76, 113, 49));

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
        jPanel2.add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 76, 433, 45));

        incorrectID.setBackground(new java.awt.Color(0, 0, 0));
        incorrectID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        incorrectID.setForeground(new java.awt.Color(255, 0, 0));
        incorrectID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        incorrectID.setText("Incorrect id");
        jPanel2.add(incorrectID, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 17, 138, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(99, 122, 159));
        jLabel2.setText("Name:-");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 220, 41));

        maintenanceDateTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        maintenanceDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenanceDateTxtActionPerformed(evt);
            }
        });
        jPanel2.add(maintenanceDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 332, 45));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(99, 122, 159));
        jLabel6.setText("Purchase Date:-");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 229, 28));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(99, 122, 159));
        jLabel5.setText("Status:-");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 184, 28));

        statusTxt.setColumns(20);
        statusTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        statusTxt.setRows(5);
        jScrollPane1.setViewportView(statusTxt);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 332, 88));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(99, 122, 159));
        jLabel4.setText("Maintenance Date:-");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 258, 28));

        eqNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        eqNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eqNameTxtActionPerformed(evt);
            }
        });
        jPanel2.add(eqNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 332, 45));

        purchaseDateTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        purchaseDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseDateTxtActionPerformed(evt);
            }
        });
        jPanel2.add(purchaseDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 332, 45));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 110, 1380, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton4ActionPerformed
        // TODO add your handling code here:
        mf.switchInternalFrames("Show Equipments");
    }//GEN-LAST:event_myButton4ActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:

        if(searchTxt.getText().isEmpty())
        {
            incorrectID.setVisible(true);
            return;
        }

        String id = searchTxt.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String name = eqNameTxt.getText();
        String status = statusTxt.getText();
        String pDate = purchaseDateTxt.getText();
        String mDate = maintenanceDateTxt.getText();

        Connection con = null;
        PreparedStatement pmt = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "root");
            String query = "UPDATE equipment SET eq_name = ? , purchase_date = ? , maintenance_date = ? , status = ? WHERE eq_id = ?";

            pmt = con.prepareStatement(query);
            pmt.setString(1, name);
            pmt.setString(2, pDate);
            pmt.setString(3, mDate);
            pmt.setString(4, status);
            pmt.setString(5, id);

            pmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data updated successfully");

            resetAll(false);
            searchTxt.setText("");

            con.close();
            pmt.close();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Pehle dhang se entry krna seekh ke aa");
            Logger.getLogger(UpdateEquipmentInternal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pehle dhang se entry krna seekh ke aa");
            Logger.getLogger(UpdateEquipmentInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
        // DB CONNECTION ENDED
    }//GEN-LAST:event_saveBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here: r40418r17

        resetAll(false);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        if(searchTxt.getText().isEmpty())
        {
            incorrectID.setVisible(true);
            return;
        }

        String id = searchTxt.getText();
        Connection con = null;
        PreparedStatement pmt = null;
        ResultSet rs = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "root");
            //  String query = "select * from member where mid = ? ";

            pmt = con.prepareStatement("select * from equipment where eq_id = ?");
            pmt.setString(1, id);
            rs = pmt.executeQuery();

            int flag = 0;

            String name = "",status = "",pDate = "",mDate = "";

            long phone=0;
            int age=0,amount=0;
            if(rs.next())
            {
                //     table.addRow(new Object[] { resultSet.getString("column_name_1"), resultSet.getString("column_name_2") });}
            flag++;
            name = rs.getString("eq_name");
            pDate = rs.getString("purchase_date");
            mDate = rs.getString("maintenance_date");
            status = rs.getString("status");

        }

        if(flag == 1)
        {
            eqNameTxt.setText(name);
            purchaseDateTxt.setText(pDate);
            maintenanceDateTxt.setText(mDate);
            statusTxt.setText(status);
            incorrectID.setVisible(false);
        }
        else{
            resetAll(true);
        }
        con.close();
        pmt.close();
        rs.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateEquipmentInternal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateEquipmentInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
        // DB CONNECTION ENDED
    }//GEN-LAST:event_searchBtnActionPerformed

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

    private void maintenanceDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintenanceDateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maintenanceDateTxtActionPerformed

    private void eqNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eqNameTxtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_eqNameTxtActionPerformed

    private void purchaseDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseDateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseDateTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eqNameTxt;
    private javax.swing.JLabel incorrectID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maintenanceDateTxt;
    private buttons.MyButton myButton4;
    private javax.swing.JTextField purchaseDateTxt;
    private buttons.MyButton resetBtn;
    private buttons.MyButton saveBtn;
    private buttons.MyButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTextArea statusTxt;
    // End of variables declaration//GEN-END:variables
}
