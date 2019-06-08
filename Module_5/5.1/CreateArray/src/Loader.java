import java.util.Scanner;


public class Loader
{

    public static void main(String[] args)
    {
        String text = "каждый охотник желает знать где сидит фазан";
        String[] textArray =text.split("\\s");

        System.out.println("Изначальный массив:/n");
        for (String stmp:textArray)
        {
            System.out.println(stmp);
        }

        String tmpStr;
        for (int i = 0; i < (textArray.length / 2); i++)
        {
            tmpStr = textArray[i];
            textArray[i] = textArray[textArray.length - 1 - i];
            textArray[textArray.length - 1 - i] = tmpStr;
        }

        System.out.println("\nВывод обратного массива\n");
        for (String stmp:textArray)
        {
            System.out.println(stmp);
        }
    }
}
