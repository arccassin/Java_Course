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
        for (int I = 200000; I <= 235000; I++)
        {
            if ((I<=210000) || (I >= 220000))
            {
                System.out.println("Ticket number " + I);
            }
        }

        System.out.println("Ticket numbers of while loop ==========================================");
        Integer I = 200000;
        do
        {
            if ((I<=210000) || (I >= 220000))
            {
                System.out.println("Ticket number " + I);
            }
            I++;
        }while (I <= 235000);

    }
}

