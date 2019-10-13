package InteractiveMomConnect.ClientMobile.clientScreens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen extends JFrame implements ActionListener {

    public WelcomeScreen(){
        initComponents();
    }

    private void initComponents() {

        registerBT = new javax.swing.JButton();
        String [] languagesArray = { "English", "IsiXhosa", "IsiZulu","Afrikaans", "Pedi", "Tsonga", "Swati", "Sesotho", "Venda" };

        chooseLanguageCB = new JComboBox(languagesArray);
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTA = new javax.swing.JTextArea();
        languageLB = new JLabel();
        jLabel1 = new JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome To MomConnect");
        setResizable(true);

        registerBT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        registerBT.setText("REGISTER");
        registerBT.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        registerBT.addActionListener(this);

        chooseLanguageCB.setSelectedIndex(0);
        chooseLanguageCB.addActionListener(this);

        infoTA.setColumns(20);
        infoTA.setRows(5);
        infoTA.setVisible(false);
       // infoTA.setBackground(Color.cyan);
        jScrollPane1.setViewportView(infoTA);

        languageLB.setBackground(Color.cyan);
        languageLB.setIcon(new ImageIcon("momconnet.jpg"));

      //  jLabel2.setText("Language:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(105, 105, 105)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel1)
                                                        .addComponent(registerBT, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(chooseLanguageCB, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(78, 78, 78)))))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(languageLB, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(languageLB, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(chooseLanguageCB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                .addGap(41, 41, 41)
                                .addComponent(registerBT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
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
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JComboBox chooseLanguageCB;
    private javax.swing.JButton extTB;
    private javax.swing.JTextArea infoTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel languageLB;
    private javax.swing.JButton registerBT;
    private javax.swing.JButton signInBT;
    // End of variables declaration



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == chooseLanguageCB){
            infoTA.setVisible(true);
            JComboBox cb = (JComboBox)e.getSource();
            String msg = (String)cb.getSelectedItem();
            switch(msg){
                case "English": infoTA.setText("Welcome to the Department of \nHealth's MomConnect.\n\nMomConnect provide support to \npregnant woman, Through using \nthe information provided in this\napplication. \n\nTo gain access to this \ninformation, you will have\nto register your details.\n\nThe details will be saved in \nDepartment of Health database.\nThis will help nearby clinic to\nlocate you faster in terms of\nemergencies.");
                break;
                case "IsiXhosa": infoTA.setText("Wamkelekile kwisebeleze mpilo \nMomConnect.\n\nuMomConnect ulungiselelwe \nukuxhasa abantu \nbesifazane abakhulelweyo, \nngokuthi basebenzize le app. \n\nUkuze umntu wesifazane akwazi \nusebenzisa le app kumela kuqala \na fake incukaca zakhe. \nEzincukaca zizagcinwa lisebelezembilo, \nukuze isibhedlele esikufutshane \nkunawe sikwazi \nukunceda xa usegxakini malunga \nnokhulelo kwakho.");
                break;
               /* case "IsiZulu": infoTA.setText("Welcome to the Department of \nHealth's MomConnect.\n\nMomConnect provide support to \npregnant woman, Through using \nthe information provided in this\napplication. \n\nTo gain access to this \ninformation, you will have\nto register your details.\n\nThe details will be saved in \nDepartment of Health database.\nThis will help nearby clinic to\nlocate you faster in terms of\nemergencies.");
                break;
                case "Afrikaans": infoTA.setText("Welcome to the Department of \nHealth's MomConnect.\n\nMomConnect provide support to \npregnant woman, Through using \nthe information provided in this\napplication. \n\nTo gain access to this \ninformation, you will have\nto register your details.\n\nThe details will be saved in \nDepartment of Health database.\nThis will help nearby clinic to\nlocate you faster in terms of\nemergencies.");
                break;
                case "Pedi": infoTA.setText("Welcome to the Department of \nHealth's MomConnect.\n\nMomConnect provide support to \npregnant woman, Through using \nthe information provided in this\napplication. \n\nTo gain access to this \ninformation, you will have\nto register your details.\n\nThe details will be saved in \nDepartment of Health database.\nThis will help nearby clinic to\nlocate you faster in terms of\nemergencies.");
                break;
                case "Swati": infoTA.setText(" ");
                break;
                case "Sesotho": infoTA.setText(" ");
                break;*/
                default: infoTA.setText(" this language is not available yet. ");
            }
        }
        if(registerBT == e.getSource()){
            this.setVisible(false);
            new RegisterScreen().setVisible(true);
        }

    }
}
