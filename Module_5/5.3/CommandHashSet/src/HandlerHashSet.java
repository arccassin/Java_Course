import java.util.HashSet;

/**
 * Created by User on 10 Июнь, 2019
 */
class HandlerHashSet
{
    private static final String COMMAND_LIST = "LIST";
    private static final String COMMAND_ADD = "ADD";

    private HashSet<String> hashset;

    public HandlerHashSet()
    {
        hashset = new HashSet<String>();
    }

    public void scannerCommand(String input)
    {
        String[] sArray = input.split("\\s", 2);

        String command = sArray[0];
        if (command.compareTo(COMMAND_ADD) != 0 && command.compareTo(COMMAND_LIST) != 0)
        {
            System.out.println("\"" + input + "\"" + " не содержит команды!");
            return;
        }

        if (command.compareTo(COMMAND_LIST) == 0)
        {
            showList();
            return;
        }


        if (sArray.length < 2)
        {
            System.out.println(" Команда " + command + " вызывается неверно!");
            return;
        }

        String email = sArray[1];


        if (!(email.matches("^.+@.+")))
        {
            System.out.println("E-mail \"" + sArray[1] + "\" не корректен!");
            return;
        }

        switch (command)
        {
            case COMMAND_ADD:
                add(email);
                break;
        }

    }

    private void showList()
    {
        for (String item : hashset)
        {
            System.out.println(" " + item);
        }
    }

    private void add(String stringItem)
    {
        if (!hashset.add(stringItem))
        {
            System.out.println(" Такой e-mail уже присутствует в списке");
        }
    }


}
