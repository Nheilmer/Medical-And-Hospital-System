/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medical.and.hospital.system;

import Components.fileHandling;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import medical.and.hospital.system.AccountPanels.Patients;
import medical.and.hospital.system.Popups.Bookings;
import medical.and.hospital.system.Popups.EditPersonalDetails_jdlg;
import medical.and.hospital.system.Popups.MedicalHistory;
import medical.and.hospital.system.Popups.PatientList;
import medical.and.hospital.system.Popups.Prescriptions;

/**
 *
 * @author Carlo E. Aranez
 */
public class UserDashboard extends javax.swing.JFrame {
    String userType;
    String userName;
    String userID;
    
    public String AccountType;
    ArrayList<String> Datas;
    public Patients ps;
    
    public final void setUserGreet(String userType, String userName) {
        weclome_lbl.setText("Welcome, " + userName);
        loggedInAs_lbl.setText("Logged in as (" + userType + "):");
    }
    
    public UserDashboard() {
        initComponents();
        Start();
    }
    
    public final void Start() {
        this.userType = fileHandling.getReferencedFile(fileHandling.selectedUserType);
        this.userName = fileHandling.getReferencedFile(fileHandling.selectedPatientName);
        this.userID = fileHandling.getReferencedFile(fileHandling.selectedPatientID);
        Datas = fileHandling.getAccountDetailsByID(fileHandling.patients, userID);
        
        if (userType.equals("ADMIN")) {
            setUserGreet("ADMIN", userName);
            fileHandling.saveToReference(fileHandling.selectedUserType, "ADMIN");
        }
        if (userType.equals("Doctor")) {
            setUserGreet("Doctor", userName);
            fileHandling.saveToReference(fileHandling.selectedUserType, "Doctor");
            adminDashboard_btn.setVisible(false);
        }
        if (userType.equals("Nurse")) {
            setUserGreet("Nurse", userName);
            fileHandling.saveToReference(fileHandling.selectedUserType, "Nurse");
            adminDashboard_btn.setVisible(false);
        }
        if (userType.equals("Patient")) {
            setUserGreet("Patient", userName);
            fileHandling.saveToReference(fileHandling.selectedUserType, "Patient");
            adminDashboard_btn.setVisible(false);
            selectPatient_btn.setVisible(false);
            restart_btn.setVisible(false);
        }
        recordsDisplay_txtarea.setText("Please Click refresh to see details.\nIt wont show if its lacking Prescription, Medication, and Book Apointment.\nPlease condiser entering datas.");
    }
    
    private void DisplayRecords() {
        StringBuilder sb = new StringBuilder("");
        sb.append("Personal Details").append(Consv.end).append(Consv.end);
        DisplayPersonalDetails(sb);
    }
    
    private void DisplayPersonalDetails(StringBuilder sb) {
        sb.append(Consv.tab).append(Datas.get(0)).append(Consv.end);
        sb.append(Consv.tab).append(Datas.get(1)).append(Consv.end);
        sb.append(Consv.tab).append(Datas.get(2)).append(Consv.end);
        sb.append(Consv.tab).append(Datas.get(3)).append(Consv.end);
        sb.append(Consv.tab).append(Datas.get(4)).append(Consv.end);
        sb.append(Consv.tab).append(Datas.get(5)).append(Consv.end);
        
        sb.append(Consv.br).append(Consv.br).append(Consv.br).append(Consv.br);
        sb.append(Consv.end);
        
        sb.append("Prescriptions").append(Consv.end).append(Consv.end);
        
        for (String Datas : Datas.get(6).split("\\|")) {
            sb.append(Consv.tab).append("Title: ").append(Datas.split("\\^")[0]).append(Consv.end);
            sb.append(Consv.tab).append("Notes & Meds: ").append(Datas.split("\\^")[1]).append(Consv.end).append(Consv.end);
        }
        
        sb.append(Consv.br).append(Consv.br).append(Consv.br).append(Consv.br);
        sb.append(Consv.end);
        sb.append("Medical Details (Chronic diseases ^ Past treatments ^ Allergies)").append(Consv.end).append(Consv.end);
        DisplayMedicalHistory(sb);
    }
    
