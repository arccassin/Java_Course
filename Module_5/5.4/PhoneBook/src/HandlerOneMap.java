import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by User on 16 Июнь, 2019
 */
public class HandlerOneMap
{

    private static final String COMMAND_LIST = "LIST";

    private TreeMap<String, String> treeMapKeyName;

    HandlerOneMap()
    {
        treeMapKeyName = new TreeMap<String, String>();
    }

    void scannerCommand(String input)
    {

        if (input.compareTo(COMMAND_LIST) == 0)
        {
            showList();
            return;
        }

        String phoneFormat = FormatPhoneNumber.formatPhone(input);
        if (phoneFormat == null)
        {
            //вводим ФИО
            if (treeMapKeyName.containsKey(input))
            {
                showRec(input);
            } else
            {
                System.out.println("Новый контакт! Введите номер");
                Scanner scanner = new Scanner(System.in);
                phoneFormat = FormatPhoneNumber.formatPhone(scanner.nextLine());
                if (phoneFormat == null)
                {
                    System.out.println("Неверный формат номера!");
                    return;
                }
                if (treeMapKeyName.containsValue(phoneFormat))
                {
                    showRecByValue(phoneFormat);
                } else
                {
                    treeMapKeyName.put(input, phoneFormat);
                }
            }
        } else
        {
            //вводим телефон
            if (treeMapKeyName.containsValue(phoneFormat))
            {
                showRecByValue(phoneFormat);
            } else
            {
                System.out.println("Новый контакт! Введите имя");
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                if (treeMapKeyName.containsKey(name))
                {
                    showRec(name);
                } else
                {
                    treeMapKeyName.put(name, phoneFormat);
                }

            }
        }


    }

    private void showList()
    {
        for (String name : treeMapKeyName.keySet())
        {
            System.out.println("  " + name + " : " + treeMapKeyName.get(name));
        }
    }

    private void showRec(String name)
    {
        System.out.println("  " + name + " : " + treeMapKeyName.get(name));
    }

    private void showRecByValue(String value)
    {
        for (String name : treeMapKeyName.keySet())
        {
            if (value.equals(treeMapKeyName.get(name)))
            {
                System.out.println("  " + name + " : " + value);
            }
        }

    }


}
