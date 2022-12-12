/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import Models.Bank.BankAccount;
import Models.Bank.BankAccountDirectory;
import Models.Bank.BankServiceRequest;
import Models.Bank.BankServiceRequestDirectory;
import Models.Bank.BankServiceStaffDirectory;
import Models.User.RoleType;
import Models.User.StaffUser;
import Models.User.User;
import Models.User.UserDirectory;
import Pages.Login;
import static java.lang.String.valueOf;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liuyanzi
 */
public class BankPage extends javax.swing.JFrame {
 ArrayList<BankServiceRequest> allRequests= new BankServiceRequestDirectory().getRequests();
 ArrayList<StaffUser> allStaff = new BankServiceStaffDirectory().getAllStaff();
 ArrayList<BankAccount> allAccount = new BankAccountDirectory().getAccount();
 ArrayList<User> allUser = new UserDirectory().getAllUsers();
 BankServiceRequest activeRequest;
 StaffUser activeStaff;
 private User currentUser;

    /**
     * Creates new form BankManager
     */
    public BankPage() {
        initComponents();
        populateRequestsTable();
        populateStaffTable();
        populateBankAccountTable();
        setStaffDropDownOptions();
        hideRequestUpdatePanel();
    }
    
    public void setCurrentUser(User user) {
        currentUser = user;
        System.out.println("Current User:");
        System.out.println(currentUser.getUsername());
        // hide tab based on role
        if (!currentUser.getRole().equals(RoleType.BankAdmin)) {
        populateRequestsTable();
        populateStaffTable();
        populateBankAccountTable();
        populateBankUserTable();
        setStaffDropDownOptions();
        hideRequestUpdatePanel();
        }
        if (currentUser.getRole().equals(RoleType.BankManager)) {
        populateRequestsTable();
        populateStaffTable();
        populateBankAccountTable();
        setStaffDropDownOptions();
        hideRequestUpdatePanel();
        userMgmtTab.setVisible(false);
        }
        if (currentUser.getRole().equals(RoleType.BankCustomerService)) {
        populateRequestsTable();
       
        userMgmtTab.setVisible(false);
        }
       
    }
    
    public void populateRequestsTable() {
        DefaultTableModel model = (DefaultTableModel) requestsTable.getModel();
        model.setRowCount(0);
         System.out.println("Active request:");
                for (BankServiceRequest request : allRequests)  {
                    Object[] row = new Object[5];
                        row[0] = request;
                        row[1] = request.date;
                        row[2] = request.description;
                        row[3] = request.assignedTo;
                        row[4] = request.status;
                        
                        model.addRow(row);
                }
    }

