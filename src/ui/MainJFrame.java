/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainJFrame.java
 *
 * Created on Mar 29, 2010, 7:36:18 PM
 */

package ui;

import business.databaseService.DBUtil;



/**
 *
 * @author salim
 */
public class MainJFrame extends javax.swing.JFrame {



    public MainJFrame() {
        initComponents();
        welcomeJPanel();
    }
    
    public void welcomeJPanel()
    {
        WelcomeJPanel wjp = new WelcomeJPanel();
        UserProcessContainerJPanl.removeAll();
        UserProcessContainerJPanl.add("welcome",wjp);
        ((java.awt.CardLayout) UserProcessContainerJPanl.getLayout()).next(UserProcessContainerJPanl);
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        personalInfoBttn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        communicationHistBttn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        socialInfoBttn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        UserProcessContainerJPanl = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Network Monitoring Tool - D2 Team");

        jSplitPane1.setDividerLocation(200);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personalInfoBttn.setFont(new java.awt.Font("Tahoma", 0, 14));
        personalInfoBttn.setText("Personal Information");
        personalInfoBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalInfoBttnActionPerformed(evt);
            }
        });
        jPanel1.add(personalInfoBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton1.setText("Friend List");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, -1));

        communicationHistBttn.setFont(new java.awt.Font("Tahoma", 0, 14));
        communicationHistBttn.setText("Communication History");
        communicationHistBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communicationHistBttnActionPerformed(evt);
            }
        });
        jPanel1.add(communicationHistBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, -1));

        socialInfoBttn.setFont(new java.awt.Font("Tahoma", 0, 14));
        socialInfoBttn.setText("Social & Info Nodes");
        socialInfoBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socialInfoBttnActionPerformed(evt);
            }
        });
        jPanel1.add(socialInfoBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 180, -1));

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        UserProcessContainerJPanl.setLayout(new java.awt.CardLayout());
        jPanel2.add(UserProcessContainerJPanl, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(jPanel2);

        jScrollPane1.setViewportView(jSplitPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personalInfoBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalInfoBttnActionPerformed
        PersonalInfoJPanel pij = new PersonalInfoJPanel();
        UserProcessContainerJPanl.removeAll();
        UserProcessContainerJPanl.add("personalInfo",pij);
        ((java.awt.CardLayout) UserProcessContainerJPanl.getLayout()).next(UserProcessContainerJPanl);
    }//GEN-LAST:event_personalInfoBttnActionPerformed

private void communicationHistBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communicationHistBttnActionPerformed
    CommunicationNetworkJPanel cnj = new CommunicationNetworkJPanel();
    UserProcessContainerJPanl.removeAll();
    UserProcessContainerJPanl.add("communicationStatus",cnj);
    ((java.awt.CardLayout) UserProcessContainerJPanl.getLayout()).next(UserProcessContainerJPanl);
    
}//GEN-LAST:event_communicationHistBttnActionPerformed

private void socialInfoBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socialInfoBttnActionPerformed
        SocialAndInfoNodesJPanel sainJPanel = new SocialAndInfoNodesJPanel();
        UserProcessContainerJPanl.removeAll();
        UserProcessContainerJPanl.add("socialInfoNodeJPanel",sainJPanel);
        ((java.awt.CardLayout) UserProcessContainerJPanl.getLayout()).next(UserProcessContainerJPanl);
}//GEN-LAST:event_socialInfoBttnActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UserProcessContainerJPanl;
    private javax.swing.JButton communicationHistBttn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton personalInfoBttn;
    private javax.swing.JButton socialInfoBttn;
    // End of variables declaration//GEN-END:variables

}
