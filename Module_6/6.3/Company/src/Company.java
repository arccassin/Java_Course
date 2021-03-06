import Employees.Employee;
import Employees.ParentEmployee;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by User on 30 Июнь, 2019
 */
public class Company
{
    private int fixedSalary;
    private int preliminaryTop;
    private int incomeCompany;
    private int emloyeeCount;
    private ArrayList<ParentEmployee> personalList = new ArrayList<ParentEmployee>();

    public Company(int fixedSalary, int preliminaryTop, int incomeCompany, int emloyeeCount)
    {
        this.fixedSalary = fixedSalary;
        this.preliminaryTop = preliminaryTop;
        this.incomeCompany = incomeCompany;
        this.emloyeeCount = emloyeeCount;
    }

    public int getEmloyeeCount()
    {
        return emloyeeCount;
    }

    public int getPreliminaryTop()
    {
        return preliminaryTop;
    }

    public int getIncomeCompany()
    {
        return incomeCompany;
    }

    public int getFixedSalary()
    {
        return fixedSalary;
    }

    public ArrayList<Employee> getTopSalaryStaff(int count)
    {
        if (count == 0 || count > personalList.size())
        {
            return null;
        }

        ArrayList<Employee> currentList = new ArrayList<>();
//        Collections.sort(personalList, new EmployeeComparator());
        Collections.sort(personalList);
        for (int i = personalList.size() - 1; i > personalList.size() - 1 - count; i--)
        {
            currentList.add(personalList.get(i));
        }

        return currentList;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count)
    {
        if (count == 0 || count > personalList.size())
        {
            return null;
        }

        ArrayList<Employee> currentList = new ArrayList<>();
//        Collections.sort(personalList, new EmployeeComparator());
        Collections.sort(personalList);
        for (int i = 0; i < personalList.size(); i++)
        {
            currentList.add(personalList.get(i));
        }

        return currentList;
    }

    public void hiringEmployee(ParentEmployee employee)
    {
        personalList.add(employee);
    }

    public void firingEmployee(Employee employee)
    {
        personalList.remove(employee);
    }

}