    public void populateStaffTable() {
        DefaultTableModel model = (DefaultTableModel) bankStaffTable.getModel();
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
     public void populateBankAccountTable() {
        DefaultTableModel model = (DefaultTableModel) bankAccountTable.getModel();
        model.setRowCount(0);
         System.out.println("Active account:");
                for (BankAccount account : allAccount)  {
                    Object[] row = new Object[2];
                        row[0] = account.getAccountNumber();
                        row[1] = account.getBalance();
                        model.addRow(row);
                }
    }
     public void populateBankUserTable() {
        DefaultTableModel model = (DefaultTableModel) bankUserTable.getModel();
        model.setRowCount(0);
         System.out.println("Active Bank User:");
                for (User user : allUser)  {
                    Object[] row = new Object[3];
                        row[0] = user.getUsername();
                        row[1] = user.getPassword();
                        row[2] = user.getRole();
                        model.addRow(row);
                }
    }
    
    public void setStaffDropDownOptions(){
         dropDownStaff.setModel(new DefaultComboBoxModel(_getStaffNames()));
         }
         
         public String[] _getStaffNames() {
            ArrayList<String> names = new ArrayList<String>();
         for (StaffUser staff: allStaff) {
              names.add("Unassigned");
             names.add(staff.getName());
         }
         String[] dropdownNames = names.toArray(new String[names.size()]);
         return dropdownNames;
         }
         
         public void hideRequestUpdatePanel() {
                requestDetailsPanel.setVisible(false);
                
    }
         public void showRequestUpdatePanel() {
                requestDetailsPanel.setVisible(true);
    }
         
     public void setStatusofRequestDropDownOptions(){
         dropDownRequestStatus.setModel(new DefaultComboBoxModel(_getRequestStatus()));
         }
         
         public String[] _getRequestStatus() {
            ArrayList<String> status = new ArrayList<String>();
        status.add("pending");
        status.add("processing");
        status.add("resolved");
        
         String[] dropdownStatus = status.toArray(new String[status.size()]);
         return dropdownStatus;
         }
         
         
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pagePanel = new javax.swing.JPanel();
        sideBarPanel = new javax.swing.JPanel();
        requestsTab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        staffTab = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        accountMgtTab = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        userMgmtTab = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        customerServiceTab = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        logoutBotton = new javax.swing.JButton();
        menuBarPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        requestsPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestsTable = new javax.swing.JTable();
        requestDetailsPanel = new javax.swing.JPanel();
        saveRequestButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        dropDownStaff = new javax.swing.JComboBox<>();
        dropDownStatus = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        staffPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        bankStaffScrollPane1 = new javax.swing.JScrollPane();
        bankStaffTable = new javax.swing.JTable();
        manageStaffPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        updateStaffButton = new javax.swing.JButton();
        editStaffName = new javax.swing.JTextField();
        editStaffUsername = new javax.swing.JTextField();
        editStaffTitle = new javax.swing.JTextField();
        editStaffPhone = new javax.swing.JTextField();
        editStaffPassword = new javax.swing.JPasswordField();
        accountListPanel = new javax.swing.JPanel();
        bankAccountScrollPane3 = new javax.swing.JScrollPane();
        bankAccountTable = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        manageBankAccountPane = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        updateAccountButton = new javax.swing.JButton();
        editAccountNumber = new javax.swing.JTextField();
        editBalance = new javax.swing.JTextField();
        userManagementPanel = new javax.swing.JPanel();
        bankUserScrollPane4 = new javax.swing.JScrollPane();
        bankUserTable = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        requestsPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        assignedJTable = new javax.swing.JTable();
        requestDetailsPanel1 = new javax.swing.JPanel();
        saveAssignedRequestButton = new javax.swing.JButton();
        dropDownRequestStatus = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBarPanel.setBackground(new java.awt.Color(0, 0, 0));
        sideBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestsTab.setBackground(new java.awt.Color(102, 102, 102));
        requestsTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestsTabMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                requestsTabMousePressed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inquiries");

        javax.swing.GroupLayout requestsTabLayout = new javax.swing.GroupLayout(requestsTab);
        requestsTab.setLayout(requestsTabLayout);
        requestsTabLayout.setHorizontalGroup(
            requestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestsTabLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        requestsTabLayout.setVerticalGroup(
            requestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        sideBarPanel.add(requestsTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 140, 30));

        staffTab.setBackground(new java.awt.Color(102, 102, 102));
        staffTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffTabMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                staffTabMousePressed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Staff");

        javax.swing.GroupLayout staffTabLayout = new javax.swing.GroupLayout(staffTab);
        staffTab.setLayout(staffTabLayout);
        staffTabLayout.setHorizontalGroup(
            staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffTabLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        staffTabLayout.setVerticalGroup(
            staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        sideBarPanel.add(staffTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, 30));

        accountMgtTab.setBackground(new java.awt.Color(102, 102, 102));
        accountMgtTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMgtTabMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accountMgtTabMousePressed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Account Management");

        javax.swing.GroupLayout accountMgtTabLayout = new javax.swing.GroupLayout(accountMgtTab);
        accountMgtTab.setLayout(accountMgtTabLayout);
        accountMgtTabLayout.setHorizontalGroup(
            accountMgtTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountMgtTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        accountMgtTabLayout.setVerticalGroup(
            accountMgtTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountMgtTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        sideBarPanel.add(accountMgtTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 140, 30));

        userMgmtTab.setBackground(new java.awt.Color(102, 102, 102));
        userMgmtTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userMgmtTabMousePressed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("User Management");

        javax.swing.GroupLayout userMgmtTabLayout = new javax.swing.GroupLayout(userMgmtTab);
        userMgmtTab.setLayout(userMgmtTabLayout);
        userMgmtTabLayout.setHorizontalGroup(
            userMgmtTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userMgmtTabLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        userMgmtTabLayout.setVerticalGroup(
            userMgmtTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userMgmtTabLayout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        sideBarPanel.add(userMgmtTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 140, 30));

        customerServiceTab.setBackground(new java.awt.Color(102, 102, 102));
        customerServiceTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerServiceTabMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                customerServiceTabMousePressed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Customer Service");

        javax.swing.GroupLayout customerServiceTabLayout = new javax.swing.GroupLayout(customerServiceTab);
        customerServiceTab.setLayout(customerServiceTabLayout);
        customerServiceTabLayout.setHorizontalGroup(
            customerServiceTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerServiceTabLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        customerServiceTabLayout.setVerticalGroup(
            customerServiceTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerServiceTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        sideBarPanel.add(customerServiceTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 140, 30));

        logoutBotton.setBackground(new java.awt.Color(0, 51, 51));
        logoutBotton.setForeground(new java.awt.Color(255, 255, 255));
        logoutBotton.setText("Logout");
        logoutBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBottonActionPerformed(evt);
            }
        });
        sideBarPanel.add(logoutBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        pagePanel.add(sideBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 700));

        menuBarPanel.setBackground(new java.awt.Color(0, 0, 0));
        menuBarPanel.setPreferredSize(new java.awt.Dimension(766, 56));

        jLabel1.setText("Bank Dashboard");

        javax.swing.GroupLayout menuBarPanelLayout = new javax.swing.GroupLayout(menuBarPanel);
        menuBarPanel.setLayout(menuBarPanelLayout);
        menuBarPanelLayout.setHorizontalGroup(
            menuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarPanelLayout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(jLabel1)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        menuBarPanelLayout.setVerticalGroup(
            menuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        pagePanel.add(menuBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 760, 60));

        tabbedPane.setBackground(new java.awt.Color(0, 0, 0));

        requestsPanel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("INQUIRIES");
        jLabel5.setMaximumSize(new java.awt.Dimension(142, 23));
        jLabel5.setMinimumSize(new java.awt.Dimension(142, 23));
        jLabel5.setPreferredSize(new java.awt.Dimension(142, 23));

        requestsTable.setBackground(new java.awt.Color(51, 51, 51));
        requestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Bank Account #", "Date", "Description", "Assigned To", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestsTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                requestsTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(requestsTable);

        requestDetailsPanel.setBackground(new java.awt.Color(51, 51, 51));

        saveRequestButton.setText("Save");
        saveRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveRequestButtonActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Customer Inquiry");

        dropDownStaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dropDownStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unassigned", "In Progress", "Complete" }));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Assigned To");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Status");

        javax.swing.GroupLayout requestDetailsPanelLayout = new javax.swing.GroupLayout(requestDetailsPanel);
        requestDetailsPanel.setLayout(requestDetailsPanelLayout);
        requestDetailsPanelLayout.setHorizontalGroup(
            requestDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, requestDetailsPanelLayout.createSequentialGroup()
                .addGap(0, 158, Short.MAX_VALUE)
                .addGroup(requestDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dropDownStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(requestDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropDownStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(177, 177, 177))
            .addGroup(requestDetailsPanelLayout.createSequentialGroup()
                .addGroup(requestDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(requestDetailsPanelLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(saveRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(requestDetailsPanelLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        requestDetailsPanelLayout.setVerticalGroup(
            requestDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestDetailsPanelLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(requestDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(requestDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropDownStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropDownStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(saveRequestButton)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout requestsPanelLayout = new javax.swing.GroupLayout(requestsPanel);
        requestsPanel.setLayout(requestsPanelLayout);
        requestsPanelLayout.setHorizontalGroup(
            requestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, requestsPanelLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(requestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(requestDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(requestsPanelLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        requestsPanelLayout.setVerticalGroup(
            requestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestsPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(requestDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Inquiries", requestsPanel);

        staffPanel.setBackground(new java.awt.Color(53, 53, 53));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Staff");

        bankStaffTable.setBackground(new java.awt.Color(53, 53, 53));
        bankStaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "UserName", "Name", "Title", "Phone"
            }
        ));
        bankStaffTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bankStaffTableMousePressed(evt);
            }
        });
        bankStaffScrollPane1.setViewportView(bankStaffTable);

        manageStaffPanel.setBackground(new java.awt.Color(53, 53, 53));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Username");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Password");

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Title");

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Phone");

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Name");

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
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel26)
                        .addGap(106, 106, 106)
                        .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editStaffPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel26))
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

        javax.swing.GroupLayout staffPanelLayout = new javax.swing.GroupLayout(staffPanel);
        staffPanel.setLayout(staffPanelLayout);
        staffPanelLayout.setHorizontalGroup(
            staffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffPanelLayout.createSequentialGroup()
                .addGroup(staffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageStaffPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(staffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(staffPanelLayout.createSequentialGroup()
                            .addGap(335, 335, 335)
                            .addComponent(jLabel6))
                        .addGroup(staffPanelLayout.createSequentialGroup()
                            .addGap(94, 94, 94)
                            .addComponent(bankStaffScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        staffPanelLayout.setVerticalGroup(
            staffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(bankStaffScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(manageStaffPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        tabbedPane.addTab("tab2", staffPanel);

        accountListPanel.setBackground(new java.awt.Color(53, 53, 53));

        bankAccountTable.setBackground(new java.awt.Color(53, 53, 53));
        bankAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Account#", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bankAccountTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bankAccountTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bankAccountTableMousePressed(evt);
            }
        });
        bankAccountScrollPane3.setViewportView(bankAccountTable);

        jLabel24.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Account List");

        manageBankAccountPane.setBackground(new java.awt.Color(53, 53, 53));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Account#");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Balance");

        updateAccountButton.setText("Update");
        updateAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateAccountButtonMousePressed(evt);
            }
        });
        updateAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAccountButtonActionPerformed(evt);
            }
        });

        editBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBalanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageBankAccountPaneLayout = new javax.swing.GroupLayout(manageBankAccountPane);
        manageBankAccountPane.setLayout(manageBankAccountPaneLayout);
        manageBankAccountPaneLayout.setHorizontalGroup(
            manageBankAccountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageBankAccountPaneLayout.createSequentialGroup()
                .addGroup(manageBankAccountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageBankAccountPaneLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(manageBankAccountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(editAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(manageBankAccountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(editBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(manageBankAccountPaneLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(updateAccountButton)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        manageBankAccountPaneLayout.setVerticalGroup(
            manageBankAccountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageBankAccountPaneLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(manageBankAccountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageBankAccountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(updateAccountButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout accountListPanelLayout = new javax.swing.GroupLayout(accountListPanel);
        accountListPanel.setLayout(accountListPanelLayout);
        accountListPanelLayout.setHorizontalGroup(
            accountListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountListPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(accountListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(bankAccountScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(accountListPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(manageBankAccountPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        accountListPanelLayout.setVerticalGroup(
            accountListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountListPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(bankAccountScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(manageBankAccountPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        tabbedPane.addTab("tab3", accountListPanel);

        userManagementPanel.setBackground(new java.awt.Color(53, 53, 53));

        bankUserTable.setBackground(new java.awt.Color(53, 53, 53));
        bankUserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "User Name", "Password", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bankUserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bankUserTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bankUserTableMousePressed(evt);
            }
        });
        bankUserScrollPane4.setViewportView(bankUserTable);

        jLabel25.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("User List");

        javax.swing.GroupLayout userManagementPanelLayout = new javax.swing.GroupLayout(userManagementPanel);
        userManagementPanel.setLayout(userManagementPanelLayout);
        userManagementPanelLayout.setHorizontalGroup(
            userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userManagementPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(bankUserScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        userManagementPanelLayout.setVerticalGroup(
            userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userManagementPanelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel25)
                .addGap(29, 29, 29)
                .addComponent(bankUserScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );

        tabbedPane.addTab("tab4", userManagementPanel);

        requestsPanel1.setBackground(new java.awt.Color(53, 53, 53));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Requests to Me");

        assignedJTable.setBackground(new java.awt.Color(53, 53, 53));
        assignedJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Bank Account #", "Date", "Description", "Assigned To", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        assignedJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assignedJTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                assignedJTableMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(assignedJTable);

        requestDetailsPanel1.setBackground(new java.awt.Color(53, 53, 53));

        saveAssignedRequestButton.setText("Save");
        saveAssignedRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAssignedRequestButtonActionPerformed(evt);
            }
        });

        dropDownRequestStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unassigned", "In Progress", "Complete" }));
        dropDownRequestStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropDownRequestStatusActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Status");

        javax.swing.GroupLayout requestDetailsPanel1Layout = new javax.swing.GroupLayout(requestDetailsPanel1);
        requestDetailsPanel1.setLayout(requestDetailsPanel1Layout);
        requestDetailsPanel1Layout.setHorizontalGroup(
            requestDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestDetailsPanel1Layout.createSequentialGroup()
                .addGroup(requestDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(requestDetailsPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(saveAssignedRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(requestDetailsPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(dropDownRequestStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        requestDetailsPanel1Layout.setVerticalGroup(
            requestDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestDetailsPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(requestDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(dropDownRequestStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(saveAssignedRequestButton)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout requestsPanel1Layout = new javax.swing.GroupLayout(requestsPanel1);
        requestsPanel1.setLayout(requestsPanel1Layout);
        requestsPanel1Layout.setHorizontalGroup(
            requestsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestsPanel1Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, requestsPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(requestsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(requestDetailsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        requestsPanel1Layout.setVerticalGroup(
            requestsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestsPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(requestDetailsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        tabbedPane.addTab("tab5", requestsPanel1);

        pagePanel.add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 760, 670));
        tabbedPane.getAccessibleContext().setAccessibleName("Requests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void requestsTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestsTabMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_requestsTabMouseClicked

    private void requestsTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestsTabMousePressed
        // TODO add your handling code here:
        tabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_requestsTabMousePressed

    private void staffTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffTabMouseClicked
        // TODO add your handling code here:
        

    }//GEN-LAST:event_staffTabMouseClicked

    private void staffTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffTabMousePressed
        // TODO add your handling code here:
        tabbedPane.setSelectedIndex(1);
             
    }//GEN-LAST:event_staffTabMousePressed

    private void accountMgtTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMgtTabMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_accountMgtTabMouseClicked

    private void accountMgtTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMgtTabMousePressed
        // TODO add your handling code here:
        tabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_accountMgtTabMousePressed

    private void bankAccountTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bankAccountTableMousePressed
        // TODO add your handling code here:
         int tableSize = bankAccountTable.getRowCount();
        int selectedRow = bankAccountTable.getSelectedRow();
            if (selectedRow >= 0 || selectedRow < tableSize) {
                BankAccount selectedAccount = (BankAccount) bankAccountTable.getValueAt(selectedRow, 0);
                
                editAccountNumber.setText(selectedAccount.getAccountNumber().toString());
                editBalance.setText(valueOf(selectedAccount.getBalance()));
               
         }       
    }//GEN-LAST:event_bankAccountTableMousePressed

    private void bankAccountTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bankAccountTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bankAccountTableMouseClicked

    private void saveRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveRequestButtonActionPerformed
        // TODO add your handling code here:
        int tableSize = requestsTable.getRowCount();
        int selectedRow = requestsTable.getSelectedRow();
        if (selectedRow >= 0 || selectedRow < tableSize) {
            BankServiceRequest selectedRequest = (BankServiceRequest) requestsTable.getValueAt(selectedRow, 0);
            String status = dropDownStatus.getSelectedItem().toString();
            String staffName = dropDownStaff.getSelectedItem().toString();
            StaffUser selectedStaff = null;
            for (StaffUser staff : allStaff) {
                if (staffName.equals(staff.getName())) {
                    selectedStaff = staff;
                }
            }
            selectedRequest.setAssignedTo(selectedStaff);
            selectedRequest.setStatus(status);
            populateRequestsTable();
        }
    }//GEN-LAST:event_saveRequestButtonActionPerformed

    private void requestsTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestsTableMousePressed
        // TODO add your handling code here:
        int tableSize = requestsTable.getRowCount();
        int selectedRow = requestsTable.getSelectedRow();
        System.out.println("Row");
        System.out.println(selectedRow);
        if (selectedRow >= 0 || selectedRow < tableSize) {
            BankServiceRequest selectedRequest = (BankServiceRequest) requestsTable.getValueAt(selectedRow, 0);
            dropDownStaff.setSelectedItem(selectedRequest.assignedTo);
            dropDownStatus.setSelectedItem(selectedRequest.status);
            showRequestUpdatePanel();
        }
    }//GEN-LAST:event_requestsTableMousePressed

    private void requestsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestsTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_requestsTableMouseClicked

    private void bankUserTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bankUserTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bankUserTableMouseClicked

    private void bankUserTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bankUserTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankUserTableMousePressed

    private void customerServiceTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerServiceTabMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_customerServiceTabMouseClicked

    private void customerServiceTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerServiceTabMousePressed
        // TODO add your handling code here:
         tabbedPane.setSelectedIndex(4);
        
    }//GEN-LAST:event_customerServiceTabMousePressed

    private void assignedJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignedJTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_assignedJTableMouseClicked

    private void assignedJTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignedJTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_assignedJTableMousePressed

    private void saveAssignedRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAssignedRequestButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveAssignedRequestButtonActionPerformed

    private void dropDownRequestStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropDownRequestStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropDownRequestStatusActionPerformed

    private void updateStaffButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateStaffButtonMousePressed
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
            JOptionPane.showMessageDialog(this, MessageFormat.format("{0} Successfully Updated!", _name));
        }
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
            JOptionPane.showMessageDialog(this, MessageFormat.format("{0} Successfully Updated!", _name));
        }
    }//GEN-LAST:event_updateStaffButtonActionPerformed

    private void updateAccountButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateAccountButtonMousePressed
        // TODO add your handling code here:
        String _accountnumber = editAccountNumber.getText();
        String _balance = editBalance.getText();
       
        
    }//GEN-LAST:event_updateAccountButtonMousePressed

    private void updateAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAccountButtonActionPerformed
        // TODO add your handling code here:
       
         String _accountnumber = editAccountNumber.getText();
        String _balance = editBalance.getText();
       
        
    }//GEN-LAST:event_updateAccountButtonActionPerformed

    private void editBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBalanceActionPerformed

    private void logoutBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBottonActionPerformed
        // TODO add your handling code here:
        Login loginpg = new Login();
        loginpg.show();
        dispose();
    }//GEN-LAST:event_logoutBottonActionPerformed

    private void bankStaffTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bankStaffTableMousePressed
        // TODO add your handling code here:
        int tableSize = bankStaffTable.getRowCount();
        int selectedRow = bankStaffTable.getSelectedRow();
            if (selectedRow >= 0 || selectedRow < tableSize) {
                StaffUser selectedStaff = (StaffUser) bankStaffTable.getValueAt(selectedRow, 0);
                activeStaff = selectedStaff;
                editStaffUsername.setText(selectedStaff.getUsername());
                editStaffName.setText(selectedStaff.getName());
                editStaffPhone.setText(selectedStaff.getPhone());
                editStaffTitle.setText(selectedStaff.getTitle());
                editStaffPassword.setText(selectedStaff.getPassword());
         }  
    }//GEN-LAST:event_bankStaffTableMousePressed

    private void userMgmtTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMgmtTabMousePressed
        // TODO add your handling code here:
        tabbedPane.setSelectedIndex(3);
        
    }//GEN-LAST:event_userMgmtTabMousePressed

    public boolean validateUserEdit() {
        BankServiceStaffDirectory userList = new BankServiceStaffDirectory();
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountListPanel;
    private javax.swing.JPanel accountMgtTab;
    private javax.swing.JTable assignedJTable;
    private javax.swing.JScrollPane bankAccountScrollPane3;
    private javax.swing.JTable bankAccountTable;
    private javax.swing.JScrollPane bankStaffScrollPane1;
    private javax.swing.JTable bankStaffTable;
    private javax.swing.JScrollPane bankUserScrollPane4;
    private javax.swing.JTable bankUserTable;
    private javax.swing.JPanel customerServiceTab;
    private javax.swing.JComboBox<String> dropDownRequestStatus;
    private javax.swing.JComboBox<String> dropDownStaff;
    private javax.swing.JComboBox<String> dropDownStatus;
    private javax.swing.JTextField editAccountNumber;
    private javax.swing.JTextField editBalance;
    private javax.swing.JTextField editStaffName;
    private javax.swing.JPasswordField editStaffPassword;
    private javax.swing.JTextField editStaffPhone;
    private javax.swing.JTextField editStaffTitle;
    private javax.swing.JTextField editStaffUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logoutBotton;
    private javax.swing.JPanel manageBankAccountPane;
    private javax.swing.JPanel manageStaffPanel;
    private javax.swing.JPanel menuBarPanel;
    private javax.swing.JPanel pagePanel;
    private javax.swing.JPanel requestDetailsPanel;
    private javax.swing.JPanel requestDetailsPanel1;
    private javax.swing.JPanel requestsPanel;
    private javax.swing.JPanel requestsPanel1;
    private javax.swing.JPanel requestsTab;
    private javax.swing.JTable requestsTable;
    private javax.swing.JButton saveAssignedRequestButton;
    private javax.swing.JButton saveRequestButton;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JPanel staffPanel;
    private javax.swing.JPanel staffTab;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JButton updateAccountButton;
    private javax.swing.JButton updateStaffButton;
    private javax.swing.JPanel userManagementPanel;
    private javax.swing.JPanel userMgmtTab;
    // End of variables declaration//GEN-END:variables
}
