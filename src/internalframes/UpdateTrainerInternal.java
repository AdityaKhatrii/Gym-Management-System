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

public class UpdateTrainerInternal extends javax.swing.JInternalFrame {

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private myframes.MainFrame1 mf;
    
    public UpdateTrainerInternal(myframes.MainFrame1 mainframe) {
        this.mf = mainframe;
        initComponents();
        incorrectID.setVisible(false);
    }

    private void resetAll(boolean status){
        incorrectID.setVisible(status);
        nameTxt.setText("");
        fNameTxt.setText("");
        Date date = new Date();
        joinDateChoose.setDate(date);
        
        salaryTxt.setText("");
        salaryTxt.setText("");
        emailTxt.setText("");
        addressTxt1.setText("");
        genderTxt1.setText("");
        ageTxt1.setText("");
        //int charges = getChargesForMembership(mshipid);
        shiftTxt.setText("");
        searchTxt.setText("");
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
        emailTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        salaryTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        shiftTxt = new javax.swing.JTextField();
        addressTxt1 = new javax.swing.JTextField();
        ageTxt1 = new javax.swing.JTextField();
        genderTxt1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        phoneTxt1 = new javax.swing.JTextField();
        joinDateChoose = new com.toedter.calendar.JDateChooser();

        setBorder(null);
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(230, 131, 105));
        jPanel1.setPreferredSize(new java.awt.Dimension(1370, 114));

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Trainer");

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
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(19, 24, 66));

        saveBtn.setBorder(null);
        saveBtn.setText("Save Changes");
        saveBtn.setColor(new java.awt.Color(236, 206, 174));
        saveBtn.setColorOver(new java.awt.Color(0, 102, 204));
        saveBtn.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        resetBtn.setBorder(null);
        resetBtn.setText("Reset");
        resetBtn.setColor(new java.awt.Color(236, 206, 174));
        resetBtn.setColorOver(new java.awt.Color(0, 102, 204));
        resetBtn.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        searchBtn.setBorder(null);
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchBtn.setText("search");
        searchBtn.setBorderPainted(false);
        searchBtn.setColor(new java.awt.Color(236, 206, 174));
        searchBtn.setColorClick(new java.awt.Color(0, 153, 153));
        searchBtn.setColorOver(new java.awt.Color(0, 102, 255));
        searchBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchBtn.setRadius(35);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

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

        incorrectID.setBackground(new java.awt.Color(0, 0, 0));
        incorrectID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        incorrectID.setForeground(new java.awt.Color(255, 0, 0));
        incorrectID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        incorrectID.setText("Incorrect id");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 246, 226));
        jLabel2.setText("Name:-");

        nameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(251, 246, 226));
        jLabel6.setText("Father Name:-");

        fNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(251, 246, 226));
        jLabel4.setText("Email:- ");

        emailTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(251, 246, 226));
        jLabel3.setText("Address:-");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(251, 246, 226));
        jLabel5.setText("Date of Joining :-");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(251, 246, 226));
        jLabel8.setText("Gender:-");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(251, 246, 226));
        jLabel7.setText("Age:-");

        salaryTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(251, 246, 226));
        jLabel9.setText("Salary:-");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(251, 246, 226));
        jLabel10.setText("Shift:-");

        shiftTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        shiftTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftTxtActionPerformed(evt);
            }
        });

        addressTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxt1ActionPerformed(evt);
            }
        });

        ageTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        genderTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(251, 246, 226));
        jLabel11.setText("Phone Number:-");

        phoneTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        joinDateChoose.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(457, 457, 457)
                                .addComponent(incorrectID, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTxt1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneTxt1)
                            .addComponent(joinDateChoose, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
                        .addGap(188, 188, 188)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(138, 138, 138)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shiftTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(incorrectID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(fNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(genderTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(ageTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(shiftTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(phoneTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(addressTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(joinDateChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton4ActionPerformed
        
        mf.switchInternalFrames("Show Trainers");
        
    }//GEN-LAST:event_myButton4ActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:

        if(searchTxt.getText().isEmpty())
        {
            incorrectID.setVisible(true);
            return;
        }
        String name = "",mail = "",fname="",address="",gender="",shift="";
        long phone=0;
        int age=0,salary=0;
        String id = searchTxt.getText();

        name = nameTxt.getText();
        fname = fNameTxt.getText();
        address =addressTxt1.getText();
        mail = emailTxt.getText();
        String ph = phoneTxt1.getText();
        phone = Long.parseLong(ph);
        age = Integer.parseInt(ageTxt1.getText());
        gender = genderTxt1.getText();

        Date d = joinDateChoose.getDate();
        String date = sdf.format(d);
        salary = Integer.parseInt(salaryTxt.getText());
        shift = shiftTxt.getText();
        Connection con = null;
        PreparedStatement pmt = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "root");
            String query = "UPDATE trainer SET tname = ? , fname = ? , phone = ? ,mail=?, address = ? , dob = ? , gender = ?, age = ?,salary = ?,shift=?,date=? WHERE t_id = ?";

            pmt = con.prepareStatement(query);
            pmt.setString(1, name);
            pmt.setString(2, fname);
            pmt.setLong(3, phone);
            pmt.setString(4, mail);
            pmt.setString(5, address);
            pmt.setString(6, gender);
            pmt.setInt(7, age);
            pmt.setInt(8, salary);

            pmt.setString(9, shift);
            pmt.setString(10, date);
            pmt.setString(11, id);
            pmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data updated successfully");

            resetAll(false);

            con.close();
            pmt.close();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Pehle dhang se entry krna seekh ke aa");
            Logger.getLogger(UpdateTrainerInternal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pehle dhang se entry krna seekh ke aa");
            Logger.getLogger(UpdateTrainerInternal.class.getName()).log(Level.SEVERE, null, ex);
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

            pmt = con.prepareStatement("select * from trainer where t_id = ?");
            pmt.setString(1, id);
            rs = pmt.executeQuery();
            // t_id | tname | fname | phone  | mail | address | gender | age | salary | shift     | date
            int flag = 0;
            String name = "",d = "",mail = "",fname="",address="",gender="",shift="";
            long phone=0;
            int age=0,salary=0;
            if(rs.next())
            {
                //     table.addRow(new Object[] { resultSet.getString("column_name_1"), resultSet.getString("column_name_2") });}
            flag++;
            name = rs.getString("tname");
            fname = rs.getString("fname");
            phone = rs.getLong("phone");
            address = rs.getString("address");
            mail = rs.getString("mail");

            gender = rs.getString("gender");
            shift = rs.getString("shift");
            age = rs.getInt("age");
            salary = rs.getInt("salary");
            d = rs.getString("date");
        }

        if(flag >= 1)
        {
            nameTxt.setText(name);
            fNameTxt.setText(fname);
            Date date = sdf.parse(d);
            joinDateChoose.setDate(date);
            //  salaryTxt.setText(salary);
            shiftTxt.setText(shift);
            addressTxt1.setText(address);
            genderTxt1.setText(gender);
            ageTxt1.setText(String.valueOf(age));
            emailTxt.setText(mail);
            phoneTxt1.setText(String.valueOf(phone));
            salaryTxt.setText(String.valueOf(salary));
        }
        else{
            resetAll(true);
        }
        con.close();
        pmt.close();
        rs.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateTrainerInternal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateTrainerInternal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(UpdateTrainerInternal.class.getName()).log(Level.SEVERE, null, ex);
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

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void fNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTxtActionPerformed

    private void shiftTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftTxtActionPerformed

    }//GEN-LAST:event_shiftTxtActionPerformed

    private void addressTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt1;
    private javax.swing.JTextField ageTxt1;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JTextField genderTxt1;
    private javax.swing.JLabel incorrectID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private com.toedter.calendar.JDateChooser joinDateChoose;
    private buttons.MyButton myButton4;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField phoneTxt1;
    private buttons.MyButton resetBtn;
    private javax.swing.JTextField salaryTxt;
    private buttons.MyButton saveBtn;
    private buttons.MyButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTextField shiftTxt;
    // End of variables declaration//GEN-END:variables
}
