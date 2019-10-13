package InteractiveMomConnect.ClientMobile.clientScreens;

import InteractiveMomConnect.ClientMobile.Client;
import InteractiveMomConnect.ClientMobile.RegisterUser;

import javax.swing.*;
import java.awt.event.*;
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
    private javax.swing.JComboBox provinceCB;
    private javax.swing.JLabel addressLB;
    private javax.swing.JButton backBT;
    private javax.swing.JLabel dueLB;
    private javax.swing.JLabel idNumLB;
    private javax.swing.JTextField idNumbTF;
    private com.toedter.calendar.JDateChooser jDateChooserDue;
    private com.toedter.calendar.JDateChooser jDateChooserLast;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea addressTA;
    private javax.swing.JLabel lastDateLB;
    private javax.swing.JButton nextBT;
    private javax.swing.JLabel nmBT;
    private javax.swing.JTextField nmTF;
    private javax.swing.JLabel provinceLB;
    private javax.swing.JLabel registerLB;
    private javax.swing.JLabel setLB;
    private javax.swing.JLabel show_validation;
    private javax.swing.JLabel surnmLB;
    private javax.swing.JTextField surnmTF1;
    private javax.swing.JLabel visitLB;
    private javax.swing.JTextField visitTF;
    // End of variables declaration

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
        nmBT = new javax.swing.JLabel();
        surnmLB = new javax.swing.JLabel();
        idNumLB = new javax.swing.JLabel();
        addressLB = new javax.swing.JLabel();
        visitLB = new javax.swing.JLabel();
        nextBT = new javax.swing.JButton();
        backBT = new javax.swing.JButton();
        nmTF = new javax.swing.JTextField();
        idNumbTF = new javax.swing.JTextField(13);
        surnmTF1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTA = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        registerLB = new javax.swing.JLabel();
        lastDateLB = new javax.swing.JLabel();
        dueLB = new javax.swing.JLabel();
        setLB = new javax.swing.JLabel();
        jDateChooserLast = new com.toedter.calendar.JDateChooser();
        jDateChooserDue = new com.toedter.calendar.JDateChooser();
        show_validation = new javax.swing.JLabel();
        provinceLB = new javax.swing.JLabel();
        visitTF = new javax.swing.JTextField();
        String [] provinces = {" ", "Eastern Cape", "Free State", "Gauteng" ,"KwaZulu-Natal ","Limpopo","Mpumalanga","Northern Cape","North West","Western Cape"};
        provinceCB = new JComboBox(provinces);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(297, 480));
        setTitle("Register to MomConnect");

        nmBT.setText("Name:");
        surnmLB.setText("Surname:");
        surnmLB.setMaximumSize(new java.awt.Dimension(55, 14));
        surnmLB.setMinimumSize(new java.awt.Dimension(55, 14));

        idNumLB.setText("ID Number:");

        addressLB.setText("Address:");

        visitLB.setText("Clinic of visit:");

        nextBT.setText("Next");
        nextBT.addActionListener(this);

        backBT.setText("Back");
        backBT.addActionListener(this);

        nmTF.addActionListener(this);

        idNumbTF.addActionListener(this);
        idNumbTF.addKeyListener(this);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        addressTA.setColumns(20);
        addressTA.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        addressTA.setRows(5);
        jScrollPane1.setViewportView(addressTA);

        jPanel1.setBackground(new java.awt.Color(255, 102, 204));

        registerLB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        registerLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLB.setText("Register");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(registerLB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registerLB, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        lastDateLB.setText("Last Period Date: ");

        dueLB.setText("Due-Date:");

        setLB.setText("Set your pregnancy details below:");

        provinceLB.setText("Province: ");

      //  provinceCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nmBT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(surnmLB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(idNumLB)
                                                        .addComponent(visitLB)
                                                        .addComponent(provinceLB)
                                                        .addComponent(addressLB))
                                                .addGap(43, 43, 43)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(provinceCB, 0, 129, Short.MAX_VALUE)
                                                        .addComponent(idNumbTF)
                                                        .addComponent(surnmTF1)
                                                        .addComponent(nmTF)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addComponent(visitTF))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(show_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(backBT)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(nextBT))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(lastDateLB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(dueLB, javax.swing.GroupLayout.Alignment.LEADING))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(jDateChooserLast, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                                                .addComponent(jDateChooserDue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                        .addComponent(setLB, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nmBT)
                                        .addComponent(nmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(surnmTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(surnmLB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idNumbTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idNumLB))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(show_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(provinceLB)
                                                .addComponent(provinceCB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addressLB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(visitLB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(visitTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(setLB)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDateChooserLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastDateLB))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(dueLB)
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(backBT)
                                                        .addComponent(nextBT)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jDateChooserDue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(37, Short.MAX_VALUE))
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

           if(nmTF.getText().isEmpty() || surnmTF1.getText().isEmpty() || idNumbTF.getText().isEmpty() || provinceCB.getSelectedItem().equals(" ")|| addressTA.getText().isEmpty() || visitTF.getText().isEmpty()){
               JOptionPane.showMessageDialog(null,"Please fill in all information details.","Invalid data",JOptionPane.ERROR_MESSAGE);

           }else {
               RegisterUser user = new RegisterUser.Builder()
                       .IDnumber((idNumbTF.getText()))
                       .name(nmTF.getText())
                       .surname(surnmTF1.getText())
                     //  .province(provinceTF.getText())
                       .address(addressTA.getText())
                       .visit(visitTF.getText())
                       .startDate(((JTextField)jDateChooserLast.getDateEditor().getUiComponent()).getText())
                       .due_Date(((JTextField)jDateChooserDue.getDateEditor().getUiComponent()).getText())
                       .build();
               String message = client.AddNewUser(user);
               JOptionPane.showMessageDialog(null,message,"Confirmed",JOptionPane.INFORMATION_MESSAGE);

              // updateUserTable();
               nmTF.setText("");
               surnmTF1.setText("");
               idNumbTF.setText("");
               visitTF.setText("");
               addressTA.setText("");
            //   provinceTF.setText("");

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
