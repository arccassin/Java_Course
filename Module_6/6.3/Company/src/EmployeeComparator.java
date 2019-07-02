import Employees.Employee;

import java.util.Comparator;

/**
 * Created by User on 02 Июль, 2019
 */
public class EmployeeComparator implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2)
    {
        if (o1.getMonthSalary() > o2.getMonthSalary()){
            return 1;
        }
        if (o1.getMonthSalary() < o2.getMonthSalary()){
            return -1;
        }
        return 0;
    }
}
