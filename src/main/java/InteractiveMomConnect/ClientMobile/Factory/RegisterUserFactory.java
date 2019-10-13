package InteractiveMomConnect.ClientMobile.Factory;

import InteractiveMomConnect.ClientMobile.RegisterUser;

import java.sql.Date;
import java.util.Map;

public class RegisterUserFactory {

    public static RegisterUser getRegisterUser(String id, String name, String sname, String prov,String addr,  String dateStart, String due_date, String visit){
        return new RegisterUser.Builder()
                .IDnumber(id)
                .name(name)
                .surname(sname)
                .province(prov)
                .address(addr)
                .startDate(dateStart)
                .due_Date(due_date)
                .visit(visit)
                .build();
    }
}
