
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User  001
 */
public class UpdatePatient extends javax.swing.JFrame {

    /**
     * Creates new form UpdatePatient
     */
    public UpdatePatient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel7.setBackground(new java.awt.Color(37, 193, 239));
        jLabel7.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(37, 193, 239));
        jLabel7.setText("PatientID");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 180, 110, 50);

        jLabel14.setBackground(new java.awt.Color(37, 193, 239));
        jLabel14.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(37, 193, 239));
        jLabel14.setText("Date of Discharge");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(550, 430, 120, 30);

        jLabel22.setBackground(new java.awt.Color(37, 193, 239));
        jLabel22.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(37, 193, 239));
        jLabel22.setText("Gender");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(550, 300, 70, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(840, 80, 34, 14);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PatientLogo.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 140, 150);

        jLabel16.setBackground(new java.awt.Color(37, 193, 239));
        jLabel16.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(37, 193, 239));
        jLabel16.setText("Ward No");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(140, 500, 80, 30);

        jLabel10.setBackground(new java.awt.Color(37, 193, 239));
        jLabel10.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(37, 193, 239));
        jLabel10.setText("Date of Admit");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(140, 430, 90, 30);

        jLabel5.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(37, 193, 239));
        jLabel5.setText("PatientType");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(550, 381, 120, 30);

        jLabel9.setBackground(new java.awt.Color(37, 193, 239));
        jLabel9.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(37, 193, 239));
        jLabel9.setText("Age");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(550, 260, 120, 30);

        jLabel8.setBackground(new java.awt.Color(37, 193, 239));
        jLabel8.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(37, 193, 239));
        jLabel8.setText("Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(140, 250, 80, 30);

        jLabel11.setBackground(new java.awt.Color(37, 193, 239));
        jLabel11.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(37, 193, 239));
        jLabel11.setText("Address");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(140, 340, 80, 30);

        jLabel12.setBackground(new java.awt.Color(37, 193, 239));
        jLabel12.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(37, 193, 239));
        jLabel12.setText("Blood Group");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(140, 380, 80, 30);

        jLabel13.setBackground(new java.awt.Color(37, 193, 239));
        jLabel13.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(37, 193, 239));
        jLabel13.setText("Mobile No");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(140, 290, 80, 40);

        jLabel17.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel17.setText("(for Indoor patients only)");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(140, 480, 210, 19);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Logout");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(880, 80, 50, 14);

        jLabel15.setBackground(new java.awt.Color(37, 193, 239));
        jLabel15.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(37, 193, 239));
        jLabel15.setText("Bed No");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(550, 500, 38, 30);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(750, 60, 73, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PowerButton.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(890, 50, 30, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeButton.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(840, 50, 30, 30);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(230, 250, 200, 30);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackButton.png"))); // NOI18N
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(40, 170, 30, 30);

        jLabel3.setBackground(new java.awt.Color(37, 193, 239));
        jLabel3.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("      Search Patient Details");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 40, 880, 70);
        jPanel1.add(jTextField15);
        jTextField15.setBounds(670, 500, 200, 30);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(230, 190, 200, 30);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(670, 260, 200, 30);
        jPanel1.add(jTextField13);
        jTextField13.setBounds(230, 500, 200, 30);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(230, 340, 640, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(670, 380, 200, 30);
        jPanel1.add(jTextField12);
        jTextField12.setBounds(230, 430, 200, 30);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(230, 300, 200, 30);
        jPanel1.add(jTextField10);
        jTextField10.setBounds(230, 380, 200, 30);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(670, 300, 200, 30);
        jPanel1.add(jTextField14);
        jTextField14.setBounds(670, 430, 200, 30);

        jTextField16.setEditable(false);
        jPanel1.add(jTextField16);
        jTextField16.setBounds(0, 0, 950, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        PatientDetails m=new PatientDetails();
        m.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  String a=jTextField5.getText();
        try {Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/hms", "root", "manager");
            Statement stmt = con.createStatement();
              String sql = "Select * from patient where patientid='"+a+"'";
              ResultSet rst=stmt.executeQuery(sql);
      if(rst.next())
      { 
      jTextField5.setText(rst.getString("PatientId"));
      jTextField1.setText(rst.getString("Name"));
      jTextField9.setText(rst.getString("address"));
      jTextField8.setText(rst.getString("gender"));
      jTextField6.setText(rst.getString("age"));
      jTextField12.setText(rst.getString("dateofadmit"));
      jTextField14.setText(rst.getString("dateofdischarge"));
      jTextField10.setText(rst.getString("bloodgroup"));
      jTextField7.setText(rst.getString("phoneno"));
      jTextField2.setText(rst.getString("patienttype"));
      jTextField13.setText(rst.getString("wardno"));
      jTextField15.setText(rst.getString("bedno"));
      }
        else 
          JOptionPane.showMessageDialog(this, "Invalid Data Entered");
       con.close();  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }                // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AccountantPortal m=new AccountantPortal();
        m.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MainLogin m=new MainLogin();
        m.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
