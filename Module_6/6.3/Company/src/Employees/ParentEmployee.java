package Employees;

/**
 * Created by User on 30 Июнь, 2019
 */
public class ParentEmployee implements Comparable<Employee>, Employee
{
    private int fixedSalary;

    public int getFixedSalary()
    {
        return fixedSalary;
    }

    public ParentEmployee(int fixedSalary)
    {
        this.fixedSalary =  fixedSalary;
    }



    @Override
    public int compareTo(Employee o)
    {
        if (getMonthSalary() > o.getMonthSalary()){
            return 1;
        }
        if (getMonthSalary() < o.getMonthSalary()){
            return -1;
        }
        return 0;
    }

    @Override
    public int getMonthSalary()
    {
        return 0;
    }
}
