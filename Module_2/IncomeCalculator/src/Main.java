import java.util.Scanner;

public class Main
{
    //задаем статические поля класса
    private static int minIncome = 200000;
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000;

    public static void main(String[] args)
    {
        //расчет minIncome
        double minIncome = (minInvestmentsAmount/(1-mainTaxPercent) + calculateFixedCharges())/(1-managerPercent);
        System.out.println("Минимальный доход должен составлять " + minIncome);

        //начало бексонечного цикла while
        while (true)
        {
            //Вывод сообщения с правилами ввода
            System.out.println("Введите сумму доходов компании за месяц " +
                    "(от 200 до 900 тысяч рублей): ");
            //считываем введенное число в целочисленную переменную
            int income = (new Scanner(System.in)).nextInt();
            //вызов функции, которая проверяет границы введенного значения и в случае
            // несоответствия заканчивает итерацию цикла
            if (!checkIncomeRange(income))
            {
                continue;
            }
            //расчитываем вознаграждение менеджера
            double managerSalary = income * managerPercent;
            //расчитываем чистый доход после вычета фиксированных расходов, которые считаются в
            // функции и платы менеджеру
            double pureIncome = income - managerSalary -
                    calculateFixedCharges();
            //считаем сумму налога от чистого дохода
            double taxAmount = mainTaxPercent * pureIncome;
            //считаем доход после вычета налога
            double pureIncomeAfterTax = pureIncome - taxAmount;
            //записываем в логическую переменную результат сравнения дохода после вычета налога и
            // заданной минимальной суммы для инвестирования
            boolean canMakeInvestments = pureIncomeAfterTax >=
                    minInvestmentsAmount;
            //выводим на экран зарплату менеджера
            System.out.println("Зарплата менеджера: " + managerSalary);
            //выводим на экран общую сумму налога, тернарным оператором выводя
            // неотрицательную сумму
            System.out.println("Общая сумма налогов: " +
                    (taxAmount > 0 ? taxAmount : 0));
            //выводим тернарным оператором возможность инвестирования
            System.out.println("Компания может инвестировать: " +
                    (canMakeInvestments ? "да" : "нет"));
            //если чистый доход в минусе, то пишем важный бизнес совет
            if (pureIncome < 0)
            {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    private static boolean checkIncomeRange(int income)
    {   //проверка границ и вывод на экран при выходе за них
        if (income < minIncome)
        {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if (income > maxIncome)
        {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges()
    {   //сумируем заданные поля налогов
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
