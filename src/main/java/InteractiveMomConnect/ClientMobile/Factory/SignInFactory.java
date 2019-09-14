package InteractiveMomConnect.ClientMobile.Factory;

import InteractiveMomConnect.ClientMobile.SignIn;

public class SignInFactory {

    public static SignIn getSignIn(String id, int pass){
        return new SignIn.Builder()
                .IDnumber(id)
                .password(pass)
                .build();
    }
}
