import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Emessar_WinPC on 04 Дек., 2018
 */
public class Loader
{

    public static void main(String[] args)
    {

        Calendar calendar = Calendar.getInstance();
        Date nowdate = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - EEE", Locale.ENGLISH);
        calendar.set(1990,Calendar.DECEMBER,2);
        int inc = 0;

        while (calendar.getTime().before(nowdate))
        {
            Date currentDate = calendar.getTime();
            System.out.println(inc + " - " + dateFormat.format(calendar.getTime()) + "\n");
            calendar.add(Calendar.YEAR, 1);
            inc++;
        }
    }
}


//          0 - 13.02.1989 - Mon
//
//          1 - 13.02.1990 - Tue

