/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tr.edu.comu.cinema;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.util.List;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * created on Dec 6, 2019 2:27:40 PM
 * @author bayramcicek
 */
public class TicketSellerFrame extends javax.swing.JFrame {
    
    static Session session;

    /** Creates new form TicketSellerFrame */
    public TicketSellerFrame() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2 - getHeight()/2);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username_jLabel = new javax.swing.JLabel();
        password_jLabel = new javax.swing.JLabel();
        password_jPasswordField = new javax.swing.JPasswordField();
        top_jLabel = new javax.swing.JLabel();
        main_IMG_jLabel = new javax.swing.JLabel();
        user_IMG_jLabel = new javax.swing.JLabel();
        password_IMG_Label = new javax.swing.JLabel();
        username_jtextField = new javax.swing.JTextField();
        clear_jButton = new javax.swing.JButton();
        signin_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(530, 300));
        setResizable(false);

        password_jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                password_jPasswordFieldKeyReleased(evt);
            }
        });

        top_jLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        top_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        top_jLabel.setText("TICKET SELLER");

        main_IMG_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/video-production-4223911_640_200x200.jpg"))); // NOI18N

        user_IMG_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usericon_30x.png"))); // NOI18N

        password_IMG_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-password-30.png"))); // NOI18N

        username_jtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_jtextFieldActionPerformed(evt);
            }
        });
        username_jtextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                username_jtextFieldKeyReleased(evt);
            }
        });

        clear_jButton.setBackground(new java.awt.Color(253, 125, 190));
        clear_jButton.setText("CLEAR");
        clear_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_jButtonActionPerformed(evt);
            }
        });

        signin_jButton.setBackground(new java.awt.Color(200, 0, 0));
        signin_jButton.setForeground(new java.awt.Color(255, 255, 255));
        signin_jButton.setText("SIGN IN");
        signin_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(top_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(main_IMG_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(user_IMG_jLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(username_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(username_jtextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password_jLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(clear_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(signin_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(password_IMG_Label)
                                .addGap(18, 18, 18)
                                .addComponent(password_jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(top_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username_jtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_IMG_jLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password_IMG_Label)
                            .addComponent(password_jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clear_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signin_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(main_IMG_jLabel))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void password_jPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_jPasswordFieldKeyReleased
        // TODO add your handling code here:
        password_jLabel.setText("");
    }//GEN-LAST:event_password_jPasswordFieldKeyReleased

    private void username_jtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_jtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_jtextFieldActionPerformed

    private void username_jtextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_jtextFieldKeyReleased
        // TODO add your handling code here:
        username_jLabel.setText("");
    }//GEN-LAST:event_username_jtextFieldKeyReleased

    private void clear_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_jButtonActionPerformed
        // TODO add your handling code here:
        username_jLabel.setText("");
        password_jLabel.setText("");
        username_jtextField.setText("");
        password_jPasswordField.setText("");
    }//GEN-LAST:event_clear_jButtonActionPerformed

    private void signin_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin_jButtonActionPerformed
        // TODO add your handling code here:
        if (username_jtextField.getText().trim().isEmpty() && password_jPasswordField.getText().trim().isEmpty()) {
            username_jLabel.setText("Please fill out Username");
            password_jLabel.setText("Please fill out Password");
        }else if (username_jtextField.getText().trim().isEmpty()) {
            username_jLabel.setText("Please fill out Username");
        }else if (password_jPasswordField.getText().trim().isEmpty()) {
            password_jLabel.setText("Please fill out Password");

        } else {
            try {

                session = HibernateUtil.getSessionFactory().openSession();

                // Hibernate Query Language
                //                String sql_query = "from Manager where username= :u and password= :p";
                //                Query query = session.createQuery(sql_query);
                //                query.setParameter("u", username_jtextField.getText());
                //                query.setParameter("p", password_jPasswordField.getText());
                //                List results = query.list();

                // Hibernate Query Language
                List results = session
                .createQuery("from TicketSeller where username= :u and password= :p")
                .setString("u", username_jtextField.getText())
                .setString("p", password_jPasswordField.getText())
                .list();

                if ((results != null) && (results.size() > 0)) {
                    JOptionPane.showMessageDialog(null, "Login SUCCESSFUL!!!");
                    //                    MainMenu menu = new MainMenu();
                    //                    menu.setVisible(true);
                    //                    setVisible(false);

                }else {

                    username_jLabel.setText("incorrect username");
                    password_jLabel.setText("incorrect password");

                }

                session.close();

            } catch (HeadlessException | HibernateException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_signin_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TicketSellerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketSellerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketSellerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketSellerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketSellerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_jButton;
    private javax.swing.JLabel main_IMG_jLabel;
    private javax.swing.JLabel password_IMG_Label;
    private javax.swing.JLabel password_jLabel;
    private javax.swing.JPasswordField password_jPasswordField;
    private javax.swing.JButton signin_jButton;
    private javax.swing.JLabel top_jLabel;
    private javax.swing.JLabel user_IMG_jLabel;
    private javax.swing.JLabel username_jLabel;
    private javax.swing.JTextField username_jtextField;
    // End of variables declaration//GEN-END:variables

}
