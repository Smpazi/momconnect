package InteractiveMomConnect.ClientMobile;

import InteractiveMomConnect.ClientMobile.Factory.RegisterUserFactory;

import java.io.*;
import java.sql.Date;

public class CreateUserSer {

    public static void main(String []args){
        RegisterUser user ;
        try {

            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("User.ser"));
            output.flush();

            output.writeObject( RegisterUserFactory.getRegisterUser("0006435609808","Lomie","Mpazi","Eastern Cape","1928,Valley,Stelly, 7600","25 Jun 2020","05 Sep 2019", "Parow Clinic"));
            output.writeObject( RegisterUserFactory.getRegisterUser("9600818679807","Siziphiwe","Mpazi","Western Cape","19 Matshekethwa,5060","25 Jul 2020","05 Oct 2019", "Khayamandi Clinic"));
            output.close();
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("User.ser"));
            while (true){
                user = (RegisterUser) input.readObject();
                System.out.println(user.toString());
            }
        } catch(EOFException fnfe )
        {
            return;
        }
        catch (IOException fnfe) {
            System.out.println(fnfe);
            System.exit(1);
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
            System.exit(1);        }
    }
}
