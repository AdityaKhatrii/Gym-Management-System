package internalframes;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import project.ConnectionProvider;

public class Signup extends javax.swing.JInternalFrame {

    private myframes.MainFrame1 mf;
    
    public Signup(myframes.MainFrame1 mf) {
        this.mf = mf;
        initComponents();
        incorrectUP.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        passTxt = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        resetBTN = new buttons.MyButton();
        incorrectUP = new javax.swing.JLabel();
        log = new buttons.MyButton();
        jButton1 = new javax.swing.JButton();
        signup1 = new buttons.MyButton();
        userTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userIdTxt = new javax.swing.JTextField();

        setBorder(null);
        setFrameIcon(null);

        jPanel2.setBackground(new java.awt.Color(152, 204, 211));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 52)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GYM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(543, 543, 543)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(577, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(235, 240, 246));
        jPanel1.setForeground(new java.awt.Color(54, 78, 104));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passTxtFocusGained(evt);
            }
        });
        jPanel1.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 292, 50));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(54, 78, 104));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 190, 70));

        resetBTN.setBorder(null);
        resetBTN.setForeground(new java.awt.Color(255, 255, 255));
        resetBTN.setText("reset");
        resetBTN.setBorderPainted(false);
        resetBTN.setColor(new java.awt.Color(19, 34, 56));
        resetBTN.setColorClick(new java.awt.Color(255, 153, 102));
        resetBTN.setColorOver(new java.awt.Color(255, 51, 51));
        resetBTN.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        resetBTN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                resetBTNFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resetBTNFocusLost(evt);
            }
        });
        resetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBTNActionPerformed(evt);
            }
        });
        jPanel1.add(resetBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 70, 40));

        incorrectUP.setBackground(new java.awt.Color(0, 0, 0));
        incorrectUP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        incorrectUP.setForeground(new java.awt.Color(255, 0, 0));
        incorrectUP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        incorrectUP.setText("Invalid username or password");
        jPanel1.add(incorrectUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 360, 40));

        log.setBorder(null);
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setText("Login");
        log.setBorderPainted(false);
        log.setColor(new java.awt.Color(19, 34, 56));
        log.setColorClick(new java.awt.Color(255, 153, 102));
        log.setColorOver(new java.awt.Color(51, 0, 204));
        log.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        log.setRadius(45);
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        jPanel1.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 110, 50));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Forgot password");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 150, 40));

        signup1.setBorder(null);
        signup1.setForeground(new java.awt.Color(255, 255, 255));
        signup1.setText("Signup");
        signup1.setBorderPainted(false);
        signup1.setColor(new java.awt.Color(19, 34, 56));
        signup1.setColorClick(new java.awt.Color(255, 153, 102));
        signup1.setColorOver(new java.awt.Color(51, 0, 204));
        signup1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        signup1.setRadius(45);
        signup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup1ActionPerformed(evt);
            }
        });
        jPanel1.add(signup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 110, 50));

        userTxt.setName("userTxt"); // NOI18N
        userTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userTxtFocusGained(evt);
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        jPanel1.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 290, 50));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(54, 78, 104));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 190, 70));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(54, 78, 104));
        jLabel2.setText("User ID ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 150, 50));

        userIdTxt.setEditable(false);
        userIdTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userIdTxt.setName("userIdTxt"); // NOI18N
        userIdTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userIdTxtFocusGained(evt);
            }
        });
        userIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIdTxtActionPerformed(evt);
            }
        });
        jPanel1.add(userIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 290, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTxtFocusGained
        incorrectUP.setVisible(false);
    }//GEN-LAST:event_passTxtFocusGained

    private void resetBTNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_resetBTNFocusGained
        resetBTN.setBackground(Color.WHITE);
    }//GEN-LAST:event_resetBTNFocusGained

    private void resetBTNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_resetBTNFocusLost
        // TODO add your handling code here:
        resetBTN.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_resetBTNFocusLost

    private void resetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBTNActionPerformed
        // TODO add your handling code here:
        incorrectUP.setVisible(false);
        passTxt.setText("");
        userTxt.setText("");
        userIdTxt.setText("");
    }//GEN-LAST:event_resetBTNActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        mf.switchInternalFrames("Login");

    }//GEN-LAST:event_logActionPerformed

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
        // TODO add your handling code here:
        jButton1.setBackground(Color.CYAN);
    }//GEN-LAST:event_jButton1FocusGained

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_jButton1MouseExited

    private void signup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup1ActionPerformed
        String user = userTxt.getText();
        char[] pass = passTxt.getPassword();
        String password = String.valueOf(pass);
        if(user.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Incorrect Username or password ");
            return;
        }
        Connection con = ConnectionProvider.getCon();
        PreparedStatement pmt = null;
        Random random = new Random();

        int randomNumber = random.nextInt(101);
        int randomNum2 = random.nextInt(101);
        String uid = user.charAt(0)+ "404"+randomNumber + user.charAt(0)+randomNum2;
        try {
            // TODO add your handling code here:
            //            String user = idTxt.getText();
            //            String pass = idTxt.getText();

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "root");
            String query = "insert into users values(?,?,?)";
            pmt = con.prepareStatement(query);
            pmt.setString(1, uid);
            pmt.setString(2, user);
            pmt.setString(3, password);
            pmt.executeUpdate();
            
            userIdTxt.setText(uid);

            JOptionPane.showMessageDialog(null, "Account Created Successfully your id is = "+uid);
            con.close();
            pmt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signup1ActionPerformed

    private void userTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtFocusGained

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void userIdTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userIdTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_userIdTxtFocusGained

    private void userIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIdTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel incorrectUP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private buttons.MyButton log;
    private javax.swing.JPasswordField passTxt;
    private buttons.MyButton resetBTN;
    private buttons.MyButton signup1;
    private javax.swing.JTextField userIdTxt;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
