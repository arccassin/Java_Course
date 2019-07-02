package Employees;

/**
 * Created by User on 30 Июнь, 2019
 */
public class Operator extends ParentEmployee implements Employee
{
    public Operator(int fixedSalary)
    {
        super(fixedSalary);
    }

    @Override
    public int getMonthSalary()
    {
        return getFixedSalary();
    }

    @Override
    public String toString()
    {
        return "Operator{} monthSalary = " + getMonthSalary();
    }
}
