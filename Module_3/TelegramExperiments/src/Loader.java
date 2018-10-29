import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthAuthorization;
import org.javagram.response.AuthCheckedPhone;
import org.javagram.response.AuthSentCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

/**
 * Created by Emessar_WinPC on 28 Окт., 2018
 */
public class Loader
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443", 615110,
                "cf73ad86c092a27efec8ea85a696de93");

        System.out.println("Please, type phone number");
        String phoneNumber = reader.readLine().trim();
//        AuthCheckedPhone checkedPhone = bridge.authCheckPhone(reader.readLine().trim());
//        System.out.println(checkedPhone.isRegistered());

        AuthSentCode sentCode= bridge.authSendCode(phoneNumber);
        System.out.println("Please, type confirmation code");
        AuthAuthorization authAuthorization = bridge.authSignIn(reader.readLine().trim());
        System.out.println("FirstName: " + authAuthorization.getUser().getFirstName());
        bridge.authLogOut();
    }
}
