package InteractiveMomConnect.ServerSystem;

import InteractiveMomConnect.ClientMobile.RegisterUser;

import java.io.*;
import java.sql.*;

public class Standalone {

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;

    public Standalone(){

    }

    public void ConnectDB(){

        try{
            connection= DriverManager.getConnection("jdbc:ucanaccess://MomConnectDatabase.accdb");
            statement= connection.createStatement();
            System.out.println("Connected!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public  void createTable(){

        try{
            statement.executeUpdate("CREATE TABLE Users(ID_Number VARCHAR(30) NOT NULL, Fname VARCHAR(30) NOT NULL, Surname VARCHAR(30), Address VARCHAR(60) NOT NULL, Password INT NOT NULL, DateStarted DATE , DateDue  DATE , PRIMARY KEY (ID_Number) )");
            System.out.println("Table Created.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillUserTable(){
        int count =0;
        try {
            ObjectInputStream inputUser = new ObjectInputStream(new FileInputStream("User.ser"));
            RegisterUser user;
            while (true)
            {
                user =(RegisterUser)inputUser.readObject();
                preparedStatement= connection.prepareStatement("INSERT INTO Users(ID_Number,Fname,Surname,Address,Password,DateStarted, DateDue) VALUES (?,?,?,?,?,?,?)");
                preparedStatement.setString(1,user.getIDnumber());
                preparedStatement.setString(2,user.getName());
                preparedStatement.setString(3,user.getSurname());
                preparedStatement.setString(4,user.getAddress());
                preparedStatement.setInt(5,user.getPassword());
                preparedStatement.setDate(6,user.getDateStarted());
                preparedStatement.setDate(7,user.getDateDue());

                preparedStatement.executeUpdate();
                count++;
            }
        }
        catch(EOFException ee)
        {
            System.out.println("Users rows inserted: " + count);
            return;
        }
        catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[]args){
        Standalone standalone= new Standalone();
        standalone.ConnectDB();
        standalone.createTable();
        standalone.fillUserTable();
    }
}
