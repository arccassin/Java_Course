package Clients;

/**
 * Created by User on 25 Июнь, 2019
 */
public class NaturalPersonClient extends Client
{
    public NaturalPersonClient()
    {
        captionClient = "Счет физического лица";
    }

    @Override
    public void topUp(double amount)
    {
        if (amount < 0){
            System.out.println("Нельзя пополнить счет отрицательной суммой!");
            return;
        }
        this.amount += amount;
    }

    @Override
    public void withDraw(double amount)
    {
        if (amount < 0){
            System.out.println("Нельзя снять со счета отрицательную сумму!");
            return;
        }
        if (this.amount < amount)
        {
            System.out.println("Средств счета недостаточно для снятия");
        } else this.amount -= amount;
    }
}
