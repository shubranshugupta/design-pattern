import java.util.List;

import employee.*;
import proxy.*;

public class MainClass {
    public static void main(String[] args) throws Exception {
        EmployeeDAO employeeDAO1 = new EmployeeDAOProxy("admin");
        employeeDAO1.addEmployee(new Employee(1, "John Doe"));
        employeeDAO1.addEmployee(new Employee(2, "Jane Doe"));
        employeeDAO1.addEmployee(new Employee(3, "Tom Smith"));
        employeeDAO1.addEmployee(new Employee(4, "Jerry Smith"));
        employeeDAO1.addEmployee(new Employee(5, "Alice Johnson"));
        employeeDAO1.addEmployee(new Employee(6, "Bob Johnson"));
        employeeDAO1.deleteEmployee(6);

        List<Employee> employees = employeeDAO1.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        employeeDAO1.setUser("user");
        employeeDAO1.addEmployee(new Employee(6, "John Doe"));
        employeeDAO1.deleteEmployee(6);
    }
}
