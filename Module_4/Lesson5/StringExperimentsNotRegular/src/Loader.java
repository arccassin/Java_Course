
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        //Вася и Миша
        int beginIndex = text.indexOf(" ") + 1;
        String text2 = text.substring(beginIndex);
        beginIndex = text2.indexOf(" ") + 1;
        String text3 = text2.substring(beginIndex);
        beginIndex = text3.indexOf(" ");

        int firstNum = Integer.parseInt(text3.substring(0, beginIndex));

        beginIndex = text3.lastIndexOf("-") + 2;
        String text4 = text3.substring(beginIndex);
        beginIndex = text4.indexOf(" ");

        int secondNum = Integer.parseInt(text4.substring(0, beginIndex));

        System.out.println("Вася: " + firstNum);

        System.out.println("Миша: " + secondNum);
    }
}