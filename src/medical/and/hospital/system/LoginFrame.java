package medical.and.hospital.system;

import Components.fileHandling;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {

    ArrayList<String> NurseNames = new ArrayList<>();
    ArrayList<String> NursePasswords = new ArrayList<>();
    
    ArrayList<String> DoctorsNames = new ArrayList<>();
    ArrayList<String> DoctorsPasswords = new ArrayList<>();
    
    ArrayList<String> PatientsNames = new ArrayList<>();
    ArrayList<String> PatientsPasswords = new ArrayList<>();
    
    public LoginFrame() {
        initComponents();
        
        fileHandling.extractNamesAndPassInfo("DoctorAccounts.txt", DoctorsNames, DoctorsPasswords);
        fileHandling.extractNamesAndPassInfo("NursesAccounts.txt", NurseNames, NursePasswords);
        fileHandling.extractNamesAndPassInfo("PatientsAccounts.txt", PatientsNames, PatientsPasswords);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel3 = new Components.panel();
        panel4 = new Components.panel();
        label1 = new Components.label();
        label2 = new Components.label();
        username_txtfld = new Components.textfield();
        password_psfld = new Components.passwordfield();
        login_btn = new Components.button();
        lineDrawer1 = new Components.LineDrawer();
        userType_cmbx = new javax.swing.JComboBox<>();
        label4 = new Components.label();
        imageRenderer1 = new Components.ImageRenderer();
        label3 = new Components.label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        label1.setText("Username");

        label2.setText("Password");

        login_btn.setText("Login");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        userType_cmbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Doctor", "Nurse", "Admin" }));

        label4.setText("What user are you?");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineDrawer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_txtfld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password_psfld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userType_cmbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addComponent(lineDrawer1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_psfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userType_cmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        imageRenderer1.setAA_drawImage(true);
        imageRenderer1.setAA_img(new javax.swing.ImageIcon(getClass().getResource("/medical/and/hospital/system/Logo Hospital-modified.png"))); // NOI18N

        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("<html> <b>Medical & Hospital \nSystem<b> <html/>");
        label3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addComponent(imageRenderer1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(74, 74, 74))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageRenderer1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int userID = 0;
        
    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        String userName = username_txtfld.getText();
        String password = String.valueOf(password_psfld.getPassword());
        String userType = String.valueOf(userType_cmbx.getSelectedItem());
        
        System.out.println(userType);
        if (userType.equals("Admin")) {
            checkAdmin(userName, password,
            String.valueOf(userID), userName, "ADMIN", fileHandling.doctor);
        }
        else if (userType.equals("Patient")) {
            checkEntries(
                    userName, password, PatientsNames, PatientsPasswords,
                    String.valueOf(userID), userName, "Patient", fileHandling.patients
            );
        }
        else if (userType.equals("Doctor")) {
            checkEntries(
                    userName, password, DoctorsNames, DoctorsPasswords,
                    String.valueOf(userID), userName, "Doctor", fileHandling.doctor
            );
        }
        else if (userType.equals("Nurse")) {
            checkEntries(
                    userName, password, NurseNames, NursePasswords,
                    String.valueOf(userID), userName, "Nurse", fileHandling.doctor
            );
        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        fileHandling.resetSelectedUser();
    }//GEN-LAST:event_formWindowClosing
    
    private void checkEntries(String userName, String password, ArrayList<String> names, ArrayList<String> passwords,
            String UserID, String UserName, String UserType, String UserFileLocation) {
        int entryValidation1 = 0;
        int entryValidation2 = 0;
        for (int id = 0; id < names.size(); id++) {
            userID = id;
            if (userName.equals(names.get(id))) {
                entryValidation1 = 1;
            }

            if (password.equals(passwords.get(id))) {
                entryValidation2 = 1;
            }
        }

        if (entryValidation1 == 1 && entryValidation2 == 1) {
            JOptionPane.showMessageDialog(this, "Allowed Entry");
            
            fileHandling.saveToReference(fileHandling.selectedPatientID, String.valueOf(names.indexOf(UserName)+1));
            fileHandling.saveToReference(fileHandling.selectedPatientName, UserName);
            fileHandling.saveToReference(fileHandling.selectedUserType, UserType);
            fileHandling.saveToReference(fileHandling.accountREF, UserFileLocation);
            
            UserDashboard ads = new UserDashboard();
            ads.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Entry");
        }
    }
    
    private void checkAdmin(String userName, String password, 
            String UserID, String UserName, String UserType, String UserFileLocation) {
        int entryValidation = 0;
        if (userName.equals("Admin")) {
            entryValidation = 0;
        } else {
            entryValidation = 1;
        }

        if (password.equals("123")) {
            entryValidation = 0;
        } else {
            entryValidation = 1;
        }

        if (entryValidation == 0) {
            JOptionPane.showMessageDialog(this, "Login Successfull");
            
            fileHandling.saveToReference(fileHandling.selectedPatientID, String.valueOf(1));
            fileHandling.saveToReference(fileHandling.selectedPatientName, UserName);
            fileHandling.saveToReference(fileHandling.selectedUserType, UserType);
            fileHandling.saveToReference(fileHandling.accountREF, UserFileLocation);
            
            AdminDashboard ad = new AdminDashboard();
            ad.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Entry");
        }
            
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.ImageRenderer imageRenderer1;
    private Components.label label1;
    private Components.label label2;
    private Components.label label3;
    private Components.label label4;
    private Components.LineDrawer lineDrawer1;
    private Components.button login_btn;
    private Components.panel panel3;
    private Components.panel panel4;
    private Components.passwordfield password_psfld;
    private javax.swing.JComboBox<String> userType_cmbx;
    private Components.textfield username_txtfld;
    // End of variables declaration//GEN-END:variables
}
