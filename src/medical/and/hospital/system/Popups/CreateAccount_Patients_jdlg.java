package medical.and.hospital.system.Popups;

public class CreateAccount_Patients_jdlg extends javax.swing.JDialog {
    
    public CreateAccount_Patients_jdlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cancel_btn = new javax.swing.JButton();
        save_btn = new javax.swing.JButton();
        headerPanel3 = new javax.swing.JPanel();
        headerTitle3 = new javax.swing.JLabel();
        exit_btn = new javax.swing.JButton();
        lineDrawer2 = new Components.LineDrawer();
        name_txtfld = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        personaldetLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        age_txtfld = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        gender_txtfld = new javax.swing.JTextField();
        contactLabel = new javax.swing.JLabel();
        contact_txtfld = new javax.swing.JTextField();
        password_txtfld = new javax.swing.JTextField();
        nameLabel1 = new javax.swing.JLabel();
        nameLabel2 = new javax.swing.JLabel();
        id_txtfld = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        cancel_btn.setBackground(new java.awt.Color(255, 0, 0));
        cancel_btn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancel_btn.setForeground(new java.awt.Color(255, 255, 255));
        cancel_btn.setText("Cancel");
        cancel_btn.setBorder(null);
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        save_btn.setBackground(new java.awt.Color(72, 189, 94));
        save_btn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        save_btn.setForeground(new java.awt.Color(255, 255, 255));
        save_btn.setText("Save");
        save_btn.setBorder(null);
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        headerPanel3.setBackground(new java.awt.Color(255, 255, 255));

        headerTitle3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        headerTitle3.setForeground(new java.awt.Color(0, 0, 0));
        headerTitle3.setText("Create Patient Account");

        exit_btn.setBackground(new java.awt.Color(255, 51, 51));
        exit_btn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exit_btn.setForeground(new java.awt.Color(255, 255, 255));
        exit_btn.setText("X");
        exit_btn.setBorder(null);
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
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
                .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        headerPanel3Layout.setVerticalGroup(
            headerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(headerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headerTitle3)
                    .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lineDrawer2.setBackground(new java.awt.Color(0, 0, 0));

        name_txtfld.setBackground(new java.awt.Color(255, 255, 255));
        name_txtfld.setForeground(new java.awt.Color(0, 0, 0));

        nameLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("Name");

        personaldetLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        personaldetLabel.setForeground(new java.awt.Color(0, 0, 0));
        personaldetLabel.setText("Personal Details:");

        ageLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(0, 0, 0));
        ageLabel.setText("Age");

        age_txtfld.setBackground(new java.awt.Color(255, 255, 255));
        age_txtfld.setForeground(new java.awt.Color(0, 0, 0));

        genderLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(0, 0, 0));
        genderLabel.setText("Gender");

        gender_txtfld.setBackground(new java.awt.Color(255, 255, 255));
        gender_txtfld.setForeground(new java.awt.Color(0, 0, 0));

        contactLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        contactLabel.setForeground(new java.awt.Color(0, 0, 0));
        contactLabel.setText("Contact Information");

        contact_txtfld.setBackground(new java.awt.Color(255, 255, 255));
        contact_txtfld.setForeground(new java.awt.Color(0, 0, 0));

        password_txtfld.setBackground(new java.awt.Color(255, 255, 255));
        password_txtfld.setForeground(new java.awt.Color(0, 0, 0));

        nameLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        nameLabel1.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel1.setText("Password");

        nameLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        nameLabel2.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel2.setText("ID");

        id_txtfld.setBackground(new java.awt.Color(255, 255, 255));
        id_txtfld.setForeground(new java.awt.Color(0, 0, 0));

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
                        .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age_txtfld)
                            .addComponent(name_txtfld)
                            .addComponent(gender_txtfld)
                            .addComponent(contact_txtfld, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contactLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(personaldetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password_txtfld)
                            .addComponent(nameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_txtfld)
                            .addComponent(nameLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(nameLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(nameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(age_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(genderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gender_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contactLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contact_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        
    }//GEN-LAST:event_save_btnActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        dispose();
    }//GEN-LAST:event_exit_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        dispose();
    }//GEN-LAST:event_cancel_btnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    public javax.swing.JTextField age_txtfld;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JLabel contactLabel;
    public javax.swing.JTextField contact_txtfld;
    private javax.swing.JButton exit_btn;
    private javax.swing.JLabel genderLabel;
    public javax.swing.JTextField gender_txtfld;
    private javax.swing.JPanel headerPanel3;
    private javax.swing.JLabel headerTitle3;
    public javax.swing.JTextField id_txtfld;
    private javax.swing.JPanel jPanel1;
    private Components.LineDrawer lineDrawer2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameLabel2;
    public javax.swing.JTextField name_txtfld;
    public javax.swing.JTextField password_txtfld;
    private javax.swing.JLabel personaldetLabel;
    public javax.swing.JButton save_btn;
    // End of variables declaration//GEN-END:variables
}
