
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
public class DoctorProfile extends javax.swing.JFrame {

    /**
     * Creates new form DoctorProfile
     */
    public DoctorProfile() {
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
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton9.setBackground(new java.awt.Color(37, 193, 239));
        jButton9.setBorderPainted(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.setFocusPainted(false);
        jButton9.setFocusable(false);
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(40, 180, 10, 10);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackButton.png"))); // NOI18N
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(20, 160, 30, 30);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jButton7.setText("Updtae");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(740, 60, 73, 30);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(660, 60, 73, 29);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(580, 60, 73, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoctorLImage.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 10, 150, 140);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeButton.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(840, 50, 30, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PowerButton.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(890, 50, 30, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(840, 80, 34, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Logout");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(880, 80, 50, 14);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeButton.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(840, 50, 30, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Home");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(840, 80, 34, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  Logout");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(880, 80, 50, 14);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PowerButton.png"))); // NOI18N
        jPanel1.add(jButton2);
        jButton2.setBounds(890, 50, 30, 30);

        jLabel3.setBackground(new java.awt.Color(37, 193, 239));
        jLabel3.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("      Doctor profile");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 40, 880, 70);

        jLabel17.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel17.setText("LOGIN DETAILS");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(110, 150, 100, 19);

        jLabel7.setBackground(new java.awt.Color(37, 193, 239));
        jLabel7.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(37, 193, 239));
        jLabel7.setText("Username");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 170, 110, 50);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(230, 180, 200, 30);

        jLabel8.setBackground(new java.awt.Color(37, 193, 239));
        jLabel8.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(37, 193, 239));
        jLabel8.setText("Password");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(550, 170, 80, 50);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(620, 180, 210, 30);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(630, 300, 200, 30);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(230, 300, 200, 30);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(230, 260, 200, 30);

        jLabel9.setBackground(new java.awt.Color(37, 193, 239));
        jLabel9.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(37, 193, 239));
        jLabel9.setText("Accountant ID");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(140, 260, 120, 30);

        jLabel10.setBackground(new java.awt.Color(37, 193, 239));
        jLabel10.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(37, 193, 239));
        jLabel10.setText("Name");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(140, 300, 70, 30);

        jLabel11.setBackground(new java.awt.Color(37, 193, 239));
        jLabel11.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(37, 193, 239));
        jLabel11.setText("Address");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(140, 340, 80, 30);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(230, 340, 600, 30);

        jLabel12.setBackground(new java.awt.Color(37, 193, 239));
        jLabel12.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(37, 193, 239));
        jLabel12.setText("DOB");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(140, 380, 80, 30);
        jPanel1.add(jTextField10);
        jTextField10.setBounds(230, 380, 200, 30);

        jLabel19.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel19.setText("Contact Details");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(110, 430, 130, 19);

        jLabel18.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel18.setText("Personal Details");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(110, 230, 140, 19);

        jLabel13.setBackground(new java.awt.Color(37, 193, 239));
        jLabel13.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(37, 193, 239));
        jLabel13.setText("Mobile No");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(140, 460, 80, 30);

        jLabel14.setBackground(new java.awt.Color(37, 193, 239));
        jLabel14.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(37, 193, 239));
        jLabel14.setText("E-Mail ID");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(140, 500, 80, 30);
        jPanel1.add(jTextField13);
        jTextField13.setBounds(230, 500, 200, 30);
        jPanel1.add(jTextField12);
        jTextField12.setBounds(230, 460, 200, 30);

        jLabel20.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel20.setText("Emergency Contact Details");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(520, 430, 220, 19);

        jLabel15.setBackground(new java.awt.Color(37, 193, 239));
        jLabel15.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(37, 193, 239));
        jLabel15.setText("Person Name");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(550, 460, 76, 30);
        jPanel1.add(jTextField14);
        jTextField14.setBounds(645, 460, 180, 30);
        jPanel1.add(jTextField15);
        jTextField15.setBounds(645, 500, 180, 30);

        jLabel16.setBackground(new java.awt.Color(37, 193, 239));
        jLabel16.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(37, 193, 239));
        jLabel16.setText("Mobile No");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(550, 490, 80, 50);

        jLabel21.setBackground(new java.awt.Color(37, 193, 239));
        jLabel21.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(37, 193, 239));
        jLabel21.setText("Qualification");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(550, 380, 80, 30);
        jPanel1.add(jTextField11);
        jTextField11.setBounds(635, 380, 190, 30);

        jLabel22.setBackground(new java.awt.Color(37, 193, 239));
        jLabel22.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(37, 193, 239));
        jLabel22.setText("Gender");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(550, 300, 70, 30);

        jTextField1.setEditable(false);
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(110, 170, 770, 50);

        jTextField2.setEditable(false);
        jTextField2.setEnabled(false);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(110, 250, 770, 170);

        jTextField3.setEditable(false);
        jTextField3.setEnabled(false);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(110, 450, 370, 90);

        jTextField4.setEditable(false);
        jTextField4.setEnabled(false);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(520, 450, 360, 90);

        jTextField16.setEditable(false);
        jTextField16.setOpaque(false);
        jPanel1.add(jTextField16);
        jTextField16.setBounds(0, 0, 950, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
MainLogin m=new MainLogin();
m.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DoctorLoginPortal m=new DoctorLoginPortal();
        m.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   DoctorLoginPortal m=new DoctorLoginPortal();
        m.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        DoctorPortal m=new DoctorPortal();
        m.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 try {Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/HMS", "root", "manager");
            Statement stmt = con.createStatement();
            String a = jTextField5.getText();
            String b = jPasswordField1.getText();
            String c = jTextField6.getText();
            String d = jTextField7.getText();
            String f = jTextField8.getText();
            String e = jTextField9.getText();
            String h = jTextField10.getText();
            String g = jTextField11.getText();
            String i = jTextField12.getText();
            String j = jTextField13.getText();
            String k = jTextField14.getText();
            String l = jTextField15.getText();
            String sql = "Insert into doctor values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"')";
       String pass=JOptionPane.showInputDialog(null, "Enter Administrator Password");
       if(pass.equals("hospital"))
            stmt.executeUpdate(sql);
       else 
           JOptionPane.showMessageDialog(this, "Wrong Administrator Password");
       con.close();  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        JOptionPane.showMessageDialog(this, "Data Added Successfully");  
 jTextField5.setText("");
         jPasswordField1.setText("");
         jTextField6.setText("");
         jTextField7.setText("");
          jTextField8.setText("");
    jTextField9.setText("");
    jTextField10.setText("");
            jTextField11.setText("");
      jTextField12.setText("");
           jTextField13.setText("");
        jTextField14.setText("");
            jTextField15.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        AdminPortal m=new AdminPortal();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
String a=jTextField5.getText();
 String b=jPasswordField1.getText();
        try {Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/hms", "root", "manager");
            Statement stmt = con.createStatement();
              String sql = "Select * from doctor where Username='"+a+"' and Password='"+b+"' ";
              ResultSet rst=stmt.executeQuery(sql);
      if(rst.next())
      { 
      jTextField6.setText(rst.getString("doctorId"));
      jTextField7.setText(rst.getString("Name"));
      jTextField9.setText(rst.getString("address"));
      jTextField8.setText(rst.getString("gender"));
      jTextField11.setText(rst.getString("qualification"));
      jTextField10.setText(rst.getString("dob"));
      jTextField12.setText(rst.getString("mobileno"));
      jTextField13.setText(rst.getString("emailid"));
      jTextField14.setText(rst.getString("Personname"));
      jTextField15.setText(rst.getString("phoneno"));
      }
        else 
          JOptionPane.showMessageDialog(this, "Invalid Data Entered");
       con.close();  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }             // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 String a=jTextField5.getText();
 String b=jPasswordField1.getText();
        try {Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/HMS", "root", "manager");
            Statement stmt = con.createStatement();
            String x = jTextField6.getText();
            String y = jTextField7.getText();
            String c = jTextField8.getText();
            String d = jTextField9.getText();
            String e = jTextField10.getText();
            String f = jTextField11.getText();
            String g = jTextField12.getText(); 
            String h = jTextField13.getText(); 
            String i = jTextField14.getText(); 
            String j = jTextField15.getText(); 
            String sql = "Update doctor set doctorID='"+x+"',Name='"+y+"',Gender='"+c+"',Address='"+d+"',DOB='"+e+"',Qualification='"+f+"',MobileNo='"+g+"',EmailId='"+h+"',Personname='"+i+"',phoneno='"+j+"'where Username='"+a+"' and Password='"+b+"' ";
            stmt.executeUpdate(sql);
       con.close();  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        JOptionPane.showMessageDialog(this, "Profile Updated Successfully");   
         jTextField5.setText("");
         jPasswordField1.setText("");
         jTextField6.setText("");
         jTextField7.setText("");
          jTextField8.setText("");
    jTextField9.setText("");
    jTextField10.setText("");
            jTextField11.setText("");
      jTextField12.setText("");
           jTextField13.setText("");
        jTextField14.setText("");
            jTextField15.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}