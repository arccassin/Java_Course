import com.skillbox.airport.Airport;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Emessar_WinPC on 04 Дек., 2018
 */
public class Loader
{

    public static void main(String[] args)
    {
        Airport airport = Airport.getInstance();

        airport.getTerminals().stream()
                .forEach(terminal1 -> terminal1
                        .getFlights().stream().filter(flight -> {
                            Calendar c = Calendar.getInstance();
                            c.setTime(flight.getDate());
                            Calendar nc = Calendar.getInstance();
                            nc.add(Calendar.HOUR_OF_DAY, 2);
                            return (flight.getType().toString() == "DEPARTURE")
                                    && (c.after(Calendar.getInstance()) && c.before(nc));
                        })
                        .forEach(flight -> {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
                            System.out.println(simpleDateFormat.format(flight.getDate())
                                    + "\t" + flight.getAircraft().getModel());
                        }));


    }
}
