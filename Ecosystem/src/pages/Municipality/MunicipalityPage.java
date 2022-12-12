/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pages.Municipality;

import Database.Database;
import Models.Muncipality.CitizenInfo;
import javax.swing.JOptionPane;
import Models.User.RoleType;
import Models.User.StaffUser;
import Models.User.User;
import Models.muncipality.muncipalityStaffDirectory;
import Models.Muncipality.House;
import Models.Muncipality.HousingDirectory;
import Pages.Login;
import java.text.MessageFormat;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vatsalkapadia
 */
public class MunicipalityPage extends javax.swing.JFrame {
public static ArrayList<User> mockCitizenUserList = new ArrayList();
ArrayList<StaffUser> allStaff = new muncipalityStaffDirectory().getAllStaff();
StaffUser activeStaff;
private User currentUser;
    /**
     * Creates new form citizenServiceMainJFrame
     */
    public MunicipalityPage() {
        initComponents();
        // registry table
        populateCitizenInfoUpdateTable();
        populateStaffTable();
        populateCitizenInfoToHouseTable();
        updatePanel.setVisible(false);
        // If not admin, hide user management tab
    }
    
    
    public void populateStaffTable() {
        DefaultTableModel model = (DefaultTableModel) staffTable.getModel();
        model.setRowCount(0);
         System.out.println("Active staff:");
                for (StaffUser staff : allStaff)  {
                    Object[] row = new Object[4];
                        row[0] = staff;
                        row[1] = staff.getName();
                        row[2] = staff.getTitle();
                        row[3] = staff.getPhone();
                        model.addRow(row);
                }
    }
    
    // How to set current user & modify page based on user role
    public void setCurrentUser(User user) {
        currentUser = user;
        System.out.println("Current User:");
        System.out.println(currentUser.getUsername());
        // hide tab based on role

        if (currentUser.getRole().equals(RoleType.MunicipalityCitizenManager)) {
            userMgmtTab.setVisible(false);
            newHouseTab.setVisible(false);
            viewHousingjPanel4.setVisible(false);
            viewHouseTab.setVisible(false);
            jTabbedPane1.setSelectedIndex(1);
        }
        if (currentUser.getRole().equals(RoleType.MunicipalityHousingManager)) {
           populateViewHousingTable();
            userMgmtTab.setVisible(false);
            citizenRegistryTab.setVisible(false);
            newCitizenTab.setVisible(false);
            jTabbedPane1.setSelectedIndex(3);
        
        }
    }
    
    public void populateCitizenInfoToHouseTable() {
        DefaultTableModel model = (DefaultTableModel) citizensInInfoTable3.getModel();
        model.setRowCount(0);
                for (User user : mockCitizenUserList)  {
                    Object[] row = new Object[5];
                        row[0] = user;
                        row[1] = user.getCitizenInfo().getName();
                        row[2] = user.getCitizenInfo().getSsn();
                        row[3] = user.getCitizenInfo().getPhone();
                        row[4] = user.getCitizenInfo().getBirthDate();
                        model.addRow(row);
                        
                }
    }
     public void populateCitizenInfoUpdateTable() {
        DefaultTableModel model = (DefaultTableModel) citizenRegistryTable.getModel();
        model.setRowCount(0);
                for (User user : mockCitizenUserList)  {
                    Object[] row = new Object[6];
                        row[0] = user;
                        row[1] = user.getCitizenInfo().getName();
                        row[2] = user.getCitizenInfo().getSsn();
                        row[3] = user.getCitizenInfo().getPhone();
                        row[4] = user.getCitizenInfo().getBirthDate();
                        row[5] = user.getPassword();
                        model.addRow(row);
                        
                }
    }
      
