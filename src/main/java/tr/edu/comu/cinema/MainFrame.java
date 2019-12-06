/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.comu.cinema;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * created on Dec 6, 2019 1:24:01 PM
 *
 * @author bayramcicek
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top_jLabel = new javax.swing.JLabel();
        contributors_jLabel = new javax.swing.JLabel();
        tur_sec_jLabel = new javax.swing.JLabel();
        manager_jButton = new javax.swing.JButton();
        ticket_seller_jButton = new javax.swing.JButton();
        customer_jButton = new javax.swing.JButton();
        for_jLabel = new javax.swing.JLabel();
        main_login_jButton = new javax.swing.JButton();
        edit_jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(249, 249, 249));
        setResizable(false);
        setSize(new java.awt.Dimension(539, 283));

        top_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        top_jLabel.setText("Veritabanı Yönetim Sistemleri Dönem Projesi - Güz 2019 - Sinema Otomasyon Projesi");
        top_jLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        contributors_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contributors_jLabel.setText("Bayram ÇİÇEK - Tolga AKSOY");
        contributors_jLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        tur_sec_jLabel.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        tur_sec_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tur_sec_jLabel.setText("Giriş Türünüzü Seçiniz:");

        manager_jButton.setBackground(new java.awt.Color(224, 224, 65));
        manager_jButton.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        manager_jButton.setText("Manager");
        manager_jButton.setMaximumSize(new java.awt.Dimension(70, 30));
        manager_jButton.setMinimumSize(new java.awt.Dimension(70, 30));
        manager_jButton.setPreferredSize(new java.awt.Dimension(70, 30));
        manager_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manager_jButtonMouseClicked(evt);
            }
        });

        ticket_seller_jButton.setBackground(new java.awt.Color(128, 106, 172));
        ticket_seller_jButton.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        ticket_seller_jButton.setText("Ticket Seller");
        ticket_seller_jButton.setMaximumSize(new java.awt.Dimension(70, 30));
        ticket_seller_jButton.setMinimumSize(new java.awt.Dimension(70, 30));
        ticket_seller_jButton.setPreferredSize(new java.awt.Dimension(70, 30));
        ticket_seller_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticket_seller_jButtonMouseClicked(evt);
            }
        });
        ticket_seller_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticket_seller_jButtonActionPerformed(evt);
            }
        });

        customer_jButton.setBackground(new java.awt.Color(241, 103, 74));
        customer_jButton.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        customer_jButton.setText("Customer");
        customer_jButton.setMaximumSize(new java.awt.Dimension(70, 30));
        customer_jButton.setMinimumSize(new java.awt.Dimension(70, 30));
        customer_jButton.setPreferredSize(new java.awt.Dimension(70, 30));
        customer_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customer_jButtonMouseClicked(evt);
            }
        });

        for_jLabel.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N

        main_login_jButton.setText("için Giriş Yap ");
        main_login_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_login_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(manager_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(ticket_seller_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(customer_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tur_sec_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contributors_jLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(top_jLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(edit_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(for_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(main_login_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(top_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contributors_jLabel)
                .addGap(39, 39, 39)
                .addComponent(tur_sec_jLabel)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manager_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ticket_seller_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customer_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(for_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(main_login_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ticket_seller_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticket_seller_jButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticket_seller_jButtonActionPerformed

    private void manager_jButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manager_jButtonMouseClicked
        // TODO add your handling code here:
        edit_jLabel.setText("");
        for_jLabel.setText("Manager");

    }//GEN-LAST:event_manager_jButtonMouseClicked

    private void ticket_seller_jButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticket_seller_jButtonMouseClicked
        // TODO add your handling code here:
        edit_jLabel.setText("");
        for_jLabel.setText("Ticket Seller");
    }//GEN-LAST:event_ticket_seller_jButtonMouseClicked

    private void customer_jButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_jButtonMouseClicked
        // TODO add your handling code here:
        edit_jLabel.setText("");
        for_jLabel.setText("Customer");
    }//GEN-LAST:event_customer_jButtonMouseClicked

    private void main_login_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_login_jButtonActionPerformed
        if (null == for_jLabel.getText()) {
            for_jLabel.setText("");
        } else // TODO add your handling code here:
        switch (for_jLabel.getText()) {
            case "Manager":
                ManagerFrame man = new ManagerFrame();
                man.setVisible(true);
                setVisible(false);
                break;
            case "Ticket Seller":
                TicketSellerFrame seller = new TicketSellerFrame();
                seller.setVisible(true);
                setVisible(false);
                break;
            case "Customer":
                CustomerFrame customer = new CustomerFrame();
                customer.setVisible(true);
                setVisible(false);
                break;
            default:
                for_jLabel.setText("");
                edit_jLabel.setText("Please select one of the buttons above");
                break;
        }
    }//GEN-LAST:event_main_login_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contributors_jLabel;
    private javax.swing.JButton customer_jButton;
    private javax.swing.JLabel edit_jLabel;
    private javax.swing.JLabel for_jLabel;
    private javax.swing.JButton main_login_jButton;
    private javax.swing.JButton manager_jButton;
    private javax.swing.JButton ticket_seller_jButton;
    private javax.swing.JLabel top_jLabel;
    private javax.swing.JLabel tur_sec_jLabel;
    // End of variables declaration//GEN-END:variables

}