    private void DisplayMedicalHistory(StringBuilder sb) {
        for (String Medication : Datas.get(7).split("\\|")) {
            sb.append(Consv.tab).append(Consv.point).append(Medication).append(Consv.end);
        }
        
        sb.append(Consv.br).append(Consv.br).append(Consv.br).append(Consv.br);
        sb.append(Consv.end);
        sb.append("Booking Appointments").append(Consv.end).append(Consv.end);
        DisplayPrescriptions(sb);
    }
    
    private void DisplayPrescriptions(StringBuilder sb) {
        for (String PrescriptionTitle : Datas.get(8).split("\\|")) {
                sb.append(Consv.tab).append("Title: ").append(PrescriptionTitle.split("\\^")[0]).append(Consv.end);
                sb.append(Consv.tab).append("Schedule: ").append(PrescriptionTitle.split("\\^")[1]).append(Consv.end);
                sb.append(Consv.tab).append("Description: ").append(PrescriptionTitle.split("\\^")[2]).append(Consv.end).append(Consv.end);
        }
        recordsDisplay_txtarea.setText(sb.toString());
        recordsDisplay_txtarea.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new Components.panel();
        panel2 = new Components.panel();
        weclome_lbl = new javax.swing.JLabel();
        loggedInAs_lbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logout_btn = new Components.button();
        adminDashboard_btn = new Components.button();
        selectPatient_btn = new Components.button();
        restart_btn = new Components.button();
        lineDrawer1 = new Components.LineDrawer();
        personalRecords_btn = new javax.swing.JButton();
        prescriptions_btn = new javax.swing.JButton();
        bookAppointments_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lineDrawer2 = new Components.LineDrawer();
        jScrollPane1 = new javax.swing.JScrollPane();
        recordsDisplay_txtarea = new javax.swing.JTextPane();
        bookAppointments_btn1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        weclome_lbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        weclome_lbl.setText("Welcome, user!");

        loggedInAs_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loggedInAs_lbl.setText("Logged in as (PATIENT):");

        jPanel2.setOpaque(false);

        logout_btn.setBackground(new java.awt.Color(255, 0, 0));
        logout_btn.setForeground(new java.awt.Color(255, 255, 255));
        logout_btn.setText("Logout");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        adminDashboard_btn.setBackground(new java.awt.Color(255, 102, 0));
        adminDashboard_btn.setForeground(new java.awt.Color(255, 255, 255));
        adminDashboard_btn.setText("Back to Admin Dashboard");
        adminDashboard_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminDashboard_btnActionPerformed(evt);
            }
        });

        selectPatient_btn.setBackground(new java.awt.Color(35, 159, 97));
        selectPatient_btn.setForeground(new java.awt.Color(255, 255, 255));
        selectPatient_btn.setText("Select Patient");
        selectPatient_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPatient_btnActionPerformed(evt);
            }
        });

        restart_btn.setBackground(new java.awt.Color(35, 159, 97));
        restart_btn.setForeground(new java.awt.Color(255, 255, 255));
        restart_btn.setText("Restart");
        restart_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restart_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restart_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectPatient_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminDashboard_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminDashboard_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectPatient_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(restart_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(weclome_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loggedInAs_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(weclome_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(loggedInAs_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        personalRecords_btn.setBackground(new java.awt.Color(100, 100, 100));
        personalRecords_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        personalRecords_btn.setForeground(new java.awt.Color(255, 255, 255));
        personalRecords_btn.setText("Modify Personal Detail");
        personalRecords_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalRecords_btnActionPerformed(evt);
            }
        });

        prescriptions_btn.setBackground(new java.awt.Color(100, 100, 100));
        prescriptions_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        prescriptions_btn.setForeground(new java.awt.Color(255, 255, 255));
        prescriptions_btn.setText("Add Prescriptions");
        prescriptions_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescriptions_btnActionPerformed(evt);
            }
        });

        bookAppointments_btn.setBackground(new java.awt.Color(100, 100, 100));
        bookAppointments_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bookAppointments_btn.setForeground(new java.awt.Color(255, 255, 255));
        bookAppointments_btn.setText("Book Appointment");
        bookAppointments_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAppointments_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Patient Record");

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));

        lineDrawer2.setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane1.setBorder(null);

        recordsDisplay_txtarea.setEditable(false);
        recordsDisplay_txtarea.setBackground(new java.awt.Color(230, 230, 230));
        recordsDisplay_txtarea.setBorder(null);
        recordsDisplay_txtarea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(recordsDisplay_txtarea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineDrawer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lineDrawer2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
        );

        bookAppointments_btn1.setBackground(new java.awt.Color(100, 100, 100));
        bookAppointments_btn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bookAppointments_btn1.setForeground(new java.awt.Color(255, 255, 255));
        bookAppointments_btn1.setText("Add Med History");
        bookAppointments_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAppointments_btn1ActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lineDrawer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(personalRecords_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prescriptions_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookAppointments_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookAppointments_btn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineDrawer1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(personalRecords_btn)
                    .addComponent(prescriptions_btn)
                    .addComponent(bookAppointments_btn)
                    .addComponent(bookAppointments_btn1)
                    .addComponent(jButton1))
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminDashboard_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminDashboard_btnActionPerformed
        
    }//GEN-LAST:event_adminDashboard_btnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        fileHandling.resetSelectedUser();
    }//GEN-LAST:event_formWindowClosing

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        dispose();
        fileHandling.resetSelectedUser();
    }//GEN-LAST:event_logout_btnActionPerformed

    private void prescriptions_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescriptions_btnActionPerformed
        Prescriptions ps = new Prescriptions(this, rootPaneCheckingEnabled);
        ps.setVisible(true);
    }//GEN-LAST:event_prescriptions_btnActionPerformed

    private void bookAppointments_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppointments_btnActionPerformed
        Bookings bs = new Bookings(this, rootPaneCheckingEnabled);
        bs.setVisible(true);
    }//GEN-LAST:event_bookAppointments_btnActionPerformed

    private void personalRecords_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalRecords_btnActionPerformed
        java.awt.Frame parent = (java.awt.Frame) javax.swing.SwingUtilities.getWindowAncestor(this);
        EditPersonalDetails_jdlg dialog = new EditPersonalDetails_jdlg(parent, true);
        this.userID = fileHandling.getReferencedFile(fileHandling.selectedPatientID);
        this.AccountType = fileHandling.getReferencedFile(fileHandling.accountREF);
        
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
        
            fileHandling.updatePatientAccountById(AccountType, userID, ID, Name, Password, Age, Gender, Contact);
            fileHandling.ResetAccountIDs(AccountType);
            dialog.ResetValues();
            JOptionPane.showMessageDialog(this, "Account Updated.\nPlease click Restart to see the changes.");
        });
        
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_personalRecords_btnActionPerformed

    private void selectPatient_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPatient_btnActionPerformed
        PatientList pl = new PatientList(this, rootPaneCheckingEnabled);
        pl.setVisible(true);
    }//GEN-LAST:event_selectPatient_btnActionPerformed

    private void restart_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restart_btnActionPerformed
        dispose();
        UserDashboard ud = new UserDashboard();
        ud.Start();
        ud.setVisible(true);
    }//GEN-LAST:event_restart_btnActionPerformed

    private void bookAppointments_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppointments_btn1ActionPerformed
        MedicalHistory mh = new MedicalHistory(this, rootPaneCheckingEnabled);
        mh.setVisible(true);
    }//GEN-LAST:event_bookAppointments_btn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.userType = fileHandling.getReferencedFile(fileHandling.selectedUserType);
        this.userName = fileHandling.getReferencedFile(fileHandling.selectedPatientName);
        this.userID = fileHandling.getReferencedFile(fileHandling.selectedPatientID);
        Datas = fileHandling.getAccountDetailsByID(fileHandling.patients, userID);
        DisplayRecords();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Components.button adminDashboard_btn;
    private javax.swing.JButton bookAppointments_btn;
    private javax.swing.JButton bookAppointments_btn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private Components.LineDrawer lineDrawer1;
    private Components.LineDrawer lineDrawer2;
    private javax.swing.JLabel loggedInAs_lbl;
    public Components.button logout_btn;
    private Components.panel panel1;
    private Components.panel panel2;
    private javax.swing.JButton personalRecords_btn;
    private javax.swing.JButton prescriptions_btn;
    private javax.swing.JTextPane recordsDisplay_txtarea;
    public Components.button restart_btn;
    public Components.button selectPatient_btn;
    private javax.swing.JLabel weclome_lbl;
    // End of variables declaration//GEN-END:variables
}
