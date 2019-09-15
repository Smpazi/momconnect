package InteractiveMomConnect.ClientMobile.clientScreens;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientSignInScreen extends JFrame implements ActionListener {

    // Variables declaration - do not modify
    private javax.swing.JButton backBT;
    private javax.swing.JButton exitBT;
    private javax.swing.JLabel nameLB;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPasswordField passTF;
    private javax.swing.JLabel passwordLB;
    private javax.swing.JLabel picLB;
    private javax.swing.JButton signinBT;
    // End of variables declaration


    public ClientSignInScreen() {
        initComponents();
    }

    private void initComponents() {

        picLB = new JLabel(new ImageIcon("InteractiveMomConnect/ClientMobile/clientScreens/momconnet.jpg"));
        nameTF = new JTextField();
        passTF = new JPasswordField();
        signinBT = new javax.swing.JButton();
        exitBT = new javax.swing.JButton();
        nameLB = new javax.swing.JLabel();
        passwordLB = new javax.swing.JLabel();
        backBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);


        picLB.setIcon(new ImageIcon("InteractiveMomConnect/ClientMobile/clientScreens/momconnet.jpg")); // NOI18N


        signinBT.setText("Sign In");
        signinBT.addActionListener(this);

        exitBT.setText("Exit");
        exitBT.addActionListener(this);

        nameLB.setText("Your Name:");

        passwordLB.setText("Password:");

        backBT.setText("Back");
        backBT.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(backBT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitBT)
                                .addGap(37, 37, 37))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(82, 82, 82)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(passTF, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                                        .addComponent(nameLB)
                                                        .addComponent(passwordLB)
                                                        .addComponent(nameTF)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(107, 107, 107)
                                                .addComponent(signinBT))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(picLB)))
                                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(picLB)
                                .addGap(40, 40, 40)
                                .addComponent(nameLB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(passwordLB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(signinBT)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(backBT)
                                        .addComponent(exitBT))
                                .addGap(26, 26, 26))
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
            java.util.logging.Logger.getLogger(ClientSignInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientSignInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientSignInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientSignInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientSignInScreen().setVisible(true);
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(signinBT == e.getSource()){
            this.setVisible(false);
            new ClientMobileMenuScreen().setVisible(true);
        }
        if(backBT == e.getSource()){
            this.setVisible(false);
            new WelcomeScreen().setVisible(true);
        }
        if(exitBT == e.getSource()){
            System.exit(0);
        }
    }
}
