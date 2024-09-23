package internalframes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class UpdateMemberInternal extends javax.swing.JInternalFrame {

 private myframes.MainFrame1 mf;
    public UpdateMemberInternal(myframes.MainFrame1 mainframe) {
        this.mf = mainframe;
        initComponents();
        incorrectID.setVisible(false);
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
        nameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mshipTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        addressTxt1 = new javax.swing.JTextField();
        ageTxt1 = new javax.swing.JTextField();
        genderTxt1 = new javax.swing.JTextField();

        setBorder(null);
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(254, 251, 246));

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Members");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(140, 185, 189));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1370, 485));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveBtn.setBorder(null);
        saveBtn.setText("Save Changes");
        saveBtn.setColor(new java.awt.Color(236, 177, 89));
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
        resetBtn.setColor(new java.awt.Color(236, 177, 89));
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
        searchBtn.setColor(new java.awt.Color(236, 177, 89));
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

        jLabel2.setBackground(new java.awt.Color(55, 151, 119));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 71, 75));
        jLabel2.setText("Name:-");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 184, 28));

        nameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        jPanel2.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 332, 30));

        jLabel6.setBackground(new java.awt.Color(55, 151, 119));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(69, 71, 75));
        jLabel6.setText("Father Name:-");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 184, 28));

        fNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTxtActionPerformed(evt);
            }
        });
        jPanel2.add(fNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 332, 30));

        jLabel4.setBackground(new java.awt.Color(55, 151, 119));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(69, 71, 75));
        jLabel4.setText("Phone Number:-");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 184, 28));

        phoneTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 332, 30));

        jLabel3.setBackground(new java.awt.Color(55, 151, 119));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(69, 71, 75));
        jLabel3.setText("Address:-");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 184, 28));

        dateTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTxtActionPerformed(evt);
            }
        });
        jPanel2.add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 332, 30));

        jLabel5.setBackground(new java.awt.Color(55, 151, 119));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(69, 71, 75));
        jLabel5.setText("Date of Joining :-");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 184, 28));

        jLabel8.setBackground(new java.awt.Color(55, 151, 119));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(69, 71, 75));
        jLabel8.setText("Gender:-");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 184, 28));

        jLabel7.setBackground(new java.awt.Color(55, 151, 119));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(69, 71, 75));
        jLabel7.setText("Age:-");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 184, 28));

        mshipTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(mshipTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 332, 30));

        jLabel9.setBackground(new java.awt.Color(55, 151, 119));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(69, 71, 75));
        jLabel9.setText("Membership Plan:-");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 184, 28));

        jLabel10.setBackground(new java.awt.Color(55, 151, 119));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(69, 71, 75));
        jLabel10.setText("Amount to pay:-");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 184, 28));

        amountTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        amountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTxtActionPerformed(evt);
            }
        });
        jPanel2.add(amountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 332, 25));

        addressTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxt1ActionPerformed(evt);
            }
        });
        jPanel2.add(addressTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 332, 30));

        ageTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(ageTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 332, 30));

        genderTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(genderTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 332, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton4ActionPerformed
        // TODO add your handling code here:
       mf.switchInternalFrames("Show Members");
    }//GEN-LAST:event_myButton4ActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:

        if(searchTxt.getText().isEmpty())
        {
            incorrectID.setVisible(true);
            return;
        }

        String id = searchTxt.getText();

        String name = nameTxt.getText();
        String fname = fNameTxt.getText();
        String address =addressTxt1.getText();
        String ph = phoneTxt.getText();
        long phone = Long.parseLong(ph);
        int age = Integer.parseInt(ageTxt1.getText());
        String gender = genderTxt1.getText();
        String date = dateTxt.getText();
        String mship = mshipTxt.getText();

        Connection con = null;
        PreparedStatement pmt = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "root");
            String query = "UPDATE member SET m_name = ? , f_name = ? , phone = ? , address = ? , dob = ? , gender = ? , mship_id = ? , age = ? WHERE mid = ?";

            pmt = con.prepareStatement(query);
            pmt.setString(1, name);
            pmt.setString(2, fname);
            pmt.setLong(3, age);
            pmt.setString(4, address);
            pmt.setString(5, date);
            pmt.setString(6, gender);
            pmt.setString(7, mship);
            pmt.setInt(8, age);
            pmt.setString(9, id);
            pmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data updated successfully");

            incorrectID.setVisible(false);
            nameTxt.setText("");
            fNameTxt.setText("");
            dateTxt.setText("");
            dateTxt.setText("");
            mshipTxt.setText("");
            mshipTxt.setText("");
            phoneTxt.setText("");
            addressTxt1.setText("");
            genderTxt1.setText("");
            ageTxt1.setText("");
            //int charges = getChargesForMembership(mshipid);
            amountTxt.setText("");
            searchTxt.setText("");

            con.close();
            pmt.close();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Pehle dhang se entry krna seekh ke aa");
            Logger.getLogger(UpdateMemberInternal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pehle dhang se entry krna seekh ke aa");
            Logger.getLogger(UpdateMemberInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
        // DB CONNECTION ENDED

    }//GEN-LAST:event_saveBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here: r40418r17

        incorrectID.setVisible(false);
        nameTxt.setText("");
        fNameTxt.setText("");
        dateTxt.setText("");
        dateTxt.setText("");
        mshipTxt.setText("");
        mshipTxt.setText("");
        phoneTxt.setText("");
        addressTxt1.setText("");
        genderTxt1.setText("");
        ageTxt1.setText("");
        //int charges = getChargesForMembership(mshipid);
        amountTxt.setText("");
        searchTxt.setText("");
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

            pmt = con.prepareStatement("select * from member where mid = ?");
            pmt.setString(1, id);
            rs = pmt.executeQuery();

            int flag = 0;
            String name = "",date = "",mshipid = "",fname="",address="",gender="";
            long phone=0;
            int age=0,amount=0;
            if(rs.next())
            {
                //     table.addRow(new Object[] { resultSet.getString("column_name_1"), resultSet.getString("column_name_2") });}
            flag++;
            name = rs.getString("m_name");
            fname = rs.getString("f_name");
            phone = rs.getLong("phone");
            address = rs.getString("address");
            date = rs.getString("dob");
            gender = rs.getString("gender");
            mshipid = rs.getString("mship_id");
            age = rs.getInt("age");

        }

        if(flag >= 1)
        {
            nameTxt.setText(name);
            fNameTxt.setText(fname);
            dateTxt.setText(address);
            dateTxt.setText(date);
            mshipTxt.setText(gender);
            mshipTxt.setText(mshipid);
            addressTxt1.setText(address);
            genderTxt1.setText(gender);
            ageTxt1.setText(String.valueOf(age));
            phoneTxt.setText(String.valueOf(phone));
            int charges = getChargesForMembership(mshipid);
            amountTxt.setText(String.valueOf(charges));
        }
        else{
            incorrectID.setVisible(true);
            nameTxt.setText("");
            fNameTxt.setText("");
            dateTxt.setText("");
            dateTxt.setText("");
            mshipTxt.setText("");
            mshipTxt.setText("");
            phoneTxt.setText("");
            addressTxt1.setText("");
            genderTxt1.setText("");
            ageTxt1.setText("");
            //int charges = getChargesForMembership(mshipid);
            amountTxt.setText("");
        }
        con.close();
        pmt.close();
        rs.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        // DB CONNECTION ENDED
    }//GEN-LAST:event_searchBtnActionPerformed
   private int getChargesForMembership(String membershipId) {
        int charges = 0;
    try {
        // Establish database connection
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "root");
            String query = "SELECT charges FROM membership WHERE mship_id = ?";
            stmt = con.prepareStatement(query);
            stmt.setString(1, membershipId);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                charges = rs.getInt("charges");
            }
            
//            if (rs.next()) {
//                charges = rs.getInt("charges");
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }   catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateMemberInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.close();
        stmt.close();
        rs.close();
        return charges;
    } catch (SQLException ex) {
            Logger.getLogger(UpdateMemberInternal.class.getName()).log(Level.SEVERE, null, ex);
    }
    return charges;
}
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

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void fNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTxtActionPerformed

    private void dateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTxtActionPerformed

    private void amountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTxtActionPerformed

    }//GEN-LAST:event_amountTxtActionPerformed

    private void addressTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt1;
    private javax.swing.JTextField ageTxt1;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JTextField genderTxt1;
    private javax.swing.JLabel incorrectID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mshipTxt;
    private buttons.MyButton myButton4;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField phoneTxt;
    private buttons.MyButton resetBtn;
    private buttons.MyButton saveBtn;
    private buttons.MyButton searchBtn;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables
}
