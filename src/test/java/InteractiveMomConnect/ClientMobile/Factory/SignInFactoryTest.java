package InteractiveMomConnect.ClientMobile.Factory;

import InteractiveMomConnect.ClientMobile.SignIn;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SignInFactoryTest {

    @Test
    public void getSignIn() {
        String ID = "W8465";
        int password = 24785682;
        SignIn signIn = SignInFactory.getSignIn(ID, password);
        System.out.println(signIn);
        Assert.assertNotNull(signIn.toString());
    }
}