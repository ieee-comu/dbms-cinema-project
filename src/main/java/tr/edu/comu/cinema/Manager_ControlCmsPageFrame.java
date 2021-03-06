/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tr.edu.comu.cinema;

import entity.Manager;
import org.hibernate.Session;
import entity.CmsPage;
import java.util.Date;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;

/**
 * created on Dec 7, 2019 7:54:52 PM
 * @author bayramcicek
 */
public class Manager_ControlCmsPageFrame extends javax.swing.JFrame {
    
    static Session session;
    private static Manager current_user;

    /** Creates new form CMS_PageFrame
     * @param current_user */
    
    public Manager_ControlCmsPageFrame(Manager current_user) {
        initComponents();
        show_seat_data();
        Manager_ControlCmsPageFrame.current_user = current_user;
        manager_username_jTextField.setText(Manager_ControlCmsPageFrame.current_user.getUsername());
    }

    private static <CmsPage> List<CmsPage> loadAllData(Class<CmsPage> type, Session session) {

        CriteriaBuilder builder;
        builder = session.getCriteriaBuilder();
        CriteriaQuery<CmsPage> criteria = builder.createQuery(type);
        criteria.from(type);
        List<CmsPage> data;
        data = session.createQuery(criteria).getResultList();
        return data;

    }

