package Clients;

/**
 * Created by User on 25 Июнь, 2019
 */
abstract public class Client
{
    protected double amount;
    protected String captionClient;
    abstract public void topUp(double amount);
    abstract public void withDraw(double amount);
    public void showBalance()
    {
        System.out.println(captionClient + ": баланс счета составляет " + amount);
    }
}
