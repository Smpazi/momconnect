package InteractiveMomConnect.ClientMobile.clientScreens;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientProfileScreen extends JFrame implements ActionListener {

    // Variables declaration - do not modify
    private javax.swing.JButton appointBT;
    private javax.swing.JButton backBT;
    private javax.swing.JButton birthplanBT;
    private javax.swing.JButton chatBT;
    private javax.swing.JButton exitBT;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel profileLB;
    private javax.swing.JButton timelineBT;
    private javax.swing.JButton todoBT;
    private javax.swing.JButton weightBT;

    public ClientProfileScreen() {
        initComponents();
    }


    private void initComponents() {

        appointBT = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        profileLB = new javax.swing.JLabel();
        birthplanBT = new javax.swing.JButton();
        chatBT = new javax.swing.JButton();
        todoBT = new javax.swing.JButton();
        weightBT = new javax.swing.JButton();
        timelineBT = new javax.swing.JButton();
        backBT = new javax.swing.JButton();
        exitBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        appointBT.setText("Appointments");
        appointBT.addActionListener(this);

        profileLB.setText("My Profile");

        birthplanBT.setText("Birth plan");
        birthplanBT.addActionListener(this);

        chatBT.setText("assistant");
        chatBT.addActionListener(this);

        todoBT.setText("To-Do");
        todoBT.addActionListener(this);

        weightBT.setText("My weight");
        weightBT.addActionListener(this);

        timelineBT.setText("Timeline");
        timelineBT.addActionListener(this);

        backBT.setText("Back");
        backBT.addActionListener(this);

        exitBT.setText("exit");
        exitBT.addActionListener(this);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(119, 119, 119)
                                                .addComponent(profileLB))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(appointBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(23, 23, 23))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(birthplanBT, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(chatBT, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(25, 25, 25)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(timelineBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(todoBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(weightBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))))
                                .addGap(34, 34, 34))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(backBT)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitBT)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(exitBT)
                                .addGap(14, 14, 14)
                                .addComponent(profileLB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(todoBT, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                        .addComponent(appointBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(birthplanBT, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                        .addComponent(weightBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(chatBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(timelineBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(backBT)
                                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientProfileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientProfileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientProfileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientProfileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientProfileScreen().setVisible(true);
            }
        });
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(appointBT == e.getSource()){
            this.setVisible(false);
            new AppointmentScreen().setVisible(true);
        }
        if(birthplanBT == e.getSource()){
            this.setVisible(false);
            new BirthPlanScreen().setVisible(true);
        }
        if(weightBT == e.getSource()){
            this.setVisible(false);
            new MyWeightScreen().setVisible(true);
        }
        if(timelineBT == e.getSource()){
            this.setVisible(false);
            new TimelineScreen().setVisible(true);
        }
        if(todoBT == e.getSource()){
            this.setVisible(false);
            new To_DoScreen().setVisible(true);
        }
        if(chatBT == e.getSource()){
            this.setVisible(false);
            new ClientChatScreen().setVisible(true);
        }
        if(backBT == e.getSource()){
            this.setVisible(false);
            new ClientMobileMenuScreen().setVisible(true);
        }
        if(exitBT == e.getSource()){
           System.exit(0);
        }

    }
}
