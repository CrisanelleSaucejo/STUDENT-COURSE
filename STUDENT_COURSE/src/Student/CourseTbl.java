
package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class CourseTbl extends javax.swing.JFrame {

    /**
     * Creates new form CourseTbl
     */
    public CourseTbl() {
        initComponents();
        load();
    }

    
private void load(){
       String databaseURL = "jdbc:derby://localhost:1527/C:/Derby/Bookme";
        Connection con;  
        try {
            con = DriverManager.getConnection(databaseURL);
            PreparedStatement pst = con.prepareStatement("Select STUDENT_ID From STUDENT ");
            ResultSet rs = pst.executeQuery();
            sID.removeAllItems();
            while(rs.next()){
                sID.addItem(rs.getString(1));
                }    
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        updatec = new javax.swing.JButton();
        deletec = new javax.swing.JButton();
        addc = new javax.swing.JButton();
        showc = new javax.swing.JButton();
        back3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adds1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        adds4 = new javax.swing.JTextField();
        adds3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sID = new javax.swing.JComboBox<>();
        adds2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(16, 15, 15));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updatec.setBackground(new java.awt.Color(84, 82, 82));
        updatec.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        updatec.setText("UPDATE");
        updatec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatecActionPerformed(evt);
            }
        });
        jPanel2.add(updatec, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 139, 64));

        deletec.setBackground(new java.awt.Color(84, 82, 82));
        deletec.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        deletec.setText("DELETE");
        deletec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletecActionPerformed(evt);
            }
        });
        jPanel2.add(deletec, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 139, 61));

        addc.setBackground(new java.awt.Color(84, 82, 82));
        addc.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        addc.setText("ADD");
        addc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcActionPerformed(evt);
            }
        });
        jPanel2.add(addc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 139, 62));

        showc.setBackground(new java.awt.Color(84, 82, 82));
        showc.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        showc.setText("SHOW RECORD");
        showc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showcActionPerformed(evt);
            }
        });
        jPanel2.add(showc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 139, 65));

        back3.setBackground(new java.awt.Color(0, 0, 0));
        back3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back3.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-forward-button-30 (1).png")); // NOI18N
        back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back3ActionPerformed(evt);
            }
        });
        jPanel2.add(back3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 172, 454));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setText("COURSE ID        :");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 14, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setText("INSTRUCTOR    :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 94, -1, -1));

        adds1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adds1ActionPerformed(evt);
            }
        });
        jPanel3.add(adds1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 14, 228, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setText("COURSE NAME :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 54, -1, -1));

        adds4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adds4ActionPerformed(evt);
            }
        });
        jPanel3.add(adds4, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 134, 228, -1));

        adds3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adds3ActionPerformed(evt);
            }
        });
        jPanel3.add(adds3, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 94, 228, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setText("STUDENT ID     :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 174, -1, -1));

        sID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(sID, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 174, 228, 38));

        adds2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adds2ActionPerformed(evt);
            }
        });
        jPanel3.add(adds2, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 54, 228, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setText("CREDIT HOURS:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 134, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\100.jpg")); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 230));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 30, 420, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatecActionPerformed
        try {
            String url = "jdbc:derby://localhost:1527/C:/Derby/Bookme";
            String upsql = "update COURSE SET COURSE_NAME=? , INSTRUCTOR =? , CREDIT_HOURS =? , STUDENT_ID =? WHERE COURSE_ID=?";

            Connection con = DriverManager.getConnection(url);
            PreparedStatement ps = con.prepareStatement(upsql);

            ps.setString(5, adds1.getText());
            ps.setString(1, adds2.getText());
            ps.setString(2, adds3.getText());
            ps.setString(3, adds4.getText());
            ps.setString(4, (String)sID.getSelectedItem());
            int row = ps.executeUpdate();

            if (row == 1) {
                JOptionPane.showMessageDialog(null, "update");
                adds1.setText("");
                adds2.setText("");
                adds3.setText("");
                adds4.setText("");
               sID.setSelectedItem(0);

            } else {
                JOptionPane.showMessageDialog(null, "No Data!!");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updatecActionPerformed

    private void adds1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adds1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adds1ActionPerformed

    private void adds2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adds2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adds2ActionPerformed

    private void adds3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adds3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adds3ActionPerformed

    private void adds4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adds4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adds4ActionPerformed

    private void back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back3ActionPerformed
        Student_CourseTbl book = new Student_CourseTbl();

        book.show();
        dispose();
    }//GEN-LAST:event_back3ActionPerformed

    private void addcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcActionPerformed
        String url = "jdbc:derby://localhost:1527/C:/Derby/Bookme";
        String addsql = "insert into COURSE (COURSE_ID,COURSE_NAME,INSTRUCTOR,CREDIT_HOURS,STUDENT_ID) VALUES(?,?,?,?,?)";

        try {

            Connection con = DriverManager.getConnection(url);

            PreparedStatement pst = con.prepareStatement(addsql);

            pst.setString(1, adds1.getText());
            pst.setString(2, adds2.getText());
            pst.setString(3, adds3.getText());
            pst.setString(4, adds4.getText());
            pst.setString(5, (String)sID.getSelectedItem());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Added Successfully!!");
            adds1.setText(" ");
            adds2.setText(" ");
            adds3.setText(" ");
            adds4.setText(" ");
            sID.setSelectedItem(0);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_addcActionPerformed

    private void deletecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletecActionPerformed
        String url = "jdbc:derby://localhost:1527/C:/Derby/Bookme";
        String delsql = "delete From COURSE WHERE COURSE_ID=?";

        try {

            Connection con = DriverManager.getConnection(url);
            PreparedStatement ps = con.prepareStatement(delsql);

            ps.setString(1, adds1.getText());
            ps.executeUpdate();
            adds1.setText("");
            JOptionPane.showMessageDialog(null, "Deleted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deletecActionPerformed

    private void showcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showcActionPerformed
        Course_record book = new Course_record();

        book.show();
        dispose();
    }//GEN-LAST:event_showcActionPerformed

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
            java.util.logging.Logger.getLogger(CourseTbl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseTbl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseTbl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseTbl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseTbl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addc;
    private javax.swing.JTextField adds1;
    private javax.swing.JTextField adds2;
    private javax.swing.JTextField adds3;
    private javax.swing.JTextField adds4;
    private javax.swing.JButton back3;
    private javax.swing.JButton deletec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> sID;
    private javax.swing.JButton showc;
    private javax.swing.JButton updatec;
    // End of variables declaration//GEN-END:variables
}
