import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Terminal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emessar_WinPC on 04 Дек., 2018
 */
public class Loader
{
    public static void main(String[] args)
    {
        Terminal terminal = new Terminal("A");
        terminal.getArrivalAircrafts();

        Airport airport = Airport.getInstance();
        System.out.println(airport.getAllAircrafts().size());

    }
}
