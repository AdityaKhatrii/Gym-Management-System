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

public class RemoveMember extends javax.swing.JInternalFrame {
private myframes.MainFrame1 mf;

    public RemoveMember(myframes.MainFrame1 mainframe) {
        this.mf = mainframe;
        initComponents();
        incorrectID.setVisible(false);
    }

private void resetAll(boolean status){
     searchTxt.setText("");
        nameTxt.setText("");
        dateTxt.setText("");
        mshipTxt.setText("");
        phoneTxt.setText(String.valueOf(""));
        incorrectID.setVisible(status);
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
        jLabel3 = new javax.swing.JLabel();
        mshipTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        myButton7 = new buttons.MyButton();
        removeBtn = new buttons.MyButton();
        searchBtn = new buttons.MyButton();
        incorrectID = new javax.swing.JLabel();

        setBorder(null);
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(247, 231, 220));

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Remove Member");

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

        jPanel2.setBackground(new java.awt.Color(64, 93, 114));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

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

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Name:");

        nameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Membership Plan:");

        mshipTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Phone No.");

        phoneTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Date of Joining: ");

        dateTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        myButton7.setBorder(null);
        myButton7.setText("Reset");
        myButton7.setColor(new java.awt.Color(117, 134, 148));
        myButton7.setColorOver(new java.awt.Color(255, 248, 243));
        myButton7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        myButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton7ActionPerformed(evt);
            }
        });

        removeBtn.setBorder(null);
        removeBtn.setText("Remove");
        removeBtn.setColor(new java.awt.Color(117, 134, 148));
        removeBtn.setColorOver(new java.awt.Color(255, 248, 243));
        removeBtn.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        searchBtn.setBorder(null);
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchBtn.setText("search");
        searchBtn.setBorderPainted(false);
        searchBtn.setColor(new java.awt.Color(117, 134, 148));
        searchBtn.setColorClick(new java.awt.Color(0, 153, 153));
        searchBtn.setColorOver(new java.awt.Color(255, 248, 243));
        searchBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchBtn.setRadius(35);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        incorrectID.setBackground(new java.awt.Color(0, 0, 0));
        incorrectID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        incorrectID.setForeground(new java.awt.Color(255, 0, 0));
        incorrectID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        incorrectID.setText("Incorrect id");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(phoneTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mshipTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(215, 215, 215)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(199, 199, 199)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(myButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addComponent(incorrectID, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(incorrectID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mshipTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(myButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(230, 230, 230))
        );

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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        mf.switchInternalFrames("Show Members");
       
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

            pmt = con.prepareStatement("delete from member where mid = ?");
            pmt.setString(1, id);
            pmt.executeUpdate();
            resetAll(false);
            JOptionPane.showMessageDialog(null, "Member removed successfully");

            con.close();
            pmt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RemoveMember.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RemoveMember.class.getName()).log(Level.SEVERE, null, ex);
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

        String id = searchTxt.getText();
        Connection con = ConnectionProvider.getCon();
        PreparedStatement pmt = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "root");
            //  String query = "select * from member where mid = ? ";

            pmt = con.prepareStatement("select * from member where mid = ?");
            pmt.setString(1, id);
            rs = pmt.executeQuery();

            int flag = 0;
            String name = "",date = "",mshipid = "";
            long phone=0;

            if(rs.next())
            {
                //     table.addRow(new Object[] { resultSet.getString("column_name_1"), resultSet.getString("column_name_2") });}
            flag++;
            name = rs.getString("m_name");
            String fname = rs.getString("f_name");
            phone = rs.getLong("phone");
            String address = rs.getString("address");
            date = rs.getString("dob");
            String gender = rs.getString("gender");
            mshipid = rs.getString("mship_id");
            int age = rs.getInt("age");

        }

        if(flag >= 1)
        {
            nameTxt.setText(name);
            dateTxt.setText(date);
            mshipTxt.setText(mshipid);
            phoneTxt.setText(String.valueOf(phone));
        }
        else{
            resetAll(true);
        }
        con.close();
        pmt.close();
        rs.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RemoveMember.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RemoveMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        // DB CONNECTION ENDED

    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateTxt;
    private javax.swing.JLabel incorrectID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mshipTxt;
    private buttons.MyButton myButton4;
    private buttons.MyButton myButton7;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField phoneTxt;
    private buttons.MyButton removeBtn;
    private buttons.MyButton searchBtn;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables
}
