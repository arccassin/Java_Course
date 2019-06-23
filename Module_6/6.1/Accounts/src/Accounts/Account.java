package Accounts;

/**
 * Created by User on 23 Июнь, 2019
 */
public class Account
{
    private double amount;

    public void topUP(double amount)
    {
        if (amount > 0)
        {
            this.amount += amount;
        } else
            System.out.println("Поплолнить счет можно только на положительную сумму");
    }

    public void withDraw(double amount)
    {
        if (amount > 0)
        {
            this.amount -= amount;
        } else
            System.out.println("Снять со счета можно только положительную сумму");
    }

    public void showBalance(){
        System.out.println("Баланс счета составляет " + amount);
    }

}
