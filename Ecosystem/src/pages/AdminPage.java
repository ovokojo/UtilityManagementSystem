/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pages;

import Business.Enterprise.Enterprise.EnterpriseType;
import Models.User.RoleType;
import Models.User.StaffUser;
import Models.User.User;
import Models.User.UserDirectory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Pages.NewUserPage;

/**
 *
 * @author thomaskojoaddaquay
 */
public class AdminPage extends javax.swing.JFrame {
UserDirectory userList = new UserDirectory();
User activeUser;
    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
        initComponents();
        initializeRoleDropdown();
        updateUserPanel.setVisible(false);
        populateUserTable();
    }
    
        public void populateUserTable() {
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.setRowCount(0);
         System.out.println("Active staff:");
                for (User staff : userList.getAllUsers())  {
                    Object[] row = new Object[2];
                        row[0] = staff;
                        row[1] = staff.getRole();
                        model.addRow(row);
                }
    }
    
    void initializeRoleDropdown() {
    
      entDropdown.setModel(new DefaultComboBoxModel(RoleType.getAllEnterpriseTypes()));
      roleDropdown.setModel(new DefaultComboBoxModel(RoleType.getBankRoleTypes()));
      entDropdown.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
            if (entDropdown.getSelectedItem().equals(RoleType.BankEnterprise)) {
                roleDropdown.setModel(new DefaultComboBoxModel(RoleType.getBankRoleTypes()));
            }
           if (entDropdown.getSelectedItem().equals(RoleType.UtilityEnterprise)) {
                roleDropdown.setModel(new DefaultComboBoxModel(RoleType.getUtilityRoleTypes()));
            }
           if (entDropdown.getSelectedItem().equals(RoleType.HousingEnterprise)) {
                roleDropdown.setModel(new DefaultComboBoxModel(RoleType.getHousingRoleTypes()));
            }
            if (entDropdown.getSelectedItem().equals(RoleType.CitizenEnterprise)) {
                roleDropdown.setModel(new DefaultComboBoxModel(RoleType.getCitizenRoleTypes()));
            }
       }
});
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
        jPanel5 = new javax.swing.JPanel();
        TabbedPane = new javax.swing.JTabbedPane();
        allUsersPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        newUserButton = new javax.swing.JButton();
        updateUserPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        editUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        editPassword = new javax.swing.JPasswordField();
        updateUserButton = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        entDropdown = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        newUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        newPassword = new javax.swing.JPasswordField();
        saveUser = new javax.swing.JButton();
        roleDropdown = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        logoutTab = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 679, 50));

        allUsersPanel.setBackground(new java.awt.Color(51, 51, 51));
        allUsersPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTable.setBackground(new java.awt.Color(51, 51, 51));
        userTable.setForeground(new java.awt.Color(255, 255, 255));
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setResizable(false);
            userTable.getColumnModel().getColumn(1).setResizable(false);
        }

        allUsersPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 510, 200));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Users");
        allUsersPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        newUserButton.setText("+ New User");
        newUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newUserButtonMousePressed(evt);
            }
        });
        newUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserButtonActionPerformed(evt);
            }
        });
        allUsersPanel.add(newUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        updateUserPanel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        updateUserButton.setText("Update");
        updateUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateUserButtonMousePressed(evt);
            }
        });

        deleteUser.setText("Delete");
        deleteUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteUserMousePressed(evt);
            }
        });

        javax.swing.GroupLayout updateUserPanelLayout = new javax.swing.GroupLayout(updateUserPanel);
        updateUserPanel.setLayout(updateUserPanelLayout);
        updateUserPanelLayout.setHorizontalGroup(
            updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateUserPanelLayout.createSequentialGroup()
                .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateUserPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteUser))
                    .addGroup(updateUserPanelLayout.createSequentialGroup()
                        .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateUserPanelLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(editUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(editPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(updateUserPanelLayout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(updateUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 137, Short.MAX_VALUE)))
                .addContainerGap())
        );
        updateUserPanelLayout.setVerticalGroup(
            updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteUser)
                .addGap(10, 10, 10)
                .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(updateUserPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, updateUserPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(updateUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        allUsersPanel.add(updateUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 450, 170));

        TabbedPane.addTab("Users", allUsersPanel);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        entDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        entDropdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entDropdownMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                entDropdownMousePressed(evt);
            }
        });
        entDropdown.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                entDropdownPropertyChange(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Select Enterprise");

        jLabel6.setText("Username");

        jLabel7.setText("Password");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(37, 37, 37)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        saveUser.setText("Save");
        saveUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saveUserMousePressed(evt);
            }
        });

        roleDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleDropdownActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select Role");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NEW USERS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(entDropdown, 0, 207, Short.MAX_VALUE)
                            .addComponent(roleDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel4)))
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(saveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(275, 275, 275))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton1))
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(entDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roleDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(saveUser)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        TabbedPane.addTab("New", jPanel2);

        jPanel1.add(TabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, -1, 610));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        logoutTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutTabMousePressed(evt);
            }
        });

        jLabel9.setText("Logout");

        javax.swing.GroupLayout logoutTabLayout = new javax.swing.GroupLayout(logoutTab);
        logoutTab.setLayout(logoutTabLayout);
        logoutTabLayout.setHorizontalGroup(
            logoutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutTabLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoutTabLayout.setVerticalGroup(
            logoutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setText("Welcome!");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoutTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserButtonActionPerformed
        // TODO add your handling code here:
        NewUserPage newUserPopup = new NewUserPage();
        newUserPopup.show();
        dispose();
    }//GEN-LAST:event_newUserButtonActionPerformed

    private void newUserButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newUserButtonMousePressed
        // TODO add your handling code here:
        TabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_newUserButtonMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
         TabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1MousePressed

    private void entDropdownMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entDropdownMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_entDropdownMousePressed

    private void entDropdownPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_entDropdownPropertyChange
        // TODO add your handling code here        
    }//GEN-LAST:event_entDropdownPropertyChange

    private void roleDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleDropdownActionPerformed

    private void entDropdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entDropdownMouseClicked
        // TODO add your handling code here:
  
    }//GEN-LAST:event_entDropdownMouseClicked
    
    void resetUpdateFields() {
       editUsername.setText("");
        editPassword.setText("");
    }
    private void saveUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveUserMousePressed
        // TODO add your handling code here:
        String _username = newUsername.getText();
        String _password = newPassword.getText();
        String _role = roleDropdown.getSelectedItem().toString();
        
        boolean isValid = validateNewUser();
        if (isValid) {
            userList.addUser(new User(_username,_password,  _role));
            populateUserTable();
            JOptionPane.showMessageDialog(this, MessageFormat.format("{0} Successfully Created!", _role));
            TabbedPane.setSelectedIndex(0);
            newUsername.setText("");
            newPassword.setText("");
            initializeRoleDropdown();
        }        
    }//GEN-LAST:event_saveUserMousePressed

    private void userTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMousePressed
        // TODO add your handling code here:
                 int tableSize = userTable.getRowCount();
         int selectedRow = userTable.getSelectedRow();
         if (selectedRow >= 0 || selectedRow < tableSize) {
            User selectedUser = (User) userTable.getValueAt(selectedRow, 0);
            editUsername.setText(selectedUser.getUsername());
            editPassword.setText(selectedUser.getPassword());
            activeUser = selectedUser;
            updateUserPanel.setVisible(true);
         }
    }//GEN-LAST:event_userTableMousePressed

    private void updateUserButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateUserButtonMousePressed
        // TODO add your handling code here:
        String _username = editUsername.getText();
        String _password = editPassword.getText();
        boolean isValid = validateUserUpdate();
        if (isValid) {
            activeUser.setUsername(_username);
            activeUser.setPassword(_password);
            updateUserPanel.setVisible(false);
            resetUpdateFields() ;
            populateUserTable();
            JOptionPane.showMessageDialog(this, MessageFormat.format("{0} Successfully Updated!", _username));
        }
         
        
    }//GEN-LAST:event_updateUserButtonMousePressed

    private void deleteUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserMousePressed
        // TODO add your handling code here:
        userList.removeUserAccount(activeUser);
        resetUpdateFields() ;
        populateUserTable();
        updateUserPanel.setVisible(false);
        JOptionPane.showMessageDialog(this, MessageFormat.format("{0} Successfully Deleted!", activeUser.getUsername()));
    }//GEN-LAST:event_deleteUserMousePressed

    private void logoutTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutTabMousePressed
        // TODO add your handling code here:
        Login login = new Login();
        login.show();
        dispose();
    }//GEN-LAST:event_logoutTabMousePressed

    boolean validateNewUser() {
        String _username = newUsername.getText();
        String _password = newPassword.getText();
        
         if ("".equals(_username) || _username == null) {
            JOptionPane.showMessageDialog(this, "Username is required", "Error", 0);
            return false;
        }
         if (userList.doesUsernameExist(_username)) {
              JOptionPane.showMessageDialog(this, "Username already taken", "Error", 0);
             return false;
        } 
          // Validate Password
        if ("".equals(_password) || _password == null) {
            JOptionPane.showMessageDialog(this, "Password is required", "Error", 0);
            return false;
        }
        return true;
    }
    
        boolean validateUserUpdate() {
        String _username = editUsername.getText();
        String _password = editPassword.getText();
        
         if ("".equals(_username) || _username == null) {
            JOptionPane.showMessageDialog(this, "Username is required", "Error", 0);
            return false;
        }
         if (!userList.isUsernameUpdateValid(activeUser, _username)) {
              JOptionPane.showMessageDialog(this, "Username already taken", "Error", 0);
             return false;
        } 
          // Validate Password
        if ("".equals(_password) || _password == null) {
            JOptionPane.showMessageDialog(this, "Password is required", "Error", 0);
            return false;
        }
        return true;
    }
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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JPanel allUsersPanel;
    private javax.swing.JButton deleteUser;
    private javax.swing.JPasswordField editPassword;
    private javax.swing.JTextField editUsername;
    private javax.swing.JComboBox<String> entDropdown;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logoutTab;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JButton newUserButton;
    private javax.swing.JTextField newUsername;
    private javax.swing.JComboBox<String> roleDropdown;
    private javax.swing.JButton saveUser;
    private javax.swing.JButton updateUserButton;
    private javax.swing.JPanel updateUserPanel;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
