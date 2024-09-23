package myframes;
import internalframes.FixedDesktopManager;
import java.util.Stack;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class MainFrame1 extends javax.swing.JFrame {
       private internalframes.AddRawMaterial addRawMaterial = new internalframes.AddRawMaterial(this);
       private internalframes.SelectEntities se = new internalframes.SelectEntities(this);
       private internalframes.RawMaterialCRUDInternal showRawMaterials = new internalframes.RawMaterialCRUDInternal(this);
       private internalframes.RemoveRawMaterialInternal rmRemove = new internalframes.RemoveRawMaterialInternal(this);
       private internalframes.UpdateRawMaterialInternal rmUpdate = new internalframes.UpdateRawMaterialInternal(this);
       private internalframes.AddMemberInternal addMember = new internalframes.AddMemberInternal(this);
       private internalframes.MemberCRUD showMember = new internalframes.MemberCRUD(this);
       private internalframes.RemoveMember removeMember = new internalframes.RemoveMember(this);
       private internalframes.UpdateMemberInternal updateMember = new internalframes.UpdateMemberInternal(this);
       private internalframes.MembershipCRUD showMembership = new internalframes.MembershipCRUD(this);
       private internalframes.AddMembershipInternal addMembership = new internalframes.AddMembershipInternal(this);
       private internalframes.RemoveMembershipInternal removeMembership = new internalframes.RemoveMembershipInternal(this);
       private internalframes.UpdateMembershipInternal updateMembership = new internalframes.UpdateMembershipInternal(this);
       private internalframes.trainerCRUDInternal showTrainer = new internalframes.trainerCRUDInternal(this);
       private internalframes.AddTrainerInternal addTrainer = new internalframes.AddTrainerInternal(this);
       private internalframes.RemoveTrainerInternal removeTrainer = new internalframes.RemoveTrainerInternal(this);
       private internalframes.UpdateTrainerInternal updateTrainer = new internalframes.UpdateTrainerInternal(this);
       private internalframes.FeesCRUDInternal showFees = new internalframes.FeesCRUDInternal(this);
       private internalframes.AddFeesInternal addFees = new internalframes.AddFeesInternal(this);
       private internalframes.RemoveFeesInternal removeFees = new internalframes.RemoveFeesInternal(this);
       private internalframes.UpdateFeesInternal updateFees = new internalframes.UpdateFeesInternal(this);
       private internalframes.EquipmentCRUDInternal showEquipments = new internalframes.EquipmentCRUDInternal(this);
       private internalframes.AddEquipmentInternal addEquipments = new internalframes.AddEquipmentInternal(this);
       private internalframes.RemoveEquipmentInternal removeEquipments = new internalframes.RemoveEquipmentInternal(this);
       private internalframes.UpdateEquipmentInternal updateEquipments = new internalframes.UpdateEquipmentInternal(this);
       private internalframes.Login login = new internalframes.Login(this);
       private internalframes.Signup signup = new internalframes.Signup(this);
       
       
       private Stack<JInternalFrame> frameHistory;
       
    public MainFrame1() {
        initComponents();
        frameHistory = new Stack<>();
        initializeInternalFrames();
        
    }
private void initializeInternalFrames() {
        
        desktopPane.setDesktopManager(new FixedDesktopManager());
        desktopPane.add(addRawMaterial);
        desktopPane.add(se);
        desktopPane.add(showRawMaterials);
        desktopPane.add(rmRemove);
        desktopPane.add(rmUpdate);
        desktopPane.add(addMember);
        desktopPane.add(showMember);
        desktopPane.add(removeMember);
        desktopPane.add(updateMember);
        desktopPane.add(showMembership);
        desktopPane.add(addMembership);
        desktopPane.add(removeMembership);
        desktopPane.add(updateMembership);
        desktopPane.add(showTrainer);
        desktopPane.add(addTrainer);
        desktopPane.add(removeTrainer);
        desktopPane.add(updateTrainer);
        desktopPane.add(showFees);
        desktopPane.add(addFees);
        desktopPane.add(removeFees);
        desktopPane.add(updateFees);
        desktopPane.add(showEquipments);
        desktopPane.add(addEquipments);
        desktopPane.add(removeEquipments);
        desktopPane.add(updateEquipments);
        desktopPane.add(login);
        desktopPane.add(signup);
        
        addRawMaterial.setTitle("Add Raw Material");
        se.setTitle("Select Entities");
        showRawMaterials.setTitle("Show Raw Materials");
        rmRemove.setTitle("Remove Raw Materials");
        rmUpdate.setTitle("Update Raw Materials");
        addMember.setTitle("Add Member");
        showMember.setTitle("Show Members");
        removeMember.setTitle("Remove Member");
        updateMember.setTitle("Update Member");
        showMembership.setTitle("Show Membership");
        addMembership.setTitle("Add Membership");
        removeMembership.setTitle("Remove Membership");
        updateMembership.setTitle("Update Membership");
        showTrainer.setTitle("Show Trainers");
        addTrainer.setTitle("Add Trainer");
        removeTrainer.setTitle("Remove Trainer");
        updateTrainer.setTitle("Update Trainer");
        showFees.setTitle("Show Fees");
        addFees.setTitle("Add Fees");
        removeFees.setTitle("Remove Fees");
        updateFees.setTitle("Update Fees");
        showEquipments.setTitle("Show Equipments");
        addEquipments.setTitle("Add Equipment");
        removeEquipments.setTitle("Remove Equipment");
        updateEquipments.setTitle("Update Equipment");
        login.setTitle("Login");
        signup.setTitle("Signup");
        
        login.setVisible(true);
        
        rmRemove.setVisible(false);
        addRawMaterial.setVisible(false);
        showRawMaterials.setVisible(false);
        rmUpdate.setVisible(false);
        addMember.setVisible(false);
        showMember.setVisible(false);
        removeMember.setVisible(false);
        updateMember.setVisible(false);
        showMembership.setVisible(false);
        addMembership.setVisible(false);
        removeMembership.setVisible(false);
        updateMembership.setVisible(false);
        showTrainer.setVisible(false);
        addTrainer.setVisible(false);
        removeTrainer.setVisible(false);
        updateTrainer.setVisible(false);
        showFees.setVisible(false);
        addFees.setVisible(false);
        removeFees.setVisible(false);
        updateFees.setVisible(false);
        showEquipments.setVisible(false);
        addEquipments.setVisible(false);
        removeEquipments.setVisible(false);
        updateEquipments.setVisible(false);
        signup.setVisible(false);
        se.setVisible(false);
        
        
        
    }


  public void switchInternalFrames(String frameName) {
        JInternalFrame currentFrame = null;
        JInternalFrame nextFrame = null;
 //     System.out.println("Inside switch function before for loop");

        for (JInternalFrame frame : desktopPane.getAllFrames()) 
        {
            if (frame.isVisible()) {
   //             System.out.println("Inside if (frame.isVisible())");
                currentFrame = frame;
            }
    //        System.out.println(frame.getTitle());
            if (frame.getTitle().equals(frameName)) {
    //            System.out.println("frame.getTitle().equals(frameName)");
                nextFrame = frame;
            }
        }
  //    System.out.println("Inside switch function after for loop");
        if (currentFrame != null && nextFrame != null ) {
    //             System.out.println("If not null");

            frameHistory.push(currentFrame);
            currentFrame.setVisible(false);
            nextFrame.setVisible(true);
        }
  //  System.out.println("switch function end");

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        refreshButton = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        jButton3 = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        jPanel1.add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 80, -1, -1));

        desktopPane.setBackground(new java.awt.Color(102, 102, 255));
        desktopPane.setDoubleBuffered(true);
        desktopPane.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        desktopPane.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                desktopPaneComponentMoved(evt);
            }
        });

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
        );

        jPanel1.add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        prevButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        prevButton.setText("Previous");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });
        jPanel1.add(prevButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 950));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        
        JInternalFrame frame = desktopPane.getSelectedFrame();
        if(frame == showMember){
            showMember.refreshTable();
        }else if(frame == showMembership){
            showMembership.refreshTable();
        }else if(frame == showTrainer){
            showTrainer.refreshTable();
        }
        else if(frame == showFees ){
            showFees.refreshTable();
        }
        else if(frame == showEquipments ){
            showEquipments.refreshTable();
        }
        else if(frame == showRawMaterials ){
            showRawMaterials.refreshTable();
        }
        else{
           JOptionPane.showMessageDialog(null, "No table to refresh");
        }
        
        
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void desktopPaneComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_desktopPaneComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_desktopPaneComponentMoved

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        // TODO add your handling code here:
        if(frameHistory.isEmpty()){
            JOptionPane.showMessageDialog(null, "History is empty");
            return;
        }
        JInternalFrame currentFrame = null;
        for (JInternalFrame frame : desktopPane.getAllFrames()) {
                if (frame.isVisible()) {
                    currentFrame = frame;
                }
            }
            if (currentFrame != null) 
            {
                currentFrame.setVisible(false);
            }
            JInternalFrame previousFrame = frameHistory.pop();
            previousFrame.setVisible(true);
            
    }//GEN-LAST:event_prevButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}
