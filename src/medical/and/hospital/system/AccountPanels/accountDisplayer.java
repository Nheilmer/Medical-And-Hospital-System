package medical.and.hospital.system.AccountPanels;

import Components.fileHandling;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class accountDisplayer extends javax.swing.JPanel {

    String AccountID;
    String AccountType;
    ArrayList<String> Datas;
    public Patients ps;
    public Nurses ns;
    public Doctors ds;
    
    public accountDisplayer(int accountID) {
        this.AccountID = String.valueOf(accountID);
        this.AccountType = fileHandling.getReferencedFile(fileHandling.accountREF);
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
        remove_btn = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();

        setOpaque(false);

        name_txtfld.setBackground(new java.awt.Color(230, 230, 230));
        name_txtfld.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name_txtfld.setForeground(new java.awt.Color(0, 0, 0));
        name_txtfld.setText("jTextField2");

        num_lbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        num_lbl.setForeground(new java.awt.Color(0, 0, 0));
        num_lbl.setText("1.");

        remove_btn.setBackground(new java.awt.Color(255, 0, 0));
        remove_btn.setForeground(new java.awt.Color(255, 255, 255));
        remove_btn.setText("Remove");
        remove_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_btnActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(num_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_txtfld, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(name_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(num_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(edit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remove_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        java.awt.Frame parent = (java.awt.Frame) javax.swing.SwingUtilities.getWindowAncestor(this);
        medical.and.hospital.system.Popups.EditAccount_jdlg dialog = new medical.and.hospital.system.Popups.EditAccount_jdlg(parent, true);

        if (Datas == null) {
            this.AccountType = fileHandling.getReferencedFile(fileHandling.accountREF);
            Datas = fileHandling.getAccountDetailsByID(AccountType, AccountID);
        }
        
        if (Datas != null) {
            dialog.idText.setText(Datas.get(0));
            dialog.nametxt.setText(Datas.get(1));
            dialog.passwordtxt.setText(Datas.get(2));
        }
        
        dialog.savebtn.addActionListener((e) -> {
            String ID = dialog.idText.getText();
            String Name = dialog.nametxt.getText();
            String Password = dialog.passwordtxt.getText();
            fileHandling.updateAccountById(fileHandling.getReferencedFile(fileHandling.accountREF), AccountID, ID, Name, Password);
            fileHandling.ResetAccountIDs(AccountType);
            dialog.ResetValues();
            if (ps != null) {
                ps.refresh();
            }
            if (ns != null) {
                ns.refresh();
            }
            if (ds != null) {
                ds.refresh();
            }
            JOptionPane.showMessageDialog(this, "Account Updated successfully.");
        });
        
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_edit_btnActionPerformed

    private void remove_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_btnActionPerformed
        String accountName = name_txtfld.getText();
        fileHandling.removeDoctorOrNurse(AccountType, AccountID, accountName);
        fileHandling.ResetAccountIDs(AccountType);
        if (ps != null) {
            ps.refresh();
        }
        if (ns != null) {
            ns.refresh();
        }
        if (ds != null) {
            ds.refresh();
        }
        JOptionPane.showMessageDialog(this, "Account Removed successfully.");
    }//GEN-LAST:event_remove_btnActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton edit_btn;
    private javax.swing.JTextField name_txtfld;
    private javax.swing.JLabel num_lbl;
    public javax.swing.JButton remove_btn;
    // End of variables declaration//GEN-END:variables
}
