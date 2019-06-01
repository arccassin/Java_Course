/**
 * Created by Emessar_WinPC on 04 Дек., 2018
 */

// Распечатать символы с кодами от 0 до 512 и найти русские все буквы.
// Написать в качестве ответа к домашнему заданию коды русских букв.

public class Loader
{
    static final int SYMBOL_RUS_BEGIN = 0x0410;
    static final int SYMBOL_RUS_END = 0x042f;
    static final int SYMBOL_EN_BEGIN = 0x0041;
    static final int SYMBOL_EN_END = 0x005B;

    public static void main(String[] args)
    {
        int SymbolCount = SYMBOL_RUS_END - SYMBOL_RUS_BEGIN + 1;
        for (int i = SYMBOL_RUS_BEGIN; i < SYMBOL_RUS_END; i++)
        {
            System.out.println((char)i + ": " + i + "\t\t\t" + (char)(i + SymbolCount) + ": " + (i + SymbolCount));
        }

        System.out.println("");
        SymbolCount = SYMBOL_EN_END - SYMBOL_EN_BEGIN + 6;
        for (int i = SYMBOL_EN_BEGIN; i < SYMBOL_EN_END; i++)
        {
            System.out.println((char) + i + ": " + i + "  \t\t\t" + (char)(i + SymbolCount) + ": " + (i + SymbolCount));
        }


    }
}