    private void show_seat_data() {

        try {
            session = HibernateUtil.getSessionFactory().openSession();
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        List<CmsPage> cms_data = loadAllData(CmsPage.class, session);
        session.close();

        DefaultTableModel model = (DefaultTableModel) cms_jTable.getModel();
        Object[] row = new Object[6];

        for (int i = 0; i < cms_data.size(); i++) {
            row[0] = cms_data.get(i).getPageTitle();
            row[1] = cms_data.get(i).getPageBody();
            row[2] = cms_data.get(i).getPageTags();
            row[3] = cms_data.get(i).getPageDesc();
            row[4] = cms_data.get(i).getModifiedDate();
            row[5] = cms_data.get(i).getManager().getUsername();
            model.addRow(row);
        }

    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        page_title_jLabel = new javax.swing.JLabel();
        page_title_jTextField = new javax.swing.JTextField();
        page_body_jTextField = new javax.swing.JTextField();
        tag_jLabel = new javax.swing.JLabel();
        manager_username_jTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cms_jTable = new javax.swing.JTable();
        manager_username_jLabel = new javax.swing.JLabel();
        alert_jLabel = new javax.swing.JLabel();
        insert_jButton = new javax.swing.JButton();
        cms_jLabel = new javax.swing.JLabel();
        update_jButton = new javax.swing.JButton();
        delete_jButton = new javax.swing.JButton();
        refresh_jButton = new javax.swing.JButton();
        page_body_jLabel1 = new javax.swing.JLabel();
        tag_jTextField = new javax.swing.JTextField();
        desc_jLabel1 = new javax.swing.JLabel();
        desc_jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        page_title_jLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        page_title_jLabel.setText("Page Title:");

        page_title_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page_title_jTextFieldActionPerformed(evt);
            }
        });
        page_title_jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                page_title_jTextFieldKeyReleased(evt);
            }
        });

        page_body_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page_body_jTextFieldActionPerformed(evt);
            }
        });
        page_body_jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                page_body_jTextFieldKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                page_body_jTextFieldKeyReleased(evt);
            }
        });

        tag_jLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        tag_jLabel.setText("Tags:");

        manager_username_jTextField.setEnabled(false);
        manager_username_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manager_username_jTextFieldActionPerformed(evt);
            }
        });

        cms_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Page title", "Page body", "Tags", "Description", "Modified date", "Manager username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cms_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cms_jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cms_jTable);

        manager_username_jLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        manager_username_jLabel.setText("Manager Username:");

        alert_jLabel.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N

        insert_jButton.setText("INSERT");
        insert_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_jButtonActionPerformed(evt);
            }
        });

        cms_jLabel.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        cms_jLabel.setText("Control CMS page");

        update_jButton.setText("UPDATE");
        update_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_jButtonActionPerformed(evt);
            }
        });

        delete_jButton.setText("DELETE");
        delete_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_jButtonActionPerformed(evt);
            }
        });

        refresh_jButton.setText("REFRESH");
        refresh_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_jButtonActionPerformed(evt);
            }
        });

        page_body_jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        page_body_jLabel1.setText("Page Body:");

        tag_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tag_jTextFieldActionPerformed(evt);
            }
        });
        tag_jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tag_jTextFieldKeyReleased(evt);
            }
        });

        desc_jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        desc_jLabel1.setText("Desc:");

        desc_jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desc_jTextField1ActionPerformed(evt);
            }
        });
        desc_jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                desc_jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(refresh_jButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(insert_jButton)
                        .addGap(28, 28, 28)
                        .addComponent(update_jButton)
                        .addGap(27, 27, 27)
                        .addComponent(delete_jButton))
                    .addComponent(page_title_jLabel)
                    .addComponent(page_title_jTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tag_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tag_jTextField))
                    .addComponent(manager_username_jLabel)
                    .addComponent(page_body_jTextField)
                    .addComponent(manager_username_jTextField)
                    .addComponent(alert_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cms_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(page_body_jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(desc_jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desc_jTextField1)))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(page_title_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(page_title_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(page_body_jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(page_body_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tag_jLabel)
                            .addComponent(tag_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desc_jLabel1)
                            .addComponent(desc_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(manager_username_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manager_username_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alert_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cms_jLabel)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insert_jButton)
                            .addComponent(update_jButton)
                            .addComponent(delete_jButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refresh_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void page_title_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page_title_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_page_title_jTextFieldActionPerformed

    private void page_body_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page_body_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_page_body_jTextFieldActionPerformed

    private void page_body_jTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_page_body_jTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_page_body_jTextFieldKeyTyped

    private void page_body_jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_page_body_jTextFieldKeyReleased
        // TODO add your handling code here:
        alert_jLabel.setText("");
    }//GEN-LAST:event_page_body_jTextFieldKeyReleased

    private void manager_username_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manager_username_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manager_username_jTextFieldActionPerformed

    private void cms_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cms_jTableMouseClicked
        // TODO add your handling code here:
        int i = cms_jTable.getSelectedRow();
        TableModel model = cms_jTable.getModel();
        alert_jLabel.setText("");
        page_title_jTextField.setText(model.getValueAt(i, 0).toString());
        page_body_jTextField.setText(model.getValueAt(i, 1).toString());
        tag_jTextField.setText(model.getValueAt(i, 2).toString());
        desc_jTextField1.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_cms_jTableMouseClicked

    private void insert_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_jButtonActionPerformed
        // TODO add your handling code here: INSERT
        String pageTitle = page_title_jTextField.getText();
        String pageBody = page_body_jTextField.getText();
        String pageTags = tag_jTextField.getText();
        String pageDesc = desc_jTextField1.getText();
        Date CURRENT_TIMESTAMP = new Date();

        if ("".equals(pageTitle) | "".equals(pageBody) | "".equals(pageTags) | "".equals(pageDesc)) {
            alert_jLabel.setText("Please fill empty field(s).");
           
        } else {
            try {

                CmsPage cms = new CmsPage(pageTitle, current_user, pageBody, pageTags, pageDesc, CURRENT_TIMESTAMP);
                session = HibernateUtil.getSessionFactory().openSession();
                Transaction tx;
                tx = session.beginTransaction();
                session.save(cms);
                tx.commit();
                session.close();

                page_title_jTextField.setText("");
                page_body_jTextField.setText("");
                tag_jTextField.setText("");
                desc_jTextField1.setText("");
                alert_jLabel.setText("INSERTED Successfully. Click REFRESH.");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_insert_jButtonActionPerformed

    private void update_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_jButtonActionPerformed
        // TODO add your handling code here: UPDATE
        
        String pageTitle = page_title_jTextField.getText();
        String pageBody = page_body_jTextField.getText();
        String pageTags = tag_jTextField.getText();
        String pageDesc = desc_jTextField1.getText();
        Date CURRENT_TIMESTAMP = new Date();
        
        int row = cms_jTable.getSelectedRow();
        String current_pageTitle;

        if (row < 0){
            alert_jLabel.setText("Please select a row from table");
        } else if ("".equals(pageTitle) | "".equals(pageBody) | "".equals(pageTags) | "".equals(pageDesc)) {
            alert_jLabel.setText("Please fill out here");
        } else if (!(pageTitle.equals(cms_jTable.getModel().getValueAt(row, 0).toString()))){
            alert_jLabel.setText("Please do not modify pageTitle!");
            
        } else {
            try {

                session = HibernateUtil.getSessionFactory().openSession();
                current_pageTitle = cms_jTable.getModel().getValueAt(row, 0).toString();
                Object obj = session.load(CmsPage.class, current_pageTitle);
                CmsPage cms = (CmsPage)obj;

                Transaction tx;
                tx = session.beginTransaction();
                cms.setPageBody(pageBody);
                cms.setPageTags(pageTags);
                cms.setPageDesc(pageDesc);
                cms.setModifiedDate(CURRENT_TIMESTAMP);
                tx.commit();
                session.close();

                page_title_jTextField.setText("");
                page_body_jTextField.setText("");
                tag_jTextField.setText("");
                desc_jTextField1.setText("");
                alert_jLabel.setText("UPDATED Successfully. Click REFRESH.");

            } catch (NumberFormatException | HibernateException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_update_jButtonActionPerformed

    private void delete_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_jButtonActionPerformed

        int row = cms_jTable.getSelectedRow();
        String current_pageTitle;

        if (row < 0){
            alert_jLabel.setText("Please select a row from table");
        } else {
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                current_pageTitle = cms_jTable.getModel().getValueAt(row, 0).toString();
                Object obj = session.load(CmsPage.class, current_pageTitle);
                CmsPage cms = (CmsPage)obj;

                Transaction tx;
                tx = session.beginTransaction();
                session.delete(cms);
                tx.commit();
                session.close();

                page_title_jTextField.setText("");
                page_body_jTextField.setText("");
                tag_jTextField.setText("");
                desc_jTextField1.setText("");
                alert_jLabel.setText("DELETED Successfully. Click REFRESH.");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_delete_jButtonActionPerformed

    private void refresh_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_jButtonActionPerformed
        // TODO add your handling code here: REFRESH
        DefaultTableModel model = (DefaultTableModel) cms_jTable.getModel();
        model.setRowCount(0);
        show_seat_data();
        page_title_jTextField.setText("");
        page_body_jTextField.setText("");
        tag_jTextField.setText("");
        desc_jTextField1.setText("");
    }//GEN-LAST:event_refresh_jButtonActionPerformed

    private void tag_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tag_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tag_jTextFieldActionPerformed

    private void desc_jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desc_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desc_jTextField1ActionPerformed

    private void page_title_jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_page_title_jTextFieldKeyReleased
        // TODO add your handling code here:
        alert_jLabel.setText("");
    }//GEN-LAST:event_page_title_jTextFieldKeyReleased

    private void tag_jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tag_jTextFieldKeyReleased
        // TODO add your handling code here:
        alert_jLabel.setText("");
    }//GEN-LAST:event_tag_jTextFieldKeyReleased

    private void desc_jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_desc_jTextField1KeyReleased
        // TODO add your handling code here:
        alert_jLabel.setText("");
    }//GEN-LAST:event_desc_jTextField1KeyReleased

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
            java.util.logging.Logger.getLogger(Manager_ControlCmsPageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager_ControlCmsPageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager_ControlCmsPageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager_ControlCmsPageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Manager_ControlCmsPageFrame(current_user).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert_jLabel;
    private javax.swing.JLabel cms_jLabel;
    private javax.swing.JTable cms_jTable;
    private javax.swing.JButton delete_jButton;
    private javax.swing.JLabel desc_jLabel1;
    private javax.swing.JTextField desc_jTextField1;
    private javax.swing.JButton insert_jButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manager_username_jLabel;
    private javax.swing.JTextField manager_username_jTextField;
    private javax.swing.JLabel page_body_jLabel1;
    private javax.swing.JTextField page_body_jTextField;
    private javax.swing.JLabel page_title_jLabel;
    private javax.swing.JTextField page_title_jTextField;
    private javax.swing.JButton refresh_jButton;
    private javax.swing.JLabel tag_jLabel;
    private javax.swing.JTextField tag_jTextField;
    private javax.swing.JButton update_jButton;
    // End of variables declaration//GEN-END:variables

}
