/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.comu.cinema;

import entity.Customer;
import entity.Reserves;
import entity.Seat;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * created on Dec 7, 2019 7:48:03 PM
 *
 * @author bayramcicek
 */
public class Customer_ReserveSeatFrame extends javax.swing.JFrame {

    static Session session;
    private static Customer current_user;

    /**
     * Creates new form Customer_reservesFrame
     *
     * @param current_user
     */
    public Customer_ReserveSeatFrame(Customer current_user) {
        initComponents();
        show_all_data();
        Customer_ReserveSeatFrame.current_user = current_user;
        customer_username_jTextField.setText(Customer_ReserveSeatFrame.current_user.getUsername());
    }

    private static <Seat> List<Seat> loadSeatData(Class<Seat> type, Session session) {

        CriteriaBuilder builder;
        builder = session.getCriteriaBuilder();
        CriteriaQuery<Seat> criteria = builder.createQuery(type);
        criteria.from(type);
        List<Seat> data;
        data = session.createQuery(criteria).getResultList();
        return data;

    }

    private static <Reserves> List<Reserves> loadReserverData(Class<Reserves> type, Session session) {

        CriteriaBuilder builder;
        builder = session.getCriteriaBuilder();
        CriteriaQuery<Reserves> criteria = builder.createQuery(type);
        criteria.from(type);
        List<Reserves> data;
        data = session.createQuery(criteria).getResultList();
        return data;

    }

    private void show_all_data() {

        try {
            session = HibernateUtil.getSessionFactory().openSession();
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        List<Seat> seat_data = loadSeatData(Seat.class, session);
        List<Reserves> reserve_data = loadReserverData(Reserves.class, session);
        session.close();

        DefaultTableModel modelSeat = (DefaultTableModel) seat_jTable.getModel();
        Object[] rowSeat = new Object[3];
        for (int i = 0; i < seat_data.size(); i++) {
            rowSeat[0] = seat_data.get(i).getSeatNo();
            rowSeat[1] = seat_data.get(i).getSeatPrice();
            rowSeat[2] = seat_data.get(i).getTicketSeller().getUsername();
            modelSeat.addRow(rowSeat);

        }

        DefaultTableModel modelReserve = (DefaultTableModel) reserve_jTable.getModel();
        Object[] rowReserve = new Object[3];
        for (int i = 0; i < reserve_data.size(); i++) {
            rowReserve[0] = reserve_data.get(i).getId();
            rowReserve[1] = reserve_data.get(i).getSeat().getSeatNo();
            rowReserve[2] = reserve_data.get(i).getCustomer().getUsername();
            modelReserve.addRow(rowReserve);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customer_username_jLabel = new javax.swing.JLabel();
        alert_customer_jLabel = new javax.swing.JLabel();
        insert_jButton = new javax.swing.JButton();
        reserve_jLabel = new javax.swing.JLabel();
        delete_jButton = new javax.swing.JButton();
        refresh_jButton = new javax.swing.JButton();
        seat_no_jLabel = new javax.swing.JLabel();
        seat_no_jTextField = new javax.swing.JTextField();
        customer_username_jTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        seat_jTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        reserve_jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customer_username_jLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        customer_username_jLabel.setText("Customer Username:");

        alert_customer_jLabel.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N

        insert_jButton.setText("INSERT");
        insert_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_jButtonActionPerformed(evt);
            }
        });

        reserve_jLabel.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        reserve_jLabel.setText("Reserve a Seat");

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

        seat_no_jLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        seat_no_jLabel.setText("Seat No:");

