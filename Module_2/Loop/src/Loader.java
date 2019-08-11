/**
 * Created by Emessar on 23 Окт., 2018
 *
 *Написать код с использованием цикла for, который будет
 *последовательно распечатывать в консоли номера билетов
 *от 200000 до 210000 и от 220000 до 235000.
 *
 *Написать такой же код, но с использованием цикла while.
 */
public class Loader
{
    public static void main(String[] args)
    {

        System.out.println("Ticket numbers of for loop ==========================================");
        for (int i = 200000; i <= 235000; i++)
        {
            if ((i<=210000) || (i >= 220000))
            {
                System.out.println("Ticket number " + i);
            }
        }

        System.out.println("Ticket numbers of while loop ==========================================");
        int i = 200000;
        do
        {
            if ((i<=210000) || (i >= 220000))
            {
                System.out.println("Ticket number " + i);
            }
            i++;
        }while (i <= 235000);

    }
}

