package internalframes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import project.ConnectionProvider;

public class RemoveFeesInternal extends javax.swing.JInternalFrame {

    private myframes.MainFrame1 mf;
    
    public RemoveFeesInternal(myframes.MainFrame1 mf) {
        this.mf = mf;
        initComponents();
        
        incorrectID.setVisible(false);
    }

    private void resetAll(boolean status){
            searchTxt.setText("");
            incorrectID.setVisible(status);
            midTxt.setText("");
            nameTxt.setText("");
            dueDateTxt.setText("");
            paymentDateTxt.setText("");
            amountTxt.setText("");
            isPaidTxt.setText("");
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
        midTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        paymentDateTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dueDateTxt = new javax.swing.JTextField();
        myButton7 = new buttons.MyButton();
        removeBtn = new buttons.MyButton();
        searchBtn = new buttons.MyButton();
        incorrectID = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        isPaidTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();

        setBorder(null);
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(236, 202, 156));

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Remove Fees");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(myButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(378, 378, 378)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(528, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(219, 169, 121));
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
        jPanel2.add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 433, 45));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(232, 239, 207));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Member id:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 132, 32));

        midTxt.setEditable(false);
        midTxt.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jPanel2.add(midTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 374, 32));

        nameTxt.setEditable(false);
        nameTxt.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jPanel2.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 374, 32));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(232, 239, 207));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Payment Date:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 171, 32));

        paymentDateTxt.setEditable(false);
        paymentDateTxt.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jPanel2.add(paymentDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 374, 32));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(232, 239, 207));
        jLabel5.setText("Due Date: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 188, -1));

        dueDateTxt.setEditable(false);
        dueDateTxt.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        dueDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dueDateTxtActionPerformed(evt);
            }
        });
        jPanel2.add(dueDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 337, 32));

        myButton7.setBorder(null);
        myButton7.setText("Reset");
        myButton7.setColor(new java.awt.Color(175, 209, 152));
        myButton7.setColorOver(new java.awt.Color(0, 102, 204));
        myButton7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        myButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(myButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 280, 151, 39));

        removeBtn.setBorder(null);
        removeBtn.setText("Remove");
        removeBtn.setColor(new java.awt.Color(175, 209, 152));
        removeBtn.setColorOver(new java.awt.Color(255, 255, 255));
        removeBtn.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        jPanel2.add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 220, 151, 39));

        searchBtn.setBorder(null);
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchBtn.setText("search");
        searchBtn.setBorderPainted(false);
        searchBtn.setColor(new java.awt.Color(175, 209, 152));
        searchBtn.setColorClick(new java.awt.Color(0, 153, 153));
        searchBtn.setColorOver(new java.awt.Color(0, 102, 255));
        searchBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchBtn.setRadius(35);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel2.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 113, 49));

        incorrectID.setBackground(new java.awt.Color(0, 0, 0));
        incorrectID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        incorrectID.setForeground(new java.awt.Color(255, 0, 0));
        incorrectID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        incorrectID.setText("Incorrect id");
        jPanel2.add(incorrectID, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 138, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(232, 239, 207));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Name:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 85, 32));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(232, 239, 207));
        jLabel7.setText("Paid: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 188, 39));

        isPaidTxt.setEditable(false);
        isPaidTxt.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        isPaidTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isPaidTxtActionPerformed(evt);
            }
        });
        jPanel2.add(isPaidTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 337, 32));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(232, 239, 207));
        jLabel8.setText("Amount: ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 188, 32));

        amountTxt.setEditable(false);
        amountTxt.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        amountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTxtActionPerformed(evt);
            }
        });
        jPanel2.add(amountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 337, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton4ActionPerformed
        // TODO add your handling code here:
        mf.switchInternalFrames("Show Fees");
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

    private void dueDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dueDateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dueDateTxtActionPerformed

    private void myButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton7ActionPerformed
        // TODO add your handling code here:
        resetAll(false);
    }//GEN-LAST:event_myButton7ActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        if(searchTxt.getText().isEmpty())
        {
            incorrectID.setVisible(true);
            return;
        }

        String id = searchTxt.getText();
        Connection con = ConnectionProvider.getCon();
        PreparedStatement pmt = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "root");
            //  String query = "select * from member where mid = ? ";

            pmt = con.prepareStatement("delete from fees where fee_id = ?");
            pmt.setString(1, id);
            pmt.executeUpdate();
            resetAll(false);
            JOptionPane.showMessageDialog(null, "Member removed successfully");

            con.close();
            pmt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RemoveFeesInternal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RemoveFeesInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
        // DB CONNECTION ENDED
    }//GEN-LAST:event_removeBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        if(searchTxt.getText().isEmpty())
        {
            incorrectID.setVisible(true);
            return;
        }

        String fid = searchTxt.getText();
        Connection con = ConnectionProvider.getCon();
        PreparedStatement pmt = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "root");
            //  String query = "select * from member where mid = ? ";

            pmt = con.prepareStatement("SELECT m.m_name,f.* FROM member m INNER JOIN fees f ON f.mid = m.mid AND f.fee_id = ?");
            pmt.setString(1, fid);
            rs = pmt.executeQuery();

            int flag = 0;
            String memberName = "",payDate = "",mid = "",dueDate="";
            int amount = 0;
            boolean paid = false;

            if(rs.next())
            {
                //     table.addRow(new Object[] { resultSet.getString("column_name_1"), resultSet.getString("column_name_2") });}
            flag++;
            memberName = rs.getString("m_name");
            mid = rs.getString("mid");
            dueDate = rs.getString("due_date");
            payDate = rs.getString("payment_date");
            paid = rs.getBoolean("paid");
            amount = rs.getInt("amount");

        }

        if(flag >= 1)
        {
            midTxt.setText(mid);
            nameTxt.setText(memberName);
            dueDateTxt.setText(dueDate);
            paymentDateTxt.setText(payDate);
            amountTxt.setText(String.valueOf(amount));
            String status = "NO";
            if(paid){
                status = "YES";
            }
            isPaidTxt.setText(status);
        }
        else{
            resetAll(true);
        }
        con.close();
        pmt.close();
        rs.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RemoveFeesInternal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RemoveFeesInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
        // DB CONNECTION ENDED
    }//GEN-LAST:event_searchBtnActionPerformed

    private void isPaidTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isPaidTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isPaidTxtActionPerformed

    private void amountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTxt;
    private javax.swing.JTextField dueDateTxt;
    private javax.swing.JLabel incorrectID;
    private javax.swing.JTextField isPaidTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField midTxt;
    private buttons.MyButton myButton4;
    private buttons.MyButton myButton7;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField paymentDateTxt;
    private buttons.MyButton removeBtn;
    private buttons.MyButton searchBtn;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables
}
