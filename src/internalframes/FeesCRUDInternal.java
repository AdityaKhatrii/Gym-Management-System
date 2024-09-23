package internalframes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import project.ConnectionProvider;

public class FeesCRUDInternal extends javax.swing.JInternalFrame {

    private myframes.MainFrame1 mf;
    
    public FeesCRUDInternal(myframes.MainFrame1 mf) 
    {
        initComponents();
        this.mf = mf;
        refreshTable();
    }

public void refreshTable(){
    
    //DB Connection started
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
         Connection con = ConnectionProvider.getCon();
        java.sql.PreparedStatement pmt = null;
        ResultSet rs = null;
        try {
          
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "root");
            String query = "SELECT m.m_name,f.* FROM member m INNER JOIN fees f ON f.mid = m.mid;";
            pmt = con.prepareStatement(query);
            rs = pmt.executeQuery();
            //table.setModel(DbUtils.resultSetToTableModel(rs));
            while(rs.next())
            {
            //     table.addRow(new Object[] { resultSet.getString("column_name_1"), resultSet.getString("column_name_2") });}
                String fid = rs.getString("fee_id");
                String name = rs.getString("m_name");
                String mid = rs.getString("mid");
                int amount = rs.getInt("amount");
                String  dueDate = rs.getString("due_date");
                String paymentDate = rs.getString("payment_date");
                boolean isPaid = rs.getBoolean("paid");
                String status = "NO";
                if(isPaid){
                    status = "Yes";
                }
                model.addRow(new Object[]{ fid,mid,name,amount,paymentDate,dueDate,status});
            }
            con.close();
            pmt.close();
            rs.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FeesCRUDInternal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FeesCRUDInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
        // DB CONNECTION ENDED
    
}    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        myButton4 = new buttons.MyButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        addFeeBtn = new buttons.MyButton();
        removeFeeBtn = new buttons.MyButton();
        updateFeeBtn = new buttons.MyButton();

        setBorder(null);
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(245, 231, 178));

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fees");

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

        jPanel2.setBackground(new java.awt.Color(224, 167, 94));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        table.setBackground(new java.awt.Color(204, 204, 204));
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fees id", "Member id", "Member Name", "Amount", "Payment date", "Due date", "Paid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(0, 0, 0));
        table.setInheritsPopupMenu(true);
        table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        table.setShowGrid(true);
        jScrollPane1.setViewportView(table);

        addFeeBtn.setBorder(null);
        addFeeBtn.setText("Add Fee");
        addFeeBtn.setColor(new java.awt.Color(249, 214, 137));
        addFeeBtn.setColorOver(new java.awt.Color(0, 102, 204));
        addFeeBtn.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        addFeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFeeBtnActionPerformed(evt);
            }
        });

        removeFeeBtn.setBorder(null);
        removeFeeBtn.setText("Remove Fee");
        removeFeeBtn.setColor(new java.awt.Color(249, 214, 137));
        removeFeeBtn.setColorOver(new java.awt.Color(0, 102, 204));
        removeFeeBtn.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        removeFeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFeeBtnActionPerformed(evt);
            }
        });

        updateFeeBtn.setBorder(null);
        updateFeeBtn.setText("Update Fee");
        updateFeeBtn.setColor(new java.awt.Color(249, 214, 137));
        updateFeeBtn.setColorOver(new java.awt.Color(0, 102, 204));
        updateFeeBtn.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        updateFeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFeeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeFeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(addFeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateFeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(addFeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeFeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateFeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton4ActionPerformed
        // TODO add your handling code here:
        mf.switchInternalFrames("Select Entities");
    }//GEN-LAST:event_myButton4ActionPerformed

    private void addFeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFeeBtnActionPerformed
        // TODO add your handling code here:
        mf.switchInternalFrames("Add Fees");
    }//GEN-LAST:event_addFeeBtnActionPerformed

    private void removeFeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFeeBtnActionPerformed
        // TODO add your handling code here:
        mf.switchInternalFrames("Remove Fees");
    }//GEN-LAST:event_removeFeeBtnActionPerformed

    private void updateFeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFeeBtnActionPerformed
        // TODO add your handling code here:
        mf.switchInternalFrames("Update Fees");
    }//GEN-LAST:event_updateFeeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private buttons.MyButton addFeeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private buttons.MyButton myButton4;
    private buttons.MyButton removeFeeBtn;
    private javax.swing.JTable table;
    private buttons.MyButton updateFeeBtn;
    // End of variables declaration//GEN-END:variables
}
