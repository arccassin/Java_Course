import java.util.Scanner;

/**
 * Created by Emessar_WinPC on 04 Дек., 2018
 */
public class Loader
{

    public static void main(String[] args)
    {
        float[] temperatures = new float[30];

        for (int i = 0; i < temperatures.length; i++)
        {
            temperatures[i] = (float) (Math.random() * 8 + 32);
        }

        float middleTemp = 0;
        for (float temp : temperatures)
        {
            middleTemp += temp;
        }

        middleTemp /= temperatures.length;
        System.out.println("Средняя температура по больнице = " + middleTemp);

        int halty = 0;
        for (float temp : temperatures)
        {
            if (temp > 36.2 && temp < 36.9)
            {
                halty++;
            }
        }
        System.out.println("/nЗдоровые пациенты: " + halty);
    }
}

