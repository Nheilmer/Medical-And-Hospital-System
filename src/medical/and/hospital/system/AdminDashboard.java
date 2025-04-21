package medical.and.hospital.system;

import Components.fileHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AdminDashboard extends javax.swing.JFrame {
    
    public AdminDashboard() {
        initComponents();
        fileHandling.ResetAccountIDs(fileHandling.doctor);
        fileHandling.ResetAccountIDs(fileHandling.nurse);
        fileHandling.ResetAccountIDs(fileHandling.patients);
        saveToReference(fileHandling.accountREF, fileHandling.doctor);
        
        doctors1.refresh.addActionListener((e) -> {
            doctors1.contentPanel.removeAll();
            doctors1.refresh();
            doctors1.contentPanel.repaint();
            doctors1.contentPanel.revalidate();
        });
        
        nurses1.refresh.addActionListener((e) -> {
            nurses1.contentPanel.removeAll();
            nurses1.refresh();
            nurses1.contentPanel.repaint();
            nurses1.contentPanel.revalidate();
        });
        
        patients1.refresh.addActionListener((e) -> {
            patients1.contentPanel.removeAll();
            patients1.refresh();
            patients1.contentPanel.repaint();
            patients1.contentPanel.revalidate();
        });
        
        jTabbedPane1.addChangeListener(e -> {
            if (jTabbedPane1.getSelectedComponent() == doctors1) {
                saveToReference(fileHandling.accountREF, fileHandling.doctor);
            } else if (jTabbedPane1.getSelectedComponent() == nurses1) {
                saveToReference(fileHandling.accountREF, fileHandling.nurse);
            } else if (jTabbedPane1.getSelectedComponent() == patients1) {
                saveToReference(fileHandling.accountREF, fileHandling.patients);
            }
        });
    }
    
    private void saveToReference(String file, String accountType) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(accountType);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        doctors1 = new medical.and.hospital.system.AccountPanels.Doctors();
        nurses1 = new medical.and.hospital.system.AccountPanels.Nurses();
        patients1 = new medical.and.hospital.system.AccountPanels.Patients();
        lineDrawer1 = new Components.LineDrawer();
        logout_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.white);

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Logged in as (Admin)");

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("Welcome, Admin!");

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.addTab("tab1", doctors1);
        jTabbedPane1.addTab("tab2", nurses1);
        jTabbedPane1.addTab("tab3", patients1);

        logout_btn.setBackground(new java.awt.Color(255, 0, 0));
        logout_btn.setForeground(new java.awt.Color(255, 255, 255));
        logout_btn.setText("Logout");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout_btn)
                .addContainerGap())
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
            .addComponent(lineDrawer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logout_btn)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lineDrawer1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        fileHandling.resetSelectedUser();
    }//GEN-LAST:event_formWindowClosing

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        fileHandling.resetSelectedUser();
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        dispose();
    }//GEN-LAST:event_logout_btnActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private medical.and.hospital.system.AccountPanels.Doctors doctors1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private Components.LineDrawer lineDrawer1;
    private javax.swing.JButton logout_btn;
    private medical.and.hospital.system.AccountPanels.Nurses nurses1;
    private medical.and.hospital.system.AccountPanels.Patients patients1;
    // End of variables declaration//GEN-END:variables
}
