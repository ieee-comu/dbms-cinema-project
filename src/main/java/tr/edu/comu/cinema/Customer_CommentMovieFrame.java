/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tr.edu.comu.cinema;

import entity.Customer;
import org.hibernate.Session;
import entity.Movie;
import entity.CanCommentOn;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;

   

/**
 * created on Dec 7, 2019 7:48:26 PM
 * @author bayramcicek
 */
public class Customer_CommentMovieFrame extends javax.swing.JFrame {
    
    static Session session;
    private static Customer current_user;

    /** Creates new form Customer_commentFrame
     * 
     * @param current_user 
     */
    public Customer_CommentMovieFrame(Customer current_user) {
        initComponents();
        show_all_data();
        Customer_CommentMovieFrame.current_user = current_user;
        customer_username_jTextField.setText(Customer_CommentMovieFrame.current_user.getUsername());
    }
        
    private static <Movie> List<Movie> loadMovieData(Class<Movie> type, Session session) {

        CriteriaBuilder builder;
        builder = session.getCriteriaBuilder();
        CriteriaQuery<Movie> criteria = builder.createQuery(type);
        criteria.from(type);
        List<Movie> data;
        data = session.createQuery(criteria).getResultList();
        return data;

    }

    private static <CanCommentOn> List<CanCommentOn> loadCommentData(Class<CanCommentOn> type, Session session) {

        CriteriaBuilder builder;
        builder = session.getCriteriaBuilder();
        CriteriaQuery<CanCommentOn> criteria = builder.createQuery(type);
        criteria.from(type);
        List<CanCommentOn> data;
        data = session.createQuery(criteria).getResultList();
        return data;

    }

    private void show_all_data() {

        try {
            session = HibernateUtil.getSessionFactory().openSession();
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        List<Movie> movie_data = loadMovieData(Movie.class, session);
        List<CanCommentOn> comment_data = loadCommentData(CanCommentOn.class, session);
        session.close();

        DefaultTableModel modelMovie = (DefaultTableModel) movie_jTable.getModel();
        Object[] rowMovie = new Object[8];
        for (int i = 0; i < movie_data.size(); i++) {
            rowMovie[0] = movie_data.get(i).getMovieSerialNo();
            rowMovie[1] = movie_data.get(i).getCreatedDate();
            rowMovie[2] = movie_data.get(i).getSoonFlag();
            rowMovie[3] = movie_data.get(i).getTrailerLink();
            rowMovie[4] = movie_data.get(i).getMovieName();
            rowMovie[5] = movie_data.get(i).getMovieDesc();
            rowMovie[6] = movie_data.get(i).getMovieImage();
            rowMovie[7] = movie_data.get(i).getManager().getUsername();
            modelMovie.addRow(rowMovie);

        }

        DefaultTableModel modelComment = (DefaultTableModel) comment_jTable.getModel();
        Object[] rowComment = new Object[3];
        for (int i = 0; i < comment_data.size(); i++) {
            rowComment[0] = comment_data.get(i).getId();
            rowComment[1] = comment_data.get(i).getCustomer().getUsername();
            rowComment[2] = comment_data.get(i).getMovie().getMovieSerialNo();
            modelComment.addRow(rowComment);

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

        refresh_jButton = new javax.swing.JButton();
        movie_serial_no_jLabel = new javax.swing.JLabel();
        movie_serial_no_jTextField = new javax.swing.JTextField();
        customer_username_jTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        movie_jTable = new javax.swing.JTable();
        customer_username_jLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        comment_jTable = new javax.swing.JTable();
        alert_customer_jLabel = new javax.swing.JLabel();
        insert_jButton = new javax.swing.JButton();
        comment_jLabel = new javax.swing.JLabel();
        delete_jButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        comment_jTextPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        refresh_jButton.setText("REFRESH");
        refresh_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_jButtonActionPerformed(evt);
            }
        });

        movie_serial_no_jLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        movie_serial_no_jLabel.setText("Movie Serial No:");

