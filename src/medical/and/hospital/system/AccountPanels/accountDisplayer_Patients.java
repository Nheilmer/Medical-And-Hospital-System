package medical.and.hospital.system.AccountPanels;

import Components.fileHandling;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import medical.and.hospital.system.Popups.EditPersonalDetails_jdlg;
import medical.and.hospital.system.UserDashboard;

public class accountDisplayer_Patients extends javax.swing.JPanel {
    
    public String AccountID;
    public String AccountType;
    ArrayList<String> Datas;
    public Patients ps;
    
    public accountDisplayer_Patients(int accountID) {
        this.AccountID = String.valueOf(accountID);
        this.AccountType = fileHandling.getReferencedFile(fileHandling.accountREF);
        Datas = fileHandling.getAccountDetailsByID(AccountType, AccountID);
        initComponents();
    }

    public void setDetails(int accountNum, String Name) {
        num_lbl.setText(String.valueOf(accountNum));
        name_txtfld.setText(Name);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name_txtfld = new javax.swing.JTextField();
        num_lbl = new javax.swing.JLabel();
        checkRecord_btn = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        remove_btn = new javax.swing.JButton();

        setOpaque(false);

        name_txtfld.setBackground(new java.awt.Color(230, 230, 230));
        name_txtfld.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name_txtfld.setForeground(new java.awt.Color(0, 0, 0));
        name_txtfld.setText("jTextField2");

        num_lbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        num_lbl.setForeground(new java.awt.Color(0, 0, 0));
        num_lbl.setText("1");

        checkRecord_btn.setBackground(new java.awt.Color(72, 189, 94));
        checkRecord_btn.setForeground(new java.awt.Color(255, 255, 255));
        checkRecord_btn.setText("Check Record");
        checkRecord_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRecord_btnActionPerformed(evt);
            }
        });

        edit_btn.setBackground(new java.awt.Color(45, 104, 255));
        edit_btn.setForeground(new java.awt.Color(255, 255, 255));
        edit_btn.setText("Edit");
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        remove_btn.setBackground(new java.awt.Color(255, 0, 0));
        remove_btn.setForeground(new java.awt.Color(255, 255, 255));
        remove_btn.setText("Remove");
        remove_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(num_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_txtfld, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkRecord_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remove_btn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(edit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name_txtfld, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(num_lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remove_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkRecord_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        java.awt.Frame parent = (java.awt.Frame) javax.swing.SwingUtilities.getWindowAncestor(this);
        EditPersonalDetails_jdlg dialog = new EditPersonalDetails_jdlg(parent, true);
        this.AccountType = fileHandling.getReferencedFile(fileHandling.accountREF);
        
        Datas = fileHandling.getAccountDetailsByID(AccountType, AccountID);
        
        if (Datas != null) {
            dialog.id_txtfld.setText(Datas.get(0));
            dialog.nametxt.setText(Datas.get(1));
            dialog.password_txtfld.setText(Datas.get(2));
            dialog.agetxt.setText(Datas.get(3));
            dialog.gendertxt.setText(Datas.get(4));
            dialog.contacttxt.setText(Datas.get(5));
        }
        
        dialog.savebtn.addActionListener((e) -> {
            String ID = dialog.id_txtfld.getText();
            String Name = dialog.nametxt.getText();
            String Password = dialog.password_txtfld.getText();
            String Age = dialog.agetxt.getText();
            String Gender = dialog.gendertxt.getText();
            String Contact = dialog.contacttxt.getText();
            
            fileHandling.updatePatientAccountById(AccountType, AccountID, ID, Name, Password, Age, Gender, Contact);
            fileHandling.ResetAccountIDs(AccountType);
            dialog.ResetValues();
            ps.refresh();
            JOptionPane.showMessageDialog(this, "Account Updated successfully.");
        });
        
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_edit_btnActionPerformed

    private void remove_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_btnActionPerformed
        String accountName = name_txtfld.getText();
        fileHandling.removePatient(AccountType, AccountID, accountName);
        fileHandling.ResetAccountIDs(AccountType);
        ps.refresh();
        JOptionPane.showMessageDialog(this, "Patient Removed successfully.");
    }//GEN-LAST:event_remove_btnActionPerformed
    
    public boolean doesRedirect = true;
    private void checkRecord_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRecord_btnActionPerformed
        if (doesRedirect) {
            String checkIfEmpty = fileHandling.getReferencedFile(fileHandling.selectedPatientID);

            if (checkIfEmpty != null) {
                UserDashboard ad = new UserDashboard();
                ad.adminDashboard_btn.addActionListener((e) -> {
                    fileHandling.resetSelectedUser();
                    fileHandling.saveToReference(fileHandling.selectedUserType, "ADMIN");
                    fileHandling.saveToReference(fileHandling.selectedPatientName, "Admin");
                    ad.dispose();
                });
                ad.ps = this.ps;
                ad.logout_btn.setVisible(false);
                ad.restart_btn.setVisible(false);
                ad.selectPatient_btn.setVisible(false);
                ad.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Select a patient first!");
            }
        } else {
            fileHandling.saveToReference(fileHandling.selectedUserType, fileHandling.getReferencedFile(fileHandling.selectedUserType));
            fileHandling.saveToReference(fileHandling.selectedPatientName, name_txtfld.getText());
        }
    }//GEN-LAST:event_checkRecord_btnActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton checkRecord_btn;
    public javax.swing.JButton edit_btn;
    public javax.swing.JTextField name_txtfld;
    public javax.swing.JLabel num_lbl;
    public javax.swing.JButton remove_btn;
    // End of variables declaration//GEN-END:variables
}
