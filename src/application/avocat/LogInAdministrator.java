/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.avocat;


import java.sql.* ;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.* ;
/**
 *
 * @author thamer
 */
public class LogInAdministrator extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogInAdministrator() {
        initComponents();
                MysqlConnection connect = new MysqlConnection();
                 connect.seConnecter();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        pswd = new javax.swing.JPasswordField();
        submitButon = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 0));
        setMinimumSize(new java.awt.Dimension(577, 322));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Adiministrator");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 100, 150, 40);

        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(250, 150, 170, 30);
        getContentPane().add(pswd);
        pswd.setBounds(250, 190, 170, 30);

        submitButon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images.jpg"))); // NOI18N
        submitButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButon.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        submitButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButon);
        submitButon.setBounds(270, 230, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sans titre.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 200, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sans titre1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 320);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButonActionPerformed
        // fonctio de connection    
        
        String sql = "select login , motdepasse from identification " ;
        Home acc = null;
        try {
            acc = new Home();
        } catch (SQLException ex) {
            Logger.getLogger(LogInAdministrator.class.getName()).log(Level.SEVERE, null, ex);
        }
         int test = 0 ;
        
        
        // PreparedStatement preparedStatement;
        try {
           /* preparedStatement = MysqlConnection.conn.prepareStatement(sql);
              preparedStatement.executeUpdate(); 
              preparedStatement.close();*/
            Statement state =  MysqlConnection.conn.createStatement() ;
            ResultSet res = state.executeQuery(sql);
            
            while(res.next()){ 
                if(res.getString(1).equals(login.getText().toString())){
                    if (res.getString(2).equals(pswd.getText().toString())){
                        acc.setVisible(true);
                        test = 1 ;
                        
                        
                    }
                  
                }
         
                
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LogInAdministrator.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        if(test==0){
            JOptionPane.showMessageDialog(this, "erreur");
        }
           

    }//GEN-LAST:event_submitButonActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(LogInAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInAdministrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField pswd;
    private javax.swing.JButton submitButon;
    // End of variables declaration//GEN-END:variables
}
