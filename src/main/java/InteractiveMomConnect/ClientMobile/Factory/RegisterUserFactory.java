package InteractiveMomConnect.ClientMobile.Factory;

import InteractiveMomConnect.ClientMobile.RegisterUser;

import java.sql.Date;
import java.util.Map;

public class RegisterUserFactory {

    public static RegisterUser getRegisterUser(String id, String name, String sname, String addr, int pass, String dateStart, String due_date){
        return new RegisterUser.Builder()
                .IDnumber(id)
                .name(name)
                .surname(sname)
                .address(addr)
                .password(pass)
                .startDate(dateStart)
                .due_Date(due_date)
                .build();
    }
}