        movie_serial_no_jTextField.setEnabled(false);
        movie_serial_no_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie_serial_no_jTextFieldActionPerformed(evt);
            }
        });

        customer_username_jTextField.setEnabled(false);
        customer_username_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_username_jTextFieldActionPerformed(evt);
            }
        });

        movie_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie Serial No", "Created Date", "Soon Flag", "Trailer Link", "Movie Name", "Description", "Image", "Manager Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        movie_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie_jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(movie_jTable);
        if (movie_jTable.getColumnModel().getColumnCount() > 0) {
            movie_jTable.getColumnModel().getColumn(4).setResizable(false);
            movie_jTable.getColumnModel().getColumn(5).setResizable(false);
        }

        customer_username_jLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        customer_username_jLabel.setText("Customer Username:");

        comment_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Customer Username", "Movie Serial No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(comment_jTable);

        alert_customer_jLabel.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N

        insert_jButton.setText("INSERT");
        insert_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_jButtonActionPerformed(evt);
            }
        });

        comment_jLabel.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        comment_jLabel.setText("Comment on a Movie");

        delete_jButton.setText("DELETE");
        delete_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_jButtonActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(comment_jTextPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(refresh_jButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(insert_jButton)
                            .addGap(70, 70, 70)
                            .addComponent(delete_jButton))
                        .addComponent(movie_serial_no_jLabel)
                        .addComponent(customer_username_jLabel)
                        .addComponent(alert_customer_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comment_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(customer_username_jTextField)
                        .addComponent(movie_serial_no_jTextField))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(movie_serial_no_jLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(movie_serial_no_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(customer_username_jLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(customer_username_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(alert_customer_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comment_jLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(insert_jButton)
                                .addComponent(delete_jButton))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(refresh_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refresh_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_jButtonActionPerformed
        // TODO add your handling code here: REFRESH
        DefaultTableModel modelMovie = (DefaultTableModel) movie_jTable.getModel();
        DefaultTableModel modelComment = (DefaultTableModel) comment_jTable.getModel();
        modelMovie.setRowCount(0);
        modelComment.setRowCount(0);
        show_all_data();
        movie_serial_no_jTextField.setText("");
        alert_customer_jLabel.setText("");
    }//GEN-LAST:event_refresh_jButtonActionPerformed

    private void movie_serial_no_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie_serial_no_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movie_serial_no_jTextFieldActionPerformed

    private void customer_username_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_username_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_username_jTextFieldActionPerformed

    private void movie_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie_jTableMouseClicked
        // TODO add your handling code here:
        int i = movie_jTable.getSelectedRow();
        TableModel model = movie_jTable.getModel();
        alert_customer_jLabel.setText("");
        movie_serial_no_jTextField.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_movie_jTableMouseClicked

    private void insert_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_jButtonActionPerformed
        // TODO add your handling code here: INSERT
        int row = movie_jTable.getSelectedRow();
        int current_id_value;

        if (row < 0) {
            alert_customer_jLabel.setText("Please select a row from table");
        } else {

            try {
                current_id_value = Integer.parseInt(movie_jTable.getModel().getValueAt(row, 0).toString());

                session = HibernateUtil.getSessionFactory().openSession();
                Object obj = session.load(Movie.class, current_id_value);
                Movie movie = (Movie) obj;
                CanCommentOn comment = new CanCommentOn(current_user, movie);
                Transaction tx;
                tx = session.beginTransaction();
                session.save(comment);
                tx.commit();
                session.close();

                movie_serial_no_jTextField.setText("");
                alert_customer_jLabel.setText("INSERTED Successfully. Click REFRESH.");

            } catch (NumberFormatException | HibernateException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_insert_jButtonActionPerformed

    private void delete_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_jButtonActionPerformed
        // TODO add your handling code here: DELETE
        int row = comment_jTable.getSelectedRow();
        int current_id_value;

        if (row < 0) {
            alert_customer_jLabel.setText("Please select a row from table");
        } else {

            try {
                session = HibernateUtil.getSessionFactory().openSession();
                current_id_value = Integer.parseInt(comment_jTable.getModel().getValueAt(row, 0).toString());
                Object obj = session.load(CanCommentOn.class, current_id_value);
                CanCommentOn comment = (CanCommentOn) obj;
                Transaction tx;
                tx = session.beginTransaction();
                session.delete(comment);
                tx.commit();
                session.close();

                movie_serial_no_jTextField.setText("");
                alert_customer_jLabel.setText("DELETED Successfully. Click REFRESH.");

            } catch (NumberFormatException | HibernateException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

       
    }//GEN-LAST:event_delete_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_CommentMovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_CommentMovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_CommentMovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_CommentMovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Customer_CommentMovieFrame(current_user).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert_customer_jLabel;
    private javax.swing.JLabel comment_jLabel;
    private javax.swing.JTable comment_jTable;
    private javax.swing.JTextPane comment_jTextPane;
    private javax.swing.JLabel customer_username_jLabel;
    private javax.swing.JTextField customer_username_jTextField;
    private javax.swing.JButton delete_jButton;
    private javax.swing.JButton insert_jButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable movie_jTable;
    private javax.swing.JLabel movie_serial_no_jLabel;
    private javax.swing.JTextField movie_serial_no_jTextField;
    private javax.swing.JButton refresh_jButton;
    // End of variables declaration//GEN-END:variables

}
