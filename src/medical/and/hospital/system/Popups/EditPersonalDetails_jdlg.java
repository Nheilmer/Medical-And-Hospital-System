package medical.and.hospital.system.Popups;

import javax.swing.JOptionPane;

public class EditPersonalDetails_jdlg extends javax.swing.JDialog {

    public String file;
    
    public EditPersonalDetails_jdlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        headerPanel3 = new javax.swing.JPanel();
        headerTitle3 = new javax.swing.JLabel();
        exitBtn3 = new javax.swing.JButton();
        lineDrawer2 = new Components.LineDrawer();
        nametxt = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        personaldetLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        agetxt = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        gendertxt = new javax.swing.JTextField();
        contactLabel = new javax.swing.JLabel();
        contacttxt = new javax.swing.JTextField();
        nameLabel1 = new javax.swing.JLabel();
        id_txtfld = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        password_txtfld = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        cancel.setBackground(new java.awt.Color(255, 0, 0));
        cancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.setBorder(null);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        savebtn.setBackground(new java.awt.Color(72, 189, 94));
        savebtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        savebtn.setForeground(new java.awt.Color(255, 255, 255));
        savebtn.setText("Save");
        savebtn.setBorder(null);
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        headerPanel3.setBackground(new java.awt.Color(255, 255, 255));

        headerTitle3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        headerTitle3.setForeground(new java.awt.Color(0, 0, 0));
        headerTitle3.setText("Modify (Patient)");

        exitBtn3.setBackground(new java.awt.Color(255, 51, 51));
        exitBtn3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exitBtn3.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn3.setText("X");
        exitBtn3.setBorder(null);
        exitBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanel3Layout = new javax.swing.GroupLayout(headerPanel3);
        headerPanel3.setLayout(headerPanel3Layout);
        headerPanel3Layout.setHorizontalGroup(
            headerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(headerTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(exitBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        headerPanel3Layout.setVerticalGroup(
            headerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(headerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headerTitle3)
                    .addComponent(exitBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lineDrawer2.setBackground(new java.awt.Color(0, 0, 0));

        nametxt.setBackground(new java.awt.Color(255, 255, 255));
        nametxt.setForeground(new java.awt.Color(0, 0, 0));

        nameLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("Name");

        personaldetLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        personaldetLabel.setForeground(new java.awt.Color(0, 0, 0));
        personaldetLabel.setText("Personal Details:");

        ageLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(0, 0, 0));
        ageLabel.setText("Age");

        agetxt.setBackground(new java.awt.Color(255, 255, 255));
        agetxt.setForeground(new java.awt.Color(0, 0, 0));

        genderLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(0, 0, 0));
        genderLabel.setText("Gender");

        gendertxt.setBackground(new java.awt.Color(255, 255, 255));
        gendertxt.setForeground(new java.awt.Color(0, 0, 0));

        contactLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        contactLabel.setForeground(new java.awt.Color(0, 0, 0));
        contactLabel.setText("Contact Information");

        contacttxt.setBackground(new java.awt.Color(255, 255, 255));
        contacttxt.setForeground(new java.awt.Color(0, 0, 0));

        nameLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        nameLabel1.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel1.setText("ID");

        id_txtfld.setBackground(new java.awt.Color(255, 255, 255));
        id_txtfld.setForeground(new java.awt.Color(0, 0, 0));

        passwordLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setText("Password");

        password_txtfld.setBackground(new java.awt.Color(255, 255, 255));
        password_txtfld.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lineDrawer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agetxt)
                            .addComponent(nametxt)
                            .addComponent(gendertxt)
                            .addComponent(contacttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contactLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(personaldetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_txtfld)
                            .addComponent(nameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password_txtfld, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lineDrawer2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personaldetLabel)
                .addGap(12, 12, 12)
                .addComponent(nameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(genderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contactLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        ResetValues();
        JOptionPane.showMessageDialog(this, "Account Updated successfully.");
    }//GEN-LAST:event_savebtnActionPerformed

    private void exitBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtn3ActionPerformed
        ResetValues();
        dispose();
    }//GEN-LAST:event_exitBtn3ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        ResetValues();
        dispose();
    }//GEN-LAST:event_cancelActionPerformed
    
    public void ResetValues() {
        id_txtfld.setText("");
        nametxt.setText("");
        passwordLabel.setText("");
        ageLabel.setText("");
        genderLabel.setText("");
        contactLabel.setText("");
        repaint();
        revalidate();
        dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    public javax.swing.JTextField agetxt;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel contactLabel;
    public javax.swing.JTextField contacttxt;
    private javax.swing.JButton exitBtn3;
    private javax.swing.JLabel genderLabel;
    public javax.swing.JTextField gendertxt;
    private javax.swing.JPanel headerPanel3;
    private javax.swing.JLabel headerTitle3;
    public javax.swing.JTextField id_txtfld;
    private javax.swing.JPanel jPanel1;
    private Components.LineDrawer lineDrawer2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    public javax.swing.JTextField nametxt;
    public javax.swing.JLabel passwordLabel;
    public javax.swing.JTextField password_txtfld;
    private javax.swing.JLabel personaldetLabel;
    public javax.swing.JButton savebtn;
    // End of variables declaration//GEN-END:variables
}
