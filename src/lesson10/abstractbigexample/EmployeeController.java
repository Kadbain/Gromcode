package lesson10.abstractbigexample;

/**
 * Created by Ps1X on 28.09.2017.
 */
public class EmployeeController {
private Employee[] employees = new Employee[100];

void paySalaryToEmployees() {
    for (Employee employee : employees) {
        employee.paySalary();
        System.out.println("Salary was paid successfully to " + employee.getName() + "employee");
    }
}
}
