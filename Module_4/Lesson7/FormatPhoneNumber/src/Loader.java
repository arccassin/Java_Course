import java.util.Scanner;

/**
 * Created by Emessar_WinPC on 04 Дек., 2018
 */
public class Loader
{

    public static void main(String[] args)
    {
        String stringReturn = "exit";
        Scanner scanner = new Scanner(System.in);
        do
        {
            String input = scanner.nextLine();
            if (input.compareToIgnoreCase(stringReturn) == 0)
            {
                return;
            }
            input = input.replaceAll("\\D", "");
            if (input.length() == 0){
                continue;
            }
            StringBuilder builder = new StringBuilder();
            if (input.length() > 8 && input.length() < 12)
            {
                if (input.length() == 10)
                {
                    input = "7" + input;
                }

                if ((input.charAt(0) != '7') && (input.charAt(0) != '8'))
                {
                    builder.append("Not valid first symbol");
                } else
                {
                    builder.append("+ 7 ");


                    for (int i = 1; i < input.length(); i++)
                    {

                        if (i == 4)
                        {
                            builder.append(" ");
                        }
                        if ((i == 7) || (i == 9))
                        {
                            builder.append("-");
                        }
                        builder.append(input.charAt(i));

                    }
                }
            } else builder.append("Not valid");
            input = builder.toString();
            System.out.println("\n" + input);
        }
        while (true);
        //      0 123 456 78 910
        //out + 7 904 123-45-57
    }
}
