package assignment_3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Alex", 40000));
        employees.add(new Employee(102, "Benjamine", 60000));
        employees.add(new Employee(103, "Justine", 25000));

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}