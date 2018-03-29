package beans;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDaoInMemory implements EmployeeDao {

	private Map<Long, Employee> employeesMap = new HashMap<Long, Employee>();
	{
		Employee employee1 = new Employee("Ryleah", 1L, 16.50, 4);
		Employee employee2 = new Employee("Kale", 2L, 15.75, 3);
		
		employeesMap.put(employee1.getId(), employee1);
		employeesMap.put(employee2.getId(), employee2);
	}
	
	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		employeesMap.put(employee.getId(), employee);
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		employeesMap.put(employee.getId(), employee);
	}

	public void update(List<Employee> employees) {
		// TODO Auto-generated method stub
		for(Employee employee: employees) {
			update(employee);
		}
	}

	public void delete(long employeeId) {
		// TODO Auto-generated method stub
		employeesMap.remove(employeeId);
	}

	public Employee find(long employeeId) {
		// TODO Auto-generated method stub
		return employeesMap.get(employeeId);
	}

	public List<Employee> find(List<Long> employeeIds) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		for(Long id: employeeIds) {
			employees.add(employeesMap.get(id));
		}
		return employees;
	}

	public List<Employee> find(String employeeName) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		for(Employee employee: employeesMap.values()) {
			if(employeeName.equals(employee.getEmployeeName())) {
				employees.add(employee);
			}
		}	
		return employees;
	}

	public List<Employee> find(int yearsEmployed) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		for(Employee employee: employeesMap.values()) {
			if(yearsEmployed == employee.getYearsEmployed()) {
				employees.add(employee);
			}
		}	
		return employees;
	}

}
