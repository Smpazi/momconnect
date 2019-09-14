package InteractiveMomConnect.ClientMobile;

import java.io.Serializable;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class RegisterUser implements Serializable {
   private String name, surname, IDnumber, address;
   private int  password;
   private String dateStarted;
   private String dateDue;

    private SimpleDateFormat sft = new SimpleDateFormat("dd MMM yyyy");

    private RegisterUser(){

    }
    private RegisterUser(Builder builder){
        this.IDnumber=builder.IDnumber;
        this.name=builder.name;
        this.surname=builder.surname;
        this.address=builder.address;
        this.password= builder.password;
        this.dateStarted = builder.dateStarted;
        this.dateDue = builder.dateDue;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getIDnumber() {
        return IDnumber;
    }

    public int getPassword() {
        return password;
    }

    public java.sql.Date getDateStarted() {

        java.sql.Date date = null;
        try
        {
            Date startDate = sft.parse(dateStarted);

            date = new java.sql.Date(startDate.getTime());
        }
        catch(ParseException pe)
        {

        }
        return date;
    }

    public java.sql.Date getDateDue() {
        java.sql.Date date = null;
        if(!dateDue.equals("NA"))
        {
            try {
                Date dueDate = sft.parse(dateDue);
                date = new java.sql.Date(dueDate.getTime());
            }
            catch (ParseException e) {
               // e.printStackTrace();
            }
        }
        return date;
    }

    public static class Builder{
        String name, surname, IDnumber, address;
        int password;
        private String dateStarted;
        private String dateDue;
        public  Builder name(String name){
            this.name= name;
            return this;
        }
        public  Builder surname(String surname){
            this.surname= surname;
            return this;
        }
        public  Builder IDnumber(String IDnumber){
            this.IDnumber= IDnumber;
            return this;
        }
        public  Builder address(String address){
            this.address= address;
            return this;
        }
        public  Builder password(int password){
            this.password= password;
            return this;
        }
            public  Builder startDate(String dateStarted){
            this.dateStarted= dateStarted;
            return this;
        }
        public  Builder due_Date(String dueDate){
            this.dateDue= dueDate;
            return this;
        }




        public RegisterUser build(){
            return new RegisterUser(this);
        }
    }

    @Override
    public String toString() {
        return ""+ getIDnumber()+ " " + getName()+ " " + getSurname()+ " " + getAddress()+ " "+ getPassword()+" "+ getDateStarted()+" " + getDateDue();
    }

}
