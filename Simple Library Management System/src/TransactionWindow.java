/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ezio
 */
public class TransactionWindow extends javax.swing.JFrame {

    /**
     * Creates new form TransactionWindow
     */
    public TransactionWindow() {
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

        issueBookB = new javax.swing.JButton();
        receiveBookB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        issueBookB.setFont(new java.awt.Font("Lithos Pro Regular", 1, 24)); // NOI18N
        issueBookB.setForeground(new java.awt.Color(0, 0, 255));
        issueBookB.setText("Issue Book");
        issueBookB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBookBActionPerformed(evt);
            }
        });
        getContentPane().add(issueBookB, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 160, 220, 43));

        receiveBookB.setFont(new java.awt.Font("Lithos Pro Regular", 1, 24)); // NOI18N
        receiveBookB.setForeground(new java.awt.Color(0, 0, 255));
        receiveBookB.setText("Receive Book");
        receiveBookB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiveBookBActionPerformed(evt);
            }
        });
        getContentPane().add(receiveBookB, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 277, 220, 43));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library12.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void issueBookBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBookBActionPerformed
        
        BookIssueView ob = new BookIssueView();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_issueBookBActionPerformed

    private void receiveBookBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiveBookBActionPerformed
        
        BookReceiveView ob = new BookReceiveView();
        ob.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_receiveBookBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
ControlPanel cp = new ControlPanel();
        cp.setVisible(true);
        this.dispose();
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TransactionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TransactionWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton issueBookB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton receiveBookB;
    // End of variables declaration//GEN-END:variables
}