    public void populateViewHousingTable() {
        DefaultTableModel model = (DefaultTableModel) ViewHousingTable.getModel();
        model.setRowCount(0);
                for (User user : mockCitizenUserList)  {
                    Object[] row = new Object[7];
                        row[0] = user;
                        row[1] = user.getCitizenInfo().getSsn();
                        row[2] = user.getCitizenInfo().getPhone();
                        if ((user.getCitizenInfo().getHouse()) == null){
                         row[3] ="" ;
                        } else {
                            row[3] = user.getCitizenInfo().getHouse().getCityArea();
                        }                      
                        if ((user.getCitizenInfo().getHouse())== null){
                         row[4] ="" ;
                        } else {
                            row[4] = user.getCitizenInfo().getHouse().getAddressOne();
                        }
                        
                         if ((user.getCitizenInfo().getHouse())== null){
                         row[5] ="" ;
                        } else {
                            row[5] = user.getCitizenInfo().getHouse().getAddressTwo();
                        }
                          if ((user.getCitizenInfo().getHouse())== null){
                         row[6] ="" ;
                        } else {
                          row[6] = user.getCitizenInfo().getHouse().getHouseId();
                          }
                        model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        newCitizenTab = new javax.swing.JPanel();
        newCitizenTabLabel = new javax.swing.JLabel();
        citizenRegistryTab = new javax.swing.JPanel();
        citizenRegistryLabel = new javax.swing.JLabel();
        newHouseTab = new javax.swing.JPanel();
        newHouseTabLabel = new javax.swing.JLabel();
        userMgmtTab = new javax.swing.JPanel();
        userMgmtTabLabel = new javax.swing.JLabel();
        viewHouseTab = new javax.swing.JPanel();
        viewHouseTabLabel = new javax.swing.JLabel();
        logoutJBtn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        createUserJPanel = new javax.swing.JPanel();
        createCitizenTab = new javax.swing.JPanel();
        usernamejLabel4 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        passwordjLabel14 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        ssnjLabel15 = new javax.swing.JLabel();
        ssnField = new javax.swing.JTextField();
        phonejLabel16 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        birthDatejLabel = new javax.swing.JLabel();
        citizenBirthChooser = new com.toedter.calendar.JDateChooser();
        saveUserButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        NamejLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        updateJPanel = new javax.swing.JPanel();
        updateCitizensTab = new javax.swing.JPanel();
        backButton2 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        citizenRegistryTable = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        usernamejLabel14 = new javax.swing.JLabel();
        ssnjLabel13 = new javax.swing.JLabel();
        usernamejLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BirthDatejLabel11 = new javax.swing.JLabel();
        updateCitizenNameField = new javax.swing.JTextField();
        updateCitizenSsnField = new javax.swing.JTextField();
        updateUsernameField = new javax.swing.JTextField();
        updatePhoneField = new javax.swing.JTextField();
        updatePasswordField = new javax.swing.JTextField();
        updateBirthDateField = new javax.swing.JTextField();
        saveButton2 = new javax.swing.JButton();
        deletejButton2 = new javax.swing.JButton();
        createHousejPanel = new javax.swing.JPanel();
        addressL1Field1 = new javax.swing.JTextField();
        saveHousingButton = new javax.swing.JButton();
        addressL1Field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        areaDropdown = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        citizensInInfoTable3 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        viewHousingjPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ViewHousingTable = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();
        manageStaffPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        updateStaffButton = new javax.swing.JButton();
        editStaffName = new javax.swing.JTextField();
        editStaffUsername = new javax.swing.JTextField();
        editStaffTitle = new javax.swing.JTextField();
        editStaffPhone = new javax.swing.JTextField();
        editStaffPassword = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        newCitizenTab.setBackground(new java.awt.Color(102, 102, 102));
        newCitizenTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newCitizenTabMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newCitizenTabMousePressed(evt);
            }
        });

        newCitizenTabLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        newCitizenTabLabel.setForeground(new java.awt.Color(255, 255, 255));
        newCitizenTabLabel.setText("New Citizen");
        newCitizenTabLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newCitizenTabLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newCitizenTabLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout newCitizenTabLayout = new javax.swing.GroupLayout(newCitizenTab);
        newCitizenTab.setLayout(newCitizenTabLayout);
        newCitizenTabLayout.setHorizontalGroup(
            newCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newCitizenTabLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(newCitizenTabLabel)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        newCitizenTabLayout.setVerticalGroup(
            newCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newCitizenTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newCitizenTabLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        citizenRegistryTab.setBackground(new java.awt.Color(102, 102, 102));
        citizenRegistryTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                citizenRegistryTabMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                citizenRegistryTabMousePressed(evt);
            }
        });

        citizenRegistryLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        citizenRegistryLabel.setForeground(new java.awt.Color(255, 255, 255));
        citizenRegistryLabel.setText("Citizen Registry");
        citizenRegistryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                citizenRegistryLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                citizenRegistryLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout citizenRegistryTabLayout = new javax.swing.GroupLayout(citizenRegistryTab);
        citizenRegistryTab.setLayout(citizenRegistryTabLayout);
        citizenRegistryTabLayout.setHorizontalGroup(
            citizenRegistryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(citizenRegistryTabLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(citizenRegistryLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        citizenRegistryTabLayout.setVerticalGroup(
            citizenRegistryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(citizenRegistryTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(citizenRegistryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        newHouseTab.setBackground(new java.awt.Color(102, 102, 102));
        newHouseTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newHouseTabMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newHouseTabMousePressed(evt);
            }
        });

        newHouseTabLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        newHouseTabLabel.setForeground(new java.awt.Color(255, 255, 255));
        newHouseTabLabel.setText("Register House");
        newHouseTabLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newHouseTabLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newHouseTabLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout newHouseTabLayout = new javax.swing.GroupLayout(newHouseTab);
        newHouseTab.setLayout(newHouseTabLayout);
        newHouseTabLayout.setHorizontalGroup(
            newHouseTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newHouseTabLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(newHouseTabLabel)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        newHouseTabLayout.setVerticalGroup(
            newHouseTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newHouseTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(newHouseTabLabel)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        userMgmtTab.setBackground(new java.awt.Color(102, 102, 102));
        userMgmtTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMgmtTabMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userMgmtTabMousePressed(evt);
            }
        });

        userMgmtTabLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        userMgmtTabLabel.setForeground(new java.awt.Color(255, 255, 255));
        userMgmtTabLabel.setText("User Management");
        userMgmtTabLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userMgmtTabLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout userMgmtTabLayout = new javax.swing.GroupLayout(userMgmtTab);
        userMgmtTab.setLayout(userMgmtTabLayout);
        userMgmtTabLayout.setHorizontalGroup(
            userMgmtTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userMgmtTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userMgmtTabLabel)
                .addGap(26, 26, 26))
        );
        userMgmtTabLayout.setVerticalGroup(
            userMgmtTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userMgmtTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(userMgmtTabLabel)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        viewHouseTab.setBackground(new java.awt.Color(102, 102, 102));
        viewHouseTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewHouseTabMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewHouseTabMousePressed(evt);
            }
        });

        viewHouseTabLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewHouseTabLabel.setForeground(new java.awt.Color(255, 255, 255));
        viewHouseTabLabel.setText("View House");
        viewHouseTabLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewHouseTabLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewHouseTabLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout viewHouseTabLayout = new javax.swing.GroupLayout(viewHouseTab);
        viewHouseTab.setLayout(viewHouseTabLayout);
        viewHouseTabLayout.setHorizontalGroup(
            viewHouseTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewHouseTabLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(viewHouseTabLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewHouseTabLayout.setVerticalGroup(
            viewHouseTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewHouseTabLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(viewHouseTabLabel)
                .addGap(14, 14, 14))
        );

        logoutJBtn.setBackground(new java.awt.Color(0, 51, 51));
        logoutJBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutJBtn.setText("LOGOUT");
        logoutJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newCitizenTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(citizenRegistryTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(newHouseTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(userMgmtTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewHouseTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutJBtn)
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(citizenRegistryTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newCitizenTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newHouseTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewHouseTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userMgmtTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addComponent(logoutJBtn)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 170, 710));

        createCitizenTab.setBackground(new java.awt.Color(51, 51, 51));

        usernamejLabel4.setForeground(new java.awt.Color(255, 255, 255));
        usernamejLabel4.setText("Username");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        passwordjLabel14.setForeground(new java.awt.Color(255, 255, 255));
        passwordjLabel14.setText("password");

        ssnjLabel15.setForeground(new java.awt.Color(255, 255, 255));
        ssnjLabel15.setText("Social Security #");

        phonejLabel16.setForeground(new java.awt.Color(255, 255, 255));
        phonejLabel16.setText("Phone");

        birthDatejLabel.setForeground(new java.awt.Color(255, 255, 255));
        birthDatejLabel.setText("Birth Date");

        saveUserButton.setText("Save");
        saveUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saveUserButtonMousePressed(evt);
            }
        });
        saveUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveUserButtonActionPerformed(evt);
            }
        });

        NamejLabel.setForeground(new java.awt.Color(255, 255, 255));
        NamejLabel.setText("Name");

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CREATE CITIZEN");

        javax.swing.GroupLayout createCitizenTabLayout = new javax.swing.GroupLayout(createCitizenTab);
        createCitizenTab.setLayout(createCitizenTabLayout);
        createCitizenTabLayout.setHorizontalGroup(
            createCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createCitizenTabLayout.createSequentialGroup()
                .addGroup(createCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createCitizenTabLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(saveUserButton))
                    .addGroup(createCitizenTabLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel13))
                    .addGroup(createCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(createCitizenTabLayout.createSequentialGroup()
                            .addComponent(passwordjLabel14)
                            .addGap(68, 68, 68)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(createCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createCitizenTabLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createCitizenTabLayout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(usernamejLabel4)
                                .addGap(68, 68, 68)
                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, createCitizenTabLayout.createSequentialGroup()
                            .addGap(174, 174, 174)
                            .addGroup(createCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(createCitizenTabLayout.createSequentialGroup()
                                    .addComponent(ssnjLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ssnField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(createCitizenTabLayout.createSequentialGroup()
                                    .addGroup(createCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(createCitizenTabLayout.createSequentialGroup()
                                            .addComponent(phonejLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(createCitizenTabLayout.createSequentialGroup()
                                            .addComponent(birthDatejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(23, 23, 23)))
                                    .addGroup(createCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(citizenBirthChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(phoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))))
                        .addGroup(createCitizenTabLayout.createSequentialGroup()
                            .addComponent(NamejLabel)
                            .addGap(68, 68, 68)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        createCitizenTabLayout.setVerticalGroup(
            createCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createCitizenTabLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(backButton)
                .addGap(45, 45, 45)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(createCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NamejLabel))
                .addGap(28, 28, 28)
                .addGroup(createCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernamejLabel4))
                .addGap(27, 27, 27)
                .addGroup(createCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordjLabel14))
                .addGap(18, 18, 18)
                .addGroup(createCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssnjLabel15))
                .addGap(18, 18, 18)
                .addGroup(createCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonejLabel16))
                .addGap(26, 26, 26)
                .addGroup(createCitizenTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(birthDatejLabel)
                    .addComponent(citizenBirthChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(saveUserButton)
                .addGap(146, 146, 146))
        );

        javax.swing.GroupLayout createUserJPanelLayout = new javax.swing.GroupLayout(createUserJPanel);
        createUserJPanel.setLayout(createUserJPanelLayout);
        createUserJPanelLayout.setHorizontalGroup(
            createUserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createCitizenTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        createUserJPanelLayout.setVerticalGroup(
            createUserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createCitizenTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("new", createUserJPanel);

        updateCitizensTab.setBackground(new java.awt.Color(51, 51, 51));

        backButton2.setText("Back");
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });

        citizenRegistryTable.setBackground(new java.awt.Color(51, 51, 51));
        citizenRegistryTable.setForeground(new java.awt.Color(255, 255, 255));
        citizenRegistryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Username", "Name", "SSN", "Phone", "Birth Date", "Password"
            }
        ));
        citizenRegistryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                citizenRegistryTableMousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(citizenRegistryTable);

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("UPDATE CITIZEN");

        updatePanel.setBackground(new java.awt.Color(51, 51, 51));

        usernamejLabel14.setForeground(new java.awt.Color(255, 255, 255));
        usernamejLabel14.setText("Name");

        ssnjLabel13.setForeground(new java.awt.Color(255, 255, 255));
        ssnjLabel13.setText("SSN");

        usernamejLabel16.setForeground(new java.awt.Color(255, 255, 255));
        usernamejLabel16.setText("Username");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phone");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password");

        BirthDatejLabel11.setForeground(new java.awt.Color(255, 255, 255));
        BirthDatejLabel11.setText("Birth Date");

        updatePhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePhoneFieldActionPerformed(evt);
            }
        });

        updateBirthDateField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        updateBirthDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBirthDateFieldActionPerformed(evt);
            }
        });

        saveButton2.setText("Update");
        saveButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton2ActionPerformed(evt);
            }
        });

        deletejButton2.setText("Delete");
        deletejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(BirthDatejLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updatePasswordField)
                            .addComponent(updateBirthDateField)))
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernamejLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernamejLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ssnjLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateCitizenNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updatePhoneField)
                            .addComponent(updateUsernameField)
                            .addComponent(updateCitizenSsnField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelLayout.createSequentialGroup()
                        .addGap(0, 117, Short.MAX_VALUE)
                        .addComponent(saveButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deletejButton2)
                .addGap(20, 20, 20))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(deletejButton2)
                .addGap(18, 18, 18)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(usernamejLabel14)
                        .addGap(33, 33, 33)
                        .addComponent(ssnjLabel13)
                        .addGap(18, 18, 18)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernamejLabel16)
                            .addComponent(updateUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(updatePhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addComponent(updateCitizenNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateCitizenSsnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(updatePasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateBirthDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BirthDatejLabel11))))
                .addGap(18, 18, 18)
                .addComponent(saveButton2)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout updateCitizensTabLayout = new javax.swing.GroupLayout(updateCitizensTab);
        updateCitizensTab.setLayout(updateCitizensTabLayout);
        updateCitizensTabLayout.setHorizontalGroup(
            updateCitizensTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateCitizensTabLayout.createSequentialGroup()
                .addGroup(updateCitizensTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(updateCitizensTabLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(backButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(updateCitizensTabLayout.createSequentialGroup()
                        .addGap(0, 80, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updateCitizensTabLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addGap(60, 60, 60))
        );
        updateCitizensTabLayout.setVerticalGroup(
            updateCitizensTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateCitizensTabLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(updateCitizensTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton2)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout updateJPanelLayout = new javax.swing.GroupLayout(updateJPanel);
        updateJPanel.setLayout(updateJPanelLayout);
        updateJPanelLayout.setHorizontalGroup(
            updateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateCitizensTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        updateJPanelLayout.setVerticalGroup(
            updateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateCitizensTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("registry", updateJPanel);

        createHousejPanel.setBackground(new java.awt.Color(51, 51, 51));

        addressL1Field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressL1Field1ActionPerformed(evt);
            }
        });

        saveHousingButton.setText("Save");
        saveHousingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveHousingButtonActionPerformed(evt);
            }
        });

        addressL1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressL1FieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address Line 1");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Housing Area");

        areaDropdown.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        areaDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one", "Seaport", "Beacon Hill", "North End", "Back Bay" }));
        areaDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaDropdownActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jTextField2.setText("Search");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton1.setText("search");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address Line 2");

        citizensInInfoTable3.setBackground(new java.awt.Color(51, 51, 51));
        citizensInInfoTable3.setForeground(new java.awt.Color(255, 255, 255));
        citizensInInfoTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "Name", "SSN", "Phone", "Birth Date"
            }
        ));
        jScrollPane5.setViewportView(citizensInInfoTable3);

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CREATE HOUSING DATA");

        javax.swing.GroupLayout createHousejPanelLayout = new javax.swing.GroupLayout(createHousejPanel);
        createHousejPanel.setLayout(createHousejPanelLayout);
        createHousejPanelLayout.setHorizontalGroup(
            createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createHousejPanelLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createHousejPanelLayout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createHousejPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(createHousejPanelLayout.createSequentialGroup()
                .addGroup(createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createHousejPanelLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(66, 66, 66)
                        .addGroup(createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(areaDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addressL1Field)
                            .addComponent(addressL1Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(createHousejPanelLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(saveHousingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createHousejPanelLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        createHousejPanelLayout.setVerticalGroup(
            createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createHousejPanelLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(createHousejPanelLayout.createSequentialGroup()
                        .addGroup(createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(areaDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressL1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addressL1Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91)
                .addComponent(saveHousingButton)
                .addGap(85, 85, 85))
        );

        jTabbedPane1.addTab("new house", createHousejPanel);

        viewHousingjPanel4.setBackground(new java.awt.Color(51, 51, 51));

        ViewHousingTable.setBackground(new java.awt.Color(51, 51, 51));
        ViewHousingTable.setForeground(new java.awt.Color(255, 255, 255));
        ViewHousingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "SSN", "Phone", "Housing Area", "Add Line 1", "Add Line 2", "House Id"
            }
        ));
        jScrollPane4.setViewportView(ViewHousingTable);

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("VIEW HOUSING INFORMATION");

        javax.swing.GroupLayout viewHousingjPanel4Layout = new javax.swing.GroupLayout(viewHousingjPanel4);
        viewHousingjPanel4.setLayout(viewHousingjPanel4Layout);
        viewHousingjPanel4Layout.setHorizontalGroup(
            viewHousingjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewHousingjPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewHousingjPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(163, 163, 163))
        );
        viewHousingjPanel4Layout.setVerticalGroup(
            viewHousingjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewHousingjPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("view house", viewHousingjPanel4);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        staffTable.setBackground(new java.awt.Color(51, 51, 51));
        staffTable.setForeground(new java.awt.Color(255, 255, 255));
        staffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Name", "Title", "Phone"
            }
        ));
        staffTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                staffTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(staffTable);

        manageStaffPanel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel20.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Username");

        jLabel22.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Password");

        jLabel25.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Title");

        jLabel26.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Phone");

        jLabel27.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Name");

        updateStaffButton.setText("Update");
        updateStaffButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateStaffButtonMousePressed(evt);
            }
        });
        updateStaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStaffButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageStaffPanelLayout = new javax.swing.GroupLayout(manageStaffPanel);
        manageStaffPanel.setLayout(manageStaffPanelLayout);
        manageStaffPanelLayout.setHorizontalGroup(
            manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageStaffPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageStaffPanelLayout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel25)
                        .addGap(106, 106, 106)
                        .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editStaffPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(manageStaffPanelLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(57, 57, 57)
                        .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editStaffTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(manageStaffPanelLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(editStaffPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(manageStaffPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(updateStaffButton))))
                    .addComponent(editStaffUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        manageStaffPanelLayout.setVerticalGroup(
            manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageStaffPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editStaffTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editStaffPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editStaffUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editStaffPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(updateStaffButton)
                .addContainerGap())
        );

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("UPDATE ADMIN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(manageStaffPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(manageStaffPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("user mgmt", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 630, 740));
        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveHousingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveHousingButtonActionPerformed
        // TODO add your handling code here:
         int tableSize = citizensInInfoTable3.getRowCount();
         int selectedRow = citizensInInfoTable3.getSelectedRow();
         if (selectedRow >= 0 || selectedRow < tableSize) {
            DefaultTableModel model= (DefaultTableModel)citizensInInfoTable3.getModel();
            User userInfo = (User) citizensInInfoTable3.getValueAt(selectedRow, 0);
            CitizenInfo citizen = userInfo.getCitizenInfo();
            String housingArea = areaDropdown.getSelectedItem().toString();
            
            String _adddressL1= addressL1Field.getText();
            String _adddressL2= addressL1Field1.getText();
            String _housingArea = areaDropdown.getSelectedItem().toString();
            House house = new House(_adddressL1, _adddressL2, _housingArea);
            citizen.setHouse(house);
            HousingDirectory.citizenHouses.add(citizen);
            JOptionPane.showMessageDialog(this, MessageFormat.format("{0} House Successfully Created!", housingArea));
            
            //update db
            populateViewHousingTable();
            jTabbedPane1.setSelectedIndex(3);
            
         }
//        if(UserDirectory.checkUsername(_username)) {
//            JOptionPane.showMessageDialog(this, "Username already exists", "Error", 0);
//            return;
//        }
//        if (_role.equals(Role.admin)) {
//            Admin newAdmin = new Admin(_username, _password, _enterprise, _role);
//            UserDirectory.addUser(newAdmin);
//            System.out.println("Created admin");
//        }
//        if (_role.equals(Role.staff)) {
//            Staff newAdmin = new Staff(_username, _password, _enterprise, _role);
//            UserDirectory.addUser(newAdmin);
//            System.out.println("Created staff");
//        }
//        JOptionPane.showMessageDialog(this, MessageFormat.format("{0} Successfully Created!", _username));
//        AdminHomePage home = new AdminHomePage();
//        home.populateTable();
//        home.show();
//        dispose();
    }//GEN-LAST:event_saveHousingButtonActionPerformed

    private void areaDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaDropdownActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_areaDropdownActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addressL1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressL1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressL1FieldActionPerformed

    private void addressL1Field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressL1Field1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressL1Field1ActionPerformed

    private void newCitizenTabLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newCitizenTabLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_newCitizenTabLabelMouseClicked

    private void citizenRegistryLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citizenRegistryLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_citizenRegistryLabelMouseClicked

    private void newCitizenTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newCitizenTabMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_newCitizenTabMouseClicked

    private void citizenRegistryTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citizenRegistryTabMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_citizenRegistryTabMouseClicked

    private void newHouseTabLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newHouseTabLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_newHouseTabLabelMouseClicked

    private void newHouseTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newHouseTabMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_newHouseTabMouseClicked

    private void saveUserButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveUserButtonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveUserButtonMousePressed

    private void saveUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUserButtonActionPerformed
        // TODO add your handling code here:
         // Create citizen info
        String _name = nameField.getText();
        String _ssn = ssnField.getText();
        String _birthDate = citizenBirthChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString();
        String _phone = phoneField.getText();
       String _username = usernameField.getText();
        String _password = passwordField.getText();
        // TODO: Complete validations: check null values,  ssn is unique
         if ("".equals(_username) || _username == null) {
            JOptionPane.showMessageDialog(this, "Username is required", "Error", 0);
            return;
        }
        if ("".equals(_password) || _password == null) {
            JOptionPane.showMessageDialog(this, "Password is required", "Error", 0);
            return;
        }
       // Create citizen info
        CitizenInfo citizen = new CitizenInfo(_name, _ssn, _birthDate, _phone );
        // Create user info
        User newUser = new User(_username, _password, RoleType.Customer);
        // update user to include citizen info
        newUser.setCitizenInfo(citizen);
       // update db
        Database.createUser(newUser, citizen);
        mockCitizenUserList.add(newUser);
        // refresh table
        populateCitizenInfoUpdateTable();
        populateCitizenInfoToHouseTable();
        // navigate to new page
         JOptionPane.showMessageDialog(this, MessageFormat.format("{0} Successfully Created!", _name));
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_saveUserButtonActionPerformed

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_backButton2ActionPerformed

    private void saveButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton2ActionPerformed
        int tableSize = citizenRegistryTable.getRowCount();
         int selectedRow = citizenRegistryTable.getSelectedRow();
         if (selectedRow >= 0 || selectedRow < tableSize) {
            User userInfo = (User) citizenRegistryTable.getValueAt(selectedRow, 0);
            CitizenInfo citizen = userInfo.getCitizenInfo();
            String _name = updateCitizenNameField.getText();
            String _ssn = updateCitizenSsnField.getText();
            String _phone = updatePhoneField.getText();
            String _username = updateUsernameField.getText();
            String _password = updatePasswordField.getText();
            
            if ("".equals(_username) || _username == null) {
            JOptionPane.showMessageDialog(this, "Username is required", "Error", 0);
            return;
        }
        if ("".equals(_password) || _password == null) {
            JOptionPane.showMessageDialog(this, "Password is required", "Error", 0);
            return;
        }
            
            userInfo.setUsername(_username);
            userInfo.setPassword(_password);
            citizen.setName(_name);
            citizen.setSsn(_ssn);
            citizen.setPhone(_phone);
             JOptionPane.showMessageDialog(this, MessageFormat.format("{0} Successfully Updated!", _name));
        
         
        // refresh table
        populateCitizenInfoUpdateTable();
        populateCitizenInfoToHouseTable();
        // navigate to new page
        jTabbedPane1.setSelectedIndex(1);  
         }
    }//GEN-LAST:event_saveButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void newCitizenTabLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newCitizenTabLabelMousePressed
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_newCitizenTabLabelMousePressed

    private void newCitizenTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newCitizenTabMousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_newCitizenTabMousePressed

    private void citizenRegistryTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citizenRegistryTabMousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_citizenRegistryTabMousePressed

    private void citizenRegistryLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citizenRegistryLabelMousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_citizenRegistryLabelMousePressed

    private void newHouseTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newHouseTabMousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_newHouseTabMousePressed

    private void newHouseTabLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newHouseTabLabelMousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_newHouseTabLabelMousePressed

    private void userMgmtTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMgmtTabMousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_userMgmtTabMousePressed

    private void userMgmtTabLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMgmtTabLabelMousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_userMgmtTabLabelMousePressed

    private void userMgmtTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMgmtTabMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userMgmtTabMouseClicked

    private void viewHouseTabLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewHouseTabLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewHouseTabLabelMouseClicked

    private void viewHouseTabLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewHouseTabLabelMousePressed
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(3);
        
    }//GEN-LAST:event_viewHouseTabLabelMousePressed

    private void viewHouseTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewHouseTabMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewHouseTabMouseClicked

    private void viewHouseTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewHouseTabMousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_viewHouseTabMousePressed

    private void updateBirthDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBirthDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBirthDateFieldActionPerformed

    private void updatePhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatePhoneFieldActionPerformed

    private void deletejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButton2ActionPerformed
        // TODO add your handling code here:
        int tableSize = citizenRegistryTable.getRowCount();
        int selectedRow = citizenRegistryTable.getSelectedRow();
        if (selectedRow >= 0 || selectedRow < tableSize) {
            DefaultTableModel modelinfo= (DefaultTableModel)citizenRegistryTable.getModel();
            User userInfo = (User) citizenRegistryTable.getValueAt(selectedRow, 0);
            mockCitizenUserList.remove(userInfo);
        }
        populateCitizenInfoUpdateTable();
        populateCitizenInfoToHouseTable();
        updateUsernameField.setText("");
        updateCitizenNameField.setText("");
        updateCitizenSsnField.setText("");
        updatePhoneField.setText("");
        updateBirthDateField.setText("");
        updatePasswordField.setText("");
    }//GEN-LAST:event_deletejButton2ActionPerformed

    private void staffTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffTableMousePressed
        // TODO add your handling code here:
        int tableSize = staffTable.getRowCount();
        int selectedRow = staffTable.getSelectedRow();
        if (selectedRow >= 0 || selectedRow < tableSize) {
            StaffUser selectedStaff = (StaffUser) staffTable.getValueAt(selectedRow, 0);
            activeStaff = selectedStaff;
            editStaffUsername.setText(selectedStaff.getUsername());
            editStaffName.setText(selectedStaff.getName());
            editStaffPhone.setText(selectedStaff.getPhone());
            editStaffTitle.setText(selectedStaff.getTitle());
            editStaffPassword.setText(selectedStaff.getPassword());
        }
    }//GEN-LAST:event_staffTableMousePressed

    private void updateStaffButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateStaffButtonMousePressed
        // TODO add your handling code here:
        String _username = editStaffUsername.getText();
        String _name = editStaffName.getText();
        String _phone = editStaffPhone.getText();
        String _title = editStaffTitle.getText();
        String _password = editStaffPassword.getText();

