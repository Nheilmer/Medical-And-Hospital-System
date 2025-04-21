package medical.and.hospital.system.Popups;

import Components.fileHandling;
import javax.swing.JOptionPane;

public class Prescriptions extends javax.swing.JDialog {
    
    public String PatientID;
    private String Field = "Prescription:";
    
    public Prescriptions(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        PatientID = fileHandling.getReferencedFile(fileHandling.selectedPatientID);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerPanel1 = new javax.swing.JPanel();
        headerTitle1 = new javax.swing.JLabel();
        exitBtn1 = new javax.swing.JButton();
        lineDrawer1 = new Components.LineDrawer();
        medicationsLabel = new javax.swing.JLabel();
        prescriptionTitleLabel = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JButton();
        addSchedbtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        notesMed_txtpn = new javax.swing.JTextPane();
        presTitle_txtfld = new javax.swing.JTextField();
        appointmentLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));

        headerPanel1.setBackground(new java.awt.Color(255, 255, 255));

        headerTitle1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        headerTitle1.setForeground(new java.awt.Color(0, 0, 0));
        headerTitle1.setText("Add Prescription");

        exitBtn1.setBackground(new java.awt.Color(255, 51, 51));
        exitBtn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exitBtn1.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn1.setText("X");
        exitBtn1.setBorder(null);
        exitBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanel1Layout = new javax.swing.GroupLayout(headerPanel1);
        headerPanel1.setLayout(headerPanel1Layout);
        headerPanel1Layout.setHorizontalGroup(
            headerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(headerTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        headerPanel1Layout.setVerticalGroup(
            headerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(headerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headerTitle1)
                    .addComponent(exitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        medicationsLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        medicationsLabel.setForeground(new java.awt.Color(0, 0, 0));
        medicationsLabel.setText("Notes & Medications");

        prescriptionTitleLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        prescriptionTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        prescriptionTitleLabel.setText("Title");

        cancelbtn.setBackground(new java.awt.Color(255, 0, 0));
        cancelbtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelbtn.setText("Cancel");
        cancelbtn.setBorder(null);
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        addSchedbtn.setBackground(new java.awt.Color(0, 153, 255));
        addSchedbtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addSchedbtn.setForeground(new java.awt.Color(255, 255, 255));
        addSchedbtn.setText("Add Schedule");
        addSchedbtn.setBorder(null);
        addSchedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSchedbtnActionPerformed(evt);
            }
        });

        notesMed_txtpn.setBackground(new java.awt.Color(230, 230, 230));
        notesMed_txtpn.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(notesMed_txtpn);

        presTitle_txtfld.setBackground(new java.awt.Color(230, 230, 230));
        presTitle_txtfld.setForeground(new java.awt.Color(0, 0, 0));

        appointmentLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        appointmentLabel.setForeground(new java.awt.Color(0, 0, 0));
        appointmentLabel.setText("Prescription Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lineDrawer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(appointmentLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(presTitle_txtfld)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(prescriptionTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(medicationsLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addSchedbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(72, 72, 72))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lineDrawer1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appointmentLabel)
                .addGap(12, 12, 12)
                .addComponent(prescriptionTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(presTitle_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(medicationsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSchedbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void ResetValues() {
        presTitle_txtfld.setText("");
        notesMed_txtpn.setText("");
        repaint();
        revalidate();
    }
    
    private void exitBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtn1ActionPerformed
        dispose();
    }//GEN-LAST:event_exitBtn1ActionPerformed

    private void addSchedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSchedbtnActionPerformed
        String newValue = presTitle_txtfld.getText() + "^" + notesMed_txtpn.getText();
        fileHandling.replaceMedHistory(fileHandling.patients, Integer.parseInt(PatientID), "Prescription:", newValue);
        ResetValues();
        JOptionPane.showMessageDialog(this, "Successfully Booked!");
    }//GEN-LAST:event_addSchedbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelbtnActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSchedbtn;
    private javax.swing.JLabel appointmentLabel;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton exitBtn1;
    private javax.swing.JPanel headerPanel1;
    private javax.swing.JLabel headerTitle1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private Components.LineDrawer lineDrawer1;
    private javax.swing.JLabel medicationsLabel;
    private javax.swing.JTextPane notesMed_txtpn;
    private javax.swing.JTextField presTitle_txtfld;
    private javax.swing.JLabel prescriptionTitleLabel;
    // End of variables declaration//GEN-END:variables
}
