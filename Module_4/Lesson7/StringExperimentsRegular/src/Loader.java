
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей. А Олегу папа дал 100000";

        text = text.replaceAll("[^0-9\\s]", "");

        text = text.trim();

        String summStr[] = text.split("\\s+");

        int summ = 0;
        for (int i = 0; i < summStr.length; i++)
        {
            summ += Integer.parseInt(summStr[i]);
        }

        System.out.println("Сумма: " + summ);
    }
}