package Clients;

/**
 * Created by User on 25 Июнь, 2019
 */
public class LegalPersonClient extends Client
{
    public LegalPersonClient()
    {
        captionClient = "Счет юридического лица";
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
        double currentAmount = 1.01 * amount;
        if (this.amount < currentAmount)
        {
            System.out.println("Средств счета недостаточно для снятия");
        } else this.amount -= currentAmount;
    }
}
