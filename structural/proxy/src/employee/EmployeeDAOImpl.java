package employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    private List<Employee> employees = new ArrayList<Employee>();
    String user;

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                employees.remove(employee);
                break;
            }
        }
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
