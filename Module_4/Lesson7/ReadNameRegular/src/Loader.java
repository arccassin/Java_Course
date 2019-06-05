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

        String[] strings = inStr.split("\\s+", 3);

        String family = strings[0];
        String name = strings[1];
        String lastname = strings[2];
        System.out.println("Фамилия: " + family + "\nИмя: " + name + "\nОтчество: " + lastname);
    }
}
