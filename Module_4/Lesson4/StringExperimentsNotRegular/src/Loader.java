
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 50001 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        //Вася и Миша
        int beginIndex = text.indexOf(" ") + 1;
        text = text.substring(beginIndex);
        beginIndex = text.indexOf(' ') + 1;
        text = text.substring(beginIndex);
        beginIndex = text.indexOf(' ');

        int firstNum = Integer.parseInt(text.substring(0, beginIndex));

        beginIndex = text.lastIndexOf("-") + 2;
        text = text.substring(beginIndex);
        beginIndex = text.indexOf(' ');

        int secondNum = Integer.parseInt(text.substring(0, beginIndex));

        System.out.println("Сумма: " +  (firstNum + secondNum));
    }
}