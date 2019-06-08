import java.util.Scanner;

/**
 * Created by Emessar_WinPC on 04 Дек., 2018
 */
public class Loader
{

    public static void main(String[] args)
    {
        String[][] arrayX = new String[7][7];
        for (int i = 0; i < arrayX.length; i++)
        {
            for (int j = 0; j < arrayX[i].length; j++)
            {
                if (j == i || j == arrayX[i].length - 1 - i)
                {
                    arrayX[i][j] = "X";
                } else
                {
                    arrayX[i][j] = " ";
                }
            }
        }
        for (int i = 0; i < arrayX.length; i++)
        {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < arrayX[i].length; j++)
                builder.append(arrayX[i][j]);
            System.out.println(builder);
        }
    }
}

//0123456
//x     x