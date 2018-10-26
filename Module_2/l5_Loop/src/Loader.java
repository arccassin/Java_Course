/**
 * Created by Emessar on 23 Окт., 2018
 */
public class Loader
{
    public static void main(String[] args)
    {
        Integer I = 200000;
        do
        {
            System.out.println("Ticket number " + I);
            I++;
        }while (I <= 210000);
    }
}
