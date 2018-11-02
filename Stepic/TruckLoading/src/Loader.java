import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Emessar_WinPC on 03 Нояб., 2018
 */
public class Loader
{
    public static int truckCapacity = 12;
    public static int conteinerCapacity = 27;

    public static void main(String[] args) throws IOException
    {
        System.out.println("Введите количество ящиков: ");
        int boxCount = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        int truckCount = 1;
        int conteinerCount = 1;
        boolean newTruck = true;
        boolean newConteiner = true;
        for (int i = 1; i <= boxCount; i++)
        {
            if (newTruck && newConteiner) System.out.println("Грузовик " + truckCount + ":");

            if (newConteiner) System.out.println("      Контейнер " + conteinerCount + ":");

            System.out.println("            Ящик " + i + ":");
            //проверяем, не закончилась ли вместимость
            if (i % conteinerCapacity == 0)
            {
                conteinerCount++;
                newConteiner = true;
            }
            else
                newConteiner = false;
            if (newConteiner && ((conteinerCount - 1) % truckCapacity == 0))
            {
                truckCount++;
                newTruck = true;
            }
            else
                newTruck = false;
        }
    }
}
