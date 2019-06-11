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
        HandlerArrayList handlerArrayList = new HandlerArrayList();

        do
        {
            input = scanner.nextLine();

            handlerArrayList.scannerCommand(input);

        }
        while (input.compareTo("exit") != 0);
    }
}
