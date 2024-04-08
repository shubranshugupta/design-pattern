package proxy;

import java.util.List;

import employee.Employee;
import employee.EmployeeDAO;
import employee.EmployeeDAOImpl;

public class EmployeeDAOProxy implements EmployeeDAO {
    private EmployeeDAOImpl employeeDAOImpl;
    String user;

    public EmployeeDAOProxy(String user) {
        employeeDAOImpl = new EmployeeDAOImpl();
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public void addEmployee(Employee employee) {
        if (user.equalsIgnoreCase("admin")) {
            employeeDAOImpl.addEmployee(employee);
        } else {
            System.out.println("User " + user + " is not allowed to add an employee.");
        }
    }

    @Override
    public void deleteEmployee(int employeeId) {
        if (user.equalsIgnoreCase("admin")) {
            employeeDAOImpl.deleteEmployee(employeeId);
        } else {
            System.out.println("User " + user + " is not allowed to delete an employee.");
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        if (user.equalsIgnoreCase("admin") || user.equalsIgnoreCase("user")) {
            return employeeDAOImpl.getAllEmployees();
        } else {
            System.out.println("User " + user + " is not allowed to get all employees.");
            return null;
        }
    }
}
