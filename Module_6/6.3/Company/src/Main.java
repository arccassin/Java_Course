import Employees.Employee;
import Employees.Manager;
import Employees.Operator;
import Employees.TopManager;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        var company = new Company(40_000, 100_000,20_000_000, 270);
        for (int i = 0; i < company.getEmloyeeCount(); i++)
        {
            if (i % 27 == 0)
            {
                int  fixedSalary = company.getFixedSalary() * 10 + (int)(Math.random() * company.getFixedSalary()/10);
                var topManager = new TopManager(fixedSalary, company.getPreliminaryTop(), company.getIncomeCompany());
                company.hiringEmployee(topManager);
            } else if (i % 10 == 0){
                int fixedSalary = company.getFixedSalary() + (int)(Math.random() * company.getFixedSalary()/10);
                int involvementSalary =  (int) (company.getIncomeCompany() / (int)(company.getEmloyeeCount() / 10) + (Math.random() * 10000) - 5000);
                var manager = new Manager(fixedSalary, involvementSalary);
                company.hiringEmployee(manager);
            } else {
                int fixedSalary = company.getFixedSalary() + (int)(Math.random() * company.getFixedSalary()/10);
                var operator = new Operator(fixedSalary);
                company.hiringEmployee(operator);
            }

        }
        ArrayList<Employee> employees = new ArrayList<>();
        employees = company.getTopSalaryStaff(15);
        System.out.println(employees.toString());

        employees.clear();
        employees = company.getLowestSalaryStaff(5);
        System.out.println(employees.toString());

    }
}
