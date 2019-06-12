import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Emessar_WinPC on 04 Дек., 2018
 */
public class Loader
{

    public static void main(String[] args)
    {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        HandlerHashSet handlerHashSet = new HandlerHashSet();

        do
        {
            input = scanner.nextLine();

            handlerHashSet.scannerCommand(input);

        }
        while (input.compareTo("exit") != 0);
    }
}
