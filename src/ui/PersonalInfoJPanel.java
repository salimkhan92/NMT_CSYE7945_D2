/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PersonalInfoJPanel.java
 *
 * Created on Apr 6, 2012, 9:24:53 PM
 */
package ui;

/**
 *
 * @author Salim
 */
public class PersonalInfoJPanel extends javax.swing.JPanel {

    /** Creates new form PersonalInfoJPanel */
    public PersonalInfoJPanel() {
        initComponents();
        UpdateButton.setVisible(false);
        setTextFieldUnEditable();
    }
    
    
        
    public void setTextFieldUnEditable() {
        FirstNameTextField.setEditable(false);
        LastNameTextField.setEditable(false);
        AddressTextField.setEditable(false);
        CityTextField.setEditable(false);
        CountryTextField.setEditable(false);
        ZipTextField.setEditable(false);
        PhoneTextField.setEditable(false);
        StateTextField.setEditable(false);
    }
    
    public void setTextFieldEditable() {
        FirstNameTextField.setEditable(true);
        LastNameTextField.setEditable(true);
        AddressTextField.setEditable(true);
        CityTextField.setEditable(true);
        CountryTextField.setEditable(true);
        ZipTextField.setEditable(true);
        PhoneTextField.setEditable(true);
        StateTextField.setEditable(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PhoneTextField = new javax.swing.JTextField();
        ZipTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CountryTextField = new javax.swing.JTextField();
        CityTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        StateTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LastNameTextField = new javax.swing.JTextField();
        AddressTextField = new javax.swing.JTextField();
        Label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        UpdateDetailButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 79, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Phone:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Country:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        PhoneTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(PhoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 144, -1));

        ZipTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(ZipTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 144, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("First Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        CountryTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(CountryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 144, -1));

        CityTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(CityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 144, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Address:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        StateTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(StateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 144, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Last Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        LastNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(LastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 144, -1));

        AddressTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(AddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 144, -1));

        Label.setFont(new java.awt.Font("Tahoma", 1, 24));
        Label.setText("Personal Detail");
        jPanel1.add(Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 4, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("City:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("State:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        FirstNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(FirstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 144, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Postal Code/Zip:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        UpdateDetailButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UpdateDetailButton.setText("Update Detail");
        UpdateDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDetailButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateDetailButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        UpdateButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
//        jPanel.remove(this);
//        ((java.awt.CardLayout) jPanel.getLayout()).previous(jPanel);
}//GEN-LAST:event_BackButtonActionPerformed

private void UpdateDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDetailButtonActionPerformed
        UpdateDetailButton.setVisible(false);
        UpdateButton.setVisible(true);
        setTextFieldEditable();
}//GEN-LAST:event_UpdateDetailButtonActionPerformed

private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
//        int option = JOptionPane.showConfirmDialog(null, "Are You Sure you want to save the changes?", "Message", JOptionPane.YES_NO_OPTION);
//        if (option == JOptionPane.YES_OPTION) {
//            Doctor d = doctorUserAccount.getDoctor();
//            d.setSpeciality(SpecialistLabel.getText());
//            d.setFirstName(FirstNameTextField.getText());
//            d.setLastName(LastNameTextField.getText());
//            d.setAddress(AddressTextField.getText());
//            d.setCity(CityTextField.getText());
//            d.setState(StateTextField.getText());
//            d.setZip(ZipTextField.getText());
//            d.setCountry(CountryTextField.getText());
//            d.setPhone(PhoneTextField.getText());
//            d.setEmailID(EmailTextField.getText());
//            d.setAvailabilityDay(DayTextField.getText());
//            d.setAvailabilityTime(TimeTextField.getText());
//            d.setConsultingCharge(Integer.parseInt(ChargeTextField.getText()));
//            UpdateDetailButton.setEnabled(false);
//            setTextFieldUnEditable();
//            Label.setText("Personal Detail Updated");
//        }
}//GEN-LAST:event_UpdateButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField CityTextField;
    private javax.swing.JTextField CountryTextField;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JLabel Label;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JTextField PhoneTextField;
    private javax.swing.JTextField StateTextField;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton UpdateDetailButton;
    private javax.swing.JTextField ZipTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
