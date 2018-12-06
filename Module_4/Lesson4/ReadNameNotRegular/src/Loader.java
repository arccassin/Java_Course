import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * Created by Emessar_WinPC on 02 Дек., 2018
 */
public class Loader
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inStr = bufferedReader.readLine();
        int num = inStr.indexOf(' ');
        if (num < 0) return;
        String family = inStr.substring(0, num);
        inStr = inStr.substring(num + 1);
        num = inStr.indexOf(' ');
        if (num < 0) return;
        String name = inStr.substring(0, num);
        inStr = inStr.substring(num + 1);
        System.out.println("Фамилия: " + family + "\nИмя: " + name + "\nОтчество: " + inStr);

    }
}
