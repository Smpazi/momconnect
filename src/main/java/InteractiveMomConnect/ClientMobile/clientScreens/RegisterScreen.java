package InteractiveMomConnect.ClientMobile.clientScreens;

import InteractiveMomConnect.ClientMobile.Client;
import InteractiveMomConnect.ClientMobile.RegisterUser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class RegisterScreen  extends JFrame implements ActionListener, KeyListener {

 //Server sever = new Server();
    Client client = new Client();
    private SimpleDateFormat sft = new SimpleDateFormat("dd MMM yyyy");


    // Variables declaration - do not modify
    private javax.swing.JLabel addressLB;
    private javax.swing.JTextArea addressTA;
    private javax.swing.JButton backBT;
    private javax.swing.JLabel dueLB;
    private javax.swing.JLabel idNumLB;
    private javax.swing.JTextField idNumTF;
    private com.toedter.calendar.JDateChooser jDateChooserDue;
    private com.toedter.calendar.JDateChooser jDateChooserLast;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastDateLB;
    private javax.swing.JButton nextBT;
    private javax.swing.JLabel nmLB;
    private javax.swing.JTextField nmTF;
    private javax.swing.JLabel passwordLB;
    private javax.swing.JLabel registerLB;
    private javax.swing.JLabel setLB;
    private javax.swing.JTextField surnamTF;
    private javax.swing.JLabel surnmLB;

    public RegisterScreen() {
        try
        {
            client.connect(new Socket("127.0.0.1",7000));
            initComponents();

        }
        catch(IOException ioe)
        {
            System.out.println("Server not available");
            System.out.println(ioe);
        }
        //initComponents();
    }


    private void initComponents() {

        nmLB = new javax.swing.JLabel();
        surnmLB = new javax.swing.JLabel();
        idNumLB = new javax.swing.JLabel();
        addressLB = new javax.swing.JLabel();
        passwordLB = new javax.swing.JLabel();
        nextBT = new javax.swing.JButton();
        backBT = new javax.swing.JButton();
        nmTF = new javax.swing.JTextField();
        idNumTF = new javax.swing.JTextField();
        surnamTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTA = new javax.swing.JTextArea();
        jPasswordTF = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        registerLB = new javax.swing.JLabel();
        lastDateLB = new javax.swing.JLabel();
        dueLB = new javax.swing.JLabel();
        setLB = new javax.swing.JLabel();
        jDateChooserLast = new com.toedter.calendar.JDateChooser();
        jDateChooserDue = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nmLB.setText("Name:");
        surnmLB.setText("Surname:");
        surnmLB.setMaximumSize(new java.awt.Dimension(55, 14));
        surnmLB.setMinimumSize(new java.awt.Dimension(55, 14));

        idNumLB.setText("ID Number:");
        addressLB.setText("Address:");
        passwordLB.setText("Password:");

        nextBT.setText("Next");
        nextBT.addActionListener(this);

        backBT.setText("Back");
        backBT.addActionListener(this);
        nmTF.addActionListener(this);
        surnamTF.addActionListener(this);
        idNumTF.addActionListener(this);
        idNumTF.addKeyListener(this);
        jPasswordTF.addActionListener(this);
        jPasswordTF.addKeyListener(this);
       // addressTA.addAncestorListener((AncestorListener) this);


        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        addressTA.setColumns(20);
        addressTA.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        addressTA.setRows(5);
        jScrollPane1.setViewportView(addressTA);

        jPanel1.setBackground(new java.awt.Color(255, 102, 204));

        registerLB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        registerLB.setText("Register");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registerLB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registerLB)
                                .addContainerGap())
        );

        lastDateLB.setText("Last Period Date: ");

        dueLB.setText("Due-Date:");

        setLB.setText("Set your pregnancy details below to customize app. ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(setLB, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(nmLB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(surnmLB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(idNumLB)
                                                                        .addComponent(addressLB)
                                                                        .addComponent(passwordLB))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jPasswordTF, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                                                        .addComponent(idNumTF)
                                                                        .addComponent(nmTF)
                                                                        .addComponent(surnamTF)
                                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(backBT)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(nextBT)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dueLB)
                                                        .addComponent(lastDateLB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jDateChooserLast, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                        .addComponent(jDateChooserDue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nmLB)
                                        .addComponent(nmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(surnmLB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(surnamTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idNumLB))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addressLB)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordLB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addComponent(setLB)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(lastDateLB))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDateChooserLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dueLB)
                                        .addComponent(jDateChooserDue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(backBT)
                                        .addComponent(nextBT))
                                .addContainerGap())
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
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterScreen().setVisible(true);
            }
        });
    }
    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
            JOptionPane.showMessageDialog(null,"Use numbers","Invalid data",JOptionPane.ERROR_MESSAGE);
           getToolkit().beep();
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(nextBT == e.getSource()){

           if(nmTF.getText().isEmpty() || surnmLB.getText().isEmpty() || idNumTF.getText().isEmpty() || jPasswordTF.getPassword().equals("") || addressTA.getText().isEmpty()  ){
               JOptionPane.showMessageDialog(null,"Please fill in all information details","Invalid data",JOptionPane.ERROR_MESSAGE);

           }else {
               RegisterUser user = new RegisterUser.Builder()
                       .IDnumber((idNumTF.getText()))
                       .name(nmTF.getText())
                       .surname(surnamTF.getText())
                       .address(addressTA.getText())
                       .password(Integer.parseInt(String.valueOf(jPasswordTF.getPassword())))
                       .startDate(((JTextField)jDateChooserLast.getDateEditor().getUiComponent()).getText())
                       .due_Date(((JTextField)jDateChooserDue.getDateEditor().getUiComponent()).getText())
                       .build();
               String message = client.AddNewUser(user);
               JOptionPane.showMessageDialog(null,message,"Confirmed",JOptionPane.INFORMATION_MESSAGE);

              // updateUserTable();
               nmTF.setText("");
               surnamTF.setText("");
               idNumTF.setText("");
               jPasswordTF.setText("");
               addressTA.setText("");

               this.setVisible(false);
               new ClientMobileMenuScreen().setVisible(true);
           }

        }
        if(backBT == e.getSource()){
            this.setVisible(false);
            new WelcomeScreen().setVisible(true);
        }

    }


}
