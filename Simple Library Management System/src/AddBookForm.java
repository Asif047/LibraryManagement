
import javax.swing.JComboBox;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AddBookForm extends javax.swing.JFrame {
    Connection con;
    Statement st;
    ResultSet rs;

    /**
     * Creates new form AddBookForm
     */
    public AddBookForm() {
        initComponents();
        connect();
    }
    
    public void connect() {
        try{
            String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
            Class.forName(DRIVER);
            
            String db = "jdbc:odbc:LibraryManagementDatabase";
            con = DriverManager.getConnection(db);
            
            st = con.createStatement();
        } catch(Exception e){
            System.err.println(e);
        }
    }
    
    public boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }
    
    void insert() {
        String book = bookNameTextfield.getText();
        String bookid = bookIDTextField.getText();
        String author = authorNameTextField.getText();
        String edition = editionTextField.getText();
        if(!isInteger(edition)){
            JOptionPane.showMessageDialog(null, "Edition must be an integer", "Error", JOptionPane.ERROR_MESSAGE , null);
        }
        String category = jComboBox1.getSelectedItem().toString();
        
        //System.out.println(book + " " + bookid + " " + author + " " + edition + " " + category);
        
        String sql = "insert into BookTable (BookID, BookCategory, BookName, AuthorName, Edition, Availablity) values ('" + bookid + "', '" + category + "', '" + book + "', '" + author + "', '" + edition + "', Yes)";
        
        //String sql = "INSERT INTO BookTable (BookID, BookCategory, BookName, AuthorName, Edition, Availablity) VALUES ()"
        System.out.println(sql);
            
        try {
            //System.out.println("line 71");
            st.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Book Inserted", "Inserted", JOptionPane.OK_OPTION , null);
            
        } catch (SQLException ex) {
            Logger.getLogger(AddBookForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR", "Error", JOptionPane.ERROR_MESSAGE , null);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addBook = new javax.swing.JButton();
        bookNameTextfield = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        authorNameTextField = new javax.swing.JTextField();
        editionTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bookIDTextField = new javax.swing.JTextField();
        backMainB1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Book Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 30));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Author Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Edition");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 120, -1));

        addBook.setBackground(new java.awt.Color(255, 0, 0));
        addBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addBook.setText("Add ");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });
        getContentPane().add(addBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 100, 40));

        bookNameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameTextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(bookNameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 157, 30));

        jComboBox1.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Physics", "Chemistry", "Math","Other" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 130, 30));
        getContentPane().add(authorNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 30));
        getContentPane().add(editionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 160, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Book ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 120, -1));
        getContentPane().add(bookIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 160, 30));

        backMainB1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backMainB1.setText("Back to main menu");
        backMainB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMainB1ActionPerformed(evt);
            }
        });
        getContentPane().add(backMainB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 443, 170, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Books catagory");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 190, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img0066.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        
        insert();   
        
    }//GEN-LAST:event_addBookActionPerformed

    private void bookNameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNameTextfieldActionPerformed

    private void backMainB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMainB1ActionPerformed
       
        BookWindow obbw = new BookWindow();
        obbw.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_backMainB1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddBookForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBook;
    private javax.swing.JTextField authorNameTextField;
    private javax.swing.JButton backMainB1;
    private javax.swing.JTextField bookIDTextField;
    private javax.swing.JTextField bookNameTextfield;
    private javax.swing.JTextField editionTextField;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
