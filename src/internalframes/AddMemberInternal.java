
package internalframes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import project.ConnectionProvider;

public class AddMemberInternal extends javax.swing.JInternalFrame {
myframes.MainFrame1 mf;
    public AddMemberInternal(myframes.MainFrame1 mainframe) {
        this.mf = mainframe;
        initComponents();
        dateChooser.setDateFormatString("dd-MM-yyyy");
        Date date = new Date() ;
        dateChooser.setDate(date);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        myButton3 = new buttons.MyButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        membershipChoose = new javax.swing.JComboBox<>();
        saveBtn = new buttons.MyButton();
        fNameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        genderChooser = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        resetBtn = new buttons.MyButton();
        dateChooser = new com.toedter.calendar.JDateChooser();

        setBorder(null);
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(255, 127, 62));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Member");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 23, 330, 90));

        myButton3.setBorder(null);
        myButton3.setText("Prev");
        myButton3.setBorderPainted(false);
        myButton3.setColor(new java.awt.Color(153, 0, 0));
        myButton3.setColorClick(new java.awt.Color(0, 153, 153));
        myButton3.setColorOver(new java.awt.Color(0, 102, 255));
        myButton3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        myButton3.setRadius(35);
        myButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(myButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, -1));

        jPanel2.setBackground(new java.awt.Color(42, 98, 154));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Name:-");

        nameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Address:-");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Phone Number:-");

        phoneTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Date of Joining :-");

        addressTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Age:-");

        ageTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Gender:-");

        membershipChoose.setBackground(new java.awt.Color(18, 30, 49));
        membershipChoose.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        membershipChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "plan1 - 1 Month", "plan2 - 3 Months", "plan3 - 6 Months", "plan4 - 12 Months" }));
        membershipChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membershipChooseActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.setAlignmentY(0.0F);
        saveBtn.setBorderPainted(false);
        saveBtn.setColor(new java.awt.Color(255, 153, 153));
        saveBtn.setColorOver(new java.awt.Color(0, 51, 153));
        saveBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        saveBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        fNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Father Name:-");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Membership Plan:-");

        genderChooser.setBackground(new java.awt.Color(18, 30, 49));
        genderChooser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        genderChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderChooserActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Amount to pay:-");

        amountTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        amountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTxtActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.setAlignmentY(0.0F);
        resetBtn.setBorderPainted(false);
        resetBtn.setColor(new java.awt.Color(255, 153, 153));
        resetBtn.setColorOver(new java.awt.Color(153, 0, 0));
        resetBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        resetBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        dateChooser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fNameTxt)
                    .addComponent(nameTxt)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTxt)
                    .addComponent(addressTxt)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
                .addGap(224, 224, 224)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ageTxt)
                        .addComponent(genderChooser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(membershipChoose, 0, 332, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(amountTxt))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(membershipChoose)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(amountTxt)))
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void resetAll(){
    nameTxt.setText("");
        phoneTxt.setText("");
        addressTxt.setText("");
        fNameTxt.setText("");
        ageTxt.setText("");
        Date date = new Date() ;
        dateChooser.setDate(date);
        amountTxt.setText("700");
}
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
            Logger.getLogger(AddMemberInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.close();
        stmt.close();
        rs.close();
        return charges;
    } catch (SQLException ex) {
            Logger.getLogger(AddMemberInternal.class.getName()).log(Level.SEVERE, null, ex);
    }
    return charges;
}
    private void myButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton3ActionPerformed
        // TODO add your handling code here:
        mf.switchInternalFrames("Show Members");
        
    }//GEN-LAST:event_myButton3ActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void membershipChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membershipChooseActionPerformed
        String selectedMembership = (String) membershipChoose.getSelectedItem();

        String []membership = selectedMembership.split(" ");
        // Query the database to fetch charges for the selected membership
        int charges = getChargesForMembership(membership[0]);
        String date =  dateChooser.toString();
        System.out.println(date);
        amountTxt.setText(String.valueOf(charges));

    }//GEN-LAST:event_membershipChooseActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
if(nameTxt.getText().isEmpty() || phoneTxt.getText().isEmpty() || addressTxt.getText().isEmpty() || fNameTxt.getText().isEmpty()){
    JOptionPane.showMessageDialog(null,"Please Fill all details ");
}
        String name = nameTxt.getText();
        long phone = Long.parseLong(phoneTxt.getText());
        String address = addressTxt.getText();
        String gender = (String) genderChooser.getSelectedItem();
        String fatherName = fNameTxt.getText();
        int age = Integer.parseInt(ageTxt.getText());
        /*
        String membershipId = (String)membershipChoose.getSelectedItem();
        if(membershipId.equals("1 month")) membershipId = "plan1";
        else if(membershipId.equals("3 months")) membershipId = "plan2";
        else if(membershipId.equals("6 months")) membershipId = "plan3";
        else membershipId = "plan1";
        */
        String selectedMembership = (String) membershipChoose.getSelectedItem();
        String []membership = selectedMembership.split(" ");
        String membershipId  = membership[0];

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(dateChooser.getDate());
        String amount = amountTxt.getText();
        Random random = new Random();
        // java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        // Generate a random number between 0 and 100
        int randomNumber = random.nextInt(101);
        int randomNum2 = random.nextInt(101);
        String id = name.charAt(0)+ "404"+randomNumber + name.charAt(0)+randomNum2;
        try
        {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("insert into member values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, fatherName);
            ps.setLong(4, phone);
            ps.setString(5, address);
            ps.setString(6, date);
            ps.setString(7, gender);
            ps.setString(8, membershipId);
            ps.setInt(9, age);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully saved");
            con.close();
            ps.close();

            resetAll();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void fNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTxtActionPerformed

    private void genderChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderChooserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderChooserActionPerformed

    private void amountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTxtActionPerformed

    }//GEN-LAST:event_amountTxtActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        resetAll();
    }//GEN-LAST:event_resetBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JTextField amountTxt;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JComboBox<String> genderChooser;
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
    private javax.swing.JComboBox<String> membershipChoose;
    private buttons.MyButton myButton3;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField phoneTxt;
    private buttons.MyButton resetBtn;
    private buttons.MyButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
