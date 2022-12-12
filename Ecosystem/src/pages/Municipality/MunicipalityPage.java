/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pages.Municipality;

import javax.swing.JOptionPane;
import Models.User.RoleType;
import Models.User.StaffUser;
import Models.User.User;
import Models.muncipality.muncipalityStaffDirectory;
import Models.muncipality.CitizenInfo;
import Models.muncipality.House;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vatsalkapadia
 */
public class MunicipalityPage extends javax.swing.JFrame {
ArrayList<User> mockCitizenUserList = new ArrayList();
ArrayList<StaffUser> allStaff = new muncipalityStaffDirectory().getAllStaff();
StaffUser activeStaff;
private User currentUser;
    /**
     * Creates new form citizenServiceMainJFrame
     */
    public MunicipalityPage() {
        initComponents();
        populateCitizenHousingTable();
        populateStaffTable();
        
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
        if (currentUser.getRole().equals(RoleType.MunicipalityAdmin)) {
        populateCitizenHousingTable();
        populateCitizenInfoTable();
        }
        if (currentUser.getRole().equals(RoleType.MunicipalityCitizenManager)) {
            populateCitizenInfoTable();
        
            userMgmtPanel.setVisible(false);
            registerHousesJpanel.setVisible(false);
            viewHousingjPanel4.setVisible(false);
        }
        if (currentUser.getRole().equals(RoleType.MunicipalityHousingManager)) {
           populateCitizenHousingTable();
            userMgmtPanel.setVisible(false);
            updateCitizenjPanel.setVisible(false);
            viewCitizenjPanel5.setVisible(false);
            createCitizenjPanel4.setVisible(false);
        
        }
    }
    
