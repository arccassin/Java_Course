package Employees;

/**
 * Created by User on 30 Июнь, 2019
 */
public class TopManager extends ParentEmployee implements Employee
{
    private int incomeCompany;
    private int premiumSalary;
    public TopManager(int fixedSalary, int premiumSalary, int incomeCompany){
        super(fixedSalary);
        this.incomeCompany = incomeCompany;
        this.premiumSalary = premiumSalary;
    }
    @Override
    public int getMonthSalary()
    {
        return getFixedSalary() +  (incomeCompany > 10_000_000 ? premiumSalary : 0);
    }

    @Override
    public String toString()
    {
        return "TopManager{} monthSalary = " + getMonthSalary();
    }
}
