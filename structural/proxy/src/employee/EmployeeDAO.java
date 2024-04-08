package employee;

import java.util.List;

public interface EmployeeDAO {
    public void addEmployee(Employee employee);

    public void deleteEmployee(int employeeId);

    public List<Employee> getAllEmployees();

    public void setUser(String user);
}
