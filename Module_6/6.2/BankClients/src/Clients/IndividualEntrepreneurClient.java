package Clients;

/**
 * Created by User on 25 Июнь, 2019
 */
public class IndividualEntrepreneurClient extends Client
{
    public IndividualEntrepreneurClient()
    {
        captionClient = "Счет индивидуального предпринимателя";
    }

    @Override
    public void topUp(double amount)
    {
        if (amount < 0)
        {
            System.out.println("Нельзя пополнить счет отрицательной суммой!");
            return;
        }

        if (amount < 1000)
        {
            this.amount += (amount * 0.99);
        } else this.amount += (amount * 0.995);
    }

    @Override
    public void withDraw(double amount)
    {
        if (amount < 0)
        {
            System.out.println("Нельзя снять со счета отрицательную сумму!");
            return;
        }
        if (this.amount < amount)
        {
            System.out.println("Средств счета недостаточно для снятия");
        } else this.amount -= amount;
    }
}
