public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(sumDigits(container.count));
    }

    public static Integer sumDigits(Integer number)
    {
        String str = number.toString();
        int sum = 0;
        for (int i = 0; i < str.length(); i++)
        {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        return sum;
    }
}
