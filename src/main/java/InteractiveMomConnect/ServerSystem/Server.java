package InteractiveMomConnect.ServerSystem;

import InteractiveMomConnect.ClientMobile.RegisterUser;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.ArrayList;

public class Server {
    private ServerSocket listener;

    private Socket client;
    private ObjectOutputStream out = null;
    private ObjectInputStream in = null;
    String message = "";

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;


    public Server()
             {
                 try
                 {
                     listener = new ServerSocket(7000,10);
                     connectDB();
                     listen();
                     createStreams();
                     process();
                 }
                 catch(IOException ioe)
                 {
                     System.out.println(ioe.getMessage());
                 }
    }

    public void connectDB()
    {
        try
        {
            connection = DriverManager.getConnection("jdbc:ucanaccess://MomConnectDatabase.accdb");
            statement = connection.createStatement();
            System.out.println("connected");
        }
        catch(SQLException se)
        {
            System.out.println(se);
        }
    }

    public void listen()
    {
        try
        {
            System.out.println("Listening...");
            client = listener.accept();
            System.out.println("Client connected.");
        }
        catch(IOException ioe)
        {
            System.out.println("" + ioe);
        }
    }

    public void createStreams()
    {
        try
        {
            out = new ObjectOutputStream(client.getOutputStream());
            out.flush();

            in = new ObjectInputStream(client.getInputStream());
        }
        catch(IOException ioe)
        {

        }
    }
    public void process()
    {
        try
        {
            do
            {
                message = (String)in.readObject();
                System.out.println("FROM CLIENT: " + message);

                if(message.equals("AddNewUser"))
                {
                    RegisterUser user = (RegisterUser) in.readObject();
                    ArrayList<String> ids = new ArrayList<>();

                    resultSet = statement.executeQuery("SELECT ID_Number FROM Users");

                    while(resultSet.next())
                    {
                        ids.add(resultSet.getString(1));
                    }

                    preparedStatement= connection.prepareStatement("INSERT INTO Users(ID_Number,Fname,Surname,Province,Address,DateStarted, DateDue,ClinicName) VALUES (?,?,?,?,?,?,?,?)");
                    preparedStatement.setString(1,user.getIDnumber());
                    preparedStatement.setString(2,user.getName());
                    preparedStatement.setString(3,user.getSurname());
                    preparedStatement.setString(4,user.getProvince());
                    preparedStatement.setString(5,user.getAddress());
                    preparedStatement.setDate(6,user.getDateStarted());
                    preparedStatement.setDate(7,user.getDateDue());
                    preparedStatement.setString(8,user.getVisit());

                    preparedStatement.executeUpdate();

                    out.writeObject("NewUser " + (ids.get(ids.size() - 1) + 100) + " has been added to the database");
                    out.flush();
                }

                if(message.equals("UpdateUser"))
                {
                    RegisterUser user = (RegisterUser) in.readObject();

                    preparedStatement = connection.prepareStatement("UPDATE Users SET Fname = ?, Surname = ?, Province= ?, Address = ? ClinicName= ? WHERE ID_Number = ?");
                    preparedStatement.setString(1,user.getName());
                    preparedStatement.setString(2,user.getSurname());
                    preparedStatement.setString(3,user.getProvince());
                    preparedStatement.setString(4,user.getAddress());
                    preparedStatement.setString(5,user.getVisit());
                    preparedStatement.setString(6,user.getIDnumber());

                    preparedStatement.executeUpdate();

                    out.writeObject("User " + user.getIDnumber() + "User information has been updated");
                    out.flush();
                }

            }while(!message.equals("CLOSE"));

            System.out.println("Client disconnected.");
        }
        catch(IOException ioe)
        {
            System.out.println("" + ioe);
        }
        catch(ClassNotFoundException cnfe)
        {
            System.out.println(""+cnfe);
        }
        catch(SQLException se)
        {
            System.out.println(se);
        }
    }

    public static void main(String[] args)
    {
        new Server();
    }

}
