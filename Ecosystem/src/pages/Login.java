/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pages;
import Models.User.RoleType;
import Models.User.User;
import javax.swing.JOptionPane;
import Models.User.UserDirectory;
import Pages.Bank.BankManagerPage;
import Pages.Municipality.MunicipalityPage;
import Pages.Utility.UtilityManager;
import Pages.customer.customerJFrame;
/**
 *
 * @author thomaskojoaddaquay
 */
public class Login extends javax.swing.JFrame {
    UserDirectory users = new UserDirectory();
    /**
     * Creates new form AdminLogin
     */
    public Login() {
        // TODO: Read users from database & store in UserDirectory
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

        bgPanel = new javax.swing.JPanel();
        usernameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        bgLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameField.setText("sys");
        bgPanel.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 150, -1));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        bgPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        bgPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        bgPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 150, -1));

        passwordField.setText("sys");
        bgPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 150, -1));

        bgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pages/login-bg.jpg"))); // NOI18N
        bgPanel.add(bgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        jLabel3.setText("jLabel3");
        bgPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = usernameField.getText();
        String password = passwordField.getText();
        // TODO: Complete validations for login; null values
        if (!users.doesUsernameExist(username)) {
            JOptionPane.showMessageDialog(this, "Username does not exist. Please try again", "Error", 0);
            return;
        }
        if (!users.loginUser(username, password)) {
            JOptionPane.showMessageDialog(this, "Invalid Password. Please try again", "Error", 0);
            return;
        }
        // Check role of user, then navigate appropriate JFrame
        // TODO: Correct roles for enterprises
        User currentUser = users.getActiveUser();
        System.out.println("Got Active User");
         
        if (currentUser.getRole().equals(RoleType.SystemAdmin)) {
            AdminPage home = new AdminPage();
            home.show();
            dispose();
        }
       if (currentUser.getRole().equals(RoleType.MunicipalityAdmin) 
               || currentUser.getRole().equals(RoleType.MunicipalityCitizenManager)
               || currentUser.getRole().equals(RoleType.MunicipalityHousingManager)) {
            MunicipalityPage home = new MunicipalityPage();
            home.setCurrentUser(currentUser);
            home.show();
            dispose();
        }
         if (currentUser.getRole().equals(RoleType.UtilityAdmin) || currentUser.getRole().equals(RoleType.UtilityManager)) {
            UtilityManager home = new UtilityManager();
            home.show();
            dispose();
        }
          if (currentUser.getRole().equals(RoleType.BankAdmin) || currentUser.getRole().equals(RoleType.BankManager) || currentUser.getRole().equals(RoleType.BankCustomerService)) {
            BankManagerPage home = new BankManagerPage();
            home.setCurrentUser(currentUser);
            home.show();
            dispose();
        }
        // TODO: If customer, navigate to customer fram
         if (currentUser.getRole().equals(RoleType.Customer)) {
            // TODO : Fix bank page bug
            customerJFrame.setCurrentUser(currentUser);
            customerJFrame home = new customerJFrame();
            home.show();
            dispose();
        }
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgLabel;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
