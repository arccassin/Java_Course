package Employees;

/**
 * Created by User on 30 Июнь, 2019
 */
public class Manager extends ParentEmployee implements Employee
{
    private int involvementSalary;

    public Manager(int fixedSalary, int involvementSalary)
    {
        super(fixedSalary);
        this.involvementSalary = involvementSalary;

    }

    @Override
    public String toString()
    {
        return "Manager{} monthSalary = " + getMonthSalary();
    }

    @Override
    public int getMonthSalary()
    {
        return getFixedSalary() + (int) (0.05 * involvementSalary);
    }
}
