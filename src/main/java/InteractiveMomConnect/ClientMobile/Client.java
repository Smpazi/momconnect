package InteractiveMomConnect.ClientMobile;


import java.io.*;
import java.net.Socket;

public class Client {
    private Socket socket;

    private ObjectOutputStream out = null;
    private ObjectInputStream in = null;

    public Client(){

    }
    public void connect(Socket socket)
    {
        this.socket = socket;
        createStreams();
    }

    public void createStreams()
    {
        try
        {
            out = new ObjectOutputStream(socket.getOutputStream());
            out.flush();

            in = new ObjectInputStream(socket.getInputStream());
        }
        catch(IOException ioe)
        {

        }
    }

    public String AddNewUser(RegisterUser user)
    {
        String message = "";
        try
        {
            out.writeObject("AddNewUser");
            out.flush();
            out.writeObject(user);
            out.flush();
            message = (String)in.readObject();
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
        catch(ClassNotFoundException ce)
        {
            System.out.println(ce);
        }
        return message;
    }


}
