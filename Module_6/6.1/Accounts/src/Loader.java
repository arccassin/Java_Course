import Accounts.Account;
import Accounts.CardAccount;
import Accounts.DepositAccount;

import java.util.Scanner;

public class Loader
{

    public static void main(String[] args)
    {
        Account account = new Account();
        account.topUP(1100);
        account.withDraw(200);
        account.showBalance();

        DepositAccount depositAccount = new DepositAccount();
//        depositAccount.topUP(1000);
        depositAccount.withDraw(300);
        depositAccount.showBalance();

        CardAccount cardAccount = new CardAccount();
        cardAccount.topUP(1001);
        cardAccount.withDraw(100);
        cardAccount.showBalance();
    }
}
