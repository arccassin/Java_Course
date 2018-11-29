
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        //Вася и Миша
        int beginIndex = text.indexOf("л") + 1;
        System.out.println("Вася: " + text.substring(beginIndex, beginIndex + 5));
        beginIndex = text.lastIndexOf("-") + 1;
        System.out.println("Миша: " + text.substring(beginIndex, beginIndex + 6));
    }
}