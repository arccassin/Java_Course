package Accounts;

/**
 * Created by User on 23 Июнь, 2019
 */
public class CardAccount extends Account
{
    @Override
    public void withDraw(double amount)
    {
        super.withDraw(amount * 1.01);
    }
}