//        boolean isValidUpdate = validateUserEdit() ;
//        if (isValidUpdate) {
//            activeStaff.setUsername(_username);
//            activeStaff.setName(_name);
//            activeStaff.setPhone(_phone);
//            activeStaff.setTitle(_title);
//            activeStaff.setPassword(_password);
//            populateStaffTable();
//            JOptionPane.showMessageDialog(this, MessageFormat.format("{0} Successfully Updated!", _name));
//        }
    }//GEN-LAST:event_updateStaffButtonMousePressed

    private void updateStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStaffButtonActionPerformed
        // TODO add your handling code here:
        String _username = editStaffUsername.getText();
        String _name = editStaffName.getText();
        String _phone = editStaffPhone.getText();
        String _title = editStaffTitle.getText();
        String _password = editStaffPassword.getText();
        
        boolean isValidUpdate = validateUserEdit() ;
        if (isValidUpdate) {
            activeStaff.setUsername(_username);
            activeStaff.setName(_name);
            activeStaff.setPhone(_phone);
            activeStaff.setTitle(_title);
            activeStaff.setPassword(_password);
            populateStaffTable();
            JOptionPane.showMessageDialog(this, MessageFormat.format("{0} Successfully Updated!", _name));}
    }//GEN-LAST:event_updateStaffButtonActionPerformed

    private void logoutJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJBtnActionPerformed
        // TODO add your handling code here:
        Login loginpg = new Login();
        loginpg.show();
        dispose();
    }//GEN-LAST:event_logoutJBtnActionPerformed

    private void citizenRegistryTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citizenRegistryTableMousePressed
        // TODO add your handling code here:
         int tableSize = citizenRegistryTable.getRowCount();
         int selectedRow = citizenRegistryTable.getSelectedRow();
         System.out.println("Row");
         System.out.println(selectedRow);
         if (selectedRow >= 0 || selectedRow < tableSize) {
            updatePanel.setVisible(true);
            User modelinfo = (User) citizenRegistryTable.getValueAt(selectedRow, 0);
            updateUsernameField.setText( modelinfo.getUsername());
            updateCitizenNameField.setText( modelinfo.getCitizenInfo().getName());
            updateCitizenSsnField.setText( modelinfo.getCitizenInfo().getSsn());
            updatePhoneField.setText( modelinfo.getCitizenInfo().getPhone());
            updateBirthDateField.setText(modelinfo.getCitizenInfo().getBirthDate());
            updatePasswordField.setText(modelinfo.getPassword());
            
         }
        
    }//GEN-LAST:event_citizenRegistryTableMousePressed
   
    
        public boolean validateUserEdit() {
        muncipalityStaffDirectory userList = new muncipalityStaffDirectory();
        String _username = editStaffUsername.getText();
        String _name = editStaffName.getText();
        String _phone = editStaffPhone.getText();
        String _title = editStaffTitle.getText();
        String _password = editStaffPassword.getText();
        
                // Validate username
        if ("".equals(_username) || _username == null) {
            // JOptionPane.showMessageDialog(this, "Error: Name is required");
            JOptionPane.showMessageDialog(this, "Username is required", "Error", 0);
            return false;
        }
         if (!userList.isUsernameUpdateValid(activeStaff, _username)) {
              JOptionPane.showMessageDialog(this, "Username already taken", "Error", 0);
             return false;
        } 
         // Validate name
        if ("".equals(_name) || _name == null) {
            JOptionPane.showMessageDialog(this, "Name is required", "Error", 0);
            return false;
        } 
           // Validate Phone
        if ("".equals(_phone) || _phone == null) {
            JOptionPane.showMessageDialog(this, "Phone is required", "Error", 0);
            return false;
        }
           // Validate Title
        if ("".equals(_title) || _title == null) {
            JOptionPane.showMessageDialog(this, "Title is required", "Error", 0);
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
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MunicipalityPage().setVisible(true);
            }
        });
        
        
        
        
