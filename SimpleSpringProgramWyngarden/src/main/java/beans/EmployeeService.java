package beans;

public interface EmployeeService {
	public void changePayRate(long employeeId, double amount);
	public Employee getEmployee(long employeeId);
}
