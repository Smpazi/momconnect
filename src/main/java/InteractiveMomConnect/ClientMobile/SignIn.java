package InteractiveMomConnect.ClientMobile;

public class SignIn {

    String IDnumber;
    int password;

    private SignIn(){

    }
    private SignIn(Builder builder){
        this.IDnumber=builder.IDnumber;
        this.password=builder.password;
    }

    public String getIDnumber() {
        return IDnumber;
    }

    public int getPassword() {
        return password;
    }


    public static class Builder{
        String IDnumber;
        int password;

        public  Builder IDnumber(String IDnumber){
            this.IDnumber= IDnumber;
            return this;
        }
        public  Builder password(int password) {
            this.password = password;
            return this;
        }

        public  SignIn build(){
            return new SignIn(this);
        }
    }

    @Override
    public String toString() {
        return "ID number:" + getIDnumber() +
                "Password;" + getPassword() + "\n";
    }
}