    public void populateCitizenInfoTable() {
        DefaultTableModel model = (DefaultTableModel) citizensInInfoTable2.getModel();
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
        DefaultTableModel model = (DefaultTableModel) citizensInInfoTable5.getModel();
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
      
    public void populateCitizenHousingTable() {
        DefaultTableModel model = (DefaultTableModel) citizensInHousingTable2.getModel();
        model.setRowCount(0);
                for (User user : mockCitizenUserList)  {
                    Object[] row = new Object[8];
                        row[0] = user;
                        row[1] = user.getCitizenInfo().getSsn();
                        row[2] = user.getCitizenInfo().getPhone();
                        if ((user.getCitizenInfo().getHouse().getCityArea()) == null){
                         row[3] ="" ;
                        } else {
                            row[3] = user.getCitizenInfo().getHouse().getCityArea();
                        }
                        
                        
                        if ((user.getCitizenInfo().getHouse().getAddressOne())== null){
                         row[4] ="" ;
                        } else {
                            row[4] = user.getCitizenInfo().getHouse().getAddressOne();
                        }
                        
                         if ((user.getCitizenInfo().getHouse().getAddressTwo())== null){
                         row[5] ="" ;
                        } else {
                            row[5] = user.getCitizenInfo().getHouse().getAddressTwo();
                        }
                        
                        row[6] = user.getCitizenInfo().getHouse().getHouseId();
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
        createCitizenjPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        viewCitizenjPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        updateCitizenjPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        registerHousesJpanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        userMgmtPanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        viewHousesJpanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        createUserJPanel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
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
        viewJPanel = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        BirthDatejLabel10 = new javax.swing.JLabel();
        ssnField1 = new javax.swing.JPasswordField();
        usernameField1 = new javax.swing.JTextField();
        backButton1 = new javax.swing.JButton();
        ssnjLabel12 = new javax.swing.JLabel();
        namejLabel13 = new javax.swing.JLabel();
        viewButton1 = new javax.swing.JButton();
        birthDatejTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        citizensInInfoTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        phoneJField3 = new javax.swing.JPasswordField();
        usernamejLabel15 = new javax.swing.JLabel();
        nameField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        citizensInHousingTable1 = new javax.swing.JTable();
        updateJPanel = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        usernameField2 = new javax.swing.JTextField();
        backButton2 = new javax.swing.JButton();
        ssnjLabel13 = new javax.swing.JLabel();
        usernamejLabel14 = new javax.swing.JLabel();
        saveButton2 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        citizensInInfoTable5 = new javax.swing.JTable();
        viewButton2 = new javax.swing.JButton();
        usernamejLabel16 = new javax.swing.JLabel();
        usernameField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        BirthDatejLabel11 = new javax.swing.JLabel();
        birthDatejTextField2 = new javax.swing.JTextField();
        phonejTextField1 = new javax.swing.JTextField();
        ssnjTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        passjTextField1 = new javax.swing.JTextField();
        deletejButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        citizensInInfoTable4 = new javax.swing.JTable();
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
        citizensInHousingTable2 = new javax.swing.JTable();
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
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        createCitizenjPanel4.setBackground(new java.awt.Color(102, 102, 102));
        createCitizenjPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createCitizenjPanel4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createCitizenjPanel4MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Citizen");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout createCitizenjPanel4Layout = new javax.swing.GroupLayout(createCitizenjPanel4);
        createCitizenjPanel4.setLayout(createCitizenjPanel4Layout);
        createCitizenjPanel4Layout.setHorizontalGroup(
            createCitizenjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createCitizenjPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        createCitizenjPanel4Layout.setVerticalGroup(
            createCitizenjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createCitizenjPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewCitizenjPanel5.setBackground(new java.awt.Color(102, 102, 102));
        viewCitizenjPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewCitizenjPanel5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewCitizenjPanel5MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View Citizen");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout viewCitizenjPanel5Layout = new javax.swing.GroupLayout(viewCitizenjPanel5);
        viewCitizenjPanel5.setLayout(viewCitizenjPanel5Layout);
        viewCitizenjPanel5Layout.setHorizontalGroup(
            viewCitizenjPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewCitizenjPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewCitizenjPanel5Layout.setVerticalGroup(
            viewCitizenjPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewCitizenjPanel5Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        updateCitizenjPanel.setBackground(new java.awt.Color(102, 102, 102));
        updateCitizenjPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateCitizenjPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateCitizenjPanelMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Update Citizen");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout updateCitizenjPanelLayout = new javax.swing.GroupLayout(updateCitizenjPanel);
        updateCitizenjPanel.setLayout(updateCitizenjPanelLayout);
        updateCitizenjPanelLayout.setHorizontalGroup(
            updateCitizenjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateCitizenjPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        updateCitizenjPanelLayout.setVerticalGroup(
            updateCitizenjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateCitizenjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        registerHousesJpanel.setBackground(new java.awt.Color(102, 102, 102));
        registerHousesJpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerHousesJpanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registerHousesJpanelMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Register House");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout registerHousesJpanelLayout = new javax.swing.GroupLayout(registerHousesJpanel);
        registerHousesJpanel.setLayout(registerHousesJpanelLayout);
        registerHousesJpanelLayout.setHorizontalGroup(
            registerHousesJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerHousesJpanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        registerHousesJpanelLayout.setVerticalGroup(
            registerHousesJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerHousesJpanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        userMgmtPanel.setBackground(new java.awt.Color(102, 102, 102));
        userMgmtPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMgmtPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userMgmtPanelMousePressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("user managemnet");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel19MousePressed(evt);
            }
        });

        javax.swing.GroupLayout userMgmtPanelLayout = new javax.swing.GroupLayout(userMgmtPanel);
        userMgmtPanel.setLayout(userMgmtPanelLayout);
        userMgmtPanelLayout.setHorizontalGroup(
            userMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userMgmtPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userMgmtPanelLayout.setVerticalGroup(
            userMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userMgmtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        viewHousesJpanel1.setBackground(new java.awt.Color(102, 102, 102));
        viewHousesJpanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewHousesJpanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewHousesJpanel1MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("View House");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout viewHousesJpanel1Layout = new javax.swing.GroupLayout(viewHousesJpanel1);
        viewHousesJpanel1.setLayout(viewHousesJpanel1Layout);
        viewHousesJpanel1Layout.setHorizontalGroup(
            viewHousesJpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewHousesJpanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewHousesJpanel1Layout.setVerticalGroup(
            viewHousesJpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewHousesJpanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createCitizenjPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewCitizenjPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(updateCitizenjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(registerHousesJpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(userMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewHousesJpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(createCitizenjPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(viewCitizenjPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(updateCitizenjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(registerHousesJpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(viewHousesJpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(userMgmtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 170, 710));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));

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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(passwordjLabel14)
                            .addGap(68, 68, 68)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(usernamejLabel4)
                                .addGap(68, 68, 68)
                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                            .addGap(174, 174, 174)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(ssnjLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ssnField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                            .addComponent(phonejLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                            .addComponent(birthDatejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(23, 23, 23)))
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(citizenBirthChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(phoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(NamejLabel)
                            .addGap(68, 68, 68)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(saveUserButton))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel13)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(backButton)
                .addGap(45, 45, 45)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NamejLabel))
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernamejLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordjLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssnjLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonejLabel16))
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        createUserJPanelLayout.setVerticalGroup(
            createUserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", createUserJPanel);

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));

        BirthDatejLabel10.setForeground(new java.awt.Color(255, 255, 255));
        BirthDatejLabel10.setText("Birth Date");

        ssnField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnField1ActionPerformed(evt);
            }
        });

        backButton1.setText("Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        ssnjLabel12.setForeground(new java.awt.Color(255, 255, 255));
        ssnjLabel12.setText("SSN");

        namejLabel13.setForeground(new java.awt.Color(255, 255, 255));
        namejLabel13.setText("Name");

        viewButton1.setText("View");
        viewButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButton1ActionPerformed(evt);
            }
        });

        birthDatejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthDatejTextField1ActionPerformed(evt);
            }
        });

        citizensInInfoTable2.setBackground(new java.awt.Color(51, 51, 51));
        citizensInInfoTable2.setForeground(new java.awt.Color(255, 255, 255));
        citizensInInfoTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(citizensInInfoTable2);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone");

        usernamejLabel15.setForeground(new java.awt.Color(255, 255, 255));
        usernamejLabel15.setText("Username");

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("VIEW CITIZEN");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 78, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(viewButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ssnjLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernamejLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namejLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BirthDatejLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usernameField1)
                                .addComponent(phoneJField3)
                                .addComponent(birthDatejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameField3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ssnField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backButton1))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel14)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namejLabel13))
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ssnField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ssnjLabel12))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(phoneJField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthDatejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BirthDatejLabel10)))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usernameField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usernamejLabel15)))
                .addGap(59, 59, 59)
                .addComponent(viewButton1)
                .addGap(81, 81, 81))
        );

        citizensInHousingTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "SSN", "Phone"
            }
        ));
        jScrollPane2.setViewportView(citizensInHousingTable1);

        javax.swing.GroupLayout viewJPanelLayout = new javax.swing.GroupLayout(viewJPanel);
        viewJPanel.setLayout(viewJPanelLayout);
        viewJPanelLayout.setHorizontalGroup(
            viewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(viewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewJPanelLayout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(83, Short.MAX_VALUE)))
        );
        viewJPanelLayout.setVerticalGroup(
            viewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(viewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewJPanelLayout.createSequentialGroup()
                    .addGap(278, 278, 278)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(279, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab2", viewJPanel);

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));

        backButton2.setText("Back");
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });

        ssnjLabel13.setForeground(new java.awt.Color(255, 255, 255));
        ssnjLabel13.setText("SSN");

        usernamejLabel14.setForeground(new java.awt.Color(255, 255, 255));
        usernamejLabel14.setText("Name");

        saveButton2.setText("Update");
        saveButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton2ActionPerformed(evt);
            }
        });

        citizensInInfoTable5.setBackground(new java.awt.Color(51, 51, 51));
        citizensInInfoTable5.setForeground(new java.awt.Color(255, 255, 255));
        citizensInInfoTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(citizensInInfoTable5);

        viewButton2.setText("View");
        viewButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButton2ActionPerformed(evt);
            }
        });

        usernamejLabel16.setForeground(new java.awt.Color(255, 255, 255));
        usernamejLabel16.setText("Username");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phone");

        BirthDatejLabel11.setForeground(new java.awt.Color(255, 255, 255));
        BirthDatejLabel11.setText("Birth Date");

        birthDatejTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        birthDatejTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthDatejTextField2ActionPerformed(evt);
            }
        });

        phonejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonejTextField1ActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password");

        deletejButton2.setText("Delete");
        deletejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButton2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("UPDATE CITIZEN");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(backButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(0, 80, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(viewButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(phonejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addGap(172, 172, 172)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                            .addComponent(usernamejLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(68, 68, 68))
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                            .addComponent(ssnjLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(77, 77, 77))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(usernamejLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(BirthDatejLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(birthDatejTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(usernameField2)
                                .addComponent(usernameField3)
                                .addComponent(ssnjTextField1)
                                .addComponent(passjTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(saveButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(deletejButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton2)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernamejLabel14))
                .addGap(41, 41, 41)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssnjLabel13)
                    .addComponent(ssnjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernamejLabel16))
                .addGap(27, 27, 27)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(27, 27, 27)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(passjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthDatejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BirthDatejLabel11))
                .addGap(40, 40, 40)
                .addComponent(viewButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton2)
                    .addComponent(deletejButton2))
                .addGap(55, 55, 55))
        );

        citizensInInfoTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(citizensInInfoTable4);

        javax.swing.GroupLayout updateJPanelLayout = new javax.swing.GroupLayout(updateJPanel);
        updateJPanel.setLayout(updateJPanelLayout);
        updateJPanelLayout.setHorizontalGroup(
            updateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(updateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateJPanelLayout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(106, Short.MAX_VALUE)))
        );
        updateJPanelLayout.setVerticalGroup(
            updateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(updateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateJPanelLayout.createSequentialGroup()
                    .addGap(278, 278, 278)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(279, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab3", updateJPanel);

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
        jLabel16.setText("UPDATE CITIZEN");

        javax.swing.GroupLayout createHousejPanelLayout = new javax.swing.GroupLayout(createHousejPanel);
        createHousejPanel.setLayout(createHousejPanelLayout);
        createHousejPanelLayout.setHorizontalGroup(
            createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(saveHousingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createHousejPanelLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createHousejPanelLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createHousejPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        createHousejPanelLayout.setVerticalGroup(
            createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createHousejPanelLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createHousejPanelLayout.createSequentialGroup()
                        .addGroup(createHousejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createHousejPanelLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
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

        jTabbedPane1.addTab("tab4", createHousejPanel);

        viewHousingjPanel4.setBackground(new java.awt.Color(51, 51, 51));

        citizensInHousingTable2.setBackground(new java.awt.Color(51, 51, 51));
        citizensInHousingTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(citizensInHousingTable2);

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
                .addContainerGap(436, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", viewHousingjPanel4);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        staffTable.setBackground(new java.awt.Color(51, 51, 51));
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

        jLabel20.setText("Username");

        jLabel22.setText("Password");

        jLabel25.setText("Title");

        jLabel26.setText("Phone");

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
                .addContainerGap(194, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 630, 740));

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
            
            
            
            
            //update db
           
        
        
            
            populateCitizenHousingTable();
            jTabbedPane1.setSelectedIndex(4);
            
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

    private void createCitizenjPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createCitizenjPanel4MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_createCitizenjPanel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void viewCitizenjPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCitizenjPanel5MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);    
    }//GEN-LAST:event_viewCitizenjPanel5MouseClicked

    private void updateCitizenjPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateCitizenjPanelMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2); 
    }//GEN-LAST:event_updateCitizenjPanelMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void registerHousesJpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerHousesJpanelMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_registerHousesJpanelMouseClicked

    private void saveUserButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveUserButtonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveUserButtonMousePressed

    private void saveUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUserButtonActionPerformed
        // TODO add your handling code here:
         // Create citizen info
        String _name = nameField.getText();
        String _ssn = ssnField.getText();
        LocalDate _birthDate = citizenBirthChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
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
        mockCitizenUserList.add(newUser);
        // refresh table
        populateCitizenInfoTable();
        populateCitizenInfoUpdateTable();
        populateCitizenInfoToHouseTable();
        // navigate to new page
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_saveUserButtonActionPerformed

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_backButton2ActionPerformed

    private void saveButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton2ActionPerformed
        int tableSize = citizensInInfoTable5.getRowCount();
         int selectedRow = citizensInInfoTable5.getSelectedRow();
         if (selectedRow >= 0 || selectedRow < tableSize) {
            User userInfo = (User) citizensInInfoTable5.getValueAt(selectedRow, 0);
            CitizenInfo citizen = userInfo.getCitizenInfo();
            String _name = usernameField2.getText();
            String _ssn = ssnjTextField1.getText();
            String _phone = phonejTextField1.getText();
            String _username = usernameField3.getText();
            String _password = passjTextField1.getText();
            
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
        populateCitizenInfoTable();
        populateCitizenInfoUpdateTable();
        populateCitizenInfoToHouseTable();
        // navigate to new page
        jTabbedPane1.setSelectedIndex(1);  
         }
    }//GEN-LAST:event_saveButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel1MousePressed

    private void createCitizenjPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createCitizenjPanel4MousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_createCitizenjPanel4MousePressed

    private void viewCitizenjPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCitizenjPanel5MousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_viewCitizenjPanel5MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel2MousePressed

    private void updateCitizenjPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateCitizenjPanelMousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_updateCitizenjPanelMousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel3MousePressed

    private void registerHousesJpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerHousesJpanelMousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_registerHousesJpanelMousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel5MousePressed

    private void userMgmtPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMgmtPanelMousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_userMgmtPanelMousePressed

    private void jLabel19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jLabel19MousePressed

    private void userMgmtPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMgmtPanelMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_userMgmtPanelMouseClicked

    private void birthDatejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthDatejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthDatejTextField1ActionPerformed

    private void viewButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButton1ActionPerformed
        // TODO add your handling code here:
        int tableSize = citizensInInfoTable2.getRowCount();
        int selectedRow = citizensInInfoTable2.getSelectedRow();
        if (selectedRow >= 0 || selectedRow < tableSize) {
            DefaultTableModel modelinfo= (DefaultTableModel)citizensInInfoTable2.getModel();
            usernameField1.setText( modelinfo.getValueAt(selectedRow, 0).toString());
            nameField3.setText( modelinfo.getValueAt(selectedRow, 1).toString());
            ssnField1.setText( modelinfo.getValueAt(selectedRow, 2).toString());
            phoneJField3.setText( modelinfo.getValueAt(selectedRow, 3).toString());
            birthDatejTextField1.setText(modelinfo.getValueAt(selectedRow, 4).toString());
        }
    }//GEN-LAST:event_viewButton1ActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void ssnField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssnField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssnField1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MousePressed

    private void viewHousesJpanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewHousesJpanel1MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_viewHousesJpanel1MouseClicked

    private void viewHousesJpanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewHousesJpanel1MousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_viewHousesJpanel1MousePressed

    private void viewButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButton2ActionPerformed
        // TODO add your handling code here:
        int tableSize = citizensInInfoTable5.getRowCount();
        int selectedRow = citizensInInfoTable5.getSelectedRow();
        if (selectedRow >= 0 || selectedRow < tableSize) {
            DefaultTableModel modelinfo= (DefaultTableModel)citizensInInfoTable5.getModel();
            usernameField3.setText( modelinfo.getValueAt(selectedRow, 0).toString());
            usernameField2.setText( modelinfo.getValueAt(selectedRow, 1).toString());
            ssnjTextField1.setText( modelinfo.getValueAt(selectedRow, 2).toString());
            phonejTextField1.setText( modelinfo.getValueAt(selectedRow, 3).toString());
            birthDatejTextField2.setText(modelinfo.getValueAt(selectedRow, 4).toString());
            passjTextField1.setText(modelinfo.getValueAt(selectedRow, 5).toString());
        }
        
    }//GEN-LAST:event_viewButton2ActionPerformed

    private void birthDatejTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthDatejTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthDatejTextField2ActionPerformed

    private void phonejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonejTextField1ActionPerformed

    private void deletejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButton2ActionPerformed
        // TODO add your handling code here:
        int tableSize = citizensInInfoTable5.getRowCount();
        int selectedRow = citizensInInfoTable5.getSelectedRow();
        if (selectedRow >= 0 || selectedRow < tableSize) {
            DefaultTableModel modelinfo= (DefaultTableModel)citizensInInfoTable5.getModel();
            User userInfo = (User) citizensInInfoTable5.getValueAt(selectedRow, 0);
            mockCitizenUserList.remove(userInfo);
        }
        
        populateCitizenInfoTable();
        populateCitizenInfoUpdateTable();
        populateCitizenInfoToHouseTable();
        // navigate to new page
        jTabbedPane1.setSelectedIndex(1);
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
            JOptionPane.showMessageDialog(this, MessageFormat.format("{0} Successfully Updated!", _name));
    }//GEN-LAST:event_updateStaffButtonActionPerformed
   
    }
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
    private javax.swing.JLabel BirthDatejLabel10;
    private javax.swing.JLabel BirthDatejLabel11;
    private javax.swing.JLabel NamejLabel;
    private javax.swing.JTextField addressL1Field;
    private javax.swing.JTextField addressL1Field1;
    private javax.swing.JComboBox<String> areaDropdown;
    private javax.swing.JButton backButton;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton backButton2;
    private javax.swing.JLabel birthDatejLabel;
    private javax.swing.JTextField birthDatejTextField1;
    private javax.swing.JTextField birthDatejTextField2;
    private com.toedter.calendar.JDateChooser citizenBirthChooser;
    private javax.swing.JTable citizensInHousingTable1;
    private javax.swing.JTable citizensInHousingTable2;
    private javax.swing.JTable citizensInInfoTable2;
    private javax.swing.JTable citizensInInfoTable3;
    private javax.swing.JTable citizensInInfoTable4;
    private javax.swing.JTable citizensInInfoTable5;
    private javax.swing.JPanel createCitizenjPanel4;
    private javax.swing.JPanel createHousejPanel;
    private javax.swing.JPanel createUserJPanel;
    private javax.swing.JButton deletejButton2;
    private javax.swing.JTextField editStaffName;
    private javax.swing.JPasswordField editStaffPassword;
    private javax.swing.JTextField editStaffPhone;
    private javax.swing.JTextField editStaffTitle;
    private javax.swing.JTextField editStaffUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel manageStaffPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nameField3;
    private javax.swing.JLabel namejLabel13;
    private javax.swing.JTextField passjTextField1;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordjLabel14;
    private javax.swing.JTextField phoneField;
    private javax.swing.JPasswordField phoneJField3;
    private javax.swing.JLabel phonejLabel16;
    private javax.swing.JTextField phonejTextField1;
    private javax.swing.JPanel registerHousesJpanel;
    private javax.swing.JButton saveButton2;
    private javax.swing.JButton saveHousingButton;
    private javax.swing.JButton saveUserButton;
    private javax.swing.JTextField ssnField;
    private javax.swing.JPasswordField ssnField1;
    private javax.swing.JLabel ssnjLabel12;
    private javax.swing.JLabel ssnjLabel13;
    private javax.swing.JLabel ssnjLabel15;
    private javax.swing.JTextField ssnjTextField1;
    private javax.swing.JTable staffTable;
    private javax.swing.JPanel updateCitizenjPanel;
    private javax.swing.JPanel updateJPanel;
    private javax.swing.JButton updateStaffButton;
    private javax.swing.JPanel userMgmtPanel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTextField usernameField1;
    private javax.swing.JTextField usernameField2;
    private javax.swing.JTextField usernameField3;
    private javax.swing.JLabel usernamejLabel14;
    private javax.swing.JLabel usernamejLabel15;
    private javax.swing.JLabel usernamejLabel16;
    private javax.swing.JLabel usernamejLabel4;
    private javax.swing.JButton viewButton1;
    private javax.swing.JButton viewButton2;
    private javax.swing.JPanel viewCitizenjPanel5;
    private javax.swing.JPanel viewHousesJpanel1;
    private javax.swing.JPanel viewHousingjPanel4;
    private javax.swing.JPanel viewJPanel;
    // End of variables declaration//GEN-END:variables
}
