/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pages.Utility;

import Models.Utility.MaintenanceRequest;
import Models.Utility.MaintenanceRequestDirectory;
import Models.Utility.MaintenanceStaff;
import Models.Utility.MaintenanceStaffDirectory;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thomaskojoaddaquay
 */
public class UtilityManager extends javax.swing.JFrame {
 ArrayList<MaintenanceRequest> allRequests= new MaintenanceRequestDirectory().getRequests();
 ArrayList<MaintenanceStaff> allStaff = new MaintenanceStaffDirectory().getStaff();
    /**
     * Creates new form UtilityManager
     */
    public UtilityManager() {
        initComponents();
        populateRequestsTable();
        populateStaffTable();
        setStaffDropDownOptions();
        hideRequestUpdatePanel();
    }
       public void populateRequestsTable() {
        DefaultTableModel model = (DefaultTableModel) requestsTable.getModel();
        model.setRowCount(0);
         System.out.println("Active request:");
                for (MaintenanceRequest request : allRequests)  {
                    Object[] row = new Object[6];
                        row[0] = request;
                        row[1] = request.date;
                        row[2] = request.type;
                        row[3] = request.description;
                        row[4] = request.assignedTo.name;
                        row[5] = request.status;
                        
                        model.addRow(row);
                }
    }
    
    public void populateStaffTable() {
        DefaultTableModel model = (DefaultTableModel) staffTable.getModel();
        model.setRowCount(0);
         System.out.println("Active staff:");
                for (MaintenanceStaff staff : allStaff)  {
                    Object[] row = new Object[4];
                        row[0] = staff.name;
                        row[1] = staff.title;
                        row[2] = staff.phone;
                        row[3] = staff.years.toString();
                        model.addRow(row);
                }
    }
         public void setStaffDropDownOptions(){
         dropDownStaff.setModel(new DefaultComboBoxModel(_getStaffNames()));
         }
         
         public String[] _getStaffNames() {
            ArrayList<String> names = new ArrayList<String>();
         for (MaintenanceStaff staff: allStaff) {
              names.add("Unassigned");
             names.add(staff.name);
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
        jLabel4 = new javax.swing.JLabel();
        menuBarPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        utilityHomePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestsTable = new javax.swing.JTable();
        requestDetailsPanel = new javax.swing.JPanel();
        saveReqeustButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        dropDownStaff = new javax.swing.JComboBox<>();
        dropDownStatus = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBarPanel.setBackground(new java.awt.Color(51, 102, 0));
        sideBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestsTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestsTabMouseClicked(evt);
            }
        });

        jLabel2.setText("Requests");

        javax.swing.GroupLayout requestsTabLayout = new javax.swing.GroupLayout(requestsTab);
        requestsTab.setLayout(requestsTabLayout);
        requestsTabLayout.setHorizontalGroup(
            requestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestsTabLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        requestsTabLayout.setVerticalGroup(
            requestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        sideBarPanel.add(requestsTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 140, -1));

        staffTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffTabMouseClicked(evt);
            }
        });

        jLabel3.setText("Staff");

        javax.swing.GroupLayout staffTabLayout = new javax.swing.GroupLayout(staffTab);
        staffTab.setLayout(staffTabLayout);
        staffTabLayout.setHorizontalGroup(
            staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffTabLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        staffTabLayout.setVerticalGroup(
            staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        sideBarPanel.add(staffTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 140, 40));

        jLabel4.setText("Welcome!");
        sideBarPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        pagePanel.add(sideBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 700));

        menuBarPanel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Utility Dashboard");

        javax.swing.GroupLayout menuBarPanelLayout = new javax.swing.GroupLayout(menuBarPanel);
        menuBarPanel.setLayout(menuBarPanelLayout);
        menuBarPanelLayout.setHorizontalGroup(
            menuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarPanelLayout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(jLabel1)
                .addContainerGap(345, Short.MAX_VALUE))
        );
        menuBarPanelLayout.setVerticalGroup(
            menuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        pagePanel.add(menuBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 760, 60));

        jLabel5.setText("Requests");

        requestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Meter #", "Date", "Type", "Description", "Assigned To", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(requestsTable);
        if (requestsTable.getColumnModel().getColumnCount() > 0) {
            requestsTable.getColumnModel().getColumn(0).setResizable(false);
            requestsTable.getColumnModel().getColumn(1).setResizable(false);
            requestsTable.getColumnModel().getColumn(2).setResizable(false);
            requestsTable.getColumnModel().getColumn(3).setResizable(false);
            requestsTable.getColumnModel().getColumn(4).setResizable(false);
            requestsTable.getColumnModel().getColumn(5).setResizable(false);
        }

        saveReqeustButton.setText("Save");

        jLabel7.setText("Maintenance Request");

        dropDownStaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dropDownStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unassigned", "In Progress", "Complete" }));

        jLabel8.setText("Assigned To");

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
                        .addGap(248, 248, 248)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(requestDetailsPanelLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(saveReqeustButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(saveReqeustButton)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout utilityHomePanelLayout = new javax.swing.GroupLayout(utilityHomePanel);
        utilityHomePanel.setLayout(utilityHomePanelLayout);
        utilityHomePanelLayout.setHorizontalGroup(
            utilityHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utilityHomePanelLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, utilityHomePanelLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(utilityHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(requestDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        utilityHomePanelLayout.setVerticalGroup(
            utilityHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utilityHomePanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(requestDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        tabbedPane.addTab("tab1", utilityHomePanel);

        jLabel6.setText("Staff");

        staffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Title", "Phone", "Years of Experience"
            }
        ));
        jScrollPane1.setViewportView(staffTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );

        tabbedPane.addTab("tab2", jPanel1);

        pagePanel.add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 760, 670));

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
        tabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_requestsTabMouseClicked

    private void staffTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffTabMouseClicked
        // TODO add your handling code here:
        tabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_staffTabMouseClicked

    private void requestsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestsTableMouseClicked
        // TODO add your handling code here:
        int tableSize = requestsTable.getRowCount();
         int selectedRow = requestsTable.getSelectedRow();
         System.out.println("Row");
         System.out.println(selectedRow);
         if (selectedRow >= 0 || selectedRow < tableSize) {
            MaintenanceRequest selectedRequest = (MaintenanceRequest) requestsTable.getValueAt(selectedRow, 0);
            dropDownStaff.setSelectedItem(selectedRequest.assignedTo.name);
            dropDownStatus.setSelectedItem(selectedRequest.status);
            showRequestUpdatePanel();
         }
    }//GEN-LAST:event_requestsTableMouseClicked

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
            java.util.logging.Logger.getLogger(UtilityManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UtilityManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UtilityManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UtilityManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UtilityManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dropDownStaff;
    private javax.swing.JComboBox<String> dropDownStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel menuBarPanel;
    private javax.swing.JPanel pagePanel;
    private javax.swing.JPanel requestDetailsPanel;
    private javax.swing.JPanel requestsTab;
    private javax.swing.JTable requestsTable;
    private javax.swing.JButton saveReqeustButton;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JPanel staffTab;
    private javax.swing.JTable staffTable;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JPanel utilityHomePanel;
    // End of variables declaration//GEN-END:variables
}