        seat_no_jTextField.setEnabled(false);
        seat_no_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat_no_jTextFieldActionPerformed(evt);
            }
        });

        customer_username_jTextField.setEnabled(false);
        customer_username_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_username_jTextFieldActionPerformed(evt);
            }
        });

        seat_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seat No", "Seat Price", "Ticker Seller Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        seat_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat_jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(seat_jTable);

        reserve_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Seat No", "Customer Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(reserve_jTable);
        if (reserve_jTable.getColumnModel().getColumnCount() > 0) {
            reserve_jTable.getColumnModel().getColumn(0).setResizable(false);
            reserve_jTable.getColumnModel().getColumn(1).setResizable(false);
            reserve_jTable.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(refresh_jButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(insert_jButton)
                        .addGap(70, 70, 70)
                        .addComponent(delete_jButton))
                    .addComponent(seat_no_jLabel)
                    .addComponent(customer_username_jLabel)
                    .addComponent(alert_customer_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reserve_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(customer_username_jTextField)
                    .addComponent(seat_no_jTextField))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(seat_no_jLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seat_no_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(customer_username_jLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(customer_username_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(alert_customer_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(83, 83, 83)
                    .addComponent(reserve_jLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(insert_jButton)
                        .addComponent(delete_jButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(refresh_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insert_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_jButtonActionPerformed
        // TODO add your handling code here: INSERT
        int row = seat_jTable.getSelectedRow();
        int current_id_value;

        if (row < 0) {
            alert_customer_jLabel.setText("Please select a row from table");
        } else {

            try {
                current_id_value = Integer.parseInt(seat_jTable.getModel().getValueAt(row, 0).toString());

                session = HibernateUtil.getSessionFactory().openSession();
                Object obj = session.load(Seat.class, current_id_value);
                Seat seat = (Seat) obj;
                Reserves reserve = new Reserves(current_user, seat);
                Transaction tx;
                tx = session.beginTransaction();
                session.save(reserve);
                tx.commit();
                session.close();

                seat_no_jTextField.setText("");
                alert_customer_jLabel.setText("INSERTED Successfully. Click REFRESH.");

            } catch (NumberFormatException | HibernateException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_insert_jButtonActionPerformed

    private void delete_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_jButtonActionPerformed
        // TODO add your handling code here: DELETE
        int row = reserve_jTable.getSelectedRow();
        int current_id_value;

        if (row < 0) {
            alert_customer_jLabel.setText("Please select a row from table");
        } else {

            try {
                session = HibernateUtil.getSessionFactory().openSession();
                current_id_value = Integer.parseInt(reserve_jTable.getModel().getValueAt(row, 0).toString());
                Object obj = session.load(Reserves.class, current_id_value);
                Reserves reserve = (Reserves) obj;
                Transaction tx;
                tx = session.beginTransaction();
                session.delete(reserve);
                tx.commit();
                session.close();

                seat_no_jTextField.setText("");
                alert_customer_jLabel.setText("DELETED Successfully. Click REFRESH.");

            } catch (NumberFormatException | HibernateException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

//        } else {
//            try {
//                session = HibernateUtil.getSessionFactory().openSession();
//                current_id_value = Integer.parseInt(seat_jTable.getModel().getValueAt(row, 0).toString());
//                Object obj = session.load(Seat.class, current_id_value);
//                Seat seat = (Seat)obj;
//                
//                Transaction tx;
//                tx = session.beginTransaction();
//                session.delete(seat);
//                tx.commit();
//                session.close();
//                
//                seat_no_jTextField.setText("");
//                alert_seat_price_jLabel.setText("DELETED Successfully. Click REFRESH to see changes.");
//
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e);
//            }
//        } 
    }//GEN-LAST:event_delete_jButtonActionPerformed

    private void refresh_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_jButtonActionPerformed
        // TODO add your handling code here: REFRESH
        DefaultTableModel modelSeat = (DefaultTableModel) seat_jTable.getModel();
        DefaultTableModel modelReserve = (DefaultTableModel) reserve_jTable.getModel();
        modelSeat.setRowCount(0);
        modelReserve.setRowCount(0);
        show_all_data();
        seat_no_jTextField.setText("");
        alert_customer_jLabel.setText("");
    }//GEN-LAST:event_refresh_jButtonActionPerformed

    private void seat_no_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat_no_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seat_no_jTextFieldActionPerformed

    private void customer_username_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_username_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_username_jTextFieldActionPerformed

    private void seat_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat_jTableMouseClicked
        // TODO add your handling code here:
        int i = seat_jTable.getSelectedRow();
        TableModel model = seat_jTable.getModel();
        alert_customer_jLabel.setText("");
        seat_no_jTextField.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_seat_jTableMouseClicked

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
            java.util.logging.Logger.getLogger(Customer_ReserveSeatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_ReserveSeatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_ReserveSeatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_ReserveSeatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Customer_ReserveSeatFrame(current_user).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert_customer_jLabel;
    private javax.swing.JLabel customer_username_jLabel;
    private javax.swing.JTextField customer_username_jTextField;
    private javax.swing.JButton delete_jButton;
    private javax.swing.JButton insert_jButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refresh_jButton;
    private javax.swing.JLabel reserve_jLabel;
    private javax.swing.JTable reserve_jTable;
    private javax.swing.JTable seat_jTable;
    private javax.swing.JLabel seat_no_jLabel;
    private javax.swing.JTextField seat_no_jTextField;
    // End of variables declaration//GEN-END:variables

}
