package Accounts;

import java.util.Calendar;

/**
 * Created by User on 23 Июнь, 2019
 */
public class DepositAccount extends Account
{
    private Calendar calendarLastTopUp;

    @Override
    public void topUP(double amount)
    {
        calendarLastTopUp = Calendar.getInstance();
        super.topUP(amount);
    }

    @Override
    public void withDraw(double amount)
    {
        Calendar currentCalendar = Calendar.getInstance();
        currentCalendar.add(Calendar.MONTH, -1);
        if (calendarLastTopUp != null)
        {
            if (calendarLastTopUp.before(currentCalendar))
            {
                super.withDraw(amount);
            } else
                System.out.println("Со времени последнего внесения прошло меньше месяца, снятие невозможно");
        } else
            super.withDraw(amount);


    }
}
