/**
 * Created by Emessar_WinPC on 04 Дек., 2018
 */

// Распечатать символы с кодами от 0 до 512 и найти русские все буквы.
// Написать в качестве ответа к домашнему заданию коды русских букв.

public class Loader
{
    public static void main(String[] args)
    {
        for (int i = 1040; i < 1072; i++)
        {
            System.out.println((char)i + ": " + i + "           " + (char)(i + 32) + ": " + (i + 32));
        }

    }
}
