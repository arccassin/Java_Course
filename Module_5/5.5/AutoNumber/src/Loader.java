import java.util.*;

/**
 * Created by Emessar_WinPC on 04 Дек., 2018
 */
public class Loader
{

    public static void main(String[] args)
    {

        //A333AA197
        String[] symbList = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        ArrayList<String> numbers = new ArrayList<>();

        long start = System.currentTimeMillis();
        for (String symb1 : symbList)
        {
            for (int i = 1; i < 198; i++)
            {
                for (int j = 0; j < 1000; j++)
                {
                    for (String symb2 : symbList)
                    {




                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(symb1);
                            if (j < 10)
                            {
                                stringBuilder.append("00" + j);
                            } else if (j > 9 && j < 100)//&& (j % 11 != 0))
                            {
                                stringBuilder.append((j % 10) + String.valueOf(j));
                            } else if (j % 10 == j / 100 || j % 100 == 0)
                            {
                                stringBuilder.append(j);
                            } else continue;

                            stringBuilder.append(symb2);
                            stringBuilder.append(symb1);

                            if (i < 10)
                            {
                                stringBuilder.append("0");
                            }
                            stringBuilder.append(i);
                            numbers.add(stringBuilder.toString());

                    }
                }
            }
        }

        System.out.println("Заполнение листа в " + numbers.size() + " = " + (System.currentTimeMillis() - start));

        Scanner scanner = new Scanner(System.in);
        String input;

        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(numbers);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(numbers);

        do
        {
            input = scanner.nextLine();
            String sMess = "Прямой перебор";
            start = System.currentTimeMillis();
            System.out.println(numbers.contains(input));
            System.out.println(sMess + " = " + (System.currentTimeMillis() - start));

            sMess = "Бинарный поиск";
            start = System.currentTimeMillis();
            System.out.println(Collections.binarySearch(numbers, input));
            System.out.println(sMess + " = " + (System.currentTimeMillis() - start));

            sMess = "HashSet";
            start = System.currentTimeMillis();
            System.out.println(hashSet.contains(input));
            System.out.println(sMess + " = " + (System.currentTimeMillis() - start));

            sMess = "TreeSet";
            start = System.currentTimeMillis();
            System.out.println(treeSet.contains(input));
            System.out.println(sMess + " = " + (System.currentTimeMillis() - start));
        }
        while (input.compareTo("exit") != 0);
    }
}
