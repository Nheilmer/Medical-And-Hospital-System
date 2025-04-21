package medical.and.hospital.system.AccountPanels;

import Components.fileHandling;
import static Components.initializer.getAllPatientIds;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;

public class PatientsView extends javax.swing.JPanel {

    public JPanel contentPanel;
    ArrayList<String> PatientNames = new ArrayList<>();
    
    public PatientsView() {
        initComponents();
        addAccount.setVisible(false);
        contentPanel = new JPanel();
        contentPanel.setLayout(new MigLayout("wrap 1, fillx", "[grow]"));
        contentPanel.setBackground(new java.awt.Color(230, 230, 230));
        refresh();
    }

    public void refresh() {
        contentPanel.removeAll();
        PatientNames.clear();
        fileHandling.extractNamesOnly(fileHandling.patients, PatientNames);
        displayAccounts_Patients(contentPanel, PatientNames, jScrollPane1, fileHandling.patients);
            
        repaint();
        revalidate();
    }
    
    public void displayAccounts_Patients(JPanel contentPanel, ArrayList<String> DoctorNames, JScrollPane ScrollPane1, String accType) {
        ArrayList<Integer> id = getAllPatientIds(accType);
        
        for (int i = 0; i < DoctorNames.size(); i++) {
            accountDisplayer_Patients ad = new accountDisplayer_Patients((i+1));
            
            ad.doesRedirect = false;
            ad.edit_btn.setVisible(false);
            ad.remove_btn.setVisible(false);
            
            int ia = i;
            ad.checkRecord_btn.addActionListener((e) -> {
                fileHandling.saveToReference(fileHandling.selectedPatientID, ad.num_lbl.getText());
                fileHandling.saveToReference(fileHandling.selectedPatientName, ad.name_txtfld.getText());
            });
            
            ad.AccountType = accType;
            ad.AccountID = String.valueOf(id.get(i));
            ad.setDetails((i+1), DoctorNames.get(i));
            ad.repaint();
            ad.revalidate();
            ad.setVisible(true);
            contentPanel.add(ad, "growx");
        }
        ScrollPane1.setViewportView(contentPanel);
        ScrollPane1.repaint();
        ScrollPane1.revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addAccount = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        setOpaque(false);

        jScrollPane1.setBackground(new java.awt.Color(230, 230, 230));
        jScrollPane1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PATIENT");

        addAccount.setText("Add Account");
        addAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAccountActionPerformed(evt);
            }
        });

        refresh.setText("Resfresh");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refresh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAccountActionPerformed
        java.awt.Frame parent = (java.awt.Frame) javax.swing.SwingUtilities.getWindowAncestor(this);
        medical.and.hospital.system.Popups.CreateAccount_Patients_jdlg dialog = new medical.and.hospital.system.Popups.CreateAccount_Patients_jdlg(parent, true);
        dialog.save_btn.addActionListener((e) -> {
            
            String id = dialog.id_txtfld.getText();
            String name = dialog.name_txtfld.getText();
            String password = dialog.password_txtfld.getText();
            String age = dialog.age_txtfld.getText();
            String gender = dialog.gender_txtfld.getText();
            String contact = dialog.contact_txtfld.getText();
            
            fileHandling.registerPatient(fileHandling.patients, id, name, password, age, gender, contact);
            dialog.dispose();
            JOptionPane.showMessageDialog(this, "Patient registered.");
            fileHandling.ResetAccountIDs(fileHandling.patients);
            refresh();
        });
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_addAccountActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
