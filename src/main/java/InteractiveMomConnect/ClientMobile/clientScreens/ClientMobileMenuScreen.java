package InteractiveMomConnect.ClientMobile.clientScreens;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientMobileMenuScreen extends JFrame implements ActionListener {

  //  ClientExerciseScreen clientExerciseScreen;

    // Variables declaration - do not modify
    private JButton exersiceTB;
    private JButton extTB;
    private JButton healthBT;
    private JButton nutritionBT;
    private JButton profileBT;
    private JLabel profileLabel;
    private JButton sicknessBT;
    private JLabel userNmLabel;
    private JTextField usernameTF;
    // End of variables declaration

    public ClientMobileMenuScreen(){

        createComponents();
    }
    private void createComponents() {

        extTB = new javax.swing.JButton();
        userNmLabel = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        nutritionBT = new javax.swing.JButton();
        exersiceTB = new javax.swing.JButton();
        healthBT = new javax.swing.JButton();
        sicknessBT = new javax.swing.JButton();
        profileBT = new javax.swing.JButton();
        profileLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        extTB.setText("EXIT");
        extTB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        extTB.addActionListener(this);

     //   userNmLabel.setText("UserName:");

        usernameTF.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usernameTF.addActionListener(this) ;

        nutritionBT.setText("Nutrition");
        nutritionBT.addActionListener(this);


        exersiceTB.setText("Exercises");
        exersiceTB.addActionListener(this);

        healthBT.setText("Health Precautions");
        healthBT.addActionListener(this);

        sicknessBT.setText("Pregnancy Sickness");
        sicknessBT.addActionListener(this);

        profileBT.setText("PROFILE");
        profileBT.addActionListener(this);

        profileLabel.setText("MY PROFILE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(userNmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(healthBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(nutritionBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(exersiceTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(sicknessBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(85, 85, 85)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(profileBT, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(extTB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(profileLabel))))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(userNmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(exersiceTB, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                        .addComponent(nutritionBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(healthBT, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                        .addComponent(sicknessBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(41, 41, 41)
                                .addComponent(profileBT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(profileLabel)
                                .addGap(30, 30, 30)
                                .addComponent(extTB)
                                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>


    @Override
    public void actionPerformed(ActionEvent e) {

        if(exersiceTB == e.getSource()){
            this.setVisible(false);
            new ClientExerciseScreen().setVisible(true);
        }
        if(nutritionBT == e.getSource()){
            this.setVisible(false);
            new ClientNutritionScreen().setVisible(true);
        }
        if(sicknessBT == e.getSource()){
            this.setVisible(false);
            new ClientPregnancySicknessess().setVisible(true);
        }
        if(healthBT == e.getSource()){
            this.setVisible(false);
            new HealthPrecautionScreen().setVisible(true);
        }
        if(profileBT == e.getSource()){
            this.setVisible(false);
            new ClientProfileScreen().setVisible(true);
        }
        if(extTB == e.getSource()){
            System.exit(0);
        }
    }



    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientMobileMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientMobileMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientMobileMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientMobileMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientMobileMenuScreen().setVisible(true);
            }
        });
    }




}