//    private boolean fireValidations() {
//        boolean valid = true;

//        if (!usernameField.getText().matches("^[a-zA-Z]*$") || (usernameField.getText() == null) || (usernameField.getText().length() == 0)) {
//            usernameField.setBackground(Color.red);
//            valid = false;
//        } else {
//            usernameField.setBackground(Color.white);
//        }
        
//        if (!txtPatientID.getText().matches("^[0-9]+$") || (txtPatientID.getText() == null) || (txtPatientID.getText().length() == 0)) {
//            txtPatientID.setBackground(Color.red);
//            valid = false;
//        } else {
//            txtPatientID.setBackground(Color.white);
//        }
//
//        if (!txtPatientDob.getText().matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$") || (txtPatientDob.getText() == null) || (txtPatientDob.getText().length() == 0)) {
//            txtPatientDob.setBackground(Color.red);
//            valid = false;
//            JOptionPane.showMessageDialog(this, "Please enter date in DD/MM/YYYY format");
//        } else {
//            txtPatientDob.setBackground(Color.white);
//        }
//
//        if (!txtPatientAge.getText().matches("^[0-9]{1,3}$") || (txtPatientAge.getText().length() == 0)) {
//            txtPatientAge.setBackground(Color.red);
//            valid = false;
//        } else {
//            txtPatientAge.setBackground(Color.white);
//        }
//        
//        if (!txtCommunityName.getText().matches("^[a-zA-Z]*$") || (txtCommunityName.getText() == null) || (txtCommunityName.getText().length() == 0)) {
//            txtCommunityName.setBackground(Color.red);
//            valid = false;
//        } else {
//            txtCommunityName.setBackground(Color.white);
//        }
//        
//        if (!txtCommunityID.getText().matches("^[0-9]+$") || (txtCommunityID.getText() == null) || (txtCommunityID.getText().length() == 0)) {
//            txtCommunityID.setBackground(Color.red);
//            valid = false;
//        } else {
//            txtCommunityID.setBackground(Color.white);
//        }
//        
//        if (!txtCity.getText().matches("^[a-zA-Z]*$") || (txtCity.getText() == null) || (txtCity.getText().length() == 0)) {
//            txtCity.setBackground(Color.red);
//            valid = false;
//        } else {
//            txtCity.setBackground(Color.white);
//        }
//        
//        if (!txtHouseNo.getText().matches("^[a-zA-Z0-9]*$") || (txtHouseNo.getText() == null) || (txtHouseNo.getText().length() == 0)) {
//            txtHouseNo.setBackground(Color.red);
//            valid = false;
//        } else {
//            txtHouseNo.setBackground(Color.white);
//        }
//        
//        return valid;
//    

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BirthDatejLabel11;
    private javax.swing.JLabel NamejLabel;
    private javax.swing.JTable ViewHousingTable;
    private javax.swing.JTextField addressL1Field;
    private javax.swing.JTextField addressL1Field1;
    private javax.swing.JComboBox<String> areaDropdown;
    private javax.swing.JButton backButton;
    private javax.swing.JButton backButton2;
    private javax.swing.JLabel birthDatejLabel;
    private com.toedter.calendar.JDateChooser citizenBirthChooser;
    private javax.swing.JLabel citizenRegistryLabel;
    private javax.swing.JPanel citizenRegistryTab;
    private javax.swing.JTable citizenRegistryTable;
    private javax.swing.JTable citizensInInfoTable3;
    private javax.swing.JPanel createCitizenTab;
    private javax.swing.JPanel createHousejPanel;
    private javax.swing.JPanel createUserJPanel;
    private javax.swing.JButton deletejButton2;
    private javax.swing.JTextField editStaffName;
    private javax.swing.JPasswordField editStaffPassword;
    private javax.swing.JTextField editStaffPhone;
    private javax.swing.JTextField editStaffTitle;
    private javax.swing.JTextField editStaffUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton logoutJBtn;
    private javax.swing.JPanel manageStaffPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JPanel newCitizenTab;
    private javax.swing.JLabel newCitizenTabLabel;
    private javax.swing.JPanel newHouseTab;
    private javax.swing.JLabel newHouseTabLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordjLabel14;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phonejLabel16;
    private javax.swing.JButton saveButton2;
    private javax.swing.JButton saveHousingButton;
    private javax.swing.JButton saveUserButton;
    private javax.swing.JTextField ssnField;
    private javax.swing.JLabel ssnjLabel13;
    private javax.swing.JLabel ssnjLabel15;
    private javax.swing.JTable staffTable;
    private javax.swing.JTextField updateBirthDateField;
    private javax.swing.JTextField updateCitizenNameField;
    private javax.swing.JTextField updateCitizenSsnField;
    private javax.swing.JPanel updateCitizensTab;
    private javax.swing.JPanel updateJPanel;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JTextField updatePasswordField;
    private javax.swing.JTextField updatePhoneField;
    private javax.swing.JButton updateStaffButton;
    private javax.swing.JTextField updateUsernameField;
    private javax.swing.JPanel userMgmtTab;
    private javax.swing.JLabel userMgmtTabLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernamejLabel14;
    private javax.swing.JLabel usernamejLabel16;
    private javax.swing.JLabel usernamejLabel4;
    private javax.swing.JPanel viewHouseTab;
    private javax.swing.JLabel viewHouseTabLabel;
    private javax.swing.JPanel viewHousingjPanel4;
    // End of variables declaration//GEN-END:variables
}
