import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Created by User on 10 Июнь, 2019
 */
class HandlerArrayList
{
    private static final String COMMAND_LIST = "LIST";
    private static final String COMMAND_ADD = "ADD";
    private static final String COMMAND_EDIT = "EDIT";
    private static final String COMMAND_DELETE = "DELETE";

    private ArrayList<String> list;

    public HandlerArrayList()
    {
        list = new ArrayList<>();
    }

    public void scannerCommand(String input)
    {
        String[] sArray = input.split("\\s", 3);

        String command = sArray[0];
        if (command.compareTo(COMMAND_ADD) != 0 && command.compareTo(COMMAND_DELETE) != 0 &&
                command.compareTo(COMMAND_EDIT) != 0 && command.compareTo(COMMAND_LIST) != 0)
        {
            System.out.println("\"" + input  + "\"" + " не содержит команды!");
            return;
        }

        if (command.compareTo(COMMAND_LIST) == 0)
        {
            showList();
            return;
        }

        String value = "";
        int iParam = -1;

        if (sArray.length < 2){
            System.out.println(" Команда " + command + " вызывается неверно!");
            return;
        }
        if (sArray[1].matches("\\d+"))
        {
            iParam = Integer.parseInt(sArray[1]);
            if (sArray.length == 3)
            {
                value = sArray[2];
            }
        } else
        {
            sArray = input.split("\\s", 2);
            if (sArray.length == 2)
            {
                value = sArray[1];
            }
        }

        switch (command)
        {
            case COMMAND_ADD:
                add(iParam, value);
                break;
            case COMMAND_DELETE:
                delete(iParam);
                break;
            case COMMAND_EDIT:
                edit(iParam, value);
                break;
        }

    }

    private void showList()
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(" " + i + " - " + list.get(i));
        }
    }

    private void add(int index, String stringItem)
    {
        if (index < 0 || index > list.size())
        {
            list.add(stringItem);
        } else
        {
            list.add(index, stringItem);
        }
    }

    private void edit(int index, String stringItem)
    {
        if (index < 0)
        {
            System.out.println(" Команда EDIT должна иметь параметр");
        } else if (index > list.size())
        {
            System.out.println(" Команда EDIT должна иметь параметр не превышающий размер листа");
        } else
        {
            list.remove(index);
            list.add(index, stringItem);
        }
    }


    private void delete(int index)
    {
        if (index < 0)
        {
            System.out.println(" Команда DELETE должна иметь параметр");
        } else if (index > list.size())
        {
            System.out.println(" Команда DELETE должна иметь параметр не превышающий размер листа");
        } else
        {
            list.remove(index);
        }
    }


